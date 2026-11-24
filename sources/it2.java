// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class it2 extends d implements gk7, vl5 {
    public wgb E;
    public gt2 F;
    public wgb G;
    public w97 H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public ht2 P;
    public final wl5 Q;
    public TLRPC.FileLocation R;
    public byte S;
    public byte T;
    public TLRPC.Photo U;
    public be0 V;
    public FrameLayout W;
    public q5c X;
    public boolean Y;
    public boolean Z;
    public sha a;
    public k27 a0;
    public it3 b;
    public it3 c;
    public it3 d;
    public be0 e;
    public TextView f;
    public TextView h;
    public pb0 n;
    public final wjb r;
    public RadialProgressView s;
    public s71 w;
    public AnimatorSet x;
    public wgb y;

    public it2(Bundle bundle, wjb wjbVar) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.r = wjbVar;
        this.Q = new wl5(0, true, true);
    }

    @Override // vl5
    public final void H(float f) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // vl5
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override // vl5
    public final void T() {
        gl.d3(new ws2(this, (byte) 0));
    }

    @Override // vl5
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        gl.d3(new Runnable() { // from class: xs2
            @Override // java.lang.Runnable
            public final void run() {
                it2.this.e0(photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z);
            }
        });
    }

    public final String a0() {
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.I));
        return (V1 == null || TextUtils.isEmpty(V1.phone)) ? this.M : V1.phone;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.k6));
        hashSet.add(Integer.valueOf(bkb.j6));
        hashSet.add(Integer.valueOf(bkb.G6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
    }

    public final /* synthetic */ void b0(TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = getMessagesController().m1(this.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_suggestBirthday, new uf(this, (byte) 15));
    }

    @Override // vl5
    public final boolean c() {
        return this.T != 1;
    }

    public final void c0(TLRPC.User user) {
        this.R = null;
        g0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.I));
        V1.photo.personal = false;
        TLRPC.UserFull W1 = na7.q1(this.currentAccount).W1(this.I);
        if (W1 != null) {
            W1.personal_photo = null;
            W1.flags &= -2097153;
            getMessagesStorage().g2(W1, true);
        }
        TLRPC.Photo photo = this.U;
        if (photo != null) {
            V1.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w = ba4.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(arrayList, 1000, false, null, false);
            if (w != null) {
                V1.photo.photo_small = w.location;
            }
            if (w2 != null) {
                V1.photo.photo_big = w2.location;
            }
        } else {
            V1.photo = null;
            V1.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        getMessagesStorage().j1(arrayList2, null, false, true);
        j0();
        getNotificationCenter().k(kk7.b0, new Object[0]);
        getNotificationCenter().k(2, 2);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        final byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.J;
        pha phaVar = this.simpleActionBar;
        if (z) {
            phaVar.setTitle(k96.M0(2131748091, null));
        } else {
            phaVar.setTitle(k96.M0(2131751270, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new et2(this));
        this.a = this.simpleActionBar.s(k96.M0(this.J ? 2131751741 : 2131745754, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i = bkb.c6;
        wjb wjbVar = this.r;
        zkb.h(i, wjbVar, frameLayout2);
        be0 be0Var = new be0(context);
        this.e = be0Var;
        be0Var.setRoundRadius(gl.L(32.0f));
        this.W.addView(this.e, nme.d(64, 64.0f, (k96.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        s71 s71Var = new s71((Object) this, context, (Object) paint, (byte) 6);
        this.w = s71Var;
        this.W.addView(s71Var, nme.d(64, 64.0f, (k96.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(gl.L(30.0f));
        this.s.setProgressColor(-1);
        final byte b2 = 0;
        this.s.setNoProgress(false);
        this.W.addView(this.s, nme.d(64, 64.0f, (k96.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        h0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        zkb.X(textView, bkb.F6, wjbVar);
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(k96.a0 ? 5 : 3);
        this.f.setTypeface(gl.o());
        FrameLayout frameLayout3 = this.W;
        TextView textView3 = this.f;
        boolean z2 = k96.a0;
        TextView l = ug8.l(frameLayout3, textView3, nme.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 94.0f, 25.66f, z2 ? 94.0f : 0.0f, 0.0f), context);
        this.h = l;
        zkb.X(l, bkb.z6, wjbVar);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(k96.a0 ? 5 : 3);
        FrameLayout frameLayout4 = this.W;
        TextView textView4 = this.h;
        boolean z3 = k96.a0;
        frameLayout4.addView(textView4, nme.d(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 94.0f, 49.66f, z3 ? 94.0f : 0.0f, 0.0f));
        it3 it3Var = new it3(context, k96.M0(2131750677, null), false, false, -1, this.r);
        this.b = it3Var;
        it3Var.d.setImeOptions(5);
        zkb.h(i, wjbVar, this.b);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: bt2
            public final /* synthetic */ it2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b3 = b2;
                it2 it2Var = this.b;
                switch (b3) {
                    case 0:
                        if (i2 == 5) {
                            it2Var.c.d.requestFocus();
                            ht3 ht3Var = it2Var.c.d;
                            ht3Var.setSelection(ht3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            it2Var.a.performClick();
                        } else if (i2 == 5) {
                            it2Var.d.d.requestFocus();
                            it2Var.d.d.setSelection(it2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            it2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.b.d.setOnFocusChangeListener(new ft2());
        this.b.setText(this.N);
        it3 it3Var2 = new it3(context, k96.M0(2131748840, null), false, false, -1, this.r);
        this.c = it3Var2;
        it3Var2.d.setImeOptions(5);
        zkb.h(i, wjbVar, this.c);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: bt2
            public final /* synthetic */ it2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b3 = b;
                it2 it2Var = this.b;
                switch (b3) {
                    case 0:
                        if (i2 == 5) {
                            it2Var.c.d.requestFocus();
                            ht3 ht3Var = it2Var.c.d;
                            ht3Var.setSelection(ht3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            it2Var.a.performClick();
                        } else if (i2 == 5) {
                            it2Var.d.d.requestFocus();
                            it2Var.d.d.setSelection(it2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            it2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.c.setText(this.O);
        it3 it3Var3 = new it3(context, k96.M0(2131754392, null), true, true, getMessagesController().k4.C.f(), this.r);
        this.d = it3Var3;
        zkb.G(it3Var3.d, bkb.Wc, wjbVar);
        this.d.d.setImeOptions(6);
        zkb.h(i, wjbVar, this.d);
        final byte b3 = 2;
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: bt2
            public final /* synthetic */ it2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b32 = b3;
                it2 it2Var = this.b;
                switch (b32) {
                    case 0:
                        if (i2 == 5) {
                            it2Var.c.d.requestFocus();
                            ht3 ht3Var = it2Var.c.d;
                            ht3Var.setSelection(ht3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            it2Var.a.performClick();
                        } else if (i2 == 5) {
                            it2Var.d.d.requestFocus();
                            it2Var.d.d.setSelection(it2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            it2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (!this.J) {
            final TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.I));
            wgb wgbVar = new wgb(context, wjbVar);
            this.y = wgbVar;
            wgbVar.o(R.drawable.msg_addphoto, k96.a0(null, null, 2131744157, V1.first_name), true);
            this.y.setBackground(bkb.K0(wjbVar, true));
            wgb wgbVar2 = this.y;
            int i2 = bkb.u6;
            int i3 = bkb.t6;
            wgbVar2.g(i2, i3);
            final oy8 oy8Var = new oy8(R.raw.photo_suggest_icon, gl.L(50.0f), gl.L(50.0f), false, null);
            this.y.e.setTranslationX(-gl.L(8.0f));
            this.y.e.setAnimation(oy8Var);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: dt2
                public final /* synthetic */ it2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b4 = b2;
                    final oy8 oy8Var2 = oy8Var;
                    TLRPC.User user = V1;
                    final it2 it2Var = this.b;
                    final byte b5 = 1;
                    final byte b6 = 0;
                    switch (b4) {
                        case 0:
                            it2Var.S = (byte) 1;
                            wl5 wl5Var = it2Var.Q;
                            wl5Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            wl5Var.n((userProfilePhoto != null ? userProfilePhoto.photo_small : null) != null, new jc((byte) 10), new DialogInterface.OnDismissListener() { // from class: zs2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b5;
                                    oy8 oy8Var3 = oy8Var2;
                                    it2 it2Var2 = it2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!it2Var2.Q.g()) {
                                                oy8Var3.K(86);
                                                it2Var2.E.e.d();
                                                break;
                                            } else {
                                                oy8Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!it2Var2.Q.g()) {
                                                oy8Var3.K(85);
                                                it2Var2.y.e.d();
                                                break;
                                            } else {
                                                oy8Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            oy8Var2.H(0);
                            oy8Var2.K(43);
                            it2Var.y.e.d();
                            break;
                        default:
                            it2Var.S = (byte) 2;
                            wl5 wl5Var2 = it2Var.Q;
                            wl5Var2.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                            wl5Var2.n((userProfilePhoto2 != null ? userProfilePhoto2.photo_small : null) != null, new jc((byte) 10), new DialogInterface.OnDismissListener() { // from class: zs2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b6;
                                    oy8 oy8Var3 = oy8Var2;
                                    it2 it2Var2 = it2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!it2Var2.Q.g()) {
                                                oy8Var3.K(86);
                                                it2Var2.E.e.d();
                                                break;
                                            } else {
                                                oy8Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!it2Var2.Q.g()) {
                                                oy8Var3.K(85);
                                                it2Var2.y.e.d();
                                                break;
                                            } else {
                                                oy8Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            oy8Var2.H(0);
                            oy8Var2.K(43);
                            it2Var.E.e.d();
                            break;
                    }
                }
            });
            wgb wgbVar3 = new wgb(context, wjbVar);
            this.E = wgbVar3;
            wgbVar3.o(R.drawable.msg_addphoto, k96.a0(null, null, 2131743440, V1.first_name), false);
            this.E.setBackground(bkb.K0(wjbVar, true));
            this.E.g(i2, i3);
            final oy8 oy8Var2 = new oy8(R.raw.camera_outline, gl.L(50.0f), gl.L(50.0f), false, null);
            this.E.e.setTranslationX(-gl.L(8.0f));
            this.E.e.setAnimation(oy8Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: dt2
                public final /* synthetic */ it2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b4 = b;
                    final oy8 oy8Var22 = oy8Var2;
                    TLRPC.User user = V1;
                    final it2 it2Var = this.b;
                    final byte b5 = 1;
                    final byte b6 = 0;
                    switch (b4) {
                        case 0:
                            it2Var.S = (byte) 1;
                            wl5 wl5Var = it2Var.Q;
                            wl5Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            wl5Var.n((userProfilePhoto != null ? userProfilePhoto.photo_small : null) != null, new jc((byte) 10), new DialogInterface.OnDismissListener() { // from class: zs2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b5;
                                    oy8 oy8Var3 = oy8Var22;
                                    it2 it2Var2 = it2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!it2Var2.Q.g()) {
                                                oy8Var3.K(86);
                                                it2Var2.E.e.d();
                                                break;
                                            } else {
                                                oy8Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!it2Var2.Q.g()) {
                                                oy8Var3.K(85);
                                                it2Var2.y.e.d();
                                                break;
                                            } else {
                                                oy8Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            oy8Var22.H(0);
                            oy8Var22.K(43);
                            it2Var.y.e.d();
                            break;
                        default:
                            it2Var.S = (byte) 2;
                            wl5 wl5Var2 = it2Var.Q;
                            wl5Var2.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                            wl5Var2.n((userProfilePhoto2 != null ? userProfilePhoto2.photo_small : null) != null, new jc((byte) 10), new DialogInterface.OnDismissListener() { // from class: zs2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b6;
                                    oy8 oy8Var3 = oy8Var22;
                                    it2 it2Var2 = it2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!it2Var2.Q.g()) {
                                                oy8Var3.K(86);
                                                it2Var2.E.e.d();
                                                break;
                                            } else {
                                                oy8Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!it2Var2.Q.g()) {
                                                oy8Var3.K(85);
                                                it2Var2.y.e.d();
                                                break;
                                            } else {
                                                oy8Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            oy8Var22.H(0);
                            oy8Var22.K(43);
                            it2Var.E.e.d();
                            break;
                    }
                }
            });
            this.V = new be0(context);
            this.F = new gt2(this, context, wjbVar);
            pb0 pb0Var = this.n;
            if (pb0Var == null) {
                pb0Var = new pb0(0, V1);
                this.n = pb0Var;
            }
            this.V.f(V1.photo, pb0Var);
            this.F.addView(this.V, nme.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(k96.M0(2131745895, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(bkb.K0(wjbVar, true));
            this.F.g(i2, i3);
            this.F.setOnClickListener(new b0(this, context, V1, (byte) 26));
            wgb wgbVar4 = new wgb(context, wjbVar);
            this.G = wgbVar4;
            wgbVar4.o(R.drawable.menu_birthday, k96.a0(null, null, 2131743439, new Object[0]), false);
            this.G.setBackground(bkb.K0(wjbVar, true));
            this.G.g(i2, i3);
            this.G.setNeedDivider(true);
            this.G.e.setTranslationX(gl.L(4.0f));
            this.G.setOnClickListener(new kb1((Object) this, (Object) V1, (byte) 22));
            TLRPC.UserFull W1 = getMessagesController().W1(this.I);
            if (W1 != null) {
                TLRPC.Photo photo = W1.profile_photo;
                this.U = photo;
                if (photo == null) {
                    this.U = W1.fallback_photo;
                }
            }
            j0();
        }
        q5c q5cVar = new q5c(this, new w72(this, (byte) 10), new rh1((Object) this, (byte) 29), null);
        this.X = q5cVar;
        q5cVar.r1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new si1(this, frameLayout, b3));
        frameLayout.addView(this.X, nme.e(-1, -1, kk7.D1));
        if (this.J && this.L) {
            this.Y = true;
        }
        this.X.g3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.a0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(this.a0.e1()));
            kk7.f(this.currentAccount).k(kk7.v, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        w97 w97Var;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = na7.q5;
            if ((intValue & 2) == 0 && (intValue & 4) == 0) {
                return;
            }
            i0();
            return;
        }
        if (i == kk7.f3 && (w97Var = (w97) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(w97Var.b);
            int i4 = 0;
            while (i4 < arrayList.size()) {
                if (arrayList.get(i4) == null) {
                    arrayList.remove(i4);
                    i4--;
                }
                i4++;
            }
            if (arrayList.size() > 0) {
                this.U = (TLRPC.Photo) arrayList.get(0);
                j0();
            }
        }
    }

    public final void e0(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z) {
        wl5 wl5Var = this.Q;
        if (wl5Var.U) {
            return;
        }
        byte b = this.T;
        if (b == 2) {
            this.R = photoSize.location;
        } else if (b == 1 && getParentLayout() != null) {
            ui5 parentLayout = getParentLayout();
            d lastFragment = getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = (d) fragmentStack.get(size);
                if (dVar instanceof mu1) {
                    mu1 mu1Var = (mu1) dVar;
                    d dVar2 = lastFragment;
                    if (mu1Var.a() == this.I && mu1Var.g4 == 0) {
                        mu1Var.fb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            d dVar3 = dVar2;
                            if (arrayList.get(size2) != dVar3) {
                                ((d) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            dVar2 = dVar3;
                        }
                        dVar2.finishFragment();
                    } else {
                        lastFragment = dVar2;
                    }
                }
                arrayList.add((d) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            this.e.m(gl5.e(this.R), "50_50", this.n, getMessagesController().V1(Long.valueOf(this.I)));
            if (this.T == 2) {
                h0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                z3a.B(this.currentAccount);
                tL_messageService.random_id = z3a.D();
                tL_messageService.dialog_id = this.I;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int i = getUserConfig().i();
                tL_messageService.id = i;
                tL_messageService.local_id = i;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = this.I;
                tL_messageService.date = getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                k27 k27Var = new k27(this.currentAccount, tL_messageService, false, false);
                this.a0 = k27Var;
                arrayList2.add(k27Var);
                new ArrayList().add(tL_messageService);
                na7.q1(this.currentAccount).q5(0, this.I, arrayList2);
                getMessagesController().m4.put(tL_messageService.local_id, wl5Var);
            }
        } else {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.I));
            if (this.a0 == null && V1 != null) {
                boolean z2 = inputFile2 != null;
                V1.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                V1.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z2;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(V1);
                getMessagesStorage().j1(arrayList3, null, false, true);
                getNotificationCenter().k(kk7.b0, new Object[0]);
                kk7 notificationCenter = getNotificationCenter();
                int i2 = na7.q5;
                notificationCenter.k(2, 2);
            }
            g0(this.R, photoSize2.location, inputFile, inputFile2, videoSize, d, this.T);
            h0(false, true);
        }
        j0();
    }

    public final void f0(TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        if (this.a0 == null) {
            if ((fileLocation == null && inputFile == null) || tLObject == null) {
                return;
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.I));
            TLRPC.UserFull W1 = na7.q1(this.currentAccount).W1(this.I);
            if (W1 != null) {
                W1.personal_photo = tL_photos_photo.photo;
                W1.flags |= TLObject.FLAG_21;
                getMessagesStorage().g2(W1, true);
            }
            if (V1 != null) {
                TLRPC.PhotoSize w = ba4.w(arrayList, 100, false, null, false);
                TLRPC.PhotoSize w2 = ba4.w(arrayList, 1000, false, null, false);
                if (w != null && fileLocation != null) {
                    ba4.G(this.currentAccount);
                    File J = ba4.J(w, null, true, true);
                    ba4.G(this.currentAccount);
                    ba4.J(fileLocation, null, true, true).renameTo(J);
                    StringBuilder sb = new StringBuilder();
                    sb.append(fileLocation.volume_id);
                    sb.append("_");
                    String l = de9.l(sb, fileLocation.local_id, "@50_50");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w.location.volume_id);
                    sb2.append("_");
                    fl5.z().O(l, de9.l(sb2, w.location.local_id, "@50_50"), gl5.l(this.currentAccount, 1, V1));
                }
                if (w2 != null && fileLocation2 != null) {
                    ba4.G(this.currentAccount);
                    File J2 = ba4.J(w2, null, true, true);
                    ba4.G(this.currentAccount);
                    ba4.J(fileLocation2, null, true, true).renameTo(J2);
                }
                d68.a(tL_photos_photo.photo, V1, true);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(V1);
                getMessagesStorage().j1(arrayList2, null, false, true);
                getMessagesController().S0(this.I);
                getNotificationCenter().k(kk7.b0, new Object[0]);
                getNotificationCenter().k(2, 2);
                if (getParentActivity() != null) {
                    if (i == 2) {
                        u21.b0(this).V(arrayList2, gl.T2(k96.a0("UserCustomPhotoSeted", null, 2131743504, V1.first_name)), null, null).j();
                    } else {
                        u21.b0(this).V(arrayList2, gl.T2(k96.a0("UserCustomPhotoSeted", null, 2131743504, V1.first_name)), null, null).j();
                    }
                }
            }
            this.R = null;
            j0();
        }
    }

    public final void g0(final TLRPC.FileLocation fileLocation, final TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final int i) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().m1(this.I);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i2 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i2 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new RequestDelegate() { // from class: at2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gl.d3(new ct2(it2.this, fileLocation, inputFile2, tLObject, fileLocation2, i));
            }
        });
    }

    @Override // vl5
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override // vl5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final wjb getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(boolean z, boolean z2) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        if (!z2) {
            RadialProgressView radialProgressView = this.s;
            if (z) {
                radialProgressView.setAlpha(1.0f);
                this.s.setVisibility(0);
                this.w.setAlpha(1.0f);
                this.w.setVisibility(0);
                return;
            }
            radialProgressView.setAlpha(0.0f);
            this.s.setVisibility(4);
            this.w.setAlpha(0.0f);
            this.w.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        RadialProgressView radialProgressView2 = this.s;
        if (z) {
            radialProgressView2.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.x;
            RadialProgressView radialProgressView3 = this.s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView3, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<s71, Float>) property, 1.0f));
        } else {
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<s71, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new y7((byte) 24, (Object) this, z));
        this.x.start();
    }

    public final void i0() {
        TLRPC.User V1;
        if (this.f == null || (V1 = getMessagesController().V1(Long.valueOf(this.I))) == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(a0());
        TextView textView = this.f;
        if (isEmpty) {
            textView.setText(k96.M0(2131748218, null));
        } else {
            textView.setText(p38.f().e("+" + a0()));
        }
        this.h.setText(k96.d0(this.currentAccount, V1, null, null));
        if (this.R == null) {
            be0 be0Var = this.e;
            pb0 pb0Var = new pb0(0, V1);
            this.n = pb0Var;
            be0Var.f(V1, pb0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.Photo photo;
        if (this.J) {
            return;
        }
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.I));
        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.U) != null) {
            this.V.m(gl5.i(ba4.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.n, null);
        }
        pb0 pb0Var = this.n;
        if (pb0Var == null) {
            pb0Var = new pb0(0, V1);
            this.n = pb0Var;
        }
        TLRPC.FileLocation fileLocation = this.R;
        be0 be0Var = this.e;
        if (fileLocation == null) {
            be0Var.f(V1, pb0Var);
        } else {
            be0Var.m(gl5.e(fileLocation), "50_50", this.n, getMessagesController().V1(Long.valueOf(this.I)));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, kk7.f3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        this.L = na7.q1(this.currentAccount).W3.getBoolean("dialog_bar_exception" + this.I, false);
        TLRPC.User V1 = this.I != 0 ? getMessagesController().V1(Long.valueOf(this.I)) : null;
        wl5 wl5Var = this.Q;
        if (wl5Var != null) {
            wl5Var.a = this;
            wl5Var.b = this;
        }
        this.H = na7.q1(this.currentAccount).S0(this.I);
        return V1 != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, kk7.f3);
        wl5 wl5Var = this.Q;
        if (wl5Var != null) {
            wl5Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        this.Q.i();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        i0();
        this.Q.k();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        TLRPC.User V1;
        try {
            super.onThemeColorsChanged();
            if (this.e == null || (V1 = getMessagesController().V1(Long.valueOf(this.I))) == null) {
                return;
            }
            this.n.q(V1);
            this.e.invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // vl5
    public final boolean x() {
        return false;
    }

    public it2(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new wl5(0, true, true);
    }
}
