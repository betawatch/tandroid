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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cu2 extends e implements fn7, yn5 {
    public skb E;
    public au2 F;
    public skb G;
    public dc7 H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public bu2 P;
    public final zn5 Q;
    public TLRPC.FileLocation R;
    public byte S;
    public byte T;
    public TLRPC.Photo U;
    public de0 V;
    public FrameLayout W;
    public q9c X;
    public boolean Y;
    public boolean Z;
    public nla a;
    public r47 a0;
    public zt3 b;
    public zt3 c;
    public zt3 d;
    public de0 e;
    public TextView f;
    public TextView h;
    public rb0 n;
    public final vnb r;
    public RadialProgressView s;
    public a81 w;
    public AnimatorSet x;
    public skb y;

    public cu2(Bundle bundle, vnb vnbVar) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.r = vnbVar;
        this.Q = new zn5(0, true, true);
    }

    @Override // yn5
    public final void H(float f) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // yn5
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override // yn5
    public final void T() {
        hl.c3(new qt2(this, (byte) 0));
    }

    @Override // yn5
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        hl.c3(new Runnable() { // from class: rt2
            @Override // java.lang.Runnable
            public final void run() {
                cu2.this.e0(photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z);
            }
        });
    }

    public final String a0() {
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.I));
        return (X1 == null || TextUtils.isEmpty(X1.phone)) ? this.M : X1.phone;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.l6));
        hashSet.add(Integer.valueOf(aob.k6));
        hashSet.add(Integer.valueOf(aob.H6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
    }

    public final /* synthetic */ void b0(TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = getMessagesController().o1(this.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_suggestBirthday, new ye(this, (byte) 15));
    }

    public final void c0(TLRPC.User user) {
        this.R = null;
        g0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.I));
        X1.photo.personal = false;
        TLRPC.UserFull Y1 = uc7.s1(this.currentAccount).Y1(this.I);
        if (Y1 != null) {
            Y1.personal_photo = null;
            Y1.flags &= -2097153;
            getMessagesStorage().l2(Y1, true);
        }
        TLRPC.Photo photo = this.U;
        if (photo != null) {
            X1.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w = xb4.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(arrayList, 1000, false, null, false);
            if (w != null) {
                X1.photo.photo_small = w.location;
            }
            if (w2 != null) {
                X1.photo.photo_big = w2.location;
            }
        } else {
            X1.photo = null;
            X1.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        getMessagesStorage().n1(arrayList2, null, false, true);
        j0();
        getNotificationCenter().k(jn7.c0, new Object[0]);
        getNotificationCenter().k(2, 2);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        final byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.J;
        jla jlaVar = this.simpleActionBar;
        if (z) {
            jlaVar.setTitle(ob6.M0(2131748037, null));
        } else {
            jlaVar.setTitle(ob6.M0(2131751247, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new yt2(this));
        this.a = this.simpleActionBar.u(ob6.M0(this.J ? 2131751718 : 2131745674, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i = aob.d6;
        vnb vnbVar = this.r;
        yob.h(i, vnbVar, frameLayout2);
        de0 de0Var = new de0(context);
        this.e = de0Var;
        de0Var.setRoundRadius(hl.L(32.0f));
        this.W.addView(this.e, tre.d(64, 64.0f, (ob6.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        a81 a81Var = new a81((Object) this, context, (Object) paint, (byte) 6);
        this.w = a81Var;
        this.W.addView(a81Var, tre.d(64, 64.0f, (ob6.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(hl.L(30.0f));
        this.s.setProgressColor(-1);
        final byte b2 = 0;
        this.s.setNoProgress(false);
        this.W.addView(this.s, tre.d(64, 64.0f, (ob6.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        h0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        yob.X(textView, aob.G6, vnbVar);
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(ob6.a0 ? 5 : 3);
        this.f.setTypeface(hl.o());
        FrameLayout frameLayout3 = this.W;
        TextView textView3 = this.f;
        boolean z2 = ob6.a0;
        TextView l = ik8.l(frameLayout3, textView3, tre.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 94.0f, 25.66f, z2 ? 94.0f : 0.0f, 0.0f), context);
        this.h = l;
        yob.X(l, aob.A6, vnbVar);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(ob6.a0 ? 5 : 3);
        FrameLayout frameLayout4 = this.W;
        TextView textView4 = this.h;
        boolean z3 = ob6.a0;
        frameLayout4.addView(textView4, tre.d(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 94.0f, 49.66f, z3 ? 94.0f : 0.0f, 0.0f));
        zt3 zt3Var = new zt3(context, ob6.M0(2131750654, null), false, false, -1, this.r);
        this.b = zt3Var;
        zt3Var.d.setImeOptions(5);
        yob.h(i, vnbVar, this.b);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: vt2
            public final /* synthetic */ cu2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b3 = b2;
                cu2 cu2Var = this.b;
                switch (b3) {
                    case 0:
                        if (i2 == 5) {
                            cu2Var.c.d.requestFocus();
                            yt3 yt3Var = cu2Var.c.d;
                            yt3Var.setSelection(yt3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            cu2Var.a.performClick();
                        } else if (i2 == 5) {
                            cu2Var.d.d.requestFocus();
                            cu2Var.d.d.setSelection(cu2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            cu2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.b.d.setOnFocusChangeListener(new zt2());
        this.b.setText(this.N);
        zt3 zt3Var2 = new zt3(context, ob6.M0(2131748786, null), false, false, -1, this.r);
        this.c = zt3Var2;
        zt3Var2.d.setImeOptions(5);
        yob.h(i, vnbVar, this.c);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: vt2
            public final /* synthetic */ cu2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b3 = b;
                cu2 cu2Var = this.b;
                switch (b3) {
                    case 0:
                        if (i2 == 5) {
                            cu2Var.c.d.requestFocus();
                            yt3 yt3Var = cu2Var.c.d;
                            yt3Var.setSelection(yt3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            cu2Var.a.performClick();
                        } else if (i2 == 5) {
                            cu2Var.d.d.requestFocus();
                            cu2Var.d.d.setSelection(cu2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            cu2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.c.setText(this.O);
        zt3 zt3Var3 = new zt3(context, ob6.M0(2131754388, null), true, true, getMessagesController().l4.E.f(), this.r);
        this.d = zt3Var3;
        yob.G(zt3Var3.d, aob.Xc, vnbVar);
        this.d.d.setImeOptions(6);
        yob.h(i, vnbVar, this.d);
        final byte b3 = 2;
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: vt2
            public final /* synthetic */ cu2 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                byte b32 = b3;
                cu2 cu2Var = this.b;
                switch (b32) {
                    case 0:
                        if (i2 == 5) {
                            cu2Var.c.d.requestFocus();
                            yt3 yt3Var = cu2Var.c.d;
                            yt3Var.setSelection(yt3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        if (i2 == 6) {
                            cu2Var.a.performClick();
                        } else if (i2 == 5) {
                            cu2Var.d.d.requestFocus();
                            cu2Var.d.d.setSelection(cu2Var.c.d.length());
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            cu2Var.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (!this.J) {
            final TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.I));
            skb skbVar = new skb(context, vnbVar);
            this.y = skbVar;
            skbVar.o(R.drawable.msg_addphoto, ob6.a0(null, null, 2131744051, X1.first_name), true);
            this.y.setBackground(aob.K0(vnbVar, true));
            skb skbVar2 = this.y;
            int i2 = aob.v6;
            int i3 = aob.u6;
            skbVar2.g(i2, i3);
            final b29 b29Var = new b29(R.raw.photo_suggest_icon, hl.L(50.0f), hl.L(50.0f), false, null);
            this.y.e.setTranslationX(-hl.L(8.0f));
            this.y.e.setAnimation(b29Var);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: xt2
                public final /* synthetic */ cu2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b4 = b2;
                    final b29 b29Var2 = b29Var;
                    TLRPC.User user = X1;
                    final cu2 cu2Var = this.b;
                    final byte b5 = 1;
                    final byte b6 = 0;
                    switch (b4) {
                        case 0:
                            cu2Var.S = (byte) 1;
                            zn5 zn5Var = cu2Var.Q;
                            zn5Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            zn5Var.n((userProfilePhoto != null ? userProfilePhoto.photo_small : null) != null, new kc((byte) 10), new DialogInterface.OnDismissListener() { // from class: tt2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b5;
                                    b29 b29Var3 = b29Var2;
                                    cu2 cu2Var2 = cu2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!cu2Var2.Q.g()) {
                                                b29Var3.K(86);
                                                cu2Var2.E.e.d();
                                                break;
                                            } else {
                                                b29Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!cu2Var2.Q.g()) {
                                                b29Var3.K(85);
                                                cu2Var2.y.e.d();
                                                break;
                                            } else {
                                                b29Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            b29Var2.H(0);
                            b29Var2.K(43);
                            cu2Var.y.e.d();
                            break;
                        default:
                            cu2Var.S = (byte) 2;
                            zn5 zn5Var2 = cu2Var.Q;
                            zn5Var2.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                            zn5Var2.n((userProfilePhoto2 != null ? userProfilePhoto2.photo_small : null) != null, new kc((byte) 10), new DialogInterface.OnDismissListener() { // from class: tt2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b6;
                                    b29 b29Var3 = b29Var2;
                                    cu2 cu2Var2 = cu2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!cu2Var2.Q.g()) {
                                                b29Var3.K(86);
                                                cu2Var2.E.e.d();
                                                break;
                                            } else {
                                                b29Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!cu2Var2.Q.g()) {
                                                b29Var3.K(85);
                                                cu2Var2.y.e.d();
                                                break;
                                            } else {
                                                b29Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            b29Var2.H(0);
                            b29Var2.K(43);
                            cu2Var.E.e.d();
                            break;
                    }
                }
            });
            skb skbVar3 = new skb(context, vnbVar);
            this.E = skbVar3;
            skbVar3.o(R.drawable.msg_addphoto, ob6.a0(null, null, 2131743334, X1.first_name), false);
            this.E.setBackground(aob.K0(vnbVar, true));
            this.E.g(i2, i3);
            final b29 b29Var2 = new b29(R.raw.camera_outline, hl.L(50.0f), hl.L(50.0f), false, null);
            this.E.e.setTranslationX(-hl.L(8.0f));
            this.E.e.setAnimation(b29Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: xt2
                public final /* synthetic */ cu2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b4 = b;
                    final b29 b29Var22 = b29Var2;
                    TLRPC.User user = X1;
                    final cu2 cu2Var = this.b;
                    final byte b5 = 1;
                    final byte b6 = 0;
                    switch (b4) {
                        case 0:
                            cu2Var.S = (byte) 1;
                            zn5 zn5Var = cu2Var.Q;
                            zn5Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            zn5Var.n((userProfilePhoto != null ? userProfilePhoto.photo_small : null) != null, new kc((byte) 10), new DialogInterface.OnDismissListener() { // from class: tt2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b5;
                                    b29 b29Var3 = b29Var22;
                                    cu2 cu2Var2 = cu2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!cu2Var2.Q.g()) {
                                                b29Var3.K(86);
                                                cu2Var2.E.e.d();
                                                break;
                                            } else {
                                                b29Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!cu2Var2.Q.g()) {
                                                b29Var3.K(85);
                                                cu2Var2.y.e.d();
                                                break;
                                            } else {
                                                b29Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            b29Var22.H(0);
                            b29Var22.K(43);
                            cu2Var.y.e.d();
                            break;
                        default:
                            cu2Var.S = (byte) 2;
                            zn5 zn5Var2 = cu2Var.Q;
                            zn5Var2.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                            zn5Var2.n((userProfilePhoto2 != null ? userProfilePhoto2.photo_small : null) != null, new kc((byte) 10), new DialogInterface.OnDismissListener() { // from class: tt2
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b7 = b6;
                                    b29 b29Var3 = b29Var22;
                                    cu2 cu2Var2 = cu2Var;
                                    switch (b7) {
                                        case 0:
                                            if (!cu2Var2.Q.g()) {
                                                b29Var3.K(86);
                                                cu2Var2.E.e.d();
                                                break;
                                            } else {
                                                b29Var3.I(0, false, false);
                                                break;
                                            }
                                        default:
                                            if (!cu2Var2.Q.g()) {
                                                b29Var3.K(85);
                                                cu2Var2.y.e.d();
                                                break;
                                            } else {
                                                b29Var3.I(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            b29Var22.H(0);
                            b29Var22.K(43);
                            cu2Var.E.e.d();
                            break;
                    }
                }
            });
            this.V = new de0(context);
            this.F = new au2(this, context, vnbVar);
            rb0 rb0Var = this.n;
            if (rb0Var == null) {
                rb0Var = new rb0(0, X1);
                this.n = rb0Var;
            }
            this.V.f(X1.photo, rb0Var);
            this.F.addView(this.V, tre.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(ob6.M0(2131745815, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(aob.K0(vnbVar, true));
            this.F.g(i2, i3);
            this.F.setOnClickListener(new c0(this, context, X1, (byte) 26));
            skb skbVar4 = new skb(context, vnbVar);
            this.G = skbVar4;
            skbVar4.o(R.drawable.menu_birthday, ob6.a0(null, null, 2131743333, new Object[0]), false);
            this.G.setBackground(aob.K0(vnbVar, true));
            this.G.g(i2, i3);
            this.G.setNeedDivider(true);
            this.G.e.setTranslationX(hl.L(4.0f));
            this.G.setOnClickListener(new sb1((Object) this, (Object) X1, (byte) 24));
            TLRPC.UserFull Y1 = getMessagesController().Y1(this.I);
            if (Y1 != null) {
                TLRPC.Photo photo = Y1.profile_photo;
                this.U = photo;
                if (photo == null) {
                    this.U = Y1.fallback_photo;
                }
            }
            j0();
        }
        q9c q9cVar = new q9c(this, new n82(this, (byte) 10), new ht2(this, b), null);
        this.X = q9cVar;
        q9cVar.s1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new bj1(this, frameLayout, b3));
        frameLayout.addView(this.X, tre.e(-1, -1, jn7.D1));
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
            jn7.f(this.currentAccount).k(jn7.v, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        dc7 dc7Var;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = uc7.s5;
            if ((intValue & 2) == 0 && (intValue & 4) == 0) {
                return;
            }
            i0();
            return;
        }
        if (i == jn7.g3 && (dc7Var = (dc7) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(dc7Var.b);
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
        zn5 zn5Var = this.Q;
        if (zn5Var.U) {
            return;
        }
        byte b = this.T;
        if (b == 2) {
            this.R = photoSize.location;
        } else if (b == 1 && getParentLayout() != null) {
            wk5 parentLayout = getParentLayout();
            e lastFragment = getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = (e) fragmentStack.get(size);
                if (eVar instanceof zu1) {
                    zu1 zu1Var = (zu1) eVar;
                    e eVar2 = lastFragment;
                    if (zu1Var.a() == this.I && zu1Var.g4 == 0) {
                        zu1Var.sb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            e eVar3 = eVar2;
                            if (arrayList.get(size2) != eVar3) {
                                ((e) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            eVar2 = eVar3;
                        }
                        eVar2.finishFragment();
                    } else {
                        lastFragment = eVar2;
                    }
                }
                arrayList.add((e) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            this.e.m(jn5.e(this.R), "50_50", this.n, getMessagesController().X1(Long.valueOf(this.I)));
            if (this.T == 2) {
                h0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                r7a.B(this.currentAccount);
                tL_messageService.random_id = r7a.D();
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
                r47 r47Var = new r47(this.currentAccount, tL_messageService, false, false);
                this.a0 = r47Var;
                arrayList2.add(r47Var);
                new ArrayList().add(tL_messageService);
                uc7.s1(this.currentAccount).z5(0, this.I, arrayList2);
                getMessagesController().n4.put(tL_messageService.local_id, zn5Var);
            }
        } else {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.I));
            if (this.a0 == null && X1 != null) {
                boolean z2 = inputFile2 != null;
                X1.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                X1.photo = tL_userProfilePhoto;
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
                arrayList3.add(X1);
                getMessagesStorage().n1(arrayList3, null, false, true);
                getNotificationCenter().k(jn7.c0, new Object[0]);
                jn7 notificationCenter = getNotificationCenter();
                int i2 = uc7.s5;
                notificationCenter.k(2, 2);
            }
            g0(this.R, photoSize2.location, inputFile, inputFile2, videoSize, d, this.T);
            h0(false, true);
        }
        j0();
    }

    @Override // yn5
    public final boolean f() {
        return this.T != 1;
    }

    public final void f0(TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        if (this.a0 == null) {
            if ((fileLocation == null && inputFile == null) || tLObject == null) {
                return;
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.I));
            TLRPC.UserFull Y1 = uc7.s1(this.currentAccount).Y1(this.I);
            if (Y1 != null) {
                Y1.personal_photo = tL_photos_photo.photo;
                Y1.flags |= TLObject.FLAG_21;
                getMessagesStorage().l2(Y1, true);
            }
            if (X1 != null) {
                TLRPC.PhotoSize w = xb4.w(arrayList, 100, false, null, false);
                TLRPC.PhotoSize w2 = xb4.w(arrayList, 1000, false, null, false);
                if (w != null && fileLocation != null) {
                    xb4.G(this.currentAccount);
                    File J = xb4.J(w, null, true, true);
                    xb4.G(this.currentAccount);
                    xb4.J(fileLocation, null, true, true).renameTo(J);
                    StringBuilder sb = new StringBuilder();
                    sb.append(fileLocation.volume_id);
                    sb.append("_");
                    String l = uh9.l(sb, fileLocation.local_id, "@50_50");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w.location.volume_id);
                    sb2.append("_");
                    in5.z().O(l, uh9.l(sb2, w.location.local_id, "@50_50"), jn5.l(this.currentAccount, 1, X1));
                }
                if (w2 != null && fileLocation2 != null) {
                    xb4.G(this.currentAccount);
                    File J2 = xb4.J(w2, null, true, true);
                    xb4.G(this.currentAccount);
                    xb4.J(fileLocation2, null, true, true).renameTo(J2);
                }
                u98.a(tL_photos_photo.photo, X1, true);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(X1);
                getMessagesStorage().n1(arrayList2, null, false, true);
                getMessagesController().U0(this.I);
                getNotificationCenter().k(jn7.c0, new Object[0]);
                getNotificationCenter().k(2, 2);
                if (getParentActivity() != null) {
                    if (i == 2) {
                        d31.b0(this).V(arrayList2, hl.S2(ob6.a0("UserCustomPhotoSeted", null, 2131743398, X1.first_name)), null, null).j();
                    } else {
                        d31.b0(this).V(arrayList2, hl.S2(ob6.a0("UserCustomPhotoSeted", null, 2131743398, X1.first_name)), null, null).j();
                    }
                }
            }
            this.R = null;
            j0();
        }
    }

    public final void g0(final TLRPC.FileLocation fileLocation, final TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final int i) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().o1(this.I);
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new RequestDelegate() { // from class: ut2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                hl.c3(new wt2(cu2.this, fileLocation, inputFile2, tLObject, fileLocation2, i));
            }
        });
    }

    @Override // yn5
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override // yn5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.e
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView3, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<a81, Float>) property, 1.0f));
        } else {
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<a81, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new z7((byte) 24, (Object) this, z));
        this.x.start();
    }

    public final void i0() {
        TLRPC.User X1;
        if (this.f == null || (X1 = getMessagesController().X1(Long.valueOf(this.I))) == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(a0());
        TextView textView = this.f;
        if (isEmpty) {
            textView.setText(ob6.M0(2131748164, null));
        } else {
            textView.setText(f78.f().e("+" + a0()));
        }
        this.h.setText(ob6.d0(this.currentAccount, X1, null, null));
        if (this.R == null) {
            de0 de0Var = this.e;
            rb0 rb0Var = new rb0(0, X1);
            this.n = rb0Var;
            de0Var.f(X1, rb0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.Photo photo;
        if (this.J) {
            return;
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.I));
        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.U) != null) {
            this.V.m(jn5.i(xb4.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.n, null);
        }
        rb0 rb0Var = this.n;
        if (rb0Var == null) {
            rb0Var = new rb0(0, X1);
            this.n = rb0Var;
        }
        TLRPC.FileLocation fileLocation = this.R;
        de0 de0Var = this.e;
        if (fileLocation == null) {
            de0Var.f(X1, rb0Var);
        } else {
            de0Var.m(jn5.e(fileLocation), "50_50", this.n, getMessagesController().X1(Long.valueOf(this.I)));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, jn7.g3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        this.L = uc7.s1(this.currentAccount).X3.getBoolean("dialog_bar_exception" + this.I, false);
        TLRPC.User X1 = this.I != 0 ? getMessagesController().X1(Long.valueOf(this.I)) : null;
        zn5 zn5Var = this.Q;
        if (zn5Var != null) {
            zn5Var.a = this;
            zn5Var.b = this;
        }
        this.H = uc7.s1(this.currentAccount).U0(this.I);
        return X1 != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.g3);
        zn5 zn5Var = this.Q;
        if (zn5Var != null) {
            zn5Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        this.Q.i();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        i0();
        this.Q.k();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        TLRPC.User X1;
        try {
            super.onThemeColorsChanged();
            if (this.e == null || (X1 = getMessagesController().X1(Long.valueOf(this.I))) == null) {
                return;
            }
            this.n.q(X1);
            this.e.invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // yn5
    public final boolean x() {
        return false;
    }

    public cu2(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new zn5(0, true, true);
    }
}
