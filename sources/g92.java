// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class g92 extends e implements yn5, fn7 {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public LinearLayout E;
    public TLRPC.UserFull E0;
    public EditTextBoldCursor F;
    public boolean F0;
    public LinearLayout G;
    public boolean G0;
    public sca H;
    public boolean H0;
    public skb I;
    public boolean I0;
    public skb J;
    public boolean J0;
    public skb K;
    public boolean K0;
    public skb L;
    public TLRPC.ChatReactions L0;
    public j38 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public skb N;
    public boolean N0;
    public skb O;
    public boolean O0;
    public skb P;
    public boolean P0;
    public ilb Q;
    public final ArrayList Q0;
    public skb R;
    public final d92 R0;
    public LinearLayout S;
    public b29 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public skb U;
    public skb V;
    public skb W;
    public skb X;
    public skb Y;
    public skb Z;
    public nla a;
    public skb a0;
    public id b;
    public skb b0;
    public UndoView c;
    public e92 c0;
    public LinearLayout d;
    public FrameLayout d0;
    public mb0 e;
    public qmb e0;
    public a81 f;
    public skb f0;
    public skb g0;
    public AnimatorSet h;
    public zn2 h0;
    public ilb i0;
    public skb j0;
    public ilb k0;
    public skb l0;
    public skb m0;
    public RadialProgressView n;
    public skb n0;
    public skb o0;
    public skb p0;
    public skb q0;
    public final rb0 r;
    public skb r0;
    public final zn5 s;
    public ilb s0;
    public ilb t0;
    public skb u0;
    public TLRPC.FileLocation v0;
    public iu3 w;
    public long w0;
    public u1 x;
    public TLRPC.Chat x0;
    public ny9 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public g92(Bundle bundle) {
        super(bundle);
        this.Q0 = new ArrayList();
        this.R0 = new d92(this);
        this.r = new rb0((vnb) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new zn5(0, false, false);
        } else {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
            this.s = new zn5((M0 == null || !xc2.V(M0)) ? 2 : 1, true, true);
        }
    }

    public static SpannableStringBuilder a0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        lf4 lf4Var = new lf4(10);
        lf4Var.a.setTypeface(hl.n1("fonts/num.otf"));
        lf4Var.f = aob.w0(null, aob.Ck, false);
        lf4Var.n = false;
        spannableStringBuilder.setSpan(lf4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String d0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_username tL_username = arrayList.get(i);
            i++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override // yn5
    public final void H(float f) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // yn5
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // yn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
    }

    public final boolean b0(boolean z) {
        iu3 iu3Var;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        byte b = 1;
        byte b2 = 0;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            iu3 iu3Var2 = this.w;
            if ((iu3Var2 != null && !this.D0.first_name.equals(iu3Var2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(2131743381, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131752964, null);
                    alertDialog$Builder.j(ob6.M0(2131754209, null), new a92(this, b2));
                    alertDialog$Builder.g(ob6.M0(2131747307, null), new a92(this, b));
                    showDialog(idVar);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && xc2.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((iu3Var = this.w) != null && !this.x0.title.equals(iu3Var.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = ob6.M0(2131743381, "UserRestrictionsApplyChanges");
                id idVar2 = alertDialog$Builder2.a;
                idVar2.S = M02;
                if (this.J0) {
                    idVar2.U = ob6.M0(2131752271, "ChannelSettingsChangedAlert");
                } else {
                    idVar2.U = ob6.M0(2131749155, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.j(ob6.M0(2131754209, "ApplyTheme"), new a92(this, (byte) 2));
                alertDialog$Builder2.g(ob6.M0(2131747307, "PassportDiscard"), new a92(this, (byte) 3));
                showDialog(idVar2);
            }
            return false;
        }
        return true;
    }

    public final void c0() {
        String str;
        if (this.f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().H2.f(-this.w0);
        if (arrayList == null || arrayList.isEmpty()) {
            str = null;
        } else {
            r47 r47Var = (r47) c00.g(1, arrayList);
            str = !TextUtils.isEmpty(r47Var.z) ? r47Var.z.toString() : !TextUtils.isEmpty(r47Var.v) ? r47Var.v.toString() : "";
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = ob6.M0(2131742523, null);
        }
        this.f0.u(ob6.M0(2131742529, null), str, false, R.drawable.menu_welcome_messages, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:376:0x0449, code lost:
    
        if (xc2.y(0, r37.x0) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0a0f  */
    /* JADX WARN: Type inference failed for: r22v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r22;
        final g92 g92Var;
        int i;
        int i2;
        Context context2;
        CharSequence charSequence;
        int i3;
        uob uobVar;
        int i4;
        CharSequence charSequence2;
        boolean z;
        CharSequence b1;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        final g92 g92Var2;
        float f;
        int i5;
        long j;
        long j2;
        boolean z2;
        String format;
        int i6;
        skb skbVar;
        skb skbVar2;
        int i7;
        int i8;
        skb skbVar3;
        skb skbVar4;
        skb skbVar5;
        skb skbVar6;
        TLRPC.ChatFull chatFull;
        int i9;
        int i10;
        Context context3;
        FrameLayout frameLayout;
        final g92 g92Var3;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final byte b = 1;
        setHasOwnBackground(true);
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            iu3Var.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 25));
        iy0 iy0Var = new iy0(this, context, (byte) 2);
        iy0Var.setOnTouchListener(new b02((byte) 3));
        this.fragmentView = iy0Var;
        u1 u1Var = new u1(context, (byte) 9);
        this.x = u1Var;
        ny9 ny9Var = new ny9(context, this.x, this.resourceProvider, false);
        this.y = ny9Var;
        ny9Var.setFillViewport(true);
        this.y.setDrawBackground(true);
        iy0Var.addView(this.y, tre.c(-1.0f, -1));
        this.y.addView(u1Var, new FrameLayout.LayoutParams(-1, -2));
        u1Var.setOrientation(1);
        this.simpleActionBar.setTitle(ob6.L0(2131752387));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i11 = aob.d6;
        yob.h(i11, null, linearLayout2);
        u1Var.addView(this.d, tre.o(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, tre.o(-1, -2));
        mb0 mb0Var = new mb0((byte) 3, context, this);
        this.e = mb0Var;
        mb0Var.setRoundRadius(this.F0 ? hl.L(16.0f) : hl.L(32.0f));
        byte b2 = 4;
        if (this.D0 != null || xc2.d(this.x0)) {
            mb0 mb0Var2 = this.e;
            boolean z3 = ob6.a0;
            frameLayout2.addView(mb0Var2, tre.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            a81 a81Var = new a81(this, context, paint, b2);
            this.f = a81Var;
            boolean z4 = ob6.a0;
            frameLayout2.addView(a81Var, tre.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(hl.L(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z5 = ob6.a0;
            frameLayout2.addView(radialProgressView2, tre.d(64, 64.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 16.0f, 12.0f, z5 ? 16.0f : 0.0f, 8.0f));
            r0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    byte b4 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b3) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j3 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j3 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j3));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i12 = chatPhoto2.dc_id;
                                        if (i12 != 0) {
                                            chatPhoto2.photo_big.dc_id = i12;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i13 = userProfilePhoto2.dc_id;
                                        if (i13 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i13;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j4 = g92Var4.w0;
                            skb skbVar7 = g92Var4.I;
                            boolean z6 = skbVar7 != null && skbVar7.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j4;
                            v92Var.o0 = z6;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b4);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
        } else {
            mb0 mb0Var3 = this.e;
            boolean z6 = ob6.a0;
            frameLayout2.addView(mb0Var3, tre.d(64, 64.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : 16.0f, 12.0f, z6 ? 16.0f : 0.0f, 12.0f));
        }
        iu3 iu3Var2 = new iu3(context, iy0Var, this);
        this.w = iu3Var2;
        long j3 = this.C0;
        if (j3 != 0) {
            r22 = 0;
            iu3Var2.setHint(ob6.L0(2131753005));
        } else if (this.J0) {
            iu3Var2.setHint(ob6.M0(2131751089, "EnterChannelName"));
            r22 = false;
        } else {
            iu3Var2.setHint(ob6.M0(2131749176, "GroupName"));
            r22 = false;
        }
        iu3 iu3Var3 = this.w;
        TLRPC.Chat chat = this.x0;
        iu3Var3.setEnabled((chat != null || xc2.d(chat)) ? true : r22);
        iu3 iu3Var4 = this.w;
        iu3Var4.setFocusable(iu3Var4.isEnabled());
        this.w.getEditText().addTextChangedListener(new c7(this, (byte) 10));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r22] = new InputFilter.LengthFilter(128);
        this.w.setFilters(inputFilterArr);
        iu3 iu3Var5 = this.w;
        boolean z7 = ob6.a0;
        frameLayout2.addView(iu3Var5, tre.d(-1, -2.0f, 16, z7 ? 5.0f : 96.0f, 0.0f, z7 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(1);
        u1Var.addView(this.E, tre.o(-1, -2));
        final byte b3 = 12;
        if (this.D0 != null || xc2.d(this.x0)) {
            e92 e92Var = new e92(context);
            this.c0 = e92Var;
            yob.Q(e92Var, aob.L0(r22), null, yob.M(aob.i6));
            this.c0.g(aob.v6, aob.u6);
            this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b3;
                    byte b4 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i12 = chatPhoto2.dc_id;
                                        if (i12 != 0) {
                                            chatPhoto2.photo_big.dc_id = i12;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i13 = userProfilePhoto2.dc_id;
                                        if (i13 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i13;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j4 = g92Var4.w0;
                            skb skbVar7 = g92Var4.I;
                            boolean z62 = skbVar7 != null && skbVar7.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j4;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b4);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            this.E.addView(this.c0, tre.o(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.F = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        yob.E(this.F, aob.H6);
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        int i12 = aob.G6;
        yob.X(editTextBoldCursor2, i12, null);
        int i13 = r22;
        this.F.setPadding(i13, i13, i13, hl.L(6.0f));
        this.F.setBackgroundDrawable(null);
        this.F.setGravity(ob6.a0 ? 5 : 3);
        this.F.setInputType(180225);
        this.F.setImeOptions(6);
        this.F.setEnabled(this.D0 != null || xc2.d(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.F;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(jn7.d4)});
        this.F.setHint(ob6.M0(2131751425, "DescriptionOptionalPlaceholder"));
        yob.u(this.F, i12);
        this.F.setCursorSize(hl.L(20.0f));
        this.F.setCursorWidth(1.5f);
        boolean isEnabled = this.F.isEnabled();
        LinearLayout linearLayout4 = this.E;
        EditTextBoldCursor editTextBoldCursor4 = this.F;
        if (isEnabled) {
            linearLayout4.addView(editTextBoldCursor4, tre.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            linearLayout4.addView(editTextBoldCursor4, tre.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.F.setOnEditorActionListener(new j(this, (byte) 7));
        this.F.addTextChangedListener(new fi1((byte) 1));
        sca scaVar = new sca(context);
        this.H = scaVar;
        u1Var.addView(scaVar, tre.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        u1Var.addView(this.G, tre.o(-1, -2));
        TLRPC.Chat chat2 = this.x0;
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.y0) == null || chatFull3.can_set_location)) {
                skb skbVar7 = new skb(context);
                this.I = skbVar7;
                yob.Q(skbVar7, aob.L0(true), yob.M(i11), yob.M(aob.i6));
                this.G.addView(this.I, tre.o(-1, -2));
                final byte b4 = 15;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: u82
                    public final /* synthetic */ g92 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b4;
                        byte b42 = 4;
                        jn5 jn5Var = null;
                        g92 g92Var4 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", g92Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                bg2 bg2Var = new bg2(bundle);
                                bg2Var.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var);
                                break;
                            case 1:
                                d92 d92Var = g92Var4.R0;
                                long j32 = g92Var4.C0;
                                if (!g92Var4.s.g()) {
                                    TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                    if (X1 == null) {
                                        TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.q0().T1(null, g92Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i122 = chatPhoto2.dc_id;
                                            if (i122 != 0) {
                                                chatPhoto2.photo_big.dc_id = i122;
                                            }
                                            TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.q0().T1(null, g92Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                            int i132 = userProfilePhoto2.dc_id;
                                            if (i132 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i132;
                                            }
                                            PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", g92Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                bg2 bg2Var2 = new bg2(bundle2);
                                bg2Var2.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var2);
                                break;
                            case 3:
                                g92Var4.presentFragment(new qu0(g92Var4.w0));
                                break;
                            case 4:
                                g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                break;
                            case 5:
                                g92Var4.presentFragment(new wf1(g92Var4.x0));
                                break;
                            case 6:
                                g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", g92Var4.C0);
                                g92Var4.presentFragment(new ve1(bundle3));
                                break;
                            case 8:
                                g92Var4.presentFragment(new cc(g92Var4.C0));
                                break;
                            case 9:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                break;
                            case 10:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                break;
                            case 11:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                break;
                            case 12:
                                g92Var4.m0();
                                break;
                            case 13:
                                g92Var4.h0();
                                break;
                            case 14:
                                g92 g92Var5 = this.b;
                                jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                break;
                            case 15:
                                if (hl.H1(g92Var4)) {
                                    uc6 uc6Var = new uc6(4);
                                    uc6Var.m0 = -g92Var4.w0;
                                    TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                    g92Var4.presentFragment(uc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = g92Var4.w0;
                                skb skbVar72 = g92Var4.I;
                                boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                v92 v92Var = new v92(null);
                                v92Var.N = new ArrayList();
                                v92Var.O = new ArrayList();
                                v92Var.Q = new ArrayList();
                                v92Var.d0 = true;
                                v92Var.g0 = new ArrayList();
                                v92Var.p0 = new HashMap();
                                v92Var.r0 = new i92(v92Var, (byte) 5);
                                v92Var.t0 = false;
                                v92Var.a0 = j4;
                                v92Var.o0 = z62;
                                TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                v92Var.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        v92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        v92Var.c0(false);
                                    }
                                }
                                g92Var4.presentFragment(v92Var);
                                break;
                            case 17:
                                long j5 = g92Var4.w0;
                                na2 na2Var = new na2(null);
                                na2Var.w = new ArrayList();
                                na2Var.P = false;
                                na2Var.Q = false;
                                na2Var.F = j5;
                                TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                na2Var.f = M02;
                                na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                na2Var.h = g92Var4.y0;
                                g92Var4.presentFragment(na2Var);
                                break;
                            case 18:
                                ij8 ij8Var = new ij8(g92Var4.w0);
                                ij8Var.s = new a92(g92Var4, b42);
                                g92Var4.presentFragment(ij8Var);
                                break;
                            case 19:
                                g92Var4.e0();
                                break;
                            case 20:
                                dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                dc5Var.c = g92Var4.M0;
                                dc5Var.m0 = g92Var4;
                                g92Var4.presentFragment(dc5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", g92Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                bg2 bg2Var3 = new bg2(bundle4);
                                bg2Var3.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var3);
                                break;
                            case 22:
                                ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                g92Var4.presentFragment(ck6Var);
                                break;
                            case 23:
                                if (!xc2.V(g92Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", g92Var4.w0);
                                    ed2 ed2Var = new ed2(bundle5);
                                    TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                    ed2Var.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ed2Var.a == null) {
                                            ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                        }
                                        ed2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ed2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ed2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            ed2Var.w = (byte) 1;
                                        }
                                    }
                                    g92Var4.presentFragment(ed2Var);
                                    break;
                                } else {
                                    g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = qu6.j(9, "chatMode");
                                j6.putLong("chat_id", g92Var4.w0);
                                j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                g92Var4.presentFragment(new zu1(j6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull2 = this.y0) == null || chatFull2.can_set_username)) {
                skb skbVar8 = new skb(context);
                this.J = skbVar8;
                yob.Q(skbVar8, aob.L0(true), yob.M(i11), yob.M(aob.i6));
                this.G.addView(this.J, tre.o(-1, -2));
                final byte b5 = 16;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: u82
                    public final /* synthetic */ g92 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b5;
                        byte b42 = 4;
                        jn5 jn5Var = null;
                        g92 g92Var4 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", g92Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                bg2 bg2Var = new bg2(bundle);
                                bg2Var.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var);
                                break;
                            case 1:
                                d92 d92Var = g92Var4.R0;
                                long j32 = g92Var4.C0;
                                if (!g92Var4.s.g()) {
                                    TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                    if (X1 == null) {
                                        TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.q0().T1(null, g92Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i122 = chatPhoto2.dc_id;
                                            if (i122 != 0) {
                                                chatPhoto2.photo_big.dc_id = i122;
                                            }
                                            TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.q0().T1(null, g92Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                            int i132 = userProfilePhoto2.dc_id;
                                            if (i132 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i132;
                                            }
                                            PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", g92Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                bg2 bg2Var2 = new bg2(bundle2);
                                bg2Var2.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var2);
                                break;
                            case 3:
                                g92Var4.presentFragment(new qu0(g92Var4.w0));
                                break;
                            case 4:
                                g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                break;
                            case 5:
                                g92Var4.presentFragment(new wf1(g92Var4.x0));
                                break;
                            case 6:
                                g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", g92Var4.C0);
                                g92Var4.presentFragment(new ve1(bundle3));
                                break;
                            case 8:
                                g92Var4.presentFragment(new cc(g92Var4.C0));
                                break;
                            case 9:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                break;
                            case 10:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                break;
                            case 11:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                break;
                            case 12:
                                g92Var4.m0();
                                break;
                            case 13:
                                g92Var4.h0();
                                break;
                            case 14:
                                g92 g92Var5 = this.b;
                                jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                break;
                            case 15:
                                if (hl.H1(g92Var4)) {
                                    uc6 uc6Var = new uc6(4);
                                    uc6Var.m0 = -g92Var4.w0;
                                    TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                    g92Var4.presentFragment(uc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = g92Var4.w0;
                                skb skbVar72 = g92Var4.I;
                                boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                v92 v92Var = new v92(null);
                                v92Var.N = new ArrayList();
                                v92Var.O = new ArrayList();
                                v92Var.Q = new ArrayList();
                                v92Var.d0 = true;
                                v92Var.g0 = new ArrayList();
                                v92Var.p0 = new HashMap();
                                v92Var.r0 = new i92(v92Var, (byte) 5);
                                v92Var.t0 = false;
                                v92Var.a0 = j4;
                                v92Var.o0 = z62;
                                TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                v92Var.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        v92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        v92Var.c0(false);
                                    }
                                }
                                g92Var4.presentFragment(v92Var);
                                break;
                            case 17:
                                long j5 = g92Var4.w0;
                                na2 na2Var = new na2(null);
                                na2Var.w = new ArrayList();
                                na2Var.P = false;
                                na2Var.Q = false;
                                na2Var.F = j5;
                                TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                na2Var.f = M02;
                                na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                na2Var.h = g92Var4.y0;
                                g92Var4.presentFragment(na2Var);
                                break;
                            case 18:
                                ij8 ij8Var = new ij8(g92Var4.w0);
                                ij8Var.s = new a92(g92Var4, b42);
                                g92Var4.presentFragment(ij8Var);
                                break;
                            case 19:
                                g92Var4.e0();
                                break;
                            case 20:
                                dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                dc5Var.c = g92Var4.M0;
                                dc5Var.m0 = g92Var4;
                                g92Var4.presentFragment(dc5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", g92Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                bg2 bg2Var3 = new bg2(bundle4);
                                bg2Var3.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var3);
                                break;
                            case 22:
                                ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                g92Var4.presentFragment(ck6Var);
                                break;
                            case 23:
                                if (!xc2.V(g92Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", g92Var4.w0);
                                    ed2 ed2Var = new ed2(bundle5);
                                    TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                    ed2Var.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ed2Var.a == null) {
                                            ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                        }
                                        ed2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ed2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ed2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            ed2Var.w = (byte) 1;
                                        }
                                    }
                                    g92Var4.presentFragment(ed2Var);
                                    break;
                                } else {
                                    g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = qu6.j(9, "chatMode");
                                j6.putLong("chat_id", g92Var4.w0);
                                j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                g92Var4.presentFragment(new zu1(j6));
                                break;
                        }
                    }
                });
            }
            if (xc2.T(this.x0)) {
                if (this.J0 && xc2.y(1, this.x0)) {
                    charSequence = "";
                } else if (!this.J0) {
                    charSequence = "";
                }
                skb skbVar9 = new skb(context);
                this.K = skbVar9;
                yob.Q(skbVar9, aob.L0(true), yob.M(i11), yob.M(aob.i6));
                this.G.addView(this.K, tre.o(-1, -2));
                final byte b6 = 17;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: u82
                    public final /* synthetic */ g92 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b6;
                        byte b42 = 4;
                        jn5 jn5Var = null;
                        g92 g92Var4 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", g92Var4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                bg2 bg2Var = new bg2(bundle);
                                bg2Var.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var);
                                break;
                            case 1:
                                d92 d92Var = g92Var4.R0;
                                long j32 = g92Var4.C0;
                                if (!g92Var4.s.g()) {
                                    TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                    if (X1 == null) {
                                        TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.q0().T1(null, g92Var4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i122 = chatPhoto2.dc_id;
                                            if (i122 != 0) {
                                                chatPhoto2.photo_big.dc_id = i122;
                                            }
                                            TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.q0().T1(null, g92Var4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                            int i132 = userProfilePhoto2.dc_id;
                                            if (i132 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i132;
                                            }
                                            PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", g92Var4.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                bg2 bg2Var2 = new bg2(bundle2);
                                bg2Var2.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var2);
                                break;
                            case 3:
                                g92Var4.presentFragment(new qu0(g92Var4.w0));
                                break;
                            case 4:
                                g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                break;
                            case 5:
                                g92Var4.presentFragment(new wf1(g92Var4.x0));
                                break;
                            case 6:
                                g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", g92Var4.C0);
                                g92Var4.presentFragment(new ve1(bundle3));
                                break;
                            case 8:
                                g92Var4.presentFragment(new cc(g92Var4.C0));
                                break;
                            case 9:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                break;
                            case 10:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                break;
                            case 11:
                                m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                break;
                            case 12:
                                g92Var4.m0();
                                break;
                            case 13:
                                g92Var4.h0();
                                break;
                            case 14:
                                g92 g92Var5 = this.b;
                                jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                break;
                            case 15:
                                if (hl.H1(g92Var4)) {
                                    uc6 uc6Var = new uc6(4);
                                    uc6Var.m0 = -g92Var4.w0;
                                    TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                    g92Var4.presentFragment(uc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = g92Var4.w0;
                                skb skbVar72 = g92Var4.I;
                                boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                v92 v92Var = new v92(null);
                                v92Var.N = new ArrayList();
                                v92Var.O = new ArrayList();
                                v92Var.Q = new ArrayList();
                                v92Var.d0 = true;
                                v92Var.g0 = new ArrayList();
                                v92Var.p0 = new HashMap();
                                v92Var.r0 = new i92(v92Var, (byte) 5);
                                v92Var.t0 = false;
                                v92Var.a0 = j4;
                                v92Var.o0 = z62;
                                TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                v92Var.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        v92Var.m0 = tL_chatInviteExported;
                                    } else {
                                        v92Var.c0(false);
                                    }
                                }
                                g92Var4.presentFragment(v92Var);
                                break;
                            case 17:
                                long j5 = g92Var4.w0;
                                na2 na2Var = new na2(null);
                                na2Var.w = new ArrayList();
                                na2Var.P = false;
                                na2Var.Q = false;
                                na2Var.F = j5;
                                TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                na2Var.f = M02;
                                na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                na2Var.h = g92Var4.y0;
                                g92Var4.presentFragment(na2Var);
                                break;
                            case 18:
                                ij8 ij8Var = new ij8(g92Var4.w0);
                                ij8Var.s = new a92(g92Var4, b42);
                                g92Var4.presentFragment(ij8Var);
                                break;
                            case 19:
                                g92Var4.e0();
                                break;
                            case 20:
                                dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                dc5Var.c = g92Var4.M0;
                                dc5Var.m0 = g92Var4;
                                g92Var4.presentFragment(dc5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", g92Var4.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                bg2 bg2Var3 = new bg2(bundle4);
                                bg2Var3.B0(g92Var4.y0);
                                g92Var4.presentFragment(bg2Var3);
                                break;
                            case 22:
                                ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                g92Var4.presentFragment(ck6Var);
                                break;
                            case 23:
                                if (!xc2.V(g92Var4.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", g92Var4.w0);
                                    ed2 ed2Var = new ed2(bundle5);
                                    TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                    ed2Var.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ed2Var.a == null) {
                                            ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                        }
                                        ed2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ed2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ed2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            ed2Var.w = (byte) 1;
                                        }
                                    }
                                    g92Var4.presentFragment(ed2Var);
                                    break;
                                } else {
                                    g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = qu6.j(9, "chatMode");
                                j6.putLong("chat_id", g92Var4.w0);
                                j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                g92Var4.presentFragment(new zu1(j6));
                                break;
                        }
                    }
                });
                if (!xc2.V(this.x0) && this.J0 && xc2.y(1, this.x0)) {
                    skb skbVar10 = new skb(context);
                    this.L = skbVar10;
                    yob.Q(skbVar10, aob.L0(true), yob.M(i11), yob.M(aob.i6));
                    this.L.s(ob6.L0(2131746823), charSequence, R.drawable.msg_markunread, true);
                    i9 = -1;
                    this.G.addView(this.L, tre.o(-1, -2));
                    final byte b7 = 18;
                    this.L.setOnClickListener(new View.OnClickListener(this) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b7;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j4 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j4;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                } else {
                    i9 = -1;
                }
                if (xc2.V(this.x0) || !xc2.d(this.x0)) {
                    i = i11;
                    i10 = -2;
                } else {
                    i = i11;
                    i10 = -2;
                    j38 j38Var = new j38(this.currentAccount, -this.x0.id, getResourceProvider(), context);
                    this.M = j38Var;
                    yob.Q(j38Var, aob.L0(true), yob.M(i), yob.M(aob.i6));
                    this.G.addView(this.M, tre.o(i9, -2));
                    final byte b8 = 19;
                    this.M.setOnClickListener(new View.OnClickListener(this) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b8;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j4 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j4;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                }
                if (xc2.V(this.x0) || xc2.Y(this.x0)) {
                    context3 = context;
                    i2 = i10;
                    frameLayout = frameLayout2;
                    g92Var3 = this;
                } else {
                    long j4 = -this.x0.id;
                    skb skbVar11 = new skb(23, this.resourceProvider, context, false, true);
                    context3 = context;
                    this.N = skbVar11;
                    yob.Q(skbVar11, aob.L0(true), yob.M(i), yob.M(aob.i6));
                    this.N.n(R.drawable.msg_translate, ob6.L0(2131752432), this.x0.autotranslation);
                    final byte b9 = 0;
                    getMessagesController().G0().a(j4, new pcc(this) { // from class: y82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = this;
                        }

                        @Override // pcc
                        public final void a(Object obj) {
                            byte b10 = b9;
                            g92 g92Var4 = this.b;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            switch (b10) {
                                case 0:
                                    if (tL_premium_boostsStatus != null) {
                                        g92Var4.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < g92Var4.getMessagesController().l4.c2.f() ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                    break;
                                default:
                                    g92Var4.M0 = tL_premium_boostsStatus;
                                    break;
                            }
                        }
                    });
                    this.G.addView(this.N, tre.o(-1, -2));
                    i2 = -2;
                    frameLayout = frameLayout2;
                    g92Var3 = this;
                    this.N.setOnClickListener(new dg(this, new boolean[]{false}, j4, (byte) 2));
                }
                if (!g92Var3.J0 && xc2.w(2, g92Var3.x0) && (xc2.T(g92Var3.x0) || g92Var3.x0.creator)) {
                    skb skbVar12 = new skb(context3);
                    g92Var3.O = skbVar12;
                    yob.Q(skbVar12, aob.L0(true), yob.M(i), yob.M(aob.i6));
                    g92Var3.G.addView(g92Var3.O, tre.o(-1, i2));
                    g92Var3.O.setOnClickListener(new sb1((Object) g92Var3, (Object) context3, (byte) 15));
                }
                if (xc2.n0(g92Var3.x0) || !xc2.N(g92Var3.x0) || xc2.Y(g92Var3.x0)) {
                    g92Var = g92Var3;
                } else {
                    final byte b10 = 1;
                    uc7.s1(g92Var3.currentAccount).G0().a(-g92Var3.x0.id, new pcc(g92Var3) { // from class: y82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = g92Var3;
                        }

                        @Override // pcc
                        public final void a(Object obj) {
                            byte b102 = b10;
                            g92 g92Var4 = this.b;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            switch (b102) {
                                case 0:
                                    if (tL_premium_boostsStatus != null) {
                                        g92Var4.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < g92Var4.getMessagesController().l4.c2.f() ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                    break;
                                default:
                                    g92Var4.M0 = tL_premium_boostsStatus;
                                    break;
                            }
                        }
                    });
                    Context context4 = context3;
                    g92Var = this;
                    j38 j38Var2 = new j38(g92Var3.currentAccount, -g92Var3.x0.id, getResourceProvider(), context4);
                    g92Var.M = j38Var2;
                    yob.Q(j38Var2, aob.L0(true), yob.M(i), yob.M(aob.i6));
                    g92Var.G.addView(g92Var.M, tre.o(-1, i2));
                    final byte b11 = 20;
                    g92Var.M.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = g92Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b11;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j42;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                }
                if (g92Var.J0 && g92Var.x0.creator) {
                    skb skbVar13 = new skb(23, null, context, false, true);
                    context2 = context;
                    g92Var.R = skbVar13;
                    yob.Q(skbVar13, aob.L0(true), yob.M(i), yob.M(aob.i6));
                    g92Var.R.n(R.drawable.msg_topics, ob6.L0(2131752247), g92Var.F0);
                    g92Var.R.getCheckBox().setIcon(g92Var.G0 ? 0 : R.drawable.permission_locked);
                    g92Var.G.addView(g92Var.R, tre.c(-2.0f, -1));
                    g92Var.R.setOnClickListener(new sb1((Object) g92Var, (Object) frameLayout, (byte) 16));
                } else {
                    context2 = context;
                }
                g92Var.s0();
            }
            charSequence = "";
            if (!xc2.V(this.x0)) {
            }
            i9 = -1;
            if (xc2.V(this.x0)) {
            }
            i = i11;
            i10 = -2;
            if (xc2.V(this.x0)) {
            }
            context3 = context;
            i2 = i10;
            frameLayout = frameLayout2;
            g92Var3 = this;
            if (!g92Var3.J0) {
                skb skbVar122 = new skb(context3);
                g92Var3.O = skbVar122;
                yob.Q(skbVar122, aob.L0(true), yob.M(i), yob.M(aob.i6));
                g92Var3.G.addView(g92Var3.O, tre.o(-1, i2));
                g92Var3.O.setOnClickListener(new sb1((Object) g92Var3, (Object) context3, (byte) 15));
            }
            if (xc2.n0(g92Var3.x0)) {
            }
            g92Var = g92Var3;
            if (g92Var.J0) {
            }
            context2 = context;
            g92Var.s0();
        } else {
            g92Var = this;
            i = i11;
            i2 = -2;
            context2 = context;
            charSequence = "";
        }
        g92Var.simpleActionBar.v();
        if (g92Var.D0 != null || xc2.d(g92Var.x0) || g92Var.O != null) {
            g92Var.a = g92Var.simpleActionBar.u(ob6.L0(2131745674));
        }
        if (g92Var.I == null && g92Var.O == null && g92Var.J == null && g92Var.K == null && g92Var.R == null) {
            i3 = -1;
        } else {
            ilb ilbVar = new ilb(12, g92Var.resourceProvider, context2);
            g92Var.Q = ilbVar;
            if (g92Var.R != null) {
                ilbVar.setText(ob6.L0(2131750548));
            } else {
                ilbVar.setFixedSize(12);
            }
            i3 = -1;
            u1Var.addView(g92Var.Q, tre.o(-1, i2));
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        g92Var.S = linearLayout6;
        linearLayout6.setOrientation(1);
        u1Var.addView(g92Var.S, tre.o(i3, i2));
        final byte b12 = 8;
        if (g92Var.x0 != null) {
            skb skbVar14 = new skb(context2);
            g92Var.Y = skbVar14;
            hf0 L0 = aob.L0(false);
            int i14 = aob.i6;
            uobVar = null;
            yob.Q(skbVar14, L0, null, yob.M(i14));
            skb skbVar15 = g92Var.Y;
            if (!xc2.T(g92Var.x0)) {
                TLRPC.Chat chat3 = g92Var.x0;
                if (!chat3.creator && (!xc2.N(chat3) || !xc2.d(g92Var.x0))) {
                    i6 = 8;
                    skbVar15.setVisibility(i6);
                    final byte b13 = 21;
                    g92Var.Y.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = g92Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b13;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j42;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                    skb skbVar16 = new skb(context2);
                    g92Var.W = skbVar16;
                    yob.Q(skbVar16, aob.L0(false), null, yob.M(i14));
                    final byte b14 = 22;
                    g92Var.W.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = g92Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b14;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j42;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                    skb skbVar17 = new skb(context2);
                    g92Var.P = skbVar17;
                    yob.Q(skbVar17, aob.L0(false), null, yob.M(i14));
                    final byte b15 = 23;
                    g92Var.P.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = g92Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b15;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j42;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                    if (xc2.y(28, g92Var.x0)) {
                        skb skbVar18 = new skb(context2);
                        g92Var.f0 = skbVar18;
                        yob.Q(skbVar18, aob.L0(false), null, yob.M(i14));
                        final byte b16 = 24;
                        g92Var.f0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                            public final /* synthetic */ g92 b;

                            {
                                this.b = g92Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b32 = b16;
                                byte b42 = 4;
                                jn5 jn5Var = null;
                                g92 g92Var4 = this.b;
                                switch (b32) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", g92Var4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        bg2 bg2Var = new bg2(bundle);
                                        bg2Var.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var);
                                        break;
                                    case 1:
                                        d92 d92Var = g92Var4.R0;
                                        long j32 = g92Var4.C0;
                                        if (!g92Var4.s.g()) {
                                            TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                            if (X1 == null) {
                                                TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.q0().T1(null, g92Var4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i122 = chatPhoto2.dc_id;
                                                    if (i122 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i122;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.q0().T1(null, g92Var4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                    int i132 = userProfilePhoto2.dc_id;
                                                    if (i132 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i132;
                                                    }
                                                    PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", g92Var4.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        bg2 bg2Var2 = new bg2(bundle2);
                                        bg2Var2.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var2);
                                        break;
                                    case 3:
                                        g92Var4.presentFragment(new qu0(g92Var4.w0));
                                        break;
                                    case 4:
                                        g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                        break;
                                    case 5:
                                        g92Var4.presentFragment(new wf1(g92Var4.x0));
                                        break;
                                    case 6:
                                        g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", g92Var4.C0);
                                        g92Var4.presentFragment(new ve1(bundle3));
                                        break;
                                    case 8:
                                        g92Var4.presentFragment(new cc(g92Var4.C0));
                                        break;
                                    case 9:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                        break;
                                    case 10:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                        break;
                                    case 11:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                        break;
                                    case 12:
                                        g92Var4.m0();
                                        break;
                                    case 13:
                                        g92Var4.h0();
                                        break;
                                    case 14:
                                        g92 g92Var5 = this.b;
                                        jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                        break;
                                    case 15:
                                        if (hl.H1(g92Var4)) {
                                            uc6 uc6Var = new uc6(4);
                                            uc6Var.m0 = -g92Var4.w0;
                                            TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                            g92Var4.presentFragment(uc6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = g92Var4.w0;
                                        skb skbVar72 = g92Var4.I;
                                        boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                        v92 v92Var = new v92(null);
                                        v92Var.N = new ArrayList();
                                        v92Var.O = new ArrayList();
                                        v92Var.Q = new ArrayList();
                                        v92Var.d0 = true;
                                        v92Var.g0 = new ArrayList();
                                        v92Var.p0 = new HashMap();
                                        v92Var.r0 = new i92(v92Var, (byte) 5);
                                        v92Var.t0 = false;
                                        v92Var.a0 = j42;
                                        v92Var.o0 = z62;
                                        TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                        v92Var.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                v92Var.m0 = tL_chatInviteExported;
                                            } else {
                                                v92Var.c0(false);
                                            }
                                        }
                                        g92Var4.presentFragment(v92Var);
                                        break;
                                    case 17:
                                        long j5 = g92Var4.w0;
                                        na2 na2Var = new na2(null);
                                        na2Var.w = new ArrayList();
                                        na2Var.P = false;
                                        na2Var.Q = false;
                                        na2Var.F = j5;
                                        TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                        na2Var.f = M02;
                                        na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                        na2Var.h = g92Var4.y0;
                                        g92Var4.presentFragment(na2Var);
                                        break;
                                    case 18:
                                        ij8 ij8Var = new ij8(g92Var4.w0);
                                        ij8Var.s = new a92(g92Var4, b42);
                                        g92Var4.presentFragment(ij8Var);
                                        break;
                                    case 19:
                                        g92Var4.e0();
                                        break;
                                    case 20:
                                        dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                        dc5Var.c = g92Var4.M0;
                                        dc5Var.m0 = g92Var4;
                                        g92Var4.presentFragment(dc5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", g92Var4.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                        bg2 bg2Var3 = new bg2(bundle4);
                                        bg2Var3.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var3);
                                        break;
                                    case 22:
                                        ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                        ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                        g92Var4.presentFragment(ck6Var);
                                        break;
                                    case 23:
                                        if (!xc2.V(g92Var4.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", g92Var4.w0);
                                            ed2 ed2Var = new ed2(bundle5);
                                            TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                            ed2Var.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (ed2Var.a == null) {
                                                    ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                                }
                                                ed2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    ed2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    ed2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    ed2Var.w = (byte) 1;
                                                }
                                            }
                                            g92Var4.presentFragment(ed2Var);
                                            break;
                                        } else {
                                            g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = qu6.j(9, "chatMode");
                                        j6.putLong("chat_id", g92Var4.w0);
                                        j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                        g92Var4.presentFragment(new zu1(j6));
                                        break;
                                }
                            }
                        });
                        g92Var.c0();
                    }
                    skb skbVar19 = new skb(context2);
                    g92Var.X = skbVar19;
                    final byte b17 = 0;
                    yob.Q(skbVar19, aob.L0(false), null, yob.M(i14));
                    g92Var.X.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = g92Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b17;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j42;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                    skb skbVar20 = new skb(context2);
                    g92Var.U = skbVar20;
                    yob.Q(skbVar20, aob.L0(false), null, yob.M(i14));
                    final byte b18 = 2;
                    g92Var.U.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = g92Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b18;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j42;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                    if (!xc2.V(g92Var.x0)) {
                        skb skbVar21 = new skb(context2);
                        g92Var.V = skbVar21;
                        yob.Q(skbVar21, aob.L0(false), null, yob.M(i14));
                        final byte b19 = 3;
                        g92Var.V.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                            public final /* synthetic */ g92 b;

                            {
                                this.b = g92Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b32 = b19;
                                byte b42 = 4;
                                jn5 jn5Var = null;
                                g92 g92Var4 = this.b;
                                switch (b32) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", g92Var4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        bg2 bg2Var = new bg2(bundle);
                                        bg2Var.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var);
                                        break;
                                    case 1:
                                        d92 d92Var = g92Var4.R0;
                                        long j32 = g92Var4.C0;
                                        if (!g92Var4.s.g()) {
                                            TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                            if (X1 == null) {
                                                TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.q0().T1(null, g92Var4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i122 = chatPhoto2.dc_id;
                                                    if (i122 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i122;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.q0().T1(null, g92Var4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                    int i132 = userProfilePhoto2.dc_id;
                                                    if (i132 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i132;
                                                    }
                                                    PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", g92Var4.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        bg2 bg2Var2 = new bg2(bundle2);
                                        bg2Var2.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var2);
                                        break;
                                    case 3:
                                        g92Var4.presentFragment(new qu0(g92Var4.w0));
                                        break;
                                    case 4:
                                        g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                        break;
                                    case 5:
                                        g92Var4.presentFragment(new wf1(g92Var4.x0));
                                        break;
                                    case 6:
                                        g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", g92Var4.C0);
                                        g92Var4.presentFragment(new ve1(bundle3));
                                        break;
                                    case 8:
                                        g92Var4.presentFragment(new cc(g92Var4.C0));
                                        break;
                                    case 9:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                        break;
                                    case 10:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                        break;
                                    case 11:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                        break;
                                    case 12:
                                        g92Var4.m0();
                                        break;
                                    case 13:
                                        g92Var4.h0();
                                        break;
                                    case 14:
                                        g92 g92Var5 = this.b;
                                        jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                        break;
                                    case 15:
                                        if (hl.H1(g92Var4)) {
                                            uc6 uc6Var = new uc6(4);
                                            uc6Var.m0 = -g92Var4.w0;
                                            TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                            g92Var4.presentFragment(uc6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = g92Var4.w0;
                                        skb skbVar72 = g92Var4.I;
                                        boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                        v92 v92Var = new v92(null);
                                        v92Var.N = new ArrayList();
                                        v92Var.O = new ArrayList();
                                        v92Var.Q = new ArrayList();
                                        v92Var.d0 = true;
                                        v92Var.g0 = new ArrayList();
                                        v92Var.p0 = new HashMap();
                                        v92Var.r0 = new i92(v92Var, (byte) 5);
                                        v92Var.t0 = false;
                                        v92Var.a0 = j42;
                                        v92Var.o0 = z62;
                                        TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                        v92Var.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                v92Var.m0 = tL_chatInviteExported;
                                            } else {
                                                v92Var.c0(false);
                                            }
                                        }
                                        g92Var4.presentFragment(v92Var);
                                        break;
                                    case 17:
                                        long j5 = g92Var4.w0;
                                        na2 na2Var = new na2(null);
                                        na2Var.w = new ArrayList();
                                        na2Var.P = false;
                                        na2Var.Q = false;
                                        na2Var.F = j5;
                                        TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                        na2Var.f = M02;
                                        na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                        na2Var.h = g92Var4.y0;
                                        g92Var4.presentFragment(na2Var);
                                        break;
                                    case 18:
                                        ij8 ij8Var = new ij8(g92Var4.w0);
                                        ij8Var.s = new a92(g92Var4, b42);
                                        g92Var4.presentFragment(ij8Var);
                                        break;
                                    case 19:
                                        g92Var4.e0();
                                        break;
                                    case 20:
                                        dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                        dc5Var.c = g92Var4.M0;
                                        dc5Var.m0 = g92Var4;
                                        g92Var4.presentFragment(dc5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", g92Var4.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                        bg2 bg2Var3 = new bg2(bundle4);
                                        bg2Var3.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var3);
                                        break;
                                    case 22:
                                        ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                        ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                        g92Var4.presentFragment(ck6Var);
                                        break;
                                    case 23:
                                        if (!xc2.V(g92Var4.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", g92Var4.w0);
                                            ed2 ed2Var = new ed2(bundle5);
                                            TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                            ed2Var.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (ed2Var.a == null) {
                                                    ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                                }
                                                ed2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    ed2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    ed2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    ed2Var.w = (byte) 1;
                                                }
                                            }
                                            g92Var4.presentFragment(ed2Var);
                                            break;
                                        } else {
                                            g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = qu6.j(9, "chatMode");
                                        j6.putLong("chat_id", g92Var4.w0);
                                        j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                        g92Var4.presentFragment(new zu1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    skb skbVar22 = new skb(context2);
                    g92Var.a0 = skbVar22;
                    skbVar22.o(R.drawable.menu_feature_premium, a0(ob6.L0(2131752446)), false);
                    yob.Q(g92Var.a0, aob.L0(false), null, yob.M(i14));
                    final byte b20 = 4;
                    g92Var.a0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                        public final /* synthetic */ g92 b;

                        {
                            this.b = g92Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b20;
                            byte b42 = 4;
                            jn5 jn5Var = null;
                            g92 g92Var4 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", g92Var4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bg2 bg2Var = new bg2(bundle);
                                    bg2Var.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var);
                                    break;
                                case 1:
                                    d92 d92Var = g92Var4.R0;
                                    long j32 = g92Var4.C0;
                                    if (!g92Var4.s.g()) {
                                        TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                        if (X1 == null) {
                                            TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i122 = chatPhoto2.dc_id;
                                                if (i122 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i122;
                                                }
                                                TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.q0().T1(null, g92Var4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                int i132 = userProfilePhoto2.dc_id;
                                                if (i132 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i132;
                                                }
                                                PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", g92Var4.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bg2 bg2Var2 = new bg2(bundle2);
                                    bg2Var2.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var2);
                                    break;
                                case 3:
                                    g92Var4.presentFragment(new qu0(g92Var4.w0));
                                    break;
                                case 4:
                                    g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                    break;
                                case 5:
                                    g92Var4.presentFragment(new wf1(g92Var4.x0));
                                    break;
                                case 6:
                                    g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", g92Var4.C0);
                                    g92Var4.presentFragment(new ve1(bundle3));
                                    break;
                                case 8:
                                    g92Var4.presentFragment(new cc(g92Var4.C0));
                                    break;
                                case 9:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                    break;
                                case 10:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                    break;
                                case 11:
                                    m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                    break;
                                case 12:
                                    g92Var4.m0();
                                    break;
                                case 13:
                                    g92Var4.h0();
                                    break;
                                case 14:
                                    g92 g92Var5 = this.b;
                                    jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                    break;
                                case 15:
                                    if (hl.H1(g92Var4)) {
                                        uc6 uc6Var = new uc6(4);
                                        uc6Var.m0 = -g92Var4.w0;
                                        TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                        g92Var4.presentFragment(uc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = g92Var4.w0;
                                    skb skbVar72 = g92Var4.I;
                                    boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                    v92 v92Var = new v92(null);
                                    v92Var.N = new ArrayList();
                                    v92Var.O = new ArrayList();
                                    v92Var.Q = new ArrayList();
                                    v92Var.d0 = true;
                                    v92Var.g0 = new ArrayList();
                                    v92Var.p0 = new HashMap();
                                    v92Var.r0 = new i92(v92Var, (byte) 5);
                                    v92Var.t0 = false;
                                    v92Var.a0 = j42;
                                    v92Var.o0 = z62;
                                    TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                    v92Var.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            v92Var.m0 = tL_chatInviteExported;
                                        } else {
                                            v92Var.c0(false);
                                        }
                                    }
                                    g92Var4.presentFragment(v92Var);
                                    break;
                                case 17:
                                    long j5 = g92Var4.w0;
                                    na2 na2Var = new na2(null);
                                    na2Var.w = new ArrayList();
                                    na2Var.P = false;
                                    na2Var.Q = false;
                                    na2Var.F = j5;
                                    TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                    na2Var.f = M02;
                                    na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                    na2Var.h = g92Var4.y0;
                                    g92Var4.presentFragment(na2Var);
                                    break;
                                case 18:
                                    ij8 ij8Var = new ij8(g92Var4.w0);
                                    ij8Var.s = new a92(g92Var4, b42);
                                    g92Var4.presentFragment(ij8Var);
                                    break;
                                case 19:
                                    g92Var4.e0();
                                    break;
                                case 20:
                                    dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                    dc5Var.c = g92Var4.M0;
                                    dc5Var.m0 = g92Var4;
                                    g92Var4.presentFragment(dc5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", g92Var4.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                    bg2 bg2Var3 = new bg2(bundle4);
                                    bg2Var3.B0(g92Var4.y0);
                                    g92Var4.presentFragment(bg2Var3);
                                    break;
                                case 22:
                                    ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                    ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                    g92Var4.presentFragment(ck6Var);
                                    break;
                                case 23:
                                    if (!xc2.V(g92Var4.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", g92Var4.w0);
                                        ed2 ed2Var = new ed2(bundle5);
                                        TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                        ed2Var.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ed2Var.a == null) {
                                                ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                            }
                                            ed2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ed2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ed2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                ed2Var.w = (byte) 1;
                                            }
                                        }
                                        g92Var4.presentFragment(ed2Var);
                                        break;
                                    } else {
                                        g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = qu6.j(9, "chatMode");
                                    j6.putLong("chat_id", g92Var4.w0);
                                    j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                    g92Var4.presentFragment(new zu1(j6));
                                    break;
                            }
                        }
                    });
                    g92Var.a0.setVisibility(8);
                    if (!xc2.T(g92Var.x0) || g92Var.x0.gigagroup) {
                        skb skbVar23 = new skb(context2);
                        g92Var.Z = skbVar23;
                        skbVar23.o(R.drawable.msg_log, ob6.L0(2131751044), false);
                        yob.Q(g92Var.Z, aob.L0(false), null, yob.M(i14));
                        final byte b21 = 5;
                        g92Var.Z.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                            public final /* synthetic */ g92 b;

                            {
                                this.b = g92Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b32 = b21;
                                byte b42 = 4;
                                jn5 jn5Var = null;
                                g92 g92Var4 = this.b;
                                switch (b32) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", g92Var4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        bg2 bg2Var = new bg2(bundle);
                                        bg2Var.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var);
                                        break;
                                    case 1:
                                        d92 d92Var = g92Var4.R0;
                                        long j32 = g92Var4.C0;
                                        if (!g92Var4.s.g()) {
                                            TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                            if (X1 == null) {
                                                TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.q0().T1(null, g92Var4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i122 = chatPhoto2.dc_id;
                                                    if (i122 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i122;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.q0().T1(null, g92Var4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                    int i132 = userProfilePhoto2.dc_id;
                                                    if (i132 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i132;
                                                    }
                                                    PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", g92Var4.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        bg2 bg2Var2 = new bg2(bundle2);
                                        bg2Var2.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var2);
                                        break;
                                    case 3:
                                        g92Var4.presentFragment(new qu0(g92Var4.w0));
                                        break;
                                    case 4:
                                        g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                        break;
                                    case 5:
                                        g92Var4.presentFragment(new wf1(g92Var4.x0));
                                        break;
                                    case 6:
                                        g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", g92Var4.C0);
                                        g92Var4.presentFragment(new ve1(bundle3));
                                        break;
                                    case 8:
                                        g92Var4.presentFragment(new cc(g92Var4.C0));
                                        break;
                                    case 9:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                        break;
                                    case 10:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                        break;
                                    case 11:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                        break;
                                    case 12:
                                        g92Var4.m0();
                                        break;
                                    case 13:
                                        g92Var4.h0();
                                        break;
                                    case 14:
                                        g92 g92Var5 = this.b;
                                        jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                        break;
                                    case 15:
                                        if (hl.H1(g92Var4)) {
                                            uc6 uc6Var = new uc6(4);
                                            uc6Var.m0 = -g92Var4.w0;
                                            TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                            g92Var4.presentFragment(uc6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = g92Var4.w0;
                                        skb skbVar72 = g92Var4.I;
                                        boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                        v92 v92Var = new v92(null);
                                        v92Var.N = new ArrayList();
                                        v92Var.O = new ArrayList();
                                        v92Var.Q = new ArrayList();
                                        v92Var.d0 = true;
                                        v92Var.g0 = new ArrayList();
                                        v92Var.p0 = new HashMap();
                                        v92Var.r0 = new i92(v92Var, (byte) 5);
                                        v92Var.t0 = false;
                                        v92Var.a0 = j42;
                                        v92Var.o0 = z62;
                                        TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                        v92Var.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                v92Var.m0 = tL_chatInviteExported;
                                            } else {
                                                v92Var.c0(false);
                                            }
                                        }
                                        g92Var4.presentFragment(v92Var);
                                        break;
                                    case 17:
                                        long j5 = g92Var4.w0;
                                        na2 na2Var = new na2(null);
                                        na2Var.w = new ArrayList();
                                        na2Var.P = false;
                                        na2Var.Q = false;
                                        na2Var.F = j5;
                                        TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                        na2Var.f = M02;
                                        na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                        na2Var.h = g92Var4.y0;
                                        g92Var4.presentFragment(na2Var);
                                        break;
                                    case 18:
                                        ij8 ij8Var = new ij8(g92Var4.w0);
                                        ij8Var.s = new a92(g92Var4, b42);
                                        g92Var4.presentFragment(ij8Var);
                                        break;
                                    case 19:
                                        g92Var4.e0();
                                        break;
                                    case 20:
                                        dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                        dc5Var.c = g92Var4.M0;
                                        dc5Var.m0 = g92Var4;
                                        g92Var4.presentFragment(dc5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", g92Var4.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                        bg2 bg2Var3 = new bg2(bundle4);
                                        bg2Var3.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var3);
                                        break;
                                    case 22:
                                        ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                        ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                        g92Var4.presentFragment(ck6Var);
                                        break;
                                    case 23:
                                        if (!xc2.V(g92Var4.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", g92Var4.w0);
                                            ed2 ed2Var = new ed2(bundle5);
                                            TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                            ed2Var.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (ed2Var.a == null) {
                                                    ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                                }
                                                ed2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    ed2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    ed2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    ed2Var.w = (byte) 1;
                                                }
                                            }
                                            g92Var4.presentFragment(ed2Var);
                                            break;
                                        } else {
                                            g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = qu6.j(9, "chatMode");
                                        j6.putLong("chat_id", g92Var4.w0);
                                        j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                        g92Var4.presentFragment(new zu1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    if (xc2.R(g92Var.x0)) {
                        skb skbVar24 = new skb(context2);
                        g92Var.b0 = skbVar24;
                        skbVar24.o(R.drawable.msg_stats, ob6.L0(2131744548), true);
                        yob.Q(g92Var.b0, aob.L0(false), null, yob.M(i14));
                        final byte b22 = 6;
                        g92Var.b0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                            public final /* synthetic */ g92 b;

                            {
                                this.b = g92Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b32 = b22;
                                byte b42 = 4;
                                jn5 jn5Var = null;
                                g92 g92Var4 = this.b;
                                switch (b32) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", g92Var4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        bg2 bg2Var = new bg2(bundle);
                                        bg2Var.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var);
                                        break;
                                    case 1:
                                        d92 d92Var = g92Var4.R0;
                                        long j32 = g92Var4.C0;
                                        if (!g92Var4.s.g()) {
                                            TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                            if (X1 == null) {
                                                TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.q0().T1(null, g92Var4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i122 = chatPhoto2.dc_id;
                                                    if (i122 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i122;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.q0().T1(null, g92Var4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                                    int i132 = userProfilePhoto2.dc_id;
                                                    if (i132 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i132;
                                                    }
                                                    PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", g92Var4.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        bg2 bg2Var2 = new bg2(bundle2);
                                        bg2Var2.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var2);
                                        break;
                                    case 3:
                                        g92Var4.presentFragment(new qu0(g92Var4.w0));
                                        break;
                                    case 4:
                                        g92Var4.presentFragment(new ng1(-g92Var4.w0));
                                        break;
                                    case 5:
                                        g92Var4.presentFragment(new wf1(g92Var4.x0));
                                        break;
                                    case 6:
                                        g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", g92Var4.C0);
                                        g92Var4.presentFragment(new ve1(bundle3));
                                        break;
                                    case 8:
                                        g92Var4.presentFragment(new cc(g92Var4.C0));
                                        break;
                                    case 9:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                                        break;
                                    case 10:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                                        break;
                                    case 11:
                                        m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                                        break;
                                    case 12:
                                        g92Var4.m0();
                                        break;
                                    case 13:
                                        g92Var4.h0();
                                        break;
                                    case 14:
                                        g92 g92Var5 = this.b;
                                        jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                                        break;
                                    case 15:
                                        if (hl.H1(g92Var4)) {
                                            uc6 uc6Var = new uc6(4);
                                            uc6Var.m0 = -g92Var4.w0;
                                            TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                            g92Var4.presentFragment(uc6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = g92Var4.w0;
                                        skb skbVar72 = g92Var4.I;
                                        boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                                        v92 v92Var = new v92(null);
                                        v92Var.N = new ArrayList();
                                        v92Var.O = new ArrayList();
                                        v92Var.Q = new ArrayList();
                                        v92Var.d0 = true;
                                        v92Var.g0 = new ArrayList();
                                        v92Var.p0 = new HashMap();
                                        v92Var.r0 = new i92(v92Var, (byte) 5);
                                        v92Var.t0 = false;
                                        v92Var.a0 = j42;
                                        v92Var.o0 = z62;
                                        TLRPC.ChatFull chatFull6 = g92Var4.y0;
                                        v92Var.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                v92Var.m0 = tL_chatInviteExported;
                                            } else {
                                                v92Var.c0(false);
                                            }
                                        }
                                        g92Var4.presentFragment(v92Var);
                                        break;
                                    case 17:
                                        long j5 = g92Var4.w0;
                                        na2 na2Var = new na2(null);
                                        na2Var.w = new ArrayList();
                                        na2Var.P = false;
                                        na2Var.Q = false;
                                        na2Var.F = j5;
                                        TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                                        na2Var.f = M02;
                                        na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                                        na2Var.h = g92Var4.y0;
                                        g92Var4.presentFragment(na2Var);
                                        break;
                                    case 18:
                                        ij8 ij8Var = new ij8(g92Var4.w0);
                                        ij8Var.s = new a92(g92Var4, b42);
                                        g92Var4.presentFragment(ij8Var);
                                        break;
                                    case 19:
                                        g92Var4.e0();
                                        break;
                                    case 20:
                                        dc5 dc5Var = new dc5(-g92Var4.x0.id);
                                        dc5Var.c = g92Var4.M0;
                                        dc5Var.m0 = g92Var4;
                                        g92Var4.presentFragment(dc5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", g92Var4.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                                        bg2 bg2Var3 = new bg2(bundle4);
                                        bg2Var3.B0(g92Var4.y0);
                                        g92Var4.presentFragment(bg2Var3);
                                        break;
                                    case 22:
                                        ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull7 = g92Var4.y0;
                                        ck6Var.l0(chatFull7, chatFull7.exported_invite);
                                        g92Var4.presentFragment(ck6Var);
                                        break;
                                    case 23:
                                        if (!xc2.V(g92Var4.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", g92Var4.w0);
                                            ed2 ed2Var = new ed2(bundle5);
                                            TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                            ed2Var.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (ed2Var.a == null) {
                                                    ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                                }
                                                ed2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    ed2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    ed2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    ed2Var.w = (byte) 1;
                                                }
                                            }
                                            g92Var4.presentFragment(ed2Var);
                                            break;
                                        } else {
                                            g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = qu6.j(9, "chatMode");
                                        j6.putLong("chat_id", g92Var4.w0);
                                        j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                                        g92Var4.presentFragment(new zu1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    g92Var.S.addView(g92Var.P, tre.o(-1, -2));
                    skbVar = g92Var.f0;
                    if (skbVar != null) {
                        g92Var.S.addView(skbVar, tre.o(-1, -2));
                    }
                    if (!g92Var.J0 && !g92Var.x0.gigagroup) {
                        g92Var.S.addView(g92Var.Y, tre.o(-1, -2));
                    }
                    if (!g92Var.J0) {
                        g92Var.S.addView(g92Var.W, tre.o(-1, -2));
                    }
                    g92Var.S.addView(g92Var.X, tre.o(-1, -2));
                    g92Var.S.addView(g92Var.U, tre.o(-1, -2));
                    skbVar2 = g92Var.V;
                    if (skbVar2 != null && (chatFull = g92Var.y0) != null && chatFull.requests_pending > 0) {
                        g92Var.S.addView(skbVar2, tre.o(-1, -2));
                    }
                    if (g92Var.J0) {
                        g92Var.S.addView(g92Var.W, tre.o(-1, -2));
                    }
                    if (!g92Var.J0 || g92Var.x0.gigagroup) {
                        i7 = -2;
                        i8 = -1;
                        g92Var.S.addView(g92Var.Y, tre.o(-1, -2));
                    } else {
                        i7 = -2;
                        i8 = -1;
                    }
                    skbVar3 = g92Var.b0;
                    if (skbVar3 != null) {
                        g92Var.S.addView(skbVar3, tre.o(i8, i7));
                    }
                    skbVar4 = g92Var.Z;
                    if (skbVar4 != null) {
                        g92Var.S.addView(skbVar4, tre.o(i8, i7));
                    }
                    skbVar5 = g92Var.a0;
                    if (skbVar5 != null) {
                        g92Var.S.addView(skbVar5, tre.o(i8, i7));
                    }
                    if (g92Var.a0 != null && g92Var.getMessagesController().l4.K2.f() && xc2.V(g92Var.x0)) {
                        g92Var.a0.setVisibility(0);
                    }
                    skbVar6 = g92Var.Z;
                    if (skbVar6 != null) {
                        skb skbVar25 = g92Var.a0;
                        skbVar6.setNeedDivider(skbVar25 != null && skbVar25.getVisibility() == 0);
                    }
                }
            }
            i6 = 0;
            skbVar15.setVisibility(i6);
            final byte b132 = 21;
            g92Var.Y.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b132;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            skb skbVar162 = new skb(context2);
            g92Var.W = skbVar162;
            yob.Q(skbVar162, aob.L0(false), null, yob.M(i14));
            final byte b142 = 22;
            g92Var.W.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b142;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            skb skbVar172 = new skb(context2);
            g92Var.P = skbVar172;
            yob.Q(skbVar172, aob.L0(false), null, yob.M(i14));
            final byte b152 = 23;
            g92Var.P.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b152;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            if (xc2.y(28, g92Var.x0)) {
            }
            skb skbVar192 = new skb(context2);
            g92Var.X = skbVar192;
            final byte b172 = 0;
            yob.Q(skbVar192, aob.L0(false), null, yob.M(i14));
            g92Var.X.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b172;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            skb skbVar202 = new skb(context2);
            g92Var.U = skbVar202;
            yob.Q(skbVar202, aob.L0(false), null, yob.M(i14));
            final byte b182 = 2;
            g92Var.U.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b182;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            if (!xc2.V(g92Var.x0)) {
            }
            skb skbVar222 = new skb(context2);
            g92Var.a0 = skbVar222;
            skbVar222.o(R.drawable.menu_feature_premium, a0(ob6.L0(2131752446)), false);
            yob.Q(g92Var.a0, aob.L0(false), null, yob.M(i14));
            final byte b202 = 4;
            g92Var.a0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b202;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            g92Var.a0.setVisibility(8);
            if (!xc2.T(g92Var.x0)) {
            }
            skb skbVar232 = new skb(context2);
            g92Var.Z = skbVar232;
            skbVar232.o(R.drawable.msg_log, ob6.L0(2131751044), false);
            yob.Q(g92Var.Z, aob.L0(false), null, yob.M(i14));
            final byte b212 = 5;
            g92Var.Z.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b212;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            if (xc2.R(g92Var.x0)) {
            }
            g92Var.S.addView(g92Var.P, tre.o(-1, -2));
            skbVar = g92Var.f0;
            if (skbVar != null) {
            }
            if (!g92Var.J0) {
                g92Var.S.addView(g92Var.Y, tre.o(-1, -2));
            }
            if (!g92Var.J0) {
            }
            g92Var.S.addView(g92Var.X, tre.o(-1, -2));
            g92Var.S.addView(g92Var.U, tre.o(-1, -2));
            skbVar2 = g92Var.V;
            if (skbVar2 != null) {
                g92Var.S.addView(skbVar2, tre.o(-1, -2));
            }
            if (g92Var.J0) {
            }
            if (g92Var.J0) {
            }
            i7 = -2;
            i8 = -1;
            g92Var.S.addView(g92Var.Y, tre.o(-1, -2));
            skbVar3 = g92Var.b0;
            if (skbVar3 != null) {
            }
            skbVar4 = g92Var.Z;
            if (skbVar4 != null) {
            }
            skbVar5 = g92Var.a0;
            if (skbVar5 != null) {
            }
            if (g92Var.a0 != null) {
                g92Var.a0.setVisibility(0);
            }
            skbVar6 = g92Var.Z;
            if (skbVar6 != null) {
            }
        } else {
            uobVar = null;
        }
        if (g92Var.D0 != null) {
            skb skbVar26 = new skb(context2);
            g92Var.l0 = skbVar26;
            hf0 L02 = aob.L0(false);
            int i15 = aob.i6;
            yob.Q(skbVar26, L02, uobVar, yob.M(i15));
            g92Var.l0.setPrioritizeTitleOverValue(true);
            g92Var.S.addView(g92Var.l0, tre.o(-1, -2));
            final byte b23 = 7;
            g92Var.l0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b23;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            g92Var.w0();
            skb skbVar27 = new skb(context2);
            g92Var.o0 = skbVar27;
            yob.Q(skbVar27, aob.L0(false), uobVar, yob.M(i15));
            g92Var.o0.s(a0(ob6.L0(2131754339)), charSequence, R.drawable.msg_shareout, true);
            g92Var.S.addView(g92Var.o0, tre.o(-1, -2));
            g92Var.o0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b12;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            g92Var.o0.h(45, g92Var.E0 == null, false);
            TLRPC.UserFull userFull = g92Var.E0;
            if (userFull != null) {
                skb skbVar28 = g92Var.o0;
                if (userFull.starref_program == null) {
                    format = ob6.L0(2131754338);
                    z2 = false;
                } else {
                    z2 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                skbVar28.w(format, z2);
            }
            if (!g92Var.getMessagesController().l4.J2.f()) {
                g92Var.o0.setVisibility(8);
            }
            skb skbVar29 = new skb(context2);
            g92Var.p0 = skbVar29;
            yob.Q(skbVar29, aob.L0(false), uobVar, yob.M(i15));
            g92Var.p0.o(R.drawable.msg_log, ob6.L0(2131753085), true);
            g92Var.S.addView(g92Var.p0, tre.o(-1, -2));
            final byte b24 = 9;
            g92Var.p0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b24;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            skb skbVar30 = new skb(context2);
            g92Var.q0 = skbVar30;
            yob.Q(skbVar30, aob.L0(false), uobVar, yob.M(i15));
            g92Var.q0.o(R.drawable.msg_media, ob6.L0(2131753086), true);
            g92Var.S.addView(g92Var.q0, tre.o(-1, -2));
            final byte b25 = 10;
            g92Var.q0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b25;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            skb skbVar31 = new skb(context2);
            g92Var.r0 = skbVar31;
            yob.Q(skbVar31, aob.L0(false), uobVar, yob.M(i15));
            g92Var.r0.o(R.drawable.msg_bot, ob6.L0(2131753094), true);
            g92Var.S.addView(g92Var.r0, tre.o(-1, -2));
            final byte b26 = 11;
            g92Var.r0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b26;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat4 = g92Var.x0;
        if (chat4 != null) {
            if (!xc2.N(chat4)) {
                g92Var.S.setVisibility(8);
                g92Var.H.setVisibility(8);
            }
            u1Var.addView(new sca(context2), tre.o(-1, -2));
        } else if (g92Var.D0 != null) {
            g92Var.s0 = new ilb(12, g92Var.resourceProvider, context2);
            String L03 = ob6.L0(2131753036);
            SpannableString valueOf = SpannableString.valueOf(L03);
            int indexOf = L03.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new f92((byte) 0), indexOf, indexOf + 10, 33);
            }
            g92Var.s0.setText(valueOf);
            u1Var.addView(g92Var.s0, tre.o(-1, -2));
            skb skbVar32 = new skb(context2);
            g92Var.u0 = skbVar32;
            hf0 L04 = aob.L0(true);
            uob M = yob.M(i);
            int i16 = aob.i6;
            yob.Q(skbVar32, L04, M, yob.M(i16));
            g92Var.u0.o(R.drawable.menu_factcheck, ob6.L0(2131752910), false);
            skb skbVar33 = g92Var.u0;
            int i17 = aob.q6;
            skbVar33.g(i17, i17);
            u1Var.addView(g92Var.u0, tre.o(-1, -2));
            final byte b27 = 13;
            g92Var.u0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b27;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j5 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j5;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j5));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j6 = qu6.j(9, "chatMode");
                            j6.putLong("chat_id", g92Var4.w0);
                            j6.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j6));
                            break;
                    }
                }
            });
            ilb ilbVar2 = new ilb(12, g92Var.resourceProvider, context2);
            g92Var.t0 = ilbVar2;
            ilbVar2.setFixedSize(12);
            u1Var.addView(g92Var.t0, tre.o(-1, -2));
            skb skbVar34 = g92Var.u0;
            TLRPC.UserFull userFull2 = g92Var.E0;
            skbVar34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            ilb ilbVar3 = g92Var.t0;
            TLRPC.UserFull userFull3 = g92Var.E0;
            ilbVar3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = g92Var.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout7 = new LinearLayout(context2);
                g92Var.T = linearLayout7;
                linearLayout7.setOrientation(1);
                u1Var.addView(g92Var.T, tre.o(-1, -2));
                mf5 mf5Var = new mf5(context2);
                mf5Var.setText(ob6.L0(2131753105));
                g92Var.T.addView(mf5Var, tre.o(-1, -2));
                skb skbVar35 = new skb(context2);
                g92Var.m0 = skbVar35;
                yob.Q(skbVar35, aob.L0(false), uobVar, yob.M(i16));
                g92Var.m0.setPrioritizeTitleOverValue(true);
                g92Var.T.addView(g92Var.m0, tre.o(-1, -2));
                final kt0 g = kt0.g(g92Var.currentAccount);
                final byte b28 = 0;
                g92Var.m0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: v82
                    public final /* synthetic */ g92 b;

                    {
                        this.b = g92Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b29 = b28;
                        kt0 kt0Var = g;
                        g92 g92Var4 = this.b;
                        switch (b29) {
                            case 0:
                                long j5 = g92Var4.C0;
                                if (kt0Var.h(j5, false) != null) {
                                    g92Var4.presentFragment(new at0(1, j5));
                                    break;
                                }
                                break;
                            default:
                                long j6 = g92Var4.C0;
                                if (kt0Var.h(j6, false) != null) {
                                    g92Var4.presentFragment(new at0(0, j6));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g.m(j3)) {
                    long i18 = g.i(j3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i18 > 0) {
                        double d = i18 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) hl.o0((int) d, 0));
                        } else {
                            i4 = i16;
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            charSequence2 = charSequence;
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            g92Var.m0.s(ob6.L0(2131753103), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    i4 = i16;
                    charSequence2 = charSequence;
                    g92Var.m0.s(ob6.L0(2131753103), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new ya6(hl.L(30.0f), g92Var.m0.c), 0, spannableStringBuilder2.length(), 33);
                    g92Var.m0.s(ob6.L0(2131753103), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    i4 = i16;
                    charSequence2 = charSequence;
                }
                g92Var.m0.setVisibility(g.b(j3) ? 0 : 8);
                skb skbVar36 = new skb(context2);
                g92Var.n0 = skbVar36;
                yob.Q(skbVar36, aob.L0(false), null, yob.M(i4));
                final byte b29 = 1;
                g92Var.n0.setPrioritizeTitleOverValue(true);
                g92Var.T.addView(g92Var.n0, tre.o(-1, -2));
                g92Var.n0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: v82
                    public final /* synthetic */ g92 b;

                    {
                        this.b = g92Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b292 = b29;
                        kt0 kt0Var = g;
                        g92 g92Var4 = this.b;
                        switch (b292) {
                            case 0:
                                long j5 = g92Var4.C0;
                                if (kt0Var.h(j5, false) != null) {
                                    g92Var4.presentFragment(new at0(1, j5));
                                    break;
                                }
                                break;
                            default:
                                long j6 = g92Var4.C0;
                                if (kt0Var.h(j6, false) != null) {
                                    g92Var4.presentFragment(new at0(0, j6));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g.h(j3, false) != null) {
                    skb skbVar37 = g92Var.n0;
                    String L05 = ob6.L0(2131753104);
                    if (g.c(j3).amount <= 0) {
                        b1 = charSequence2;
                        z = false;
                    } else {
                        z = false;
                        b1 = nza.b1(false, TextUtils.concat("XTR", nza.I0(g.c(j3), 0.85f, ' ')), 0.85f, null);
                    }
                    skbVar37.s(L05, b1, R.drawable.menu_premium_main, z);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new ya6(hl.L(30.0f), g92Var.n0.c), 0, spannableStringBuilder3.length(), 33);
                    g92Var.n0.s(ob6.L0(2131753104), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                g92Var.n0.setVisibility(g.a(j3) ? 0 : 8);
                ilb ilbVar4 = new ilb(12, g92Var.getResourceProvider(), context2);
                ilbVar4.setFixedSize(12);
                ilbVar4.setTag(R.id.fit_width_tag, 1);
                u1Var.addView(ilbVar4, tre.o(-1, 12));
                g92Var.T.setVisibility((g92Var.n0.getVisibility() == 0 || g92Var.m0.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = g92Var.x0;
        if ((chat5 == null || !chat5.creator) && !((user = g92Var.D0) != null && user.bot && user.bot_can_edit)) {
            g92Var2 = g92Var;
            f = -2.0f;
            i5 = -2;
        } else {
            if (chat5 != null) {
                j = chat5.linked_community_id;
                j2 = -chat5.id;
            } else {
                TLRPC.User user3 = g92Var.D0;
                j = user3.linked_community_id;
                j2 = user3.id;
            }
            final long j5 = j2;
            final long j6 = j;
            final boolean z8 = g92Var.D0 != null;
            if (j6 != 0) {
                zn2 zn2Var = new zn2(context2, g92Var.resourceProvider);
                g92Var.h0 = zn2Var;
                zn2Var.a(g92Var.currentAccount, g92Var.getMessagesController().M0(Long.valueOf(j6)));
                zn2 zn2Var2 = g92Var.h0;
                final byte b30 = 0;
                hf0 L06 = aob.L0(false);
                int i19 = aob.i6;
                yob.Q(zn2Var2, L06, null, yob.M(i19));
                g92Var.h0.setOnClickListener(new View.OnClickListener(g92Var) { // from class: w82
                    public final /* synthetic */ g92 b;

                    {
                        this.b = g92Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (b30) {
                            case 0:
                                g92 g92Var4 = this.b;
                                uc7 messagesController = g92Var4.getMessagesController();
                                long j7 = j6;
                                if (!xc2.N(messagesController.M0(Long.valueOf(j7)))) {
                                    g92Var4.showDialog(new xo2(g92Var4, j7, null, null));
                                    break;
                                } else {
                                    g92Var4.presentFragment(new xn2(qu6.k(j7, "community_id")));
                                    break;
                                }
                            default:
                                this.b.presentFragment(new qn2(qu6.k(j6, "dialog_id")));
                                break;
                        }
                    }
                });
                u1Var.addView(g92Var.h0, tre.o(-1, -2));
                skb skbVar38 = new skb(context2);
                g92Var.j0 = skbVar38;
                skbVar38.o(R.drawable.outline_community_remove_24, ob6.L0(z8 ? 2131751849 : g92Var.J0 ? 2131751848 : 2131751847), false);
                skb skbVar39 = g92Var.j0;
                int i20 = aob.p7;
                skbVar39.g(i20, i20);
                yob.Q(g92Var.j0, aob.L0(false), null, yob.M(i19));
                g92Var2 = g92Var;
                i5 = -2;
                f = -2.0f;
                g92Var.j0.setOnClickListener(new View.OnClickListener() { // from class: x82
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String M0 = ob6.M0(2131751880, null);
                        g92 g92Var4 = g92.this;
                        jj.s0(g92Var4, M0, ob6.M0(z8 ? 2131751882 : g92Var4.J0 ? 2131751881 : 2131751879, null), ob6.M0(2131746048, null), true, new x20(g92Var4, j5, j6, (byte) 2));
                    }
                });
                u1Var.addView(g92Var2.j0, tre.o(-1, -2));
                ilb ilbVar5 = new ilb(12, g92Var2.getResourceProvider(), context2);
                g92Var2.k0 = ilbVar5;
                ilbVar5.setFixedSize(14);
                g92Var2.k0.setTag(R.id.fit_width_tag, 1);
                u1Var.addView(g92Var2.k0, tre.o(-1, 14));
            } else {
                g92Var2 = g92Var;
                f = -2.0f;
                i5 = -2;
                skb skbVar40 = new skb(context2);
                g92Var2.g0 = skbVar40;
                skbVar40.g(aob.v6, aob.u6);
                yob.V(g92Var2.g0.getTextView(), aob.Zl);
                yob.Q(g92Var2.g0, aob.L0(false), null, yob.M(aob.i6));
                g92Var2.g0.o(R.drawable.msg_groups, ob6.L0(z8 ? 2131751946 : g92Var2.J0 ? 2131751944 : 2131751941), false);
                final byte b31 = 1;
                g92Var2.g0.setOnClickListener(new View.OnClickListener(g92Var2) { // from class: w82
                    public final /* synthetic */ g92 b;

                    {
                        this.b = g92Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (b31) {
                            case 0:
                                g92 g92Var4 = this.b;
                                uc7 messagesController = g92Var4.getMessagesController();
                                long j7 = j5;
                                if (!xc2.N(messagesController.M0(Long.valueOf(j7)))) {
                                    g92Var4.showDialog(new xo2(g92Var4, j7, null, null));
                                    break;
                                } else {
                                    g92Var4.presentFragment(new xn2(qu6.k(j7, "community_id")));
                                    break;
                                }
                            default:
                                this.b.presentFragment(new qn2(qu6.k(j5, "dialog_id")));
                                break;
                        }
                    }
                });
                ilb ilbVar6 = new ilb(12, g92Var2.resourceProvider, context2);
                g92Var2.i0 = ilbVar6;
                ilbVar6.setText(ob6.L0(z8 ? 2131751945 : g92Var2.J0 ? 2131751943 : 2131751940));
                u1Var.addView(g92Var2.g0, tre.o(-1, -2));
                u1Var.addView(g92Var2.i0, tre.o(-1, -2));
            }
        }
        TLRPC.Chat chat6 = g92Var2.x0;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout3 = new FrameLayout(context2);
            g92Var2.d0 = frameLayout3;
            u1Var.addView(frameLayout3, tre.o(-1, i5));
            qmb qmbVar = new qmb(context2);
            g92Var2.e0 = qmbVar;
            yob.X(qmbVar.getTextView(), aob.p7, null);
            yob.Q(g92Var2.e0, aob.L0(false), null, yob.M(aob.i6));
            if (g92Var2.D0 != null) {
                g92Var2.e0.b(ob6.L0(2131751531), false);
            } else {
                boolean z9 = g92Var2.J0;
                qmb qmbVar2 = g92Var2.e0;
                if (z9) {
                    qmbVar2.b(ob6.L0(2131752396), false);
                } else {
                    qmbVar2.b(ob6.L0(2131751537), false);
                }
            }
            g92Var2.d0.addView(g92Var2.e0, tre.c(f, -1));
            final byte b32 = 14;
            g92Var2.e0.setOnClickListener(new View.OnClickListener(g92Var2) { // from class: u82
                public final /* synthetic */ g92 b;

                {
                    this.b = g92Var2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b322 = b32;
                    byte b42 = 4;
                    jn5 jn5Var = null;
                    g92 g92Var4 = this.b;
                    switch (b322) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", g92Var4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            bg2 bg2Var = new bg2(bundle);
                            bg2Var.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var);
                            break;
                        case 1:
                            d92 d92Var = g92Var4.R0;
                            long j32 = g92Var4.C0;
                            if (!g92Var4.s.g()) {
                                TLRPC.User X1 = j32 == 0 ? null : g92Var4.getMessagesController().X1(Long.valueOf(j32));
                                if (X1 == null) {
                                    TLRPC.Chat M0 = g92Var4.getMessagesController().M0(Long.valueOf(g92Var4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i122 = chatPhoto2.dc_id;
                                        if (i122 != 0) {
                                            chatPhoto2.photo_big.dc_id = i122;
                                        }
                                        TLRPC.ChatFull chatFull4 = g92Var4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                jn5Var = jn5.j(g92Var4.y0.chat_photo.video_sizes.get(0), g92Var4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.q0().m1(null, M0.photo.photo_big, null, jn5Var, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.q0().T1(null, g92Var4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                                        int i132 = userProfilePhoto2.dc_id;
                                        if (i132 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i132;
                                        }
                                        PhotoViewer.q0().m1(null, X1.photo.photo_big, null, null, null, null, null, 0, d92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", g92Var4.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            bg2 bg2Var2 = new bg2(bundle2);
                            bg2Var2.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var2);
                            break;
                        case 3:
                            g92Var4.presentFragment(new qu0(g92Var4.w0));
                            break;
                        case 4:
                            g92Var4.presentFragment(new ng1(-g92Var4.w0));
                            break;
                        case 5:
                            g92Var4.presentFragment(new wf1(g92Var4.x0));
                            break;
                        case 6:
                            g92Var4.presentFragment(w1b.d0(g92Var4.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", g92Var4.C0);
                            g92Var4.presentFragment(new ve1(bundle3));
                            break;
                        case 8:
                            g92Var4.presentFragment(new cc(g92Var4.C0));
                            break;
                        case 9:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-intro");
                            break;
                        case 10:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0) + "-commands");
                            break;
                        case 11:
                            m01.u(view.getContext(), "https://t.me/BotFather?start=" + g92.d0(g92Var4.D0));
                            break;
                        case 12:
                            g92Var4.m0();
                            break;
                        case 13:
                            g92Var4.h0();
                            break;
                        case 14:
                            g92 g92Var5 = this.b;
                            jj.r(g92Var5, false, g92Var5.x0, null, false, true, true, false, new a92(g92Var5, (byte) 7));
                            break;
                        case 15:
                            if (hl.H1(g92Var4)) {
                                uc6 uc6Var = new uc6(4);
                                uc6Var.m0 = -g92Var4.w0;
                                TLRPC.ChatFull chatFull5 = g92Var4.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        uc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                uc6Var.M0 = new a92(g92Var4, (byte) 6);
                                g92Var4.presentFragment(uc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = g92Var4.w0;
                            skb skbVar72 = g92Var4.I;
                            boolean z62 = skbVar72 != null && skbVar72.getVisibility() == 0;
                            v92 v92Var = new v92(null);
                            v92Var.N = new ArrayList();
                            v92Var.O = new ArrayList();
                            v92Var.Q = new ArrayList();
                            v92Var.d0 = true;
                            v92Var.g0 = new ArrayList();
                            v92Var.p0 = new HashMap();
                            v92Var.r0 = new i92(v92Var, (byte) 5);
                            v92Var.t0 = false;
                            v92Var.a0 = j42;
                            v92Var.o0 = z62;
                            TLRPC.ChatFull chatFull6 = g92Var4.y0;
                            v92Var.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    v92Var.m0 = tL_chatInviteExported;
                                } else {
                                    v92Var.c0(false);
                                }
                            }
                            g92Var4.presentFragment(v92Var);
                            break;
                        case 17:
                            long j52 = g92Var4.w0;
                            na2 na2Var = new na2(null);
                            na2Var.w = new ArrayList();
                            na2Var.P = false;
                            na2Var.Q = false;
                            na2Var.F = j52;
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(j52));
                            na2Var.f = M02;
                            na2Var.s = xc2.T(M02) && !na2Var.f.megagroup;
                            na2Var.h = g92Var4.y0;
                            g92Var4.presentFragment(na2Var);
                            break;
                        case 18:
                            ij8 ij8Var = new ij8(g92Var4.w0);
                            ij8Var.s = new a92(g92Var4, b42);
                            g92Var4.presentFragment(ij8Var);
                            break;
                        case 19:
                            g92Var4.e0();
                            break;
                        case 20:
                            dc5 dc5Var = new dc5(-g92Var4.x0.id);
                            dc5Var.c = g92Var4.M0;
                            dc5Var.m0 = g92Var4;
                            g92Var4.presentFragment(dc5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", g92Var4.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(g92Var4.J0 || g92Var4.x0.gigagroup) || xc2.Y(g92Var4.x0)) ? 3 : 0);
                            bg2 bg2Var3 = new bg2(bundle4);
                            bg2Var3.B0(g92Var4.y0);
                            g92Var4.presentFragment(bg2Var3);
                            break;
                        case 22:
                            ck6 ck6Var = new ck6(g92Var4.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = g92Var4.y0;
                            ck6Var.l0(chatFull7, chatFull7.exported_invite);
                            g92Var4.presentFragment(ck6Var);
                            break;
                        case 23:
                            if (!xc2.V(g92Var4.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", g92Var4.w0);
                                ed2 ed2Var = new ed2(bundle5);
                                TLRPC.ChatFull chatFull8 = g92Var4.y0;
                                ed2Var.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ed2Var.a == null) {
                                        ed2Var.a = ed2Var.getMessagesController().M0(Long.valueOf(ed2Var.c));
                                    }
                                    ed2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ed2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ed2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                ed2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        ed2Var.w = (byte) 1;
                                    }
                                }
                                g92Var4.presentFragment(ed2Var);
                                break;
                            } else {
                                g92Var4.presentFragment(new t82(g92Var4.w0, g92Var4.y0));
                                break;
                            }
                        default:
                            Bundle j62 = qu6.j(9, "chatMode");
                            j62.putLong("chat_id", g92Var4.w0);
                            j62.putLong("welcome_messages_chat_id", g92Var4.w0);
                            g92Var4.presentFragment(new zu1(j62));
                            break;
                    }
                }
            });
            u1Var.addView(new sca(context2), tre.o(-1, i5));
        }
        UndoView undoView = new UndoView(context2);
        g92Var2.c = undoView;
        iy0Var.addView(undoView, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        iu3 iu3Var6 = g92Var2.w;
        TLRPC.User user4 = g92Var2.D0;
        iu3Var6.setText(pv3.l(user4 != null ? lv2.p(user4) : g92Var2.x0.title, g92Var2.w.getEditText().getPaint().getFontMetricsInt(), true));
        iu3 iu3Var7 = g92Var2.w;
        iu3Var7.setSelection(iu3Var7.n());
        TLRPC.ChatFull chatFull4 = g92Var2.y0;
        if (chatFull4 != null) {
            g92Var2.F.setText(chatFull4.about);
        } else {
            TLRPC.UserFull userFull4 = g92Var2.E0;
            if (userFull4 != null) {
                g92Var2.F.setText(userFull4.about);
            }
        }
        g92Var2.o0();
        g92Var2.t0(true, false);
        return g92Var2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (java.lang.Math.max(r13 == null ? 0 : r13.participants_count, r12.x0.participants_count) >= getMessagesController().l4.w1.f()) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    @Override // fn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z;
        skb skbVar;
        EditTextBoldCursor editTextBoldCursor;
        int i3 = jn7.T;
        boolean z2 = true;
        long j = this.C0;
        int i4 = 0;
        if (i == i3) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.w0) {
                if (this.y0 == null && (editTextBoldCursor = this.F) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z3 = this.y0 == null;
                this.y0 = chatFull;
                c0();
                if (j != 0) {
                    this.G0 = false;
                } else {
                    if (!this.F0) {
                        TLRPC.ChatFull chatFull2 = this.y0;
                    }
                    TLRPC.ChatFull chatFull3 = this.y0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z = true;
                        this.G0 = z;
                        skbVar = this.R;
                        if (skbVar != null) {
                            skbVar.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z = false;
                    this.G0 = z;
                    skbVar = this.R;
                    if (skbVar != null) {
                    }
                }
                if (xc2.T(this.x0) && !this.y0.hidden_prehistory) {
                    z2 = false;
                }
                this.K0 = z2;
                t0(false, false);
                if (z3) {
                    l0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.u5) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.w0 == longValue) {
                this.F0 = booleanValue;
                this.H0 = booleanValue2;
                if (objArr.length > 3) {
                    this.I0 = ((Boolean) objArr[3]).booleanValue();
                }
                skb skbVar2 = this.R;
                if (skbVar2 != null) {
                    skbVar2.setChecked(this.F0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i5 = uc7.s5;
            if ((intValue & 2) != 0) {
                o0();
            }
            if ((intValue & 1) != 0) {
                w0();
                return;
            }
            return;
        }
        if (i == jn7.b1) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.w0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.z0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.A0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.B0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            wk5 wk5Var = this.parentLayout;
            if (wk5Var == null || wk5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i == jn7.a5) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.w0) {
                TLRPC.ChatFull N0 = getMessagesController().N0(longValue2);
                this.y0 = N0;
                if (N0 != null) {
                    this.L0 = N0.available_reactions;
                }
                x0(true);
                return;
            }
            return;
        }
        if (i != jn7.E3) {
            if (i == jn7.E0) {
                if (((Long) objArr[0]).longValue() == j) {
                    q0(getMessagesController().Y1(j));
                    return;
                }
                return;
            } else {
                if (i == jn7.O3) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i == jn7.y1 && (-this.w0) == ((Long) objArr[0]).longValue()) {
                    wk5 wk5Var2 = this.parentLayout;
                    if (wk5Var2 == null || wk5Var2.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
        }
        if (((Long) objArr[0]).longValue() == j) {
            if (this.n0 != null) {
                kt0 g = kt0.g(this.currentAccount);
                this.n0.setVisibility(g.a(j) ? 0 : 8);
                this.n0.w(nza.b1(false, TextUtils.concat("XTR", nza.H0(g.c(j), 0.8f, ' ')), 0.85f, null), true);
                skb skbVar3 = this.l0;
                if (skbVar3 != null) {
                    skbVar3.setNeedDivider(g.a(j) || g.b(j));
                }
                this.T.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                kt0 g2 = kt0.g(this.currentAccount);
                this.m0.setVisibility(g2.b(j) ? 0 : 8);
                long i6 = g2.i(j);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i6 > 0) {
                    double d = i6 / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) hl.o0((int) d, 0));
                    } else {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setDecimalSeparator('.');
                        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                        decimalFormat.setMinimumFractionDigits(2);
                        decimalFormat.setMaximumFractionDigits(3);
                        decimalFormat.setGroupingUsed(false);
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                    }
                }
                this.m0.w(spannableStringBuilder, true);
                skb skbVar4 = this.l0;
                if (skbVar4 != null) {
                    if (!g2.a(j) && !g2.b(j)) {
                        z2 = false;
                    }
                    skbVar4.setNeedDivider(z2);
                }
                LinearLayout linearLayout = this.T;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
                    i4 = 8;
                }
                linearLayout.setVisibility(i4);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    public final void e0() {
        wh1 wh1Var = new wh1(-this.x0.id);
        wh1Var.m0 = this;
        presentFragment(wh1Var);
        uc7.s1(this.currentAccount).Y3.edit().putInt("boostingappearance", uc7.s1(this.currentAccount).Y3.getInt("boostingappearance", 0) + 1).apply();
    }

    @Override // yn5
    public final boolean f() {
        return true;
    }

    public final void f0(id idVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, wg1 wg1Var) {
        idVar.dismiss();
        if (getParentActivity() == null) {
            return;
        }
        l46 l46Var = new l46(35, this.currentAccount, getResourceProvider(), getParentActivity(), this);
        l46Var.s1(wg1Var);
        l46Var.r1(tL_premium_boostsStatus, true);
        l46Var.t1(j);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
        if (M0 != null) {
            l46Var.L2 = new dy1(this, M0, (byte) 25);
        }
        showDialog(l46Var);
    }

    public final void g0(FrameLayout frameLayout, View view) {
        if (!this.G0) {
            TLRPC.ChatFull chatFull = this.y0;
            d31.b0(this).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? hl.S2(ob6.G(getMessagesController().l4.w1.f(), "ChannelTopicsForbidden", new Object[0])) : hl.S2(ob6.M0(2131752246, "ChannelTopicsDiscussionForbidden"))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j = -this.w0;
        h34 h34Var = new h34(null);
        h34Var.a = j;
        h34Var.setResourceProvider(this.resourceProvider);
        boolean z = this.F0;
        boolean z2 = this.H0;
        boolean z3 = this.I0;
        qo0 qo0Var = new qo0(this, view, (byte) 1);
        h34Var.c = z;
        h34Var.d = z2;
        h34Var.e = z3;
        h34Var.h = qo0Var;
        presentFragment(h34Var);
    }

    @Override // yn5
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override // yn5
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ny9 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e92 e92Var = this.c0;
        int i = aob.i6;
        arrayList.add(new apb(e92Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.c0, 4, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.u6));
        arrayList.add(new apb(this.c0, 0, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.v6));
        arrayList.add(new apb(this.U, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.X, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.W, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        skb skbVar = this.V;
        if (skbVar != null) {
            arrayList.add(new apb(skbVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        arrayList.add(new apb(this.Y, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.Z, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.J, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.O, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        LinearLayout linearLayout = this.E;
        int i2 = aob.d6;
        arrayList.add(new apb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.e0, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.e0, 4, new Class[]{qmb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.P, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        skb skbVar2 = this.L;
        if (skbVar2 != null) {
            arrayList.add(new apb(skbVar2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        skb skbVar3 = this.b0;
        if (skbVar3 != null) {
            arrayList.add(new apb(skbVar3, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        return arrayList;
    }

    public final void h0() {
        int i = this.currentAccount;
        TL_bots.BotVerifierSettings botVerifierSettings = this.E0.bot_info.verifier_settings;
        e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        Bundle j = qd4.j(16, "onlySelect", "dialogsType", true);
        j.putBoolean("resetDelegate", false);
        uj3 uj3Var = new uj3(j);
        uj3Var.setCurrentAccount(i);
        uj3Var.E2 = new ff(uj3Var, i, this.C0, botVerifierSettings);
        S.presentFragment(uj3Var);
    }

    public final void i0(long j, long j2) {
        uc7.s1(this.currentAccount).Z2(j, j2, true, false, new n82(this, (byte) 1));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final /* synthetic */ void j0() {
        this.P0 = true;
        jn7 f = jn7.f(this.currentAccount);
        int i = uc7.s5;
        f.k(2, 2);
    }

    public final /* synthetic */ void k0() {
        this.v0 = null;
        long j = this.C0;
        if (j == 0) {
            uc7.s1(this.currentAccount).z(this.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().o1(j);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new z82(this, (byte) 2));
        }
        r0(false, true);
        mb0 mb0Var = this.e;
        Object obj = this.D0;
        if (obj == null) {
            obj = this.x0;
        }
        mb0Var.m(null, null, this.r, obj);
        this.S0.H(0);
        this.c0.e.d();
    }

    public final void l0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new z82(this, (byte) 0));
    }

    public final void m0() {
        this.s.n(this.v0 != null, new b92(this, (byte) 0), new o1(this, (byte) 17), 0);
        this.S0.H(0);
        this.S0.K(43);
        this.c0.e.d();
    }

    public final void n0() {
        iu3 iu3Var;
        String str;
        String str2;
        if (this.O0 || (iu3Var = this.w) == null) {
            return;
        }
        if (iu3Var.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            hl.z3(this.w);
            return;
        }
        this.O0 = true;
        byte b = 20;
        String str3 = "";
        if (this.D0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().q1(this.D0);
            byte b2 = 4;
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.D0.first_name.equals(this.w.getText().toString())) {
                setbotinfo.name = this.w.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.F.getText().toString();
                setbotinfo.flags |= 1;
            }
            this.b = new id(3, null, getParentActivity());
            this.b.setOnCancelListener(new gt0(this, getConnectionsManager().sendRequest(setbotinfo, new ql(this, setbotinfo, b)), b2));
            this.b.show();
            return;
        }
        byte b3 = 5;
        if (!xc2.T(this.x0) && (!this.K0 || this.F0)) {
            getMessagesController().R(getParentActivity(), this.w0, this, new a92(this, b3), null);
            return;
        }
        if (this.y0 != null && xc2.T(this.x0)) {
            TLRPC.ChatFull chatFull = this.y0;
            boolean z = chatFull.hidden_prehistory;
            boolean z2 = this.K0;
            if (z != z2) {
                chatFull.hidden_prehistory = z2;
                getMessagesController().p5(this.w0, this.K0);
            }
        }
        if (this.s.g()) {
            this.N0 = true;
            id idVar = new id(3, null, getParentActivity());
            this.b = idVar;
            idVar.setOnCancelListener(new cs0(this, b3));
            this.b.show();
            return;
        }
        if (!this.x0.title.equals(this.w.getText().toString())) {
            getMessagesController().A(this.w0, this.w.getText().toString(), null);
        }
        TLRPC.ChatFull chatFull2 = this.y0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            uc7 messagesController = getMessagesController();
            long j = this.w0;
            String obj = this.F.getText().toString();
            TLRPC.ChatFull chatFull3 = this.y0;
            messagesController.getClass();
            TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
            tL_messages_editChatAbout.peer = messagesController.j1(-j);
            tL_messages_editChatAbout.about = obj;
            messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new m65(messagesController, chatFull3, obj, b), 64);
        }
        boolean z3 = this.F0;
        TLRPC.Chat chat = this.x0;
        boolean z4 = chat.forum;
        if (z3 != z4 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
            boolean z5 = this.H0 != chat.forum_tabs;
            boolean z6 = this.I0 != chat.forum_sidebar;
            boolean z7 = z3 != z4;
            getMessagesController().o5(this.w0, this.F0, this.H0, this.I0);
            if (this.F0 && !this.H0 && (z7 || z5)) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i = 0; i < fragmentStack.size(); i++) {
                    if ((fragmentStack.get(i) instanceof zu1) && ((zu1) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).a0(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        wk5 parentLayout = getParentLayout();
                        HashSet hashSet = tzb.s1;
                        ((ActionBarLayout) parentLayout).b(i, tzb.F0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (z5 || z6) {
                u0(z5);
            }
        }
        finishFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0() {
        TLRPC.FileLocation fileLocation;
        boolean z;
        jn5 m;
        if (this.e == null || this.P0) {
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
        TLRPC.User X1 = this.C0 == 0 ? null : getMessagesController().X1(Long.valueOf(this.C0));
        if (M0 == null && X1 == null) {
            return;
        }
        this.D0 = X1;
        this.x0 = M0;
        if (X1 != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
            if (userProfilePhoto != null) {
                fileLocation = userProfilePhoto.photo_small;
                this.v0 = fileLocation;
                m = jn5.m(this.currentAccount, 1, X1);
                this.e.f(X1, this.r);
                if (m != null) {
                    z = true;
                }
                z = false;
            }
            this.e.setImageDrawable(this.r);
            z = false;
        } else {
            TLRPC.ChatPhoto chatPhoto = M0.photo;
            if (chatPhoto != null) {
                TLRPC.FileLocation fileLocation2 = chatPhoto.photo_small;
                X1 = M0;
                fileLocation = fileLocation2;
                this.v0 = fileLocation;
                m = jn5.m(this.currentAccount, 1, X1);
                this.e.f(X1, this.r);
                if (m != null) {
                }
                z = false;
            }
            this.e.setImageDrawable(this.r);
            z = false;
        }
        if (this.c0 != null) {
            if (z || this.s.g()) {
                this.c0.o(R.drawable.msg_addphoto, ob6.M0(2131752178, "ChatSetNewPhoto"), true);
            } else {
                this.c0.o(R.drawable.msg_addphoto, ob6.M0(2131752177, "ChatSetPhotoOrVideo"), true);
            }
            if (this.S0 == null) {
                this.S0 = new b29(R.raw.camera_outline, hl.L(50.0f), hl.L(50.0f), false, null);
            }
            this.c0.e.setTranslationX(-hl.L(8.0f));
            this.c0.e.setAnimation(this.S0);
        }
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().r();
        }
        if (this.a0 != null && getMessagesController().l4.K2.f && xc2.V(this.x0)) {
            this.a0.setVisibility(0);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.s.h(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        iu3 iu3Var = this.w;
        if (iu3Var == null || !iu3Var.e) {
            return b0(z);
        }
        if (!z) {
            return false;
        }
        iu3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0127, code lost:
    
        if (java.lang.Math.max(r5 == null ? 0 : r5.participants_count, r1.participants_count) >= getMessagesController().l4.w1.f()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
    
        if (r1.linked_chat_id != 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j = this.w0;
        long j2 = this.C0;
        boolean z = true;
        if (j == 0) {
            TLRPC.User X1 = j2 == 0 ? null : getMessagesController().X1(Long.valueOf(j2));
            this.D0 = X1;
            if (X1 == null) {
                TLRPC.User j0 = kf7.a0(this.currentAccount).j0(j2);
                this.D0 = j0;
                if (j0 != null) {
                    getMessagesController().i4(this.D0, true, false);
                    if (this.E0 == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j2));
                        ArrayList L0 = kf7.a0(this.currentAccount).L0(hashSet);
                        if (!L0.isEmpty()) {
                            this.E0 = (TLRPC.UserFull) L0.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            rb0 rb0Var = this.r;
            if (chat == null) {
            }
            zn5 zn5Var = this.s;
            zn5Var.a = this;
            zn5Var.b = this;
            getNotificationCenter().b(this, 2);
            getNotificationCenter().b(this, jn7.y1);
            getNotificationCenter().b(this, jn7.b1);
            if (this.y0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
        this.x0 = M0;
        if (M0 == null) {
            TLRPC.Chat Q = kf7.a0(this.currentAccount).Q(this.w0);
            this.x0 = Q;
            if (Q != null) {
                getMessagesController().a4(this.x0, true);
                if (this.y0 == null) {
                    TLRPC.ChatFull F0 = kf7.a0(this.currentAccount).F0(this.w0, xc2.T(this.x0), new CountDownLatch(1), false, false, 0);
                    this.y0 = F0;
                }
            }
            return false;
        }
        chat = this.x0;
        rb0 rb0Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            rb0Var2.j(5L, this.x0.title, null, null);
            this.J0 = xc2.T(this.x0) && !this.x0.megagroup;
            TLRPC.Chat chat2 = this.x0;
            boolean z2 = chat2.forum;
            this.F0 = z2;
            this.H0 = chat2.forum_tabs;
            this.I0 = chat2.forum_sidebar;
            if (j2 == 0) {
                if (!z2) {
                    TLRPC.ChatFull chatFull = this.y0;
                }
                TLRPC.ChatFull chatFull2 = this.y0;
                if (chatFull2 != null) {
                }
                this.G0 = z;
                getNotificationCenter().b(this, jn7.T);
                getNotificationCenter().b(this, jn7.u5);
                getNotificationCenter().b(this, jn7.a5);
                getNotificationCenter().b(this, jn7.O3);
            }
            z = false;
            this.G0 = z;
            getNotificationCenter().b(this, jn7.T);
            getNotificationCenter().b(this, jn7.u5);
            getNotificationCenter().b(this, jn7.a5);
            getNotificationCenter().b(this, jn7.O3);
        } else {
            rb0Var2.j(5L, this.D0.first_name, null, null);
            this.J0 = false;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
            this.G0 = false;
            getNotificationCenter().b(this, jn7.E0);
            if (this.D0.bot) {
                getNotificationCenter().b(this, jn7.E3);
            }
        }
        zn5 zn5Var2 = this.s;
        zn5Var2.a = this;
        zn5Var2.b = this;
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, jn7.y1);
        getNotificationCenter().b(this, jn7.b1);
        if (this.y0 != null) {
            l0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        zn5 zn5Var = this.s;
        if (zn5Var != null) {
            zn5Var.c();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, jn7.T);
            getNotificationCenter().n(this, jn7.u5);
            getNotificationCenter().n(this, jn7.a5);
            getNotificationCenter().n(this, jn7.O3);
        } else {
            getNotificationCenter().n(this, jn7.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, jn7.E3);
            }
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.y1);
        getNotificationCenter().n(this, jn7.b1);
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            iu3Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((wl) obj).n(null);
        }
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            iu3Var.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.s.j(i, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            iu3Var.s();
            this.w.getEditText().requestFocus();
        }
        s0();
        hl.V2(getParentActivity(), this.classGuid);
        t0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                yob.l(editTextBoldCursor, 30, aob.G6, null);
            }
            mb0 mb0Var = this.e;
            if (mb0Var != null) {
                mb0Var.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0(TLRPC.ChatFull chatFull) {
        wl m;
        this.y0 = chatFull;
        if (chatFull != null) {
            TLRPC.Chat chat = this.x0;
            if (chat == null) {
                chat = getMessagesController().M0(Long.valueOf(this.w0));
                this.x0 = chat;
            }
            this.K0 = !xc2.T(chat) || this.y0.hidden_prehistory;
            this.L0 = this.y0.available_reactions;
            this.Q0.clear();
            ArrayList arrayList = this.Q0;
            TLRPC.Chat chat2 = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && xc2.V(chat2)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i);
                        i++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(yac.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                m = wl.l(yac.t0, wl.f(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            m = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? wl.m(yac.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, wl.f()) : null;
                        }
                        if (m != null) {
                            arrayList2.add(m);
                            m.a(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = ls6.d0(yac.t0).n;
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList4.get(i2);
                        i2++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            wl l = wl.l(yac.t0, wl.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l);
                            l.a(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().l4.K2.f && xc2.V(this.x0)) {
                this.a0.setVisibility(0);
            }
        }
        c0();
    }

    public final void q0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j = this.C0;
                this.D0 = j == 0 ? null : getMessagesController().X1(Long.valueOf(j));
            }
            skb skbVar = this.o0;
            if (skbVar != null) {
                skbVar.h(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.w(userFull2.starref_program == null ? ob6.M0(2131754338, null) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            skb skbVar2 = this.u0;
            if (skbVar2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                skbVar2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            ilb ilbVar = this.t0;
            if (ilbVar != null) {
                TLRPC.UserFull userFull4 = this.E0;
                ilbVar.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void r0(boolean z, boolean z2) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z2) {
            RadialProgressView radialProgressView = this.n;
            if (z) {
                radialProgressView.setAlpha(1.0f);
                this.n.setVisibility(0);
                this.f.setAlpha(1.0f);
                this.f.setVisibility(0);
                return;
            }
            radialProgressView.setAlpha(0.0f);
            this.n.setVisibility(4);
            this.f.setAlpha(0.0f);
            this.f.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.h = animatorSet2;
        RadialProgressView radialProgressView2 = this.n;
        if (z) {
            radialProgressView2.setVisibility(0);
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            RadialProgressView radialProgressView3 = this.n;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView3, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<a81, Float>) property, 1.0f));
        } else {
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<a81, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new z7((byte) 16, (Object) this, z));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void restoreSelfArgs(Bundle bundle) {
        zn5 zn5Var = this.s;
        if (zn5Var != null) {
            zn5Var.f = bundle.getString("path");
        }
    }

    public final void s0() {
        skb skbVar;
        skb skbVar2;
        b48 b48Var;
        int v0;
        ArrayList<Integer> arrayList;
        j38 j38Var = this.M;
        if (j38Var != null) {
            TLRPC.Chat chat = this.x0;
            skb skbVar3 = this.O;
            boolean z = (skbVar3 != null && skbVar3.getVisibility() == 0) || ((skbVar = this.R) != null && skbVar.getVisibility() == 0) || ((xc2.n0(this.x0) && xc2.N(this.x0)) || ((skbVar2 = this.N) != null && skbVar2.getVisibility() == 0));
            Paint paint = j38Var.n;
            int i = j38Var.a;
            vnb vnbVar = j38Var.d;
            if (chat != null) {
                j38Var.w = z;
                j38Var.r = new pkb(pv3.m(chat.title, aob.o2.getFontMetricsInt(), false, null, 0), 13.0f, hl.o());
                b48 b48Var2 = j38Var.x;
                if (b48Var2 != null) {
                    b48Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i2 = b48.j;
                    int i3 = tL_emojiStatusCollectible.center_color | (-16777216);
                    b48Var = new b48(i3, i3, i3, tL_emojiStatusCollectible.document_id);
                    j38Var.x = b48Var;
                } else {
                    if (xc2.I(chat) >= 0) {
                        b48 c = b48.c(i, xc2.I(chat));
                        c.a = hl.L(11.0f);
                        c.d();
                        b48Var = c;
                    } else {
                        b48Var = null;
                    }
                    j38Var.x = b48Var;
                }
                if (b48Var != null) {
                    b48Var.e(j38Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
                    int i4 = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                    if (!a || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | (-16777216);
                    int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                    int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                    j38Var.r.m(i4);
                    paint.setColor(aob.p1(0.1f, i4));
                    b48 b48Var3 = new b48(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
                    b48Var3.a = hl.L(11.0f);
                    b48Var3.d();
                    j38Var.y = b48Var3;
                    b48Var3.e(j38Var);
                    return;
                }
                int F = xc2.F(chat);
                if (F < 7) {
                    int i5 = aob.r8[F];
                    j38Var.s = i5;
                    v0 = aob.v0(i5, vnbVar);
                } else {
                    lc7 lc7Var = uc7.s1(yac.t0).F3;
                    kc7 d = lc7Var != null ? lc7Var.d(F) : null;
                    if (d != null) {
                        j38Var.s = -1;
                        v0 = d.f();
                    } else {
                        int i6 = aob.r8[0];
                        j38Var.s = i6;
                        v0 = aob.v0(i6, vnbVar);
                    }
                }
                j38Var.r.m(v0);
                paint.setColor(aob.p1(0.1f, v0));
                b48 a2 = b48.a(i, F);
                a2.a = hl.L(11.0f);
                a2.d();
                j38Var.y = a2;
                a2.e(j38Var);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        zn5 zn5Var = this.s;
        if (zn5Var != null && (str = zn5Var.f) != null) {
            bundle.putString("path", str);
        }
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            String obj = iu3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        TLRPC.ChatFull chatFull;
        String str2;
        int i6;
        String M0;
        skb skbVar;
        skb skbVar2;
        skb skbVar3;
        skb skbVar4;
        String str3;
        int i7;
        skb skbVar5;
        skb skbVar6;
        skb skbVar7;
        skb skbVar8;
        skb skbVar9;
        TLRPC.Chat M02;
        if (z && (M02 = getMessagesController().M0(Long.valueOf(this.w0))) != null) {
            this.x0 = M02;
        }
        boolean t0 = xc2.t0(this.x0);
        ilb ilbVar = this.Q;
        byte b = 8;
        if (ilbVar != null) {
            ilbVar.setVisibility((this.J != null || ((skbVar7 = this.K) != null && skbVar7.getVisibility() == 0) || (((skbVar8 = this.O) != null && skbVar8.getVisibility() == 0) || ((skbVar9 = this.I) != null && skbVar9.getVisibility() == 0))) ? 0 : 8);
        }
        skb skbVar10 = this.Z;
        if (skbVar10 != null) {
            skbVar10.setVisibility(xc2.T(this.x0) ? 0 : 8);
        }
        skb skbVar11 = this.K;
        if (skbVar11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.J0 && chatFull2.linked_chat_id == 0)) {
                skbVar11.setVisibility(8);
            } else {
                skbVar11.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(ob6.M0(2131751354, "Discussion"), ob6.M0(2131751346, "DiscussionInfoShort"), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.y0.linked_chat_id));
                    if (M03 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = xc2.K(M03, false);
                        boolean isEmpty = TextUtils.isEmpty(K);
                        skb skbVar12 = this.K;
                        if (isEmpty) {
                            skbVar12.u(ob6.M0(2131751354, "Discussion"), M03.title, false, R.drawable.msg_discuss, true);
                        } else {
                            skbVar12.u(ob6.M0(2131751354, "Discussion"), c00.i("@", K), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String K2 = xc2.K(M03, false);
                        boolean isEmpty2 = TextUtils.isEmpty(K2);
                        skb skbVar13 = this.K;
                        if (isEmpty2) {
                            String M04 = ob6.M0(2131748637, "LinkedChannel");
                            String str4 = M03.title;
                            skb skbVar14 = this.R;
                            skbVar13.u(M04, str4, false, R.drawable.msg_channel, skbVar14 != null && skbVar14.getVisibility() == 0);
                        } else {
                            String M05 = ob6.M0(2131748637, "LinkedChannel");
                            String i8 = c00.i("@", K2);
                            skb skbVar15 = this.R;
                            skbVar13.u(M05, i8, false, R.drawable.msg_channel, skbVar15 != null && skbVar15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        skb skbVar16 = this.I;
        if (skbVar16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                skbVar16.setVisibility(8);
            } else {
                skbVar16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                boolean z4 = channelLocation instanceof TLRPC.TL_channelLocation;
                skb skbVar17 = this.I;
                if (z4) {
                    skbVar17.q(ob6.M0(2131753954, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z2, true);
                } else {
                    skbVar17.q(ob6.M0(2131753954, "AttachLocation"), "Unknown address", z2, true);
                }
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z5 = this.x0.noforwards;
                if (this.J0) {
                    if (t0) {
                        str3 = "TypePublic";
                        i7 = 2131743575;
                    } else if (z5) {
                        str3 = "TypePrivateRestrictedForwards";
                        i7 = 2131743576;
                    } else {
                        str3 = "TypePrivate";
                        i7 = 2131743579;
                    }
                    M0 = ob6.M0(i7, str3);
                } else {
                    if (t0) {
                        str2 = "TypePublicGroup";
                        i6 = 2131743574;
                    } else if (z5) {
                        str2 = "TypePrivateGroupRestrictedForwards";
                        i6 = 2131743577;
                    } else {
                        str2 = "TypePrivateGroup";
                        i6 = 2131743578;
                    }
                    M0 = ob6.M0(i6, str2);
                }
                String str5 = M0;
                boolean z6 = this.J0;
                skb skbVar18 = this.J;
                if (z6) {
                    String M06 = ob6.M0(2131752242, "ChannelType");
                    skb skbVar19 = this.O;
                    skbVar18.u(M06, str5, false, R.drawable.msg_channel, (skbVar19 != null && skbVar19.getVisibility() == 0) || ((skbVar3 = this.K) != null && skbVar3.getVisibility() == 0) || ((skbVar4 = this.R) != null && skbVar4.getVisibility() == 0));
                } else {
                    String M07 = ob6.M0(2131749146, "GroupType");
                    skb skbVar20 = this.O;
                    skbVar18.u(M07, str5, false, R.drawable.msg_groups, (skbVar20 != null && skbVar20.getVisibility() == 0) || ((skbVar = this.K) != null && skbVar.getVisibility() == 0) || ((skbVar2 = this.R) != null && skbVar2.getVisibility() == 0));
                }
            } else {
                String M08 = !t0 ? ob6.M0(2131743584, "TypeLocationGroupEdit") : String.format(c00.k(new StringBuilder("https://"), getMessagesController().N2, "/%s"), xc2.K(this.x0, false));
                skb skbVar21 = this.J;
                String M09 = ob6.M0(2131743585, "TypeLocationGroup");
                skb skbVar22 = this.O;
                skbVar21.u(M09, M08, false, R.drawable.msg_channel, (skbVar22 != null && skbVar22.getVisibility() == 0) || ((skbVar5 = this.K) != null && skbVar5.getVisibility() == 0) || ((skbVar6 = this.R) != null && skbVar6.getVisibility() == 0));
            }
        }
        byte b2 = 2;
        if (this.O != null) {
            if (!this.K0 || this.F0) {
                str = "ChatHistoryVisible";
                i5 = 2131752193;
            } else {
                str = "ChatHistoryHidden";
                i5 = 2131752197;
            }
            this.O.u(ob6.M0(2131752194, "ChatHistoryShort"), ob6.M0(i5, str), z2, R.drawable.msg_discuss, this.R != null);
            this.O.setEnabled(!this.F0);
            boolean z7 = (this.F0 || t0 || ((chatFull = this.y0) != null && (chatFull.linked_chat_id != 0 || (chatFull.location instanceof TLRPC.TL_channelLocation)))) ? false : true;
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.O.getAlpha() <= 0.0f && !z7) {
                this.O.setVisibility(8);
                s0();
            } else if (this.O.getVisibility() != 0 || this.O.getAlpha() < 1.0f || !z7) {
                ArrayList arrayList = new ArrayList();
                int i9 = 0;
                boolean z8 = false;
                while (i9 < this.G.getChildCount()) {
                    LinearLayout linearLayout = this.G;
                    if (z8) {
                        arrayList.add(linearLayout.getChildAt(i9));
                    } else if (linearLayout.getChildAt(i9) == this.O) {
                        z8 = true;
                    }
                    i9++;
                    z8 = z8;
                }
                int i10 = 0;
                boolean z9 = false;
                while (i10 < this.x.getChildCount()) {
                    u1 u1Var = this.x;
                    if (z9) {
                        arrayList.add(u1Var.getChildAt(i10));
                    } else if (u1Var.getChildAt(i10) == this.G) {
                        z9 = true;
                    }
                    i10++;
                    z9 = z9;
                }
                if (this.O.getVisibility() != 0) {
                    this.O.setAlpha(0.0f);
                    this.O.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.O.setVisibility(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((View) arrayList.get(i11)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                }
                skb skbVar23 = this.O;
                if (z2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(skbVar23.getAlpha(), z7 ? 1.0f : 0.0f);
                    this.T0 = ofFloat;
                    ofFloat.addUpdateListener(new lk(this, arrayList, b));
                    this.T0.addListener(new rw(this, z7, arrayList, b2));
                    this.T0.setDuration(320L);
                    this.T0.setInterpolator(k43.h);
                    this.T0.start();
                } else {
                    skbVar23.setAlpha(z7 ? 1.0f : 0.0f);
                    this.O.setTranslationY(((-r5.getHeight()) / 2.0f) * (z7 ? 0.0f : 1.0f));
                    this.O.setScaleY(((z7 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.O.setVisibility(z7 ? 0 : 8);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        ((View) arrayList.get(i12)).setTranslationY(0.0f);
                    }
                    this.T0 = null;
                }
            }
        }
        if (this.U != null) {
            if (this.y0 != null) {
                skb skbVar24 = this.V;
                if (skbVar24 != null) {
                    if (skbVar24.getParent() == null) {
                        i = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, tre.o(-1, -2));
                    } else {
                        i = 0;
                    }
                    this.V.setVisibility(this.y0.requests_pending > 0 ? i : 8);
                } else {
                    i = 0;
                }
                if (!this.J0 || xc2.Y(this.x0)) {
                    boolean T = xc2.T(this.x0);
                    skb skbVar25 = this.U;
                    if (T) {
                        CharSequence M010 = ob6.M0(2131752349, "ChannelMembers");
                        Object[] objArr = new Object[1];
                        objArr[i] = Integer.valueOf(this.y0.participants_count);
                        skbVar25.u(M010, String.format("%d", objArr), false, R.drawable.msg_groups, true);
                    } else {
                        CharSequence M011 = ob6.M0(2131752349, "ChannelMembers");
                        Object[] objArr2 = new Object[1];
                        objArr2[i] = Integer.valueOf(this.y0.participants.participants.size());
                        skbVar25.u(M011, String.format("%d", objArr2), false, R.drawable.msg_groups, this.V.getVisibility() == 0 ? 1 : i);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (!chat.gigagroup || xc2.Y(chat)) {
                        int i13 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i14 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i14++;
                            }
                            i2 = bg2.n0(tL_chatBannedRights) + i14;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.x0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i2++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i2++;
                            }
                            if (this.F0 && !tL_chatBannedRights2.manage_topics) {
                                i2++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i2++;
                            }
                            i3 = i13;
                        } else {
                            i2 = i13;
                            i3 = i2;
                        }
                        skb skbVar26 = this.Y;
                        String M012 = ob6.M0(2131752303, null);
                        Integer valueOf = Integer.valueOf(i2);
                        Integer valueOf2 = Integer.valueOf(i3);
                        Object[] objArr3 = new Object[2];
                        objArr3[i] = valueOf;
                        objArr3[1] = valueOf2;
                        skbVar26.u(M012, String.format("%d/%d", objArr3), z2, R.drawable.msg_permissions, true);
                        z3 = z2;
                    } else {
                        skb skbVar27 = this.Y;
                        CharSequence M013 = ob6.M0(2131752427, null);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        Object[] objArr4 = new Object[1];
                        objArr4[i] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                        CharSequence format = String.format("%d", objArr4);
                        skb skbVar28 = this.Z;
                        skbVar27.u(M013, format, false, R.drawable.msg_user_remove, (skbVar28 == null || skbVar28.getVisibility() != 0) ? i : 1);
                        z3 = z2;
                    }
                    skb skbVar29 = this.V;
                    if (skbVar29 != null) {
                        CharSequence M014 = ob6.M0(2131748389, "MemberRequests");
                        Object[] objArr5 = new Object[1];
                        objArr5[i] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format2 = String.format("%d", objArr5);
                        skb skbVar30 = this.Z;
                        skbVar29.u(M014, format2, false, R.drawable.msg_requests, (skbVar30 == null || skbVar30.getVisibility() != 0) ? i : 1);
                    }
                } else {
                    skb skbVar31 = this.U;
                    String M015 = ob6.M0(2131752255, "ChannelSubscribers");
                    Object[] objArr6 = new Object[1];
                    objArr6[i] = Integer.valueOf(this.y0.participants_count);
                    skbVar31.u(M015, String.format("%d", objArr6), false, R.drawable.msg_groups, true);
                    skb skbVar32 = this.Y;
                    CharSequence M016 = ob6.M0(2131752427, null);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    Object[] objArr7 = new Object[1];
                    objArr7[i] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                    CharSequence format3 = String.format("%d", objArr7);
                    skb skbVar33 = this.Z;
                    skbVar32.u(M016, format3, false, R.drawable.msg_user_remove, (skbVar33 == null || skbVar33.getVisibility() != 0) ? i : 1);
                    z3 = z2;
                }
                skb skbVar34 = this.X;
                String M017 = ob6.M0(2131752492, "ChannelAdministrators");
                boolean T2 = xc2.T(this.x0);
                TLRPC.ChatFull chatFull7 = this.y0;
                if (T2) {
                    i4 = chatFull7.admins_count;
                } else if (chatFull7 == null) {
                    i4 = 1;
                } else {
                    int size = chatFull7.participants.participants.size();
                    int i15 = i;
                    int i16 = i15;
                    while (i15 < size) {
                        TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i15);
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            i16++;
                        }
                        i15++;
                    }
                    i4 = i16;
                }
                Object[] objArr8 = new Object[1];
                objArr8[i] = Integer.valueOf(i4);
                skbVar34.u(M017, String.format("%d", objArr8), false, R.drawable.msg_admins, true);
            } else {
                z3 = z2;
                i = 0;
                if (!this.J0 || xc2.Y(this.x0)) {
                    skb skbVar35 = this.U;
                    String M018 = ob6.M0(2131752349, "ChannelMembers");
                    skb skbVar36 = this.Z;
                    skbVar35.o(R.drawable.msg_groups, M018, skbVar36 != null && skbVar36.getVisibility() == 0);
                    boolean z10 = this.x0.gigagroup;
                    skb skbVar37 = this.Y;
                    if (z10) {
                        String M019 = ob6.M0(2131752427, null);
                        skb skbVar38 = this.Z;
                        skbVar37.o(R.drawable.msg_chats_remove, M019, skbVar38 != null && skbVar38.getVisibility() == 0);
                    } else {
                        skbVar37.o(R.drawable.msg_permissions, ob6.M0(2131752303, null), true);
                    }
                } else {
                    this.U.o(R.drawable.msg_groups, ob6.M0(2131752255, "ChannelSubscribers"), true);
                    skb skbVar39 = this.Y;
                    String M020 = ob6.M0(2131752427, null);
                    skb skbVar40 = this.Z;
                    skbVar39.o(R.drawable.msg_chats_remove, M020, skbVar40 != null && skbVar40.getVisibility() == 0);
                }
                this.X.o(R.drawable.msg_admins, ob6.M0(2131752492, "ChannelAdministrators"), true);
            }
            this.P.setVisibility(xc2.w(1, this.x0) ? i : 8);
            x0(z3);
            if (this.y0 == null || !xc2.y(3, this.x0) || (t0 && this.x0.creator)) {
                this.W.setVisibility(8);
            } else {
                int i17 = this.y0.invitesCount;
                skb skbVar41 = this.W;
                if (i17 > 0) {
                    skbVar41.u(ob6.M0(2131748894, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, R.drawable.msg_link2, true);
                } else {
                    skbVar41.u(ob6.M0(2131748894, "InviteLinks"), "1", false, R.drawable.msg_link2, true);
                }
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    public final void u0(boolean z) {
        uj3 uj3Var;
        li3 li3Var;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i = 0;
            while (i < fragmentStack.size()) {
                if (fragmentStack.get(i) instanceof zu1) {
                    zu1 zu1Var = (zu1) fragmentStack.get(i);
                    if (zu1Var.getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(zu1Var, false);
                        zu1Var.clearViews();
                        if (((ActionBarLayout) getParentLayout()).b(i, zu1Var)) {
                            jn7.e().j(zu1Var.da);
                        }
                        if (z && !this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.w0);
                            ((ActionBarLayout) getParentLayout()).b(i, new tzb(bundle));
                            i++;
                        }
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof tzb)) {
                    tzb tzbVar = (tzb) fragmentStack.get(i);
                    if (tzbVar.e() != null && tzbVar.e().id == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(tzbVar, false);
                        i--;
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof uj3) && (uj3Var = (uj3) fragmentStack.get(i)) != null && (li3Var = uj3Var.H3) != null && li3Var.c()) {
                    uj3Var.H3.a();
                }
                i++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() <= 1) {
            this.l0.u(ob6.M0(2131752986, null), "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i2);
            i2++;
            if (tL_username.active) {
                i++;
            }
        }
        this.l0.u(ob6.M0(2131752985, null), ob6.a0(null, null, 2131752984, Integer.valueOf(i), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // yn5
    public final boolean x() {
        return false;
    }

    public final void x0(boolean z) {
        String str;
        String str2;
        int i;
        TLRPC.ChatFull N0 = getMessagesController().N0(this.w0);
        boolean V = xc2.V(this.x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String M0 = ob6.M0(2131746106, null);
            if (N0 == null || !N0.paid_reactions_available) {
                str = M0;
                this.P.u(ob6.M0(2131746114, null), str, z, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i2 = 0;
            for (0; i < tL_chatReactionsSome.reactions.size(); i + 1) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null) {
                        if (tL_availableReaction.inactive) {
                        }
                        i2++;
                    }
                } else {
                    i = reaction instanceof TLRPC.TL_reactionCustomEmoji ? 0 : i + 1;
                    i2++;
                }
            }
            if (V) {
                if (N0 != null && N0.paid_reactions_available) {
                    i2++;
                }
                str2 = i2 == 0 ? ob6.M0(2131746106, null) : String.valueOf(i2);
            } else {
                int min = Math.min(getMediaDataController().n.size(), i2);
                str2 = min == 0 ? ob6.M0(2131746106, null) : ob6.a0(null, null, 2131746111, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
            }
        } else {
            str2 = ob6.M0(2131746113, null);
        }
        str = str2;
        this.P.u(ob6.M0(2131746114, null), str, z, R.drawable.msg_reactions2, true);
    }

    public final void y0(Long l) {
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.L == null) {
            return;
        }
        long j = 0;
        if (!(l != null ? l.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.L.u(ob6.M0(2131746823, null), ob6.M0(2131746813, null), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.x0.linked_monoforum_id));
        if (l != null) {
            j = l.longValue();
        } else if (M0 != null) {
            j = M0.send_paid_messages_stars;
        }
        this.L.u(ob6.M0(2131746823, null), nza.b1(false, ob6.a0(null, null, 2131746797, Long.valueOf(j)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // yn5
    public final void T() {
    }
}
