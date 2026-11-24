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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ba2 extends d implements vn5, jm7 {
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
    public bba H;
    public boolean H0;
    public xib I;
    public boolean I0;
    public xib J;
    public boolean J0;
    public xib K;
    public boolean K0;
    public xib L;
    public TLRPC.ChatReactions L0;
    public g28 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public xib N;
    public boolean N0;
    public xib O;
    public boolean O0;
    public xib P;
    public boolean P0;
    public njb Q;
    public final ArrayList Q0;
    public xib R;
    public final y92 R0;
    public LinearLayout S;
    public p09 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public xib U;
    public xib V;
    public xib W;
    public xib X;
    public xib Y;
    public xib Z;
    public uja a;
    public xib a0;
    public he b;
    public xib b0;
    public UndoView c;
    public z92 c0;
    public LinearLayout d;
    public FrameLayout d0;
    public kc0 e;
    public vkb e0;
    public a91 f;
    public xib f0;
    public xib g0;
    public AnimatorSet h;
    public ro2 h0;
    public njb i0;
    public xib j0;
    public njb k0;
    public xib l0;
    public xib m0;
    public RadialProgressView n;
    public xib n0;
    public xib o0;
    public xib p0;
    public xib q0;
    public final pc0 r;
    public xib r0;
    public final wn5 s;
    public njb s0;
    public njb t0;
    public xib u0;
    public TLRPC.FileLocation v0;
    public cv3 w;
    public long w0;
    public t1 x;
    public TLRPC.Chat x0;
    public ww9 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public ba2(Bundle bundle) {
        super(bundle);
        this.Q0 = new ArrayList();
        this.R0 = new y92(this);
        this.r = new pc0((ylb) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new wn5(0, false, false);
        } else {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.w0));
            this.s = new wn5((L0 == null || !sd2.V(L0)) ? 2 : 1, true, true);
        }
    }

    public static SpannableStringBuilder b0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        of4 of4Var = new of4(10);
        of4Var.a.setTypeface(gm.n1("fonts/num.otf"));
        of4Var.f = cmb.w0(null, cmb.Bk, false);
        of4Var.n = false;
        spannableStringBuilder.setSpan(of4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String e0(TLRPC.User user) {
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

    @Override // vn5
    public final void H(float f) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // vn5
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // vn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
    }

    @Override // vn5
    public final boolean c() {
        return true;
    }

    public final boolean c0(boolean z) {
        cv3 cv3Var;
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
            cv3 cv3Var2 = this.w;
            if ((cv3Var2 != null && !this.D0.first_name.equals(cv3Var2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131743413, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131752936, null);
                    alertDialog$Builder.j(jb6.M0(2131754181, null), new u92(this, b2));
                    alertDialog$Builder.g(jb6.M0(2131747313, null), new u92(this, b));
                    showDialog(heVar);
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
        if ((chatFull != null && sd2.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((cv3Var = this.w) != null && !this.x0.title.equals(cv3Var.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = jb6.M0(2131743413, "UserRestrictionsApplyChanges");
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M02;
                if (this.J0) {
                    heVar2.U = jb6.M0(2131752243, "ChannelSettingsChangedAlert");
                } else {
                    heVar2.U = jb6.M0(2131749158, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.j(jb6.M0(2131754181, "ApplyTheme"), new u92(this, (byte) 2));
                alertDialog$Builder2.g(jb6.M0(2131747313, "PassportDiscard"), new u92(this, (byte) 3));
                showDialog(heVar2);
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x1024  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x1031  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x1093  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x10bf  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x10c7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1098  */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v9 */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r23;
        int i;
        int i2;
        Context context2;
        Integer num;
        final ba2 ba2Var;
        int i3;
        wmb wmbVar;
        int i4;
        Integer num2;
        boolean z;
        CharSequence b1;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        TLRPC.User user;
        final ba2 ba2Var2;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        long j;
        long j2;
        boolean z2;
        String format;
        int i5;
        xib xibVar;
        xib xibVar2;
        int i6;
        xib xibVar3;
        xib xibVar4;
        xib xibVar5;
        xib xibVar6;
        TLRPC.ChatFull chatFull2;
        int i7;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final byte b = 1;
        setHasOwnBackground(true);
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            cv3Var.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 25));
        hz0 hz0Var = new hz0(this, context, (byte) 2);
        hz0Var.setOnTouchListener(new w02((byte) 3));
        this.fragmentView = hz0Var;
        t1 t1Var = new t1(context, (byte) 9);
        this.x = t1Var;
        ww9 ww9Var = new ww9(context, this.x, this.resourceProvider, false);
        this.y = ww9Var;
        ww9Var.setFillViewport(true);
        this.y.setDrawBackground(true);
        hz0Var.addView(this.y, qoe.c(-1.0f, -1));
        this.y.addView(t1Var, new FrameLayout.LayoutParams(-1, -2));
        t1Var.setOrientation(1);
        this.simpleActionBar.setTitle(jb6.L0(2131752359));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i8 = cmb.c6;
        anb.h(i8, null, linearLayout2);
        t1Var.addView(this.d, qoe.o(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, qoe.o(-1, -2));
        kc0 kc0Var = new kc0((byte) 3, context, this);
        this.e = kc0Var;
        kc0Var.setRoundRadius(this.F0 ? gm.L(16.0f) : gm.L(32.0f));
        byte b2 = 4;
        if (this.D0 != null || sd2.d(this.x0)) {
            kc0 kc0Var2 = this.e;
            boolean z3 = jb6.a0;
            frameLayout2.addView(kc0Var2, qoe.d(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            a91 a91Var = new a91(this, context, paint, b2);
            this.f = a91Var;
            boolean z4 = jb6.a0;
            frameLayout2.addView(a91Var, qoe.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(gm.L(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z5 = jb6.a0;
            frameLayout2.addView(radialProgressView2, qoe.d(64, 64.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 16.0f, 12.0f, z5 ? 16.0f : 0.0f, 8.0f));
            s0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    byte b4 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b3) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j3 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j3 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j3));
                                if (W1 == null) {
                                    TLRPC.Chat L0 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i9 = chatPhoto2.dc_id;
                                        if (i9 != 0) {
                                            chatPhoto2.photo_big.dc_id = i9;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i10 = userProfilePhoto2.dc_id;
                                        if (i10 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i10;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j4 = ba2Var3.w0;
                            xib xibVar7 = ba2Var3.I;
                            boolean z6 = xibVar7 != null && xibVar7.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j4;
                            qa2Var.o0 = z6;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L02;
                            ib2Var.s = sd2.T(L02) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b4);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
        } else {
            kc0 kc0Var3 = this.e;
            boolean z6 = jb6.a0;
            frameLayout2.addView(kc0Var3, qoe.d(64, 64.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : 16.0f, 12.0f, z6 ? 16.0f : 0.0f, 12.0f));
        }
        cv3 cv3Var2 = new cv3(context, hz0Var, this);
        this.w = cv3Var2;
        long j3 = this.C0;
        if (j3 != 0) {
            r23 = 0;
            cv3Var2.setHint(jb6.L0(2131752977));
        } else if (this.J0) {
            cv3Var2.setHint(jb6.M0(2131751061, "EnterChannelName"));
            r23 = false;
        } else {
            cv3Var2.setHint(jb6.M0(2131749179, "GroupName"));
            r23 = false;
        }
        cv3 cv3Var3 = this.w;
        TLRPC.Chat chat3 = this.x0;
        cv3Var3.setEnabled((chat3 != null || sd2.d(chat3)) ? true : r23);
        cv3 cv3Var4 = this.w;
        cv3Var4.setFocusable(cv3Var4.isEnabled());
        this.w.getEditText().addTextChangedListener(new b7(this, (byte) 11));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r23] = new InputFilter.LengthFilter(128);
        this.w.setFilters(inputFilterArr);
        cv3 cv3Var5 = this.w;
        boolean z7 = jb6.a0;
        frameLayout2.addView(cv3Var5, qoe.d(-1, -2.0f, 16, z7 ? 5.0f : 96.0f, 0.0f, z7 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(1);
        t1Var.addView(this.E, qoe.o(-1, -2));
        final byte b3 = 12;
        if (this.D0 != null || sd2.d(this.x0)) {
            z92 z92Var = new z92(context);
            this.c0 = z92Var;
            anb.Q(z92Var, cmb.L0(r23), null, anb.M(cmb.h6));
            this.c0.g(cmb.u6, cmb.t6);
            this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b3;
                    byte b4 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L0 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i9 = chatPhoto2.dc_id;
                                        if (i9 != 0) {
                                            chatPhoto2.photo_big.dc_id = i9;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i10 = userProfilePhoto2.dc_id;
                                        if (i10 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i10;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j4 = ba2Var3.w0;
                            xib xibVar7 = ba2Var3.I;
                            boolean z62 = xibVar7 != null && xibVar7.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j4;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L02;
                            ib2Var.s = sd2.T(L02) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b4);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            this.E.addView(this.c0, qoe.o(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.F = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        anb.E(this.F, cmb.G6);
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        int i9 = cmb.F6;
        anb.X(editTextBoldCursor2, i9, null);
        int i10 = r23;
        this.F.setPadding(i10, i10, i10, gm.L(6.0f));
        this.F.setBackgroundDrawable(null);
        this.F.setGravity(jb6.a0 ? 5 : 3);
        this.F.setInputType(180225);
        this.F.setImeOptions(6);
        this.F.setEnabled(this.D0 != null || sd2.d(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.F;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(nm7.d4)});
        this.F.setHint(jb6.M0(2131751397, "DescriptionOptionalPlaceholder"));
        anb.u(this.F, i9);
        this.F.setCursorSize(gm.L(20.0f));
        this.F.setCursorWidth(1.5f);
        boolean isEnabled = this.F.isEnabled();
        LinearLayout linearLayout4 = this.E;
        EditTextBoldCursor editTextBoldCursor4 = this.F;
        if (isEnabled) {
            linearLayout4.addView(editTextBoldCursor4, qoe.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            linearLayout4.addView(editTextBoldCursor4, qoe.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.F.setOnEditorActionListener(new j(this, (byte) 8));
        this.F.addTextChangedListener(new ej1((byte) 1));
        bba bbaVar = new bba(context);
        this.H = bbaVar;
        t1Var.addView(bbaVar, qoe.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        t1Var.addView(this.G, qoe.o(-1, -2));
        TLRPC.Chat chat4 = this.x0;
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.y0) == null || chatFull4.can_set_location)) {
                xib xibVar7 = new xib(context);
                this.I = xibVar7;
                anb.Q(xibVar7, cmb.L0(true), anb.M(i8), anb.M(cmb.h6));
                this.G.addView(this.I, qoe.o(-1, -2));
                final byte b4 = 15;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: o92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b4;
                        byte b42 = 4;
                        gn5 gn5Var = null;
                        ba2 ba2Var3 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ba2Var3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wg2 wg2Var = new wg2(bundle);
                                wg2Var.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var);
                                break;
                            case 1:
                                y92 y92Var = ba2Var3.R0;
                                long j32 = ba2Var3.C0;
                                if (!ba2Var3.s.g()) {
                                    TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                    if (W1 == null) {
                                        TLRPC.Chat L0 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i92 = chatPhoto2.dc_id;
                                            if (i92 != 0) {
                                                chatPhoto2.photo_big.dc_id = i92;
                                            }
                                            TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                            int i102 = userProfilePhoto2.dc_id;
                                            if (i102 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i102;
                                            }
                                            PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ba2Var3.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wg2 wg2Var2 = new wg2(bundle2);
                                wg2Var2.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var2);
                                break;
                            case 3:
                                ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                break;
                            case 4:
                                ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                break;
                            case 5:
                                ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                break;
                            case 6:
                                ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ba2Var3.C0);
                                ba2Var3.presentFragment(new uf1(bundle3));
                                break;
                            case 8:
                                ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                break;
                            case 9:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                break;
                            case 10:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                break;
                            case 11:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                break;
                            case 12:
                                ba2Var3.n0();
                                break;
                            case 13:
                                ba2Var3.i0();
                                break;
                            case 14:
                                ba2 ba2Var4 = this.b;
                                ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                break;
                            case 15:
                                if (gm.H1(ba2Var3)) {
                                    pc6 pc6Var = new pc6(4);
                                    pc6Var.m0 = -ba2Var3.w0;
                                    TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                    ba2Var3.presentFragment(pc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = ba2Var3.w0;
                                xib xibVar72 = ba2Var3.I;
                                boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                qa2 qa2Var = new qa2(null);
                                qa2Var.N = new ArrayList();
                                qa2Var.O = new ArrayList();
                                qa2Var.Q = new ArrayList();
                                qa2Var.d0 = true;
                                qa2Var.g0 = new ArrayList();
                                qa2Var.p0 = new HashMap();
                                qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                qa2Var.t0 = false;
                                qa2Var.a0 = j4;
                                qa2Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                qa2Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        qa2Var.m0 = tL_chatInviteExported;
                                    } else {
                                        qa2Var.d0(false);
                                    }
                                }
                                ba2Var3.presentFragment(qa2Var);
                                break;
                            case 17:
                                long j5 = ba2Var3.w0;
                                ib2 ib2Var = new ib2(null);
                                ib2Var.w = new ArrayList();
                                ib2Var.P = false;
                                ib2Var.Q = false;
                                ib2Var.F = j5;
                                TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                ib2Var.f = L02;
                                ib2Var.s = sd2.T(L02) && !ib2Var.f.megagroup;
                                ib2Var.h = ba2Var3.y0;
                                ba2Var3.presentFragment(ib2Var);
                                break;
                            case 18:
                                wh8 wh8Var = new wh8(ba2Var3.w0);
                                wh8Var.s = new u92(ba2Var3, b42);
                                ba2Var3.presentFragment(wh8Var);
                                break;
                            case 19:
                                ba2Var3.f0();
                                break;
                            case 20:
                                ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                ac5Var.c = ba2Var3.M0;
                                ac5Var.m0 = ba2Var3;
                                ba2Var3.presentFragment(ac5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ba2Var3.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                wg2 wg2Var3 = new wg2(bundle4);
                                wg2Var3.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var3);
                                break;
                            case 22:
                                ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                ba2Var3.presentFragment(ak6Var);
                                break;
                            case 23:
                                if (!sd2.V(ba2Var3.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ba2Var3.w0);
                                    zd2 zd2Var = new zd2(bundle5);
                                    TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                    zd2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zd2Var.a == null) {
                                            zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                        }
                                        zd2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zd2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zd2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            zd2Var.w = (byte) 1;
                                        }
                                    }
                                    ba2Var3.presentFragment(zd2Var);
                                    break;
                                } else {
                                    ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = kt6.j(9, "chatMode");
                                j6.putLong("chat_id", ba2Var3.w0);
                                j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                ba2Var3.presentFragment(new yv1(j6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull3 = this.y0) == null || chatFull3.can_set_username)) {
                xib xibVar8 = new xib(context);
                this.J = xibVar8;
                anb.Q(xibVar8, cmb.L0(true), anb.M(i8), anb.M(cmb.h6));
                this.G.addView(this.J, qoe.o(-1, -2));
                final byte b5 = 16;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: o92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b5;
                        byte b42 = 4;
                        gn5 gn5Var = null;
                        ba2 ba2Var3 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ba2Var3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wg2 wg2Var = new wg2(bundle);
                                wg2Var.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var);
                                break;
                            case 1:
                                y92 y92Var = ba2Var3.R0;
                                long j32 = ba2Var3.C0;
                                if (!ba2Var3.s.g()) {
                                    TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                    if (W1 == null) {
                                        TLRPC.Chat L0 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i92 = chatPhoto2.dc_id;
                                            if (i92 != 0) {
                                                chatPhoto2.photo_big.dc_id = i92;
                                            }
                                            TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                            int i102 = userProfilePhoto2.dc_id;
                                            if (i102 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i102;
                                            }
                                            PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ba2Var3.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wg2 wg2Var2 = new wg2(bundle2);
                                wg2Var2.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var2);
                                break;
                            case 3:
                                ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                break;
                            case 4:
                                ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                break;
                            case 5:
                                ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                break;
                            case 6:
                                ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ba2Var3.C0);
                                ba2Var3.presentFragment(new uf1(bundle3));
                                break;
                            case 8:
                                ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                break;
                            case 9:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                break;
                            case 10:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                break;
                            case 11:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                break;
                            case 12:
                                ba2Var3.n0();
                                break;
                            case 13:
                                ba2Var3.i0();
                                break;
                            case 14:
                                ba2 ba2Var4 = this.b;
                                ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                break;
                            case 15:
                                if (gm.H1(ba2Var3)) {
                                    pc6 pc6Var = new pc6(4);
                                    pc6Var.m0 = -ba2Var3.w0;
                                    TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                    ba2Var3.presentFragment(pc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = ba2Var3.w0;
                                xib xibVar72 = ba2Var3.I;
                                boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                qa2 qa2Var = new qa2(null);
                                qa2Var.N = new ArrayList();
                                qa2Var.O = new ArrayList();
                                qa2Var.Q = new ArrayList();
                                qa2Var.d0 = true;
                                qa2Var.g0 = new ArrayList();
                                qa2Var.p0 = new HashMap();
                                qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                qa2Var.t0 = false;
                                qa2Var.a0 = j4;
                                qa2Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                qa2Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        qa2Var.m0 = tL_chatInviteExported;
                                    } else {
                                        qa2Var.d0(false);
                                    }
                                }
                                ba2Var3.presentFragment(qa2Var);
                                break;
                            case 17:
                                long j5 = ba2Var3.w0;
                                ib2 ib2Var = new ib2(null);
                                ib2Var.w = new ArrayList();
                                ib2Var.P = false;
                                ib2Var.Q = false;
                                ib2Var.F = j5;
                                TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                ib2Var.f = L02;
                                ib2Var.s = sd2.T(L02) && !ib2Var.f.megagroup;
                                ib2Var.h = ba2Var3.y0;
                                ba2Var3.presentFragment(ib2Var);
                                break;
                            case 18:
                                wh8 wh8Var = new wh8(ba2Var3.w0);
                                wh8Var.s = new u92(ba2Var3, b42);
                                ba2Var3.presentFragment(wh8Var);
                                break;
                            case 19:
                                ba2Var3.f0();
                                break;
                            case 20:
                                ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                ac5Var.c = ba2Var3.M0;
                                ac5Var.m0 = ba2Var3;
                                ba2Var3.presentFragment(ac5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ba2Var3.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                wg2 wg2Var3 = new wg2(bundle4);
                                wg2Var3.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var3);
                                break;
                            case 22:
                                ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                ba2Var3.presentFragment(ak6Var);
                                break;
                            case 23:
                                if (!sd2.V(ba2Var3.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ba2Var3.w0);
                                    zd2 zd2Var = new zd2(bundle5);
                                    TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                    zd2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zd2Var.a == null) {
                                            zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                        }
                                        zd2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zd2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zd2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            zd2Var.w = (byte) 1;
                                        }
                                    }
                                    ba2Var3.presentFragment(zd2Var);
                                    break;
                                } else {
                                    ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = kt6.j(9, "chatMode");
                                j6.putLong("chat_id", ba2Var3.w0);
                                j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                ba2Var3.presentFragment(new yv1(j6));
                                break;
                        }
                    }
                });
            }
            if (sd2.T(this.x0) && ((this.J0 && sd2.y(1, this.x0)) || (!this.J0 && sd2.y(0, this.x0)))) {
                xib xibVar9 = new xib(context);
                this.K = xibVar9;
                anb.Q(xibVar9, cmb.L0(true), anb.M(i8), anb.M(cmb.h6));
                this.G.addView(this.K, qoe.o(-1, -2));
                final byte b6 = 17;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: o92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b6;
                        byte b42 = 4;
                        gn5 gn5Var = null;
                        ba2 ba2Var3 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ba2Var3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wg2 wg2Var = new wg2(bundle);
                                wg2Var.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var);
                                break;
                            case 1:
                                y92 y92Var = ba2Var3.R0;
                                long j32 = ba2Var3.C0;
                                if (!ba2Var3.s.g()) {
                                    TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                    if (W1 == null) {
                                        TLRPC.Chat L0 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i92 = chatPhoto2.dc_id;
                                            if (i92 != 0) {
                                                chatPhoto2.photo_big.dc_id = i92;
                                            }
                                            TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                            int i102 = userProfilePhoto2.dc_id;
                                            if (i102 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i102;
                                            }
                                            PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ba2Var3.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wg2 wg2Var2 = new wg2(bundle2);
                                wg2Var2.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var2);
                                break;
                            case 3:
                                ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                break;
                            case 4:
                                ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                break;
                            case 5:
                                ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                break;
                            case 6:
                                ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ba2Var3.C0);
                                ba2Var3.presentFragment(new uf1(bundle3));
                                break;
                            case 8:
                                ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                break;
                            case 9:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                break;
                            case 10:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                break;
                            case 11:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                break;
                            case 12:
                                ba2Var3.n0();
                                break;
                            case 13:
                                ba2Var3.i0();
                                break;
                            case 14:
                                ba2 ba2Var4 = this.b;
                                ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                break;
                            case 15:
                                if (gm.H1(ba2Var3)) {
                                    pc6 pc6Var = new pc6(4);
                                    pc6Var.m0 = -ba2Var3.w0;
                                    TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                    ba2Var3.presentFragment(pc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = ba2Var3.w0;
                                xib xibVar72 = ba2Var3.I;
                                boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                qa2 qa2Var = new qa2(null);
                                qa2Var.N = new ArrayList();
                                qa2Var.O = new ArrayList();
                                qa2Var.Q = new ArrayList();
                                qa2Var.d0 = true;
                                qa2Var.g0 = new ArrayList();
                                qa2Var.p0 = new HashMap();
                                qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                qa2Var.t0 = false;
                                qa2Var.a0 = j4;
                                qa2Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                qa2Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        qa2Var.m0 = tL_chatInviteExported;
                                    } else {
                                        qa2Var.d0(false);
                                    }
                                }
                                ba2Var3.presentFragment(qa2Var);
                                break;
                            case 17:
                                long j5 = ba2Var3.w0;
                                ib2 ib2Var = new ib2(null);
                                ib2Var.w = new ArrayList();
                                ib2Var.P = false;
                                ib2Var.Q = false;
                                ib2Var.F = j5;
                                TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                ib2Var.f = L02;
                                ib2Var.s = sd2.T(L02) && !ib2Var.f.megagroup;
                                ib2Var.h = ba2Var3.y0;
                                ba2Var3.presentFragment(ib2Var);
                                break;
                            case 18:
                                wh8 wh8Var = new wh8(ba2Var3.w0);
                                wh8Var.s = new u92(ba2Var3, b42);
                                ba2Var3.presentFragment(wh8Var);
                                break;
                            case 19:
                                ba2Var3.f0();
                                break;
                            case 20:
                                ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                ac5Var.c = ba2Var3.M0;
                                ac5Var.m0 = ba2Var3;
                                ba2Var3.presentFragment(ac5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ba2Var3.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                wg2 wg2Var3 = new wg2(bundle4);
                                wg2Var3.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var3);
                                break;
                            case 22:
                                ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                ba2Var3.presentFragment(ak6Var);
                                break;
                            case 23:
                                if (!sd2.V(ba2Var3.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ba2Var3.w0);
                                    zd2 zd2Var = new zd2(bundle5);
                                    TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                    zd2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zd2Var.a == null) {
                                            zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                        }
                                        zd2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zd2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zd2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            zd2Var.w = (byte) 1;
                                        }
                                    }
                                    ba2Var3.presentFragment(zd2Var);
                                    break;
                                } else {
                                    ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = kt6.j(9, "chatMode");
                                j6.putLong("chat_id", ba2Var3.w0);
                                j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                ba2Var3.presentFragment(new yv1(j6));
                                break;
                        }
                    }
                });
            }
            if (sd2.V(this.x0) && this.J0 && sd2.y(1, this.x0)) {
                xib xibVar10 = new xib(context);
                this.L = xibVar10;
                anb.Q(xibVar10, cmb.L0(true), anb.M(i8), anb.M(cmb.h6));
                this.L.s(jb6.L0(2131746829), "", R.drawable.msg_markunread, true);
                i7 = -1;
                this.G.addView(this.L, qoe.o(-1, -2));
                final byte b7 = 18;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: o92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b7;
                        byte b42 = 4;
                        gn5 gn5Var = null;
                        ba2 ba2Var3 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ba2Var3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wg2 wg2Var = new wg2(bundle);
                                wg2Var.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var);
                                break;
                            case 1:
                                y92 y92Var = ba2Var3.R0;
                                long j32 = ba2Var3.C0;
                                if (!ba2Var3.s.g()) {
                                    TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                    if (W1 == null) {
                                        TLRPC.Chat L0 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i92 = chatPhoto2.dc_id;
                                            if (i92 != 0) {
                                                chatPhoto2.photo_big.dc_id = i92;
                                            }
                                            TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                            int i102 = userProfilePhoto2.dc_id;
                                            if (i102 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i102;
                                            }
                                            PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ba2Var3.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wg2 wg2Var2 = new wg2(bundle2);
                                wg2Var2.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var2);
                                break;
                            case 3:
                                ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                break;
                            case 4:
                                ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                break;
                            case 5:
                                ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                break;
                            case 6:
                                ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ba2Var3.C0);
                                ba2Var3.presentFragment(new uf1(bundle3));
                                break;
                            case 8:
                                ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                break;
                            case 9:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                break;
                            case 10:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                break;
                            case 11:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                break;
                            case 12:
                                ba2Var3.n0();
                                break;
                            case 13:
                                ba2Var3.i0();
                                break;
                            case 14:
                                ba2 ba2Var4 = this.b;
                                ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                break;
                            case 15:
                                if (gm.H1(ba2Var3)) {
                                    pc6 pc6Var = new pc6(4);
                                    pc6Var.m0 = -ba2Var3.w0;
                                    TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                    ba2Var3.presentFragment(pc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = ba2Var3.w0;
                                xib xibVar72 = ba2Var3.I;
                                boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                qa2 qa2Var = new qa2(null);
                                qa2Var.N = new ArrayList();
                                qa2Var.O = new ArrayList();
                                qa2Var.Q = new ArrayList();
                                qa2Var.d0 = true;
                                qa2Var.g0 = new ArrayList();
                                qa2Var.p0 = new HashMap();
                                qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                qa2Var.t0 = false;
                                qa2Var.a0 = j4;
                                qa2Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                qa2Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        qa2Var.m0 = tL_chatInviteExported;
                                    } else {
                                        qa2Var.d0(false);
                                    }
                                }
                                ba2Var3.presentFragment(qa2Var);
                                break;
                            case 17:
                                long j5 = ba2Var3.w0;
                                ib2 ib2Var = new ib2(null);
                                ib2Var.w = new ArrayList();
                                ib2Var.P = false;
                                ib2Var.Q = false;
                                ib2Var.F = j5;
                                TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                ib2Var.f = L02;
                                ib2Var.s = sd2.T(L02) && !ib2Var.f.megagroup;
                                ib2Var.h = ba2Var3.y0;
                                ba2Var3.presentFragment(ib2Var);
                                break;
                            case 18:
                                wh8 wh8Var = new wh8(ba2Var3.w0);
                                wh8Var.s = new u92(ba2Var3, b42);
                                ba2Var3.presentFragment(wh8Var);
                                break;
                            case 19:
                                ba2Var3.f0();
                                break;
                            case 20:
                                ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                ac5Var.c = ba2Var3.M0;
                                ac5Var.m0 = ba2Var3;
                                ba2Var3.presentFragment(ac5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ba2Var3.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                wg2 wg2Var3 = new wg2(bundle4);
                                wg2Var3.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var3);
                                break;
                            case 22:
                                ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                ba2Var3.presentFragment(ak6Var);
                                break;
                            case 23:
                                if (!sd2.V(ba2Var3.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ba2Var3.w0);
                                    zd2 zd2Var = new zd2(bundle5);
                                    TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                    zd2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zd2Var.a == null) {
                                            zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                        }
                                        zd2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zd2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zd2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            zd2Var.w = (byte) 1;
                                        }
                                    }
                                    ba2Var3.presentFragment(zd2Var);
                                    break;
                                } else {
                                    ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = kt6.j(9, "chatMode");
                                j6.putLong("chat_id", ba2Var3.w0);
                                j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                ba2Var3.presentFragment(new yv1(j6));
                                break;
                        }
                    }
                });
            } else {
                i7 = -1;
            }
            if (sd2.V(this.x0) && sd2.d(this.x0)) {
                i = i8;
                i2 = -2;
                g28 g28Var = new g28(this.currentAccount, -this.x0.id, getResourceProvider(), context);
                this.M = g28Var;
                anb.Q(g28Var, cmb.L0(true), anb.M(i), anb.M(cmb.h6));
                this.G.addView(this.M, qoe.o(i7, -2));
                final byte b8 = 19;
                this.M.setOnClickListener(new View.OnClickListener(this) { // from class: o92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b8;
                        byte b42 = 4;
                        gn5 gn5Var = null;
                        ba2 ba2Var3 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ba2Var3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wg2 wg2Var = new wg2(bundle);
                                wg2Var.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var);
                                break;
                            case 1:
                                y92 y92Var = ba2Var3.R0;
                                long j32 = ba2Var3.C0;
                                if (!ba2Var3.s.g()) {
                                    TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                    if (W1 == null) {
                                        TLRPC.Chat L0 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i92 = chatPhoto2.dc_id;
                                            if (i92 != 0) {
                                                chatPhoto2.photo_big.dc_id = i92;
                                            }
                                            TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                            int i102 = userProfilePhoto2.dc_id;
                                            if (i102 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i102;
                                            }
                                            PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ba2Var3.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wg2 wg2Var2 = new wg2(bundle2);
                                wg2Var2.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var2);
                                break;
                            case 3:
                                ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                break;
                            case 4:
                                ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                break;
                            case 5:
                                ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                break;
                            case 6:
                                ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ba2Var3.C0);
                                ba2Var3.presentFragment(new uf1(bundle3));
                                break;
                            case 8:
                                ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                break;
                            case 9:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                break;
                            case 10:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                break;
                            case 11:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                break;
                            case 12:
                                ba2Var3.n0();
                                break;
                            case 13:
                                ba2Var3.i0();
                                break;
                            case 14:
                                ba2 ba2Var4 = this.b;
                                ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                break;
                            case 15:
                                if (gm.H1(ba2Var3)) {
                                    pc6 pc6Var = new pc6(4);
                                    pc6Var.m0 = -ba2Var3.w0;
                                    TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                    ba2Var3.presentFragment(pc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j4 = ba2Var3.w0;
                                xib xibVar72 = ba2Var3.I;
                                boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                qa2 qa2Var = new qa2(null);
                                qa2Var.N = new ArrayList();
                                qa2Var.O = new ArrayList();
                                qa2Var.Q = new ArrayList();
                                qa2Var.d0 = true;
                                qa2Var.g0 = new ArrayList();
                                qa2Var.p0 = new HashMap();
                                qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                qa2Var.t0 = false;
                                qa2Var.a0 = j4;
                                qa2Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                qa2Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        qa2Var.m0 = tL_chatInviteExported;
                                    } else {
                                        qa2Var.d0(false);
                                    }
                                }
                                ba2Var3.presentFragment(qa2Var);
                                break;
                            case 17:
                                long j5 = ba2Var3.w0;
                                ib2 ib2Var = new ib2(null);
                                ib2Var.w = new ArrayList();
                                ib2Var.P = false;
                                ib2Var.Q = false;
                                ib2Var.F = j5;
                                TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                ib2Var.f = L02;
                                ib2Var.s = sd2.T(L02) && !ib2Var.f.megagroup;
                                ib2Var.h = ba2Var3.y0;
                                ba2Var3.presentFragment(ib2Var);
                                break;
                            case 18:
                                wh8 wh8Var = new wh8(ba2Var3.w0);
                                wh8Var.s = new u92(ba2Var3, b42);
                                ba2Var3.presentFragment(wh8Var);
                                break;
                            case 19:
                                ba2Var3.f0();
                                break;
                            case 20:
                                ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                ac5Var.c = ba2Var3.M0;
                                ac5Var.m0 = ba2Var3;
                                ba2Var3.presentFragment(ac5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ba2Var3.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                wg2 wg2Var3 = new wg2(bundle4);
                                wg2Var3.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var3);
                                break;
                            case 22:
                                ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                ba2Var3.presentFragment(ak6Var);
                                break;
                            case 23:
                                if (!sd2.V(ba2Var3.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ba2Var3.w0);
                                    zd2 zd2Var = new zd2(bundle5);
                                    TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                    zd2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zd2Var.a == null) {
                                            zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                        }
                                        zd2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zd2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zd2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            zd2Var.w = (byte) 1;
                                        }
                                    }
                                    ba2Var3.presentFragment(zd2Var);
                                    break;
                                } else {
                                    ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = kt6.j(9, "chatMode");
                                j6.putLong("chat_id", ba2Var3.w0);
                                j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                ba2Var3.presentFragment(new yv1(j6));
                                break;
                        }
                    }
                });
            } else {
                i = i8;
                i2 = -2;
            }
            if (!sd2.V(this.x0) || sd2.Y(this.x0)) {
                context3 = context;
                frameLayout = frameLayout2;
                num = 1;
                ba2Var = this;
            } else {
                long j4 = -this.x0.id;
                num = 1;
                xib xibVar11 = new xib(23, this.resourceProvider, context, false, true);
                context3 = context;
                this.N = xibVar11;
                anb.Q(xibVar11, cmb.L0(true), anb.M(i), anb.M(cmb.h6));
                this.N.n(R.drawable.msg_translate, jb6.L0(2131752404), this.x0.autotranslation);
                final byte b9 = 0;
                getMessagesController().F0().a(j4, new qac(this) { // from class: s92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = this;
                    }

                    @Override // qac
                    public final void a(Object obj) {
                        byte b10 = b9;
                        ba2 ba2Var3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (b10) {
                            case 0:
                                if (tL_premium_boostsStatus != null) {
                                    ba2Var3.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < ba2Var3.getMessagesController().l4.U1.f() ? R.drawable.permission_locked : 0);
                                    break;
                                }
                                break;
                            default:
                                ba2Var3.M0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                this.G.addView(this.N, qoe.o(-1, i2));
                frameLayout = frameLayout2;
                ba2Var = this;
                this.N.setOnClickListener(new fh(this, new boolean[]{false}, j4, (byte) 2));
            }
            if (!ba2Var.J0 && sd2.w(2, ba2Var.x0) && (sd2.T(ba2Var.x0) || ba2Var.x0.creator)) {
                xib xibVar12 = new xib(context3);
                ba2Var.O = xibVar12;
                anb.Q(xibVar12, cmb.L0(true), anb.M(i), anb.M(cmb.h6));
                ba2Var.G.addView(ba2Var.O, qoe.o(-1, i2));
                ba2Var.O.setOnClickListener(new rc1((Object) ba2Var, (Object) context3, (byte) 14));
            }
            if (sd2.n0(ba2Var.x0) && sd2.N(ba2Var.x0) && !sd2.Y(ba2Var.x0)) {
                final byte b10 = 1;
                oc7.r1(ba2Var.currentAccount).F0().a(-ba2Var.x0.id, new qac(ba2Var) { // from class: s92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = ba2Var;
                    }

                    @Override // qac
                    public final void a(Object obj) {
                        byte b102 = b10;
                        ba2 ba2Var3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (b102) {
                            case 0:
                                if (tL_premium_boostsStatus != null) {
                                    ba2Var3.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < ba2Var3.getMessagesController().l4.U1.f() ? R.drawable.permission_locked : 0);
                                    break;
                                }
                                break;
                            default:
                                ba2Var3.M0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                g28 g28Var2 = new g28(ba2Var.currentAccount, -ba2Var.x0.id, ba2Var.getResourceProvider(), context3);
                ba2Var.M = g28Var2;
                anb.Q(g28Var2, cmb.L0(true), anb.M(i), anb.M(cmb.h6));
                ba2Var.G.addView(ba2Var.M, qoe.o(-1, i2));
                final byte b11 = 20;
                ba2Var.M.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = ba2Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b32 = b11;
                        byte b42 = 4;
                        gn5 gn5Var = null;
                        ba2 ba2Var3 = this.b;
                        switch (b32) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ba2Var3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wg2 wg2Var = new wg2(bundle);
                                wg2Var.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var);
                                break;
                            case 1:
                                y92 y92Var = ba2Var3.R0;
                                long j32 = ba2Var3.C0;
                                if (!ba2Var3.s.g()) {
                                    TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                    if (W1 == null) {
                                        TLRPC.Chat L0 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i92 = chatPhoto2.dc_id;
                                            if (i92 != 0) {
                                                chatPhoto2.photo_big.dc_id = i92;
                                            }
                                            TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.r0().T1(null, ba2Var3, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                            int i102 = userProfilePhoto2.dc_id;
                                            if (i102 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i102;
                                            }
                                            PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ba2Var3.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wg2 wg2Var2 = new wg2(bundle2);
                                wg2Var2.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var2);
                                break;
                            case 3:
                                ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                break;
                            case 4:
                                ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                break;
                            case 5:
                                ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                break;
                            case 6:
                                ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                break;
                            case 7:
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ba2Var3.C0);
                                ba2Var3.presentFragment(new uf1(bundle3));
                                break;
                            case 8:
                                ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                break;
                            case 9:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                break;
                            case 10:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                break;
                            case 11:
                                l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                break;
                            case 12:
                                ba2Var3.n0();
                                break;
                            case 13:
                                ba2Var3.i0();
                                break;
                            case 14:
                                ba2 ba2Var4 = this.b;
                                ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                break;
                            case 15:
                                if (gm.H1(ba2Var3)) {
                                    pc6 pc6Var = new pc6(4);
                                    pc6Var.m0 = -ba2Var3.w0;
                                    TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                    ba2Var3.presentFragment(pc6Var);
                                    break;
                                }
                                break;
                            case 16:
                                long j42 = ba2Var3.w0;
                                xib xibVar72 = ba2Var3.I;
                                boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                qa2 qa2Var = new qa2(null);
                                qa2Var.N = new ArrayList();
                                qa2Var.O = new ArrayList();
                                qa2Var.Q = new ArrayList();
                                qa2Var.d0 = true;
                                qa2Var.g0 = new ArrayList();
                                qa2Var.p0 = new HashMap();
                                qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                qa2Var.t0 = false;
                                qa2Var.a0 = j42;
                                qa2Var.o0 = z62;
                                TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                qa2Var.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        qa2Var.m0 = tL_chatInviteExported;
                                    } else {
                                        qa2Var.d0(false);
                                    }
                                }
                                ba2Var3.presentFragment(qa2Var);
                                break;
                            case 17:
                                long j5 = ba2Var3.w0;
                                ib2 ib2Var = new ib2(null);
                                ib2Var.w = new ArrayList();
                                ib2Var.P = false;
                                ib2Var.Q = false;
                                ib2Var.F = j5;
                                TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                ib2Var.f = L02;
                                ib2Var.s = sd2.T(L02) && !ib2Var.f.megagroup;
                                ib2Var.h = ba2Var3.y0;
                                ba2Var3.presentFragment(ib2Var);
                                break;
                            case 18:
                                wh8 wh8Var = new wh8(ba2Var3.w0);
                                wh8Var.s = new u92(ba2Var3, b42);
                                ba2Var3.presentFragment(wh8Var);
                                break;
                            case 19:
                                ba2Var3.f0();
                                break;
                            case 20:
                                ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                ac5Var.c = ba2Var3.M0;
                                ac5Var.m0 = ba2Var3;
                                ba2Var3.presentFragment(ac5Var);
                                break;
                            case 21:
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ba2Var3.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                wg2 wg2Var3 = new wg2(bundle4);
                                wg2Var3.B0(ba2Var3.y0);
                                ba2Var3.presentFragment(wg2Var3);
                                break;
                            case 22:
                                ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                ba2Var3.presentFragment(ak6Var);
                                break;
                            case 23:
                                if (!sd2.V(ba2Var3.x0)) {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ba2Var3.w0);
                                    zd2 zd2Var = new zd2(bundle5);
                                    TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                    zd2Var.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zd2Var.a == null) {
                                            zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                        }
                                        zd2Var.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zd2Var.w = (byte) 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zd2Var.w = (byte) 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                    zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                }
                                                r9++;
                                            }
                                            zd2Var.w = (byte) 1;
                                        }
                                    }
                                    ba2Var3.presentFragment(zd2Var);
                                    break;
                                } else {
                                    ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                    break;
                                }
                            default:
                                Bundle j6 = kt6.j(9, "chatMode");
                                j6.putLong("chat_id", ba2Var3.w0);
                                j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                ba2Var3.presentFragment(new yv1(j6));
                                break;
                        }
                    }
                });
            }
            if (ba2Var.J0 || !ba2Var.x0.creator) {
                context2 = context;
            } else {
                xib xibVar13 = new xib(23, null, context, false, true);
                context2 = context;
                ba2Var.R = xibVar13;
                anb.Q(xibVar13, cmb.L0(true), anb.M(i), anb.M(cmb.h6));
                ba2Var.R.n(R.drawable.msg_topics, jb6.L0(2131752219), ba2Var.F0);
                ba2Var.R.getCheckBox().setIcon(ba2Var.G0 ? 0 : R.drawable.permission_locked);
                ba2Var.G.addView(ba2Var.R, qoe.c(-2.0f, -1));
                ba2Var.R.setOnClickListener(new rc1((Object) ba2Var, (Object) frameLayout, (byte) 15));
            }
            ba2Var.t0();
        } else {
            i = i8;
            i2 = -2;
            context2 = context;
            num = 1;
            ba2Var = this;
        }
        ba2Var.simpleActionBar.t();
        if (ba2Var.D0 != null || sd2.d(ba2Var.x0) || ba2Var.O != null) {
            ba2Var.a = ba2Var.simpleActionBar.s(jb6.L0(2131745680));
        }
        if (ba2Var.I == null && ba2Var.O == null && ba2Var.J == null && ba2Var.K == null && ba2Var.R == null) {
            i3 = -1;
        } else {
            njb njbVar = new njb(12, ba2Var.resourceProvider, context2);
            ba2Var.Q = njbVar;
            if (ba2Var.R != null) {
                njbVar.setText(jb6.L0(2131750520));
            } else {
                njbVar.setFixedSize(12);
            }
            i3 = -1;
            t1Var.addView(ba2Var.Q, qoe.o(-1, i2));
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        ba2Var.S = linearLayout6;
        linearLayout6.setOrientation(1);
        t1Var.addView(ba2Var.S, qoe.o(i3, i2));
        if (ba2Var.x0 != null) {
            xib xibVar14 = new xib(context2);
            ba2Var.Y = xibVar14;
            fg0 L0 = cmb.L0(false);
            int i11 = cmb.h6;
            wmbVar = null;
            anb.Q(xibVar14, L0, null, anb.M(i11));
            xib xibVar15 = ba2Var.Y;
            if (!sd2.T(ba2Var.x0)) {
                TLRPC.Chat chat5 = ba2Var.x0;
                if (!chat5.creator && (!sd2.N(chat5) || !sd2.d(ba2Var.x0))) {
                    i5 = 8;
                    xibVar15.setVisibility(i5);
                    final byte b12 = 21;
                    ba2Var.Y.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                        public final /* synthetic */ ba2 b;

                        {
                            this.b = ba2Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b12;
                            byte b42 = 4;
                            gn5 gn5Var = null;
                            ba2 ba2Var3 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ba2Var3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wg2 wg2Var = new wg2(bundle);
                                    wg2Var.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var);
                                    break;
                                case 1:
                                    y92 y92Var = ba2Var3.R0;
                                    long j32 = ba2Var3.C0;
                                    if (!ba2Var3.s.g()) {
                                        TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                        if (W1 == null) {
                                            TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                            TLRPC.ChatPhoto chatPhoto = L02.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                int i92 = chatPhoto2.dc_id;
                                                if (i92 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i92;
                                                }
                                                TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                int i102 = userProfilePhoto2.dc_id;
                                                if (i102 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i102;
                                                }
                                                PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ba2Var3.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wg2 wg2Var2 = new wg2(bundle2);
                                    wg2Var2.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var2);
                                    break;
                                case 3:
                                    ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                    break;
                                case 4:
                                    ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                    break;
                                case 5:
                                    ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                    break;
                                case 6:
                                    ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ba2Var3.C0);
                                    ba2Var3.presentFragment(new uf1(bundle3));
                                    break;
                                case 8:
                                    ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                    break;
                                case 9:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                    break;
                                case 10:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                    break;
                                case 11:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                    break;
                                case 12:
                                    ba2Var3.n0();
                                    break;
                                case 13:
                                    ba2Var3.i0();
                                    break;
                                case 14:
                                    ba2 ba2Var4 = this.b;
                                    ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                    break;
                                case 15:
                                    if (gm.H1(ba2Var3)) {
                                        pc6 pc6Var = new pc6(4);
                                        pc6Var.m0 = -ba2Var3.w0;
                                        TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                        ba2Var3.presentFragment(pc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = ba2Var3.w0;
                                    xib xibVar72 = ba2Var3.I;
                                    boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                    qa2 qa2Var = new qa2(null);
                                    qa2Var.N = new ArrayList();
                                    qa2Var.O = new ArrayList();
                                    qa2Var.Q = new ArrayList();
                                    qa2Var.d0 = true;
                                    qa2Var.g0 = new ArrayList();
                                    qa2Var.p0 = new HashMap();
                                    qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                    qa2Var.t0 = false;
                                    qa2Var.a0 = j42;
                                    qa2Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                    qa2Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            qa2Var.m0 = tL_chatInviteExported;
                                        } else {
                                            qa2Var.d0(false);
                                        }
                                    }
                                    ba2Var3.presentFragment(qa2Var);
                                    break;
                                case 17:
                                    long j5 = ba2Var3.w0;
                                    ib2 ib2Var = new ib2(null);
                                    ib2Var.w = new ArrayList();
                                    ib2Var.P = false;
                                    ib2Var.Q = false;
                                    ib2Var.F = j5;
                                    TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                    ib2Var.f = L022;
                                    ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                    ib2Var.h = ba2Var3.y0;
                                    ba2Var3.presentFragment(ib2Var);
                                    break;
                                case 18:
                                    wh8 wh8Var = new wh8(ba2Var3.w0);
                                    wh8Var.s = new u92(ba2Var3, b42);
                                    ba2Var3.presentFragment(wh8Var);
                                    break;
                                case 19:
                                    ba2Var3.f0();
                                    break;
                                case 20:
                                    ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                    ac5Var.c = ba2Var3.M0;
                                    ac5Var.m0 = ba2Var3;
                                    ba2Var3.presentFragment(ac5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ba2Var3.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                    wg2 wg2Var3 = new wg2(bundle4);
                                    wg2Var3.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var3);
                                    break;
                                case 22:
                                    ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                    ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                    ba2Var3.presentFragment(ak6Var);
                                    break;
                                case 23:
                                    if (!sd2.V(ba2Var3.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ba2Var3.w0);
                                        zd2 zd2Var = new zd2(bundle5);
                                        TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                        zd2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zd2Var.a == null) {
                                                zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                            }
                                            zd2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zd2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zd2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                zd2Var.w = (byte) 1;
                                            }
                                        }
                                        ba2Var3.presentFragment(zd2Var);
                                        break;
                                    } else {
                                        ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = kt6.j(9, "chatMode");
                                    j6.putLong("chat_id", ba2Var3.w0);
                                    j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                    ba2Var3.presentFragment(new yv1(j6));
                                    break;
                            }
                        }
                    });
                    xib xibVar16 = new xib(context2);
                    ba2Var.W = xibVar16;
                    anb.Q(xibVar16, cmb.L0(false), null, anb.M(i11));
                    final byte b13 = 22;
                    ba2Var.W.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                        public final /* synthetic */ ba2 b;

                        {
                            this.b = ba2Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b13;
                            byte b42 = 4;
                            gn5 gn5Var = null;
                            ba2 ba2Var3 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ba2Var3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wg2 wg2Var = new wg2(bundle);
                                    wg2Var.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var);
                                    break;
                                case 1:
                                    y92 y92Var = ba2Var3.R0;
                                    long j32 = ba2Var3.C0;
                                    if (!ba2Var3.s.g()) {
                                        TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                        if (W1 == null) {
                                            TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                            TLRPC.ChatPhoto chatPhoto = L02.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                int i92 = chatPhoto2.dc_id;
                                                if (i92 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i92;
                                                }
                                                TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                int i102 = userProfilePhoto2.dc_id;
                                                if (i102 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i102;
                                                }
                                                PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ba2Var3.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wg2 wg2Var2 = new wg2(bundle2);
                                    wg2Var2.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var2);
                                    break;
                                case 3:
                                    ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                    break;
                                case 4:
                                    ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                    break;
                                case 5:
                                    ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                    break;
                                case 6:
                                    ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ba2Var3.C0);
                                    ba2Var3.presentFragment(new uf1(bundle3));
                                    break;
                                case 8:
                                    ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                    break;
                                case 9:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                    break;
                                case 10:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                    break;
                                case 11:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                    break;
                                case 12:
                                    ba2Var3.n0();
                                    break;
                                case 13:
                                    ba2Var3.i0();
                                    break;
                                case 14:
                                    ba2 ba2Var4 = this.b;
                                    ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                    break;
                                case 15:
                                    if (gm.H1(ba2Var3)) {
                                        pc6 pc6Var = new pc6(4);
                                        pc6Var.m0 = -ba2Var3.w0;
                                        TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                        ba2Var3.presentFragment(pc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = ba2Var3.w0;
                                    xib xibVar72 = ba2Var3.I;
                                    boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                    qa2 qa2Var = new qa2(null);
                                    qa2Var.N = new ArrayList();
                                    qa2Var.O = new ArrayList();
                                    qa2Var.Q = new ArrayList();
                                    qa2Var.d0 = true;
                                    qa2Var.g0 = new ArrayList();
                                    qa2Var.p0 = new HashMap();
                                    qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                    qa2Var.t0 = false;
                                    qa2Var.a0 = j42;
                                    qa2Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                    qa2Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            qa2Var.m0 = tL_chatInviteExported;
                                        } else {
                                            qa2Var.d0(false);
                                        }
                                    }
                                    ba2Var3.presentFragment(qa2Var);
                                    break;
                                case 17:
                                    long j5 = ba2Var3.w0;
                                    ib2 ib2Var = new ib2(null);
                                    ib2Var.w = new ArrayList();
                                    ib2Var.P = false;
                                    ib2Var.Q = false;
                                    ib2Var.F = j5;
                                    TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                    ib2Var.f = L022;
                                    ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                    ib2Var.h = ba2Var3.y0;
                                    ba2Var3.presentFragment(ib2Var);
                                    break;
                                case 18:
                                    wh8 wh8Var = new wh8(ba2Var3.w0);
                                    wh8Var.s = new u92(ba2Var3, b42);
                                    ba2Var3.presentFragment(wh8Var);
                                    break;
                                case 19:
                                    ba2Var3.f0();
                                    break;
                                case 20:
                                    ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                    ac5Var.c = ba2Var3.M0;
                                    ac5Var.m0 = ba2Var3;
                                    ba2Var3.presentFragment(ac5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ba2Var3.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                    wg2 wg2Var3 = new wg2(bundle4);
                                    wg2Var3.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var3);
                                    break;
                                case 22:
                                    ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                    ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                    ba2Var3.presentFragment(ak6Var);
                                    break;
                                case 23:
                                    if (!sd2.V(ba2Var3.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ba2Var3.w0);
                                        zd2 zd2Var = new zd2(bundle5);
                                        TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                        zd2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zd2Var.a == null) {
                                                zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                            }
                                            zd2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zd2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zd2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                zd2Var.w = (byte) 1;
                                            }
                                        }
                                        ba2Var3.presentFragment(zd2Var);
                                        break;
                                    } else {
                                        ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = kt6.j(9, "chatMode");
                                    j6.putLong("chat_id", ba2Var3.w0);
                                    j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                    ba2Var3.presentFragment(new yv1(j6));
                                    break;
                            }
                        }
                    });
                    xib xibVar17 = new xib(context2);
                    ba2Var.P = xibVar17;
                    anb.Q(xibVar17, cmb.L0(false), null, anb.M(i11));
                    final byte b14 = 23;
                    ba2Var.P.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                        public final /* synthetic */ ba2 b;

                        {
                            this.b = ba2Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b14;
                            byte b42 = 4;
                            gn5 gn5Var = null;
                            ba2 ba2Var3 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ba2Var3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wg2 wg2Var = new wg2(bundle);
                                    wg2Var.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var);
                                    break;
                                case 1:
                                    y92 y92Var = ba2Var3.R0;
                                    long j32 = ba2Var3.C0;
                                    if (!ba2Var3.s.g()) {
                                        TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                        if (W1 == null) {
                                            TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                            TLRPC.ChatPhoto chatPhoto = L02.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                int i92 = chatPhoto2.dc_id;
                                                if (i92 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i92;
                                                }
                                                TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                int i102 = userProfilePhoto2.dc_id;
                                                if (i102 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i102;
                                                }
                                                PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ba2Var3.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wg2 wg2Var2 = new wg2(bundle2);
                                    wg2Var2.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var2);
                                    break;
                                case 3:
                                    ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                    break;
                                case 4:
                                    ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                    break;
                                case 5:
                                    ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                    break;
                                case 6:
                                    ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ba2Var3.C0);
                                    ba2Var3.presentFragment(new uf1(bundle3));
                                    break;
                                case 8:
                                    ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                    break;
                                case 9:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                    break;
                                case 10:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                    break;
                                case 11:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                    break;
                                case 12:
                                    ba2Var3.n0();
                                    break;
                                case 13:
                                    ba2Var3.i0();
                                    break;
                                case 14:
                                    ba2 ba2Var4 = this.b;
                                    ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                    break;
                                case 15:
                                    if (gm.H1(ba2Var3)) {
                                        pc6 pc6Var = new pc6(4);
                                        pc6Var.m0 = -ba2Var3.w0;
                                        TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                        ba2Var3.presentFragment(pc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = ba2Var3.w0;
                                    xib xibVar72 = ba2Var3.I;
                                    boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                    qa2 qa2Var = new qa2(null);
                                    qa2Var.N = new ArrayList();
                                    qa2Var.O = new ArrayList();
                                    qa2Var.Q = new ArrayList();
                                    qa2Var.d0 = true;
                                    qa2Var.g0 = new ArrayList();
                                    qa2Var.p0 = new HashMap();
                                    qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                    qa2Var.t0 = false;
                                    qa2Var.a0 = j42;
                                    qa2Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                    qa2Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            qa2Var.m0 = tL_chatInviteExported;
                                        } else {
                                            qa2Var.d0(false);
                                        }
                                    }
                                    ba2Var3.presentFragment(qa2Var);
                                    break;
                                case 17:
                                    long j5 = ba2Var3.w0;
                                    ib2 ib2Var = new ib2(null);
                                    ib2Var.w = new ArrayList();
                                    ib2Var.P = false;
                                    ib2Var.Q = false;
                                    ib2Var.F = j5;
                                    TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                    ib2Var.f = L022;
                                    ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                    ib2Var.h = ba2Var3.y0;
                                    ba2Var3.presentFragment(ib2Var);
                                    break;
                                case 18:
                                    wh8 wh8Var = new wh8(ba2Var3.w0);
                                    wh8Var.s = new u92(ba2Var3, b42);
                                    ba2Var3.presentFragment(wh8Var);
                                    break;
                                case 19:
                                    ba2Var3.f0();
                                    break;
                                case 20:
                                    ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                    ac5Var.c = ba2Var3.M0;
                                    ac5Var.m0 = ba2Var3;
                                    ba2Var3.presentFragment(ac5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ba2Var3.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                    wg2 wg2Var3 = new wg2(bundle4);
                                    wg2Var3.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var3);
                                    break;
                                case 22:
                                    ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                    ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                    ba2Var3.presentFragment(ak6Var);
                                    break;
                                case 23:
                                    if (!sd2.V(ba2Var3.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ba2Var3.w0);
                                        zd2 zd2Var = new zd2(bundle5);
                                        TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                        zd2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zd2Var.a == null) {
                                                zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                            }
                                            zd2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zd2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zd2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                zd2Var.w = (byte) 1;
                                            }
                                        }
                                        ba2Var3.presentFragment(zd2Var);
                                        break;
                                    } else {
                                        ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = kt6.j(9, "chatMode");
                                    j6.putLong("chat_id", ba2Var3.w0);
                                    j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                    ba2Var3.presentFragment(new yv1(j6));
                                    break;
                            }
                        }
                    });
                    if (sd2.y(28, ba2Var.x0)) {
                        xib xibVar18 = new xib(context2);
                        ba2Var.f0 = xibVar18;
                        anb.Q(xibVar18, cmb.L0(false), null, anb.M(i11));
                        final byte b15 = 24;
                        ba2Var.f0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                            public final /* synthetic */ ba2 b;

                            {
                                this.b = ba2Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b32 = b15;
                                byte b42 = 4;
                                gn5 gn5Var = null;
                                ba2 ba2Var3 = this.b;
                                switch (b32) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", ba2Var3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        wg2 wg2Var = new wg2(bundle);
                                        wg2Var.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var);
                                        break;
                                    case 1:
                                        y92 y92Var = ba2Var3.R0;
                                        long j32 = ba2Var3.C0;
                                        if (!ba2Var3.s.g()) {
                                            TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                            if (W1 == null) {
                                                TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                                TLRPC.ChatPhoto chatPhoto = L02.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, ba2Var3, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                    int i92 = chatPhoto2.dc_id;
                                                    if (i92 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i92;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, ba2Var3, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                    int i102 = userProfilePhoto2.dc_id;
                                                    if (i102 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i102;
                                                    }
                                                    PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", ba2Var3.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        wg2 wg2Var2 = new wg2(bundle2);
                                        wg2Var2.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var2);
                                        break;
                                    case 3:
                                        ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                        break;
                                    case 4:
                                        ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                        break;
                                    case 5:
                                        ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                        break;
                                    case 6:
                                        ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", ba2Var3.C0);
                                        ba2Var3.presentFragment(new uf1(bundle3));
                                        break;
                                    case 8:
                                        ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                        break;
                                    case 9:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                        break;
                                    case 10:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                        break;
                                    case 11:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                        break;
                                    case 12:
                                        ba2Var3.n0();
                                        break;
                                    case 13:
                                        ba2Var3.i0();
                                        break;
                                    case 14:
                                        ba2 ba2Var4 = this.b;
                                        ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                        break;
                                    case 15:
                                        if (gm.H1(ba2Var3)) {
                                            pc6 pc6Var = new pc6(4);
                                            pc6Var.m0 = -ba2Var3.w0;
                                            TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                            ba2Var3.presentFragment(pc6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = ba2Var3.w0;
                                        xib xibVar72 = ba2Var3.I;
                                        boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                        qa2 qa2Var = new qa2(null);
                                        qa2Var.N = new ArrayList();
                                        qa2Var.O = new ArrayList();
                                        qa2Var.Q = new ArrayList();
                                        qa2Var.d0 = true;
                                        qa2Var.g0 = new ArrayList();
                                        qa2Var.p0 = new HashMap();
                                        qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                        qa2Var.t0 = false;
                                        qa2Var.a0 = j42;
                                        qa2Var.o0 = z62;
                                        TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                        qa2Var.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                qa2Var.m0 = tL_chatInviteExported;
                                            } else {
                                                qa2Var.d0(false);
                                            }
                                        }
                                        ba2Var3.presentFragment(qa2Var);
                                        break;
                                    case 17:
                                        long j5 = ba2Var3.w0;
                                        ib2 ib2Var = new ib2(null);
                                        ib2Var.w = new ArrayList();
                                        ib2Var.P = false;
                                        ib2Var.Q = false;
                                        ib2Var.F = j5;
                                        TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                        ib2Var.f = L022;
                                        ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                        ib2Var.h = ba2Var3.y0;
                                        ba2Var3.presentFragment(ib2Var);
                                        break;
                                    case 18:
                                        wh8 wh8Var = new wh8(ba2Var3.w0);
                                        wh8Var.s = new u92(ba2Var3, b42);
                                        ba2Var3.presentFragment(wh8Var);
                                        break;
                                    case 19:
                                        ba2Var3.f0();
                                        break;
                                    case 20:
                                        ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                        ac5Var.c = ba2Var3.M0;
                                        ac5Var.m0 = ba2Var3;
                                        ba2Var3.presentFragment(ac5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", ba2Var3.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                        wg2 wg2Var3 = new wg2(bundle4);
                                        wg2Var3.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var3);
                                        break;
                                    case 22:
                                        ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                        ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                        ba2Var3.presentFragment(ak6Var);
                                        break;
                                    case 23:
                                        if (!sd2.V(ba2Var3.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", ba2Var3.w0);
                                            zd2 zd2Var = new zd2(bundle5);
                                            TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                            zd2Var.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (zd2Var.a == null) {
                                                    zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                                }
                                                zd2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zd2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zd2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    zd2Var.w = (byte) 1;
                                                }
                                            }
                                            ba2Var3.presentFragment(zd2Var);
                                            break;
                                        } else {
                                            ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = kt6.j(9, "chatMode");
                                        j6.putLong("chat_id", ba2Var3.w0);
                                        j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                        ba2Var3.presentFragment(new yv1(j6));
                                        break;
                                }
                            }
                        });
                        ba2Var.d0();
                    }
                    xib xibVar19 = new xib(context2);
                    ba2Var.X = xibVar19;
                    final byte b16 = 0;
                    anb.Q(xibVar19, cmb.L0(false), null, anb.M(i11));
                    ba2Var.X.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                        public final /* synthetic */ ba2 b;

                        {
                            this.b = ba2Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b16;
                            byte b42 = 4;
                            gn5 gn5Var = null;
                            ba2 ba2Var3 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ba2Var3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wg2 wg2Var = new wg2(bundle);
                                    wg2Var.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var);
                                    break;
                                case 1:
                                    y92 y92Var = ba2Var3.R0;
                                    long j32 = ba2Var3.C0;
                                    if (!ba2Var3.s.g()) {
                                        TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                        if (W1 == null) {
                                            TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                            TLRPC.ChatPhoto chatPhoto = L02.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                int i92 = chatPhoto2.dc_id;
                                                if (i92 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i92;
                                                }
                                                TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                int i102 = userProfilePhoto2.dc_id;
                                                if (i102 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i102;
                                                }
                                                PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ba2Var3.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wg2 wg2Var2 = new wg2(bundle2);
                                    wg2Var2.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var2);
                                    break;
                                case 3:
                                    ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                    break;
                                case 4:
                                    ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                    break;
                                case 5:
                                    ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                    break;
                                case 6:
                                    ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ba2Var3.C0);
                                    ba2Var3.presentFragment(new uf1(bundle3));
                                    break;
                                case 8:
                                    ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                    break;
                                case 9:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                    break;
                                case 10:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                    break;
                                case 11:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                    break;
                                case 12:
                                    ba2Var3.n0();
                                    break;
                                case 13:
                                    ba2Var3.i0();
                                    break;
                                case 14:
                                    ba2 ba2Var4 = this.b;
                                    ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                    break;
                                case 15:
                                    if (gm.H1(ba2Var3)) {
                                        pc6 pc6Var = new pc6(4);
                                        pc6Var.m0 = -ba2Var3.w0;
                                        TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                        ba2Var3.presentFragment(pc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = ba2Var3.w0;
                                    xib xibVar72 = ba2Var3.I;
                                    boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                    qa2 qa2Var = new qa2(null);
                                    qa2Var.N = new ArrayList();
                                    qa2Var.O = new ArrayList();
                                    qa2Var.Q = new ArrayList();
                                    qa2Var.d0 = true;
                                    qa2Var.g0 = new ArrayList();
                                    qa2Var.p0 = new HashMap();
                                    qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                    qa2Var.t0 = false;
                                    qa2Var.a0 = j42;
                                    qa2Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                    qa2Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            qa2Var.m0 = tL_chatInviteExported;
                                        } else {
                                            qa2Var.d0(false);
                                        }
                                    }
                                    ba2Var3.presentFragment(qa2Var);
                                    break;
                                case 17:
                                    long j5 = ba2Var3.w0;
                                    ib2 ib2Var = new ib2(null);
                                    ib2Var.w = new ArrayList();
                                    ib2Var.P = false;
                                    ib2Var.Q = false;
                                    ib2Var.F = j5;
                                    TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                    ib2Var.f = L022;
                                    ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                    ib2Var.h = ba2Var3.y0;
                                    ba2Var3.presentFragment(ib2Var);
                                    break;
                                case 18:
                                    wh8 wh8Var = new wh8(ba2Var3.w0);
                                    wh8Var.s = new u92(ba2Var3, b42);
                                    ba2Var3.presentFragment(wh8Var);
                                    break;
                                case 19:
                                    ba2Var3.f0();
                                    break;
                                case 20:
                                    ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                    ac5Var.c = ba2Var3.M0;
                                    ac5Var.m0 = ba2Var3;
                                    ba2Var3.presentFragment(ac5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ba2Var3.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                    wg2 wg2Var3 = new wg2(bundle4);
                                    wg2Var3.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var3);
                                    break;
                                case 22:
                                    ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                    ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                    ba2Var3.presentFragment(ak6Var);
                                    break;
                                case 23:
                                    if (!sd2.V(ba2Var3.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ba2Var3.w0);
                                        zd2 zd2Var = new zd2(bundle5);
                                        TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                        zd2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zd2Var.a == null) {
                                                zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                            }
                                            zd2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zd2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zd2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                zd2Var.w = (byte) 1;
                                            }
                                        }
                                        ba2Var3.presentFragment(zd2Var);
                                        break;
                                    } else {
                                        ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = kt6.j(9, "chatMode");
                                    j6.putLong("chat_id", ba2Var3.w0);
                                    j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                    ba2Var3.presentFragment(new yv1(j6));
                                    break;
                            }
                        }
                    });
                    xib xibVar20 = new xib(context2);
                    ba2Var.U = xibVar20;
                    anb.Q(xibVar20, cmb.L0(false), null, anb.M(i11));
                    final byte b17 = 2;
                    ba2Var.U.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                        public final /* synthetic */ ba2 b;

                        {
                            this.b = ba2Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b17;
                            byte b42 = 4;
                            gn5 gn5Var = null;
                            ba2 ba2Var3 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ba2Var3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wg2 wg2Var = new wg2(bundle);
                                    wg2Var.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var);
                                    break;
                                case 1:
                                    y92 y92Var = ba2Var3.R0;
                                    long j32 = ba2Var3.C0;
                                    if (!ba2Var3.s.g()) {
                                        TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                        if (W1 == null) {
                                            TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                            TLRPC.ChatPhoto chatPhoto = L02.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                int i92 = chatPhoto2.dc_id;
                                                if (i92 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i92;
                                                }
                                                TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                int i102 = userProfilePhoto2.dc_id;
                                                if (i102 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i102;
                                                }
                                                PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ba2Var3.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wg2 wg2Var2 = new wg2(bundle2);
                                    wg2Var2.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var2);
                                    break;
                                case 3:
                                    ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                    break;
                                case 4:
                                    ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                    break;
                                case 5:
                                    ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                    break;
                                case 6:
                                    ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ba2Var3.C0);
                                    ba2Var3.presentFragment(new uf1(bundle3));
                                    break;
                                case 8:
                                    ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                    break;
                                case 9:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                    break;
                                case 10:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                    break;
                                case 11:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                    break;
                                case 12:
                                    ba2Var3.n0();
                                    break;
                                case 13:
                                    ba2Var3.i0();
                                    break;
                                case 14:
                                    ba2 ba2Var4 = this.b;
                                    ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                    break;
                                case 15:
                                    if (gm.H1(ba2Var3)) {
                                        pc6 pc6Var = new pc6(4);
                                        pc6Var.m0 = -ba2Var3.w0;
                                        TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                        ba2Var3.presentFragment(pc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = ba2Var3.w0;
                                    xib xibVar72 = ba2Var3.I;
                                    boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                    qa2 qa2Var = new qa2(null);
                                    qa2Var.N = new ArrayList();
                                    qa2Var.O = new ArrayList();
                                    qa2Var.Q = new ArrayList();
                                    qa2Var.d0 = true;
                                    qa2Var.g0 = new ArrayList();
                                    qa2Var.p0 = new HashMap();
                                    qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                    qa2Var.t0 = false;
                                    qa2Var.a0 = j42;
                                    qa2Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                    qa2Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            qa2Var.m0 = tL_chatInviteExported;
                                        } else {
                                            qa2Var.d0(false);
                                        }
                                    }
                                    ba2Var3.presentFragment(qa2Var);
                                    break;
                                case 17:
                                    long j5 = ba2Var3.w0;
                                    ib2 ib2Var = new ib2(null);
                                    ib2Var.w = new ArrayList();
                                    ib2Var.P = false;
                                    ib2Var.Q = false;
                                    ib2Var.F = j5;
                                    TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                    ib2Var.f = L022;
                                    ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                    ib2Var.h = ba2Var3.y0;
                                    ba2Var3.presentFragment(ib2Var);
                                    break;
                                case 18:
                                    wh8 wh8Var = new wh8(ba2Var3.w0);
                                    wh8Var.s = new u92(ba2Var3, b42);
                                    ba2Var3.presentFragment(wh8Var);
                                    break;
                                case 19:
                                    ba2Var3.f0();
                                    break;
                                case 20:
                                    ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                    ac5Var.c = ba2Var3.M0;
                                    ac5Var.m0 = ba2Var3;
                                    ba2Var3.presentFragment(ac5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ba2Var3.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                    wg2 wg2Var3 = new wg2(bundle4);
                                    wg2Var3.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var3);
                                    break;
                                case 22:
                                    ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                    ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                    ba2Var3.presentFragment(ak6Var);
                                    break;
                                case 23:
                                    if (!sd2.V(ba2Var3.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ba2Var3.w0);
                                        zd2 zd2Var = new zd2(bundle5);
                                        TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                        zd2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zd2Var.a == null) {
                                                zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                            }
                                            zd2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zd2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zd2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                zd2Var.w = (byte) 1;
                                            }
                                        }
                                        ba2Var3.presentFragment(zd2Var);
                                        break;
                                    } else {
                                        ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = kt6.j(9, "chatMode");
                                    j6.putLong("chat_id", ba2Var3.w0);
                                    j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                    ba2Var3.presentFragment(new yv1(j6));
                                    break;
                            }
                        }
                    });
                    if (!sd2.V(ba2Var.x0)) {
                        xib xibVar21 = new xib(context2);
                        ba2Var.V = xibVar21;
                        anb.Q(xibVar21, cmb.L0(false), null, anb.M(i11));
                        final byte b18 = 3;
                        ba2Var.V.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                            public final /* synthetic */ ba2 b;

                            {
                                this.b = ba2Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b32 = b18;
                                byte b42 = 4;
                                gn5 gn5Var = null;
                                ba2 ba2Var3 = this.b;
                                switch (b32) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", ba2Var3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        wg2 wg2Var = new wg2(bundle);
                                        wg2Var.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var);
                                        break;
                                    case 1:
                                        y92 y92Var = ba2Var3.R0;
                                        long j32 = ba2Var3.C0;
                                        if (!ba2Var3.s.g()) {
                                            TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                            if (W1 == null) {
                                                TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                                TLRPC.ChatPhoto chatPhoto = L02.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, ba2Var3, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                    int i92 = chatPhoto2.dc_id;
                                                    if (i92 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i92;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, ba2Var3, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                    int i102 = userProfilePhoto2.dc_id;
                                                    if (i102 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i102;
                                                    }
                                                    PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", ba2Var3.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        wg2 wg2Var2 = new wg2(bundle2);
                                        wg2Var2.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var2);
                                        break;
                                    case 3:
                                        ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                        break;
                                    case 4:
                                        ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                        break;
                                    case 5:
                                        ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                        break;
                                    case 6:
                                        ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", ba2Var3.C0);
                                        ba2Var3.presentFragment(new uf1(bundle3));
                                        break;
                                    case 8:
                                        ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                        break;
                                    case 9:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                        break;
                                    case 10:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                        break;
                                    case 11:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                        break;
                                    case 12:
                                        ba2Var3.n0();
                                        break;
                                    case 13:
                                        ba2Var3.i0();
                                        break;
                                    case 14:
                                        ba2 ba2Var4 = this.b;
                                        ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                        break;
                                    case 15:
                                        if (gm.H1(ba2Var3)) {
                                            pc6 pc6Var = new pc6(4);
                                            pc6Var.m0 = -ba2Var3.w0;
                                            TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                            ba2Var3.presentFragment(pc6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = ba2Var3.w0;
                                        xib xibVar72 = ba2Var3.I;
                                        boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                        qa2 qa2Var = new qa2(null);
                                        qa2Var.N = new ArrayList();
                                        qa2Var.O = new ArrayList();
                                        qa2Var.Q = new ArrayList();
                                        qa2Var.d0 = true;
                                        qa2Var.g0 = new ArrayList();
                                        qa2Var.p0 = new HashMap();
                                        qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                        qa2Var.t0 = false;
                                        qa2Var.a0 = j42;
                                        qa2Var.o0 = z62;
                                        TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                        qa2Var.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                qa2Var.m0 = tL_chatInviteExported;
                                            } else {
                                                qa2Var.d0(false);
                                            }
                                        }
                                        ba2Var3.presentFragment(qa2Var);
                                        break;
                                    case 17:
                                        long j5 = ba2Var3.w0;
                                        ib2 ib2Var = new ib2(null);
                                        ib2Var.w = new ArrayList();
                                        ib2Var.P = false;
                                        ib2Var.Q = false;
                                        ib2Var.F = j5;
                                        TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                        ib2Var.f = L022;
                                        ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                        ib2Var.h = ba2Var3.y0;
                                        ba2Var3.presentFragment(ib2Var);
                                        break;
                                    case 18:
                                        wh8 wh8Var = new wh8(ba2Var3.w0);
                                        wh8Var.s = new u92(ba2Var3, b42);
                                        ba2Var3.presentFragment(wh8Var);
                                        break;
                                    case 19:
                                        ba2Var3.f0();
                                        break;
                                    case 20:
                                        ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                        ac5Var.c = ba2Var3.M0;
                                        ac5Var.m0 = ba2Var3;
                                        ba2Var3.presentFragment(ac5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", ba2Var3.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                        wg2 wg2Var3 = new wg2(bundle4);
                                        wg2Var3.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var3);
                                        break;
                                    case 22:
                                        ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                        ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                        ba2Var3.presentFragment(ak6Var);
                                        break;
                                    case 23:
                                        if (!sd2.V(ba2Var3.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", ba2Var3.w0);
                                            zd2 zd2Var = new zd2(bundle5);
                                            TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                            zd2Var.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (zd2Var.a == null) {
                                                    zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                                }
                                                zd2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zd2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zd2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    zd2Var.w = (byte) 1;
                                                }
                                            }
                                            ba2Var3.presentFragment(zd2Var);
                                            break;
                                        } else {
                                            ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = kt6.j(9, "chatMode");
                                        j6.putLong("chat_id", ba2Var3.w0);
                                        j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                        ba2Var3.presentFragment(new yv1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    xib xibVar22 = new xib(context2);
                    ba2Var.a0 = xibVar22;
                    xibVar22.o(R.drawable.menu_feature_premium, b0(jb6.L0(2131752418)), false);
                    anb.Q(ba2Var.a0, cmb.L0(false), null, anb.M(i11));
                    final byte b19 = 4;
                    ba2Var.a0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                        public final /* synthetic */ ba2 b;

                        {
                            this.b = ba2Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b32 = b19;
                            byte b42 = 4;
                            gn5 gn5Var = null;
                            ba2 ba2Var3 = this.b;
                            switch (b32) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ba2Var3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wg2 wg2Var = new wg2(bundle);
                                    wg2Var.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var);
                                    break;
                                case 1:
                                    y92 y92Var = ba2Var3.R0;
                                    long j32 = ba2Var3.C0;
                                    if (!ba2Var3.s.g()) {
                                        TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                        if (W1 == null) {
                                            TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                            TLRPC.ChatPhoto chatPhoto = L02.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                int i92 = chatPhoto2.dc_id;
                                                if (i92 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i92;
                                                }
                                                TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                int i102 = userProfilePhoto2.dc_id;
                                                if (i102 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i102;
                                                }
                                                PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ba2Var3.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wg2 wg2Var2 = new wg2(bundle2);
                                    wg2Var2.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var2);
                                    break;
                                case 3:
                                    ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                    break;
                                case 4:
                                    ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                    break;
                                case 5:
                                    ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                    break;
                                case 6:
                                    ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ba2Var3.C0);
                                    ba2Var3.presentFragment(new uf1(bundle3));
                                    break;
                                case 8:
                                    ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                    break;
                                case 9:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                    break;
                                case 10:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                    break;
                                case 11:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                    break;
                                case 12:
                                    ba2Var3.n0();
                                    break;
                                case 13:
                                    ba2Var3.i0();
                                    break;
                                case 14:
                                    ba2 ba2Var4 = this.b;
                                    ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                    break;
                                case 15:
                                    if (gm.H1(ba2Var3)) {
                                        pc6 pc6Var = new pc6(4);
                                        pc6Var.m0 = -ba2Var3.w0;
                                        TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                        ba2Var3.presentFragment(pc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = ba2Var3.w0;
                                    xib xibVar72 = ba2Var3.I;
                                    boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                    qa2 qa2Var = new qa2(null);
                                    qa2Var.N = new ArrayList();
                                    qa2Var.O = new ArrayList();
                                    qa2Var.Q = new ArrayList();
                                    qa2Var.d0 = true;
                                    qa2Var.g0 = new ArrayList();
                                    qa2Var.p0 = new HashMap();
                                    qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                    qa2Var.t0 = false;
                                    qa2Var.a0 = j42;
                                    qa2Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                    qa2Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            qa2Var.m0 = tL_chatInviteExported;
                                        } else {
                                            qa2Var.d0(false);
                                        }
                                    }
                                    ba2Var3.presentFragment(qa2Var);
                                    break;
                                case 17:
                                    long j5 = ba2Var3.w0;
                                    ib2 ib2Var = new ib2(null);
                                    ib2Var.w = new ArrayList();
                                    ib2Var.P = false;
                                    ib2Var.Q = false;
                                    ib2Var.F = j5;
                                    TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                    ib2Var.f = L022;
                                    ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                    ib2Var.h = ba2Var3.y0;
                                    ba2Var3.presentFragment(ib2Var);
                                    break;
                                case 18:
                                    wh8 wh8Var = new wh8(ba2Var3.w0);
                                    wh8Var.s = new u92(ba2Var3, b42);
                                    ba2Var3.presentFragment(wh8Var);
                                    break;
                                case 19:
                                    ba2Var3.f0();
                                    break;
                                case 20:
                                    ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                    ac5Var.c = ba2Var3.M0;
                                    ac5Var.m0 = ba2Var3;
                                    ba2Var3.presentFragment(ac5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ba2Var3.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                    wg2 wg2Var3 = new wg2(bundle4);
                                    wg2Var3.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var3);
                                    break;
                                case 22:
                                    ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                    ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                    ba2Var3.presentFragment(ak6Var);
                                    break;
                                case 23:
                                    if (!sd2.V(ba2Var3.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ba2Var3.w0);
                                        zd2 zd2Var = new zd2(bundle5);
                                        TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                        zd2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zd2Var.a == null) {
                                                zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                            }
                                            zd2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zd2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zd2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                zd2Var.w = (byte) 1;
                                            }
                                        }
                                        ba2Var3.presentFragment(zd2Var);
                                        break;
                                    } else {
                                        ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                        break;
                                    }
                                default:
                                    Bundle j6 = kt6.j(9, "chatMode");
                                    j6.putLong("chat_id", ba2Var3.w0);
                                    j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                    ba2Var3.presentFragment(new yv1(j6));
                                    break;
                            }
                        }
                    });
                    ba2Var.a0.setVisibility(8);
                    if (!sd2.T(ba2Var.x0) || ba2Var.x0.gigagroup) {
                        xib xibVar23 = new xib(context2);
                        ba2Var.Z = xibVar23;
                        xibVar23.o(R.drawable.msg_log, jb6.L0(2131751016), false);
                        anb.Q(ba2Var.Z, cmb.L0(false), null, anb.M(i11));
                        final byte b20 = 5;
                        ba2Var.Z.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                            public final /* synthetic */ ba2 b;

                            {
                                this.b = ba2Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b32 = b20;
                                byte b42 = 4;
                                gn5 gn5Var = null;
                                ba2 ba2Var3 = this.b;
                                switch (b32) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", ba2Var3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        wg2 wg2Var = new wg2(bundle);
                                        wg2Var.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var);
                                        break;
                                    case 1:
                                        y92 y92Var = ba2Var3.R0;
                                        long j32 = ba2Var3.C0;
                                        if (!ba2Var3.s.g()) {
                                            TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                            if (W1 == null) {
                                                TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                                TLRPC.ChatPhoto chatPhoto = L02.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, ba2Var3, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                    int i92 = chatPhoto2.dc_id;
                                                    if (i92 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i92;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, ba2Var3, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                    int i102 = userProfilePhoto2.dc_id;
                                                    if (i102 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i102;
                                                    }
                                                    PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", ba2Var3.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        wg2 wg2Var2 = new wg2(bundle2);
                                        wg2Var2.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var2);
                                        break;
                                    case 3:
                                        ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                        break;
                                    case 4:
                                        ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                        break;
                                    case 5:
                                        ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                        break;
                                    case 6:
                                        ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", ba2Var3.C0);
                                        ba2Var3.presentFragment(new uf1(bundle3));
                                        break;
                                    case 8:
                                        ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                        break;
                                    case 9:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                        break;
                                    case 10:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                        break;
                                    case 11:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                        break;
                                    case 12:
                                        ba2Var3.n0();
                                        break;
                                    case 13:
                                        ba2Var3.i0();
                                        break;
                                    case 14:
                                        ba2 ba2Var4 = this.b;
                                        ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                        break;
                                    case 15:
                                        if (gm.H1(ba2Var3)) {
                                            pc6 pc6Var = new pc6(4);
                                            pc6Var.m0 = -ba2Var3.w0;
                                            TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                            ba2Var3.presentFragment(pc6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = ba2Var3.w0;
                                        xib xibVar72 = ba2Var3.I;
                                        boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                        qa2 qa2Var = new qa2(null);
                                        qa2Var.N = new ArrayList();
                                        qa2Var.O = new ArrayList();
                                        qa2Var.Q = new ArrayList();
                                        qa2Var.d0 = true;
                                        qa2Var.g0 = new ArrayList();
                                        qa2Var.p0 = new HashMap();
                                        qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                        qa2Var.t0 = false;
                                        qa2Var.a0 = j42;
                                        qa2Var.o0 = z62;
                                        TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                        qa2Var.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                qa2Var.m0 = tL_chatInviteExported;
                                            } else {
                                                qa2Var.d0(false);
                                            }
                                        }
                                        ba2Var3.presentFragment(qa2Var);
                                        break;
                                    case 17:
                                        long j5 = ba2Var3.w0;
                                        ib2 ib2Var = new ib2(null);
                                        ib2Var.w = new ArrayList();
                                        ib2Var.P = false;
                                        ib2Var.Q = false;
                                        ib2Var.F = j5;
                                        TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                        ib2Var.f = L022;
                                        ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                        ib2Var.h = ba2Var3.y0;
                                        ba2Var3.presentFragment(ib2Var);
                                        break;
                                    case 18:
                                        wh8 wh8Var = new wh8(ba2Var3.w0);
                                        wh8Var.s = new u92(ba2Var3, b42);
                                        ba2Var3.presentFragment(wh8Var);
                                        break;
                                    case 19:
                                        ba2Var3.f0();
                                        break;
                                    case 20:
                                        ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                        ac5Var.c = ba2Var3.M0;
                                        ac5Var.m0 = ba2Var3;
                                        ba2Var3.presentFragment(ac5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", ba2Var3.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                        wg2 wg2Var3 = new wg2(bundle4);
                                        wg2Var3.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var3);
                                        break;
                                    case 22:
                                        ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                        ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                        ba2Var3.presentFragment(ak6Var);
                                        break;
                                    case 23:
                                        if (!sd2.V(ba2Var3.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", ba2Var3.w0);
                                            zd2 zd2Var = new zd2(bundle5);
                                            TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                            zd2Var.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (zd2Var.a == null) {
                                                    zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                                }
                                                zd2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zd2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zd2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    zd2Var.w = (byte) 1;
                                                }
                                            }
                                            ba2Var3.presentFragment(zd2Var);
                                            break;
                                        } else {
                                            ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = kt6.j(9, "chatMode");
                                        j6.putLong("chat_id", ba2Var3.w0);
                                        j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                        ba2Var3.presentFragment(new yv1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    if (sd2.R(ba2Var.x0)) {
                        xib xibVar24 = new xib(context2);
                        ba2Var.b0 = xibVar24;
                        xibVar24.o(R.drawable.msg_stats, jb6.L0(2131744580), true);
                        anb.Q(ba2Var.b0, cmb.L0(false), null, anb.M(i11));
                        final byte b21 = 6;
                        ba2Var.b0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                            public final /* synthetic */ ba2 b;

                            {
                                this.b = ba2Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b32 = b21;
                                byte b42 = 4;
                                gn5 gn5Var = null;
                                ba2 ba2Var3 = this.b;
                                switch (b32) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", ba2Var3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        wg2 wg2Var = new wg2(bundle);
                                        wg2Var.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var);
                                        break;
                                    case 1:
                                        y92 y92Var = ba2Var3.R0;
                                        long j32 = ba2Var3.C0;
                                        if (!ba2Var3.s.g()) {
                                            TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                            if (W1 == null) {
                                                TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                                TLRPC.ChatPhoto chatPhoto = L02.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, ba2Var3, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                                    int i92 = chatPhoto2.dc_id;
                                                    if (i92 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i92;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.r0().T1(null, ba2Var3, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                    int i102 = userProfilePhoto2.dc_id;
                                                    if (i102 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i102;
                                                    }
                                                    PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", ba2Var3.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        wg2 wg2Var2 = new wg2(bundle2);
                                        wg2Var2.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var2);
                                        break;
                                    case 3:
                                        ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                        break;
                                    case 4:
                                        ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                        break;
                                    case 5:
                                        ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                        break;
                                    case 6:
                                        ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                        break;
                                    case 7:
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", ba2Var3.C0);
                                        ba2Var3.presentFragment(new uf1(bundle3));
                                        break;
                                    case 8:
                                        ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                        break;
                                    case 9:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                        break;
                                    case 10:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                        break;
                                    case 11:
                                        l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                        break;
                                    case 12:
                                        ba2Var3.n0();
                                        break;
                                    case 13:
                                        ba2Var3.i0();
                                        break;
                                    case 14:
                                        ba2 ba2Var4 = this.b;
                                        ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                        break;
                                    case 15:
                                        if (gm.H1(ba2Var3)) {
                                            pc6 pc6Var = new pc6(4);
                                            pc6Var.m0 = -ba2Var3.w0;
                                            TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                            ba2Var3.presentFragment(pc6Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        long j42 = ba2Var3.w0;
                                        xib xibVar72 = ba2Var3.I;
                                        boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                        qa2 qa2Var = new qa2(null);
                                        qa2Var.N = new ArrayList();
                                        qa2Var.O = new ArrayList();
                                        qa2Var.Q = new ArrayList();
                                        qa2Var.d0 = true;
                                        qa2Var.g0 = new ArrayList();
                                        qa2Var.p0 = new HashMap();
                                        qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                        qa2Var.t0 = false;
                                        qa2Var.a0 = j42;
                                        qa2Var.o0 = z62;
                                        TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                        qa2Var.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                qa2Var.m0 = tL_chatInviteExported;
                                            } else {
                                                qa2Var.d0(false);
                                            }
                                        }
                                        ba2Var3.presentFragment(qa2Var);
                                        break;
                                    case 17:
                                        long j5 = ba2Var3.w0;
                                        ib2 ib2Var = new ib2(null);
                                        ib2Var.w = new ArrayList();
                                        ib2Var.P = false;
                                        ib2Var.Q = false;
                                        ib2Var.F = j5;
                                        TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                                        ib2Var.f = L022;
                                        ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                                        ib2Var.h = ba2Var3.y0;
                                        ba2Var3.presentFragment(ib2Var);
                                        break;
                                    case 18:
                                        wh8 wh8Var = new wh8(ba2Var3.w0);
                                        wh8Var.s = new u92(ba2Var3, b42);
                                        ba2Var3.presentFragment(wh8Var);
                                        break;
                                    case 19:
                                        ba2Var3.f0();
                                        break;
                                    case 20:
                                        ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                        ac5Var.c = ba2Var3.M0;
                                        ac5Var.m0 = ba2Var3;
                                        ba2Var3.presentFragment(ac5Var);
                                        break;
                                    case 21:
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", ba2Var3.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                        wg2 wg2Var3 = new wg2(bundle4);
                                        wg2Var3.B0(ba2Var3.y0);
                                        ba2Var3.presentFragment(wg2Var3);
                                        break;
                                    case 22:
                                        ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                        ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                        ba2Var3.presentFragment(ak6Var);
                                        break;
                                    case 23:
                                        if (!sd2.V(ba2Var3.x0)) {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", ba2Var3.w0);
                                            zd2 zd2Var = new zd2(bundle5);
                                            TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                            zd2Var.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (zd2Var.a == null) {
                                                    zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                                }
                                                zd2Var.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zd2Var.w = (byte) 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zd2Var.w = (byte) 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                        if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                            zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                        }
                                                        r9++;
                                                    }
                                                    zd2Var.w = (byte) 1;
                                                }
                                            }
                                            ba2Var3.presentFragment(zd2Var);
                                            break;
                                        } else {
                                            ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                            break;
                                        }
                                    default:
                                        Bundle j6 = kt6.j(9, "chatMode");
                                        j6.putLong("chat_id", ba2Var3.w0);
                                        j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                        ba2Var3.presentFragment(new yv1(j6));
                                        break;
                                }
                            }
                        });
                    }
                    ba2Var.S.addView(ba2Var.P, qoe.o(-1, i2));
                    xibVar = ba2Var.f0;
                    if (xibVar != null) {
                        ba2Var.S.addView(xibVar, qoe.o(-1, i2));
                    }
                    if (!ba2Var.J0 && !ba2Var.x0.gigagroup) {
                        ba2Var.S.addView(ba2Var.Y, qoe.o(-1, i2));
                    }
                    if (!ba2Var.J0) {
                        ba2Var.S.addView(ba2Var.W, qoe.o(-1, i2));
                    }
                    ba2Var.S.addView(ba2Var.X, qoe.o(-1, i2));
                    ba2Var.S.addView(ba2Var.U, qoe.o(-1, i2));
                    xibVar2 = ba2Var.V;
                    if (xibVar2 != null && (chatFull2 = ba2Var.y0) != null && chatFull2.requests_pending > 0) {
                        ba2Var.S.addView(xibVar2, qoe.o(-1, i2));
                    }
                    if (ba2Var.J0) {
                        ba2Var.S.addView(ba2Var.W, qoe.o(-1, i2));
                    }
                    if (!ba2Var.J0 || ba2Var.x0.gigagroup) {
                        i6 = -1;
                        ba2Var.S.addView(ba2Var.Y, qoe.o(-1, i2));
                    } else {
                        i6 = -1;
                    }
                    xibVar3 = ba2Var.b0;
                    if (xibVar3 != null) {
                        ba2Var.S.addView(xibVar3, qoe.o(i6, i2));
                    }
                    xibVar4 = ba2Var.Z;
                    if (xibVar4 != null) {
                        ba2Var.S.addView(xibVar4, qoe.o(i6, i2));
                    }
                    xibVar5 = ba2Var.a0;
                    if (xibVar5 != null) {
                        ba2Var.S.addView(xibVar5, qoe.o(i6, i2));
                    }
                    if (ba2Var.a0 != null && ba2Var.getMessagesController().l4.C2.f() && sd2.V(ba2Var.x0)) {
                        ba2Var.a0.setVisibility(0);
                    }
                    xibVar6 = ba2Var.Z;
                    if (xibVar6 != null) {
                        xib xibVar25 = ba2Var.a0;
                        xibVar6.setNeedDivider(xibVar25 != null && xibVar25.getVisibility() == 0);
                    }
                }
            }
            i5 = 0;
            xibVar15.setVisibility(i5);
            final byte b122 = 21;
            ba2Var.Y.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b122;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L02.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L022;
                            ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            xib xibVar162 = new xib(context2);
            ba2Var.W = xibVar162;
            anb.Q(xibVar162, cmb.L0(false), null, anb.M(i11));
            final byte b132 = 22;
            ba2Var.W.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b132;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L02.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L022;
                            ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            xib xibVar172 = new xib(context2);
            ba2Var.P = xibVar172;
            anb.Q(xibVar172, cmb.L0(false), null, anb.M(i11));
            final byte b142 = 23;
            ba2Var.P.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b142;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L02.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L022;
                            ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            if (sd2.y(28, ba2Var.x0)) {
            }
            xib xibVar192 = new xib(context2);
            ba2Var.X = xibVar192;
            final byte b162 = 0;
            anb.Q(xibVar192, cmb.L0(false), null, anb.M(i11));
            ba2Var.X.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b162;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L02.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L022;
                            ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            xib xibVar202 = new xib(context2);
            ba2Var.U = xibVar202;
            anb.Q(xibVar202, cmb.L0(false), null, anb.M(i11));
            final byte b172 = 2;
            ba2Var.U.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b172;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L02.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L022;
                            ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            if (!sd2.V(ba2Var.x0)) {
            }
            xib xibVar222 = new xib(context2);
            ba2Var.a0 = xibVar222;
            xibVar222.o(R.drawable.menu_feature_premium, b0(jb6.L0(2131752418)), false);
            anb.Q(ba2Var.a0, cmb.L0(false), null, anb.M(i11));
            final byte b192 = 4;
            ba2Var.a0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b192;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L02.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L022;
                            ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            ba2Var.a0.setVisibility(8);
            if (!sd2.T(ba2Var.x0)) {
            }
            xib xibVar232 = new xib(context2);
            ba2Var.Z = xibVar232;
            xibVar232.o(R.drawable.msg_log, jb6.L0(2131751016), false);
            anb.Q(ba2Var.Z, cmb.L0(false), null, anb.M(i11));
            final byte b202 = 5;
            ba2Var.Z.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b202;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L02 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L02.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L02.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L022 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L022;
                            ib2Var.s = sd2.T(L022) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            if (sd2.R(ba2Var.x0)) {
            }
            ba2Var.S.addView(ba2Var.P, qoe.o(-1, i2));
            xibVar = ba2Var.f0;
            if (xibVar != null) {
            }
            if (!ba2Var.J0) {
                ba2Var.S.addView(ba2Var.Y, qoe.o(-1, i2));
            }
            if (!ba2Var.J0) {
            }
            ba2Var.S.addView(ba2Var.X, qoe.o(-1, i2));
            ba2Var.S.addView(ba2Var.U, qoe.o(-1, i2));
            xibVar2 = ba2Var.V;
            if (xibVar2 != null) {
                ba2Var.S.addView(xibVar2, qoe.o(-1, i2));
            }
            if (ba2Var.J0) {
            }
            if (ba2Var.J0) {
            }
            i6 = -1;
            ba2Var.S.addView(ba2Var.Y, qoe.o(-1, i2));
            xibVar3 = ba2Var.b0;
            if (xibVar3 != null) {
            }
            xibVar4 = ba2Var.Z;
            if (xibVar4 != null) {
            }
            xibVar5 = ba2Var.a0;
            if (xibVar5 != null) {
            }
            if (ba2Var.a0 != null) {
                ba2Var.a0.setVisibility(0);
            }
            xibVar6 = ba2Var.Z;
            if (xibVar6 != null) {
            }
        } else {
            wmbVar = null;
        }
        if (ba2Var.D0 != null) {
            xib xibVar26 = new xib(context2);
            ba2Var.l0 = xibVar26;
            fg0 L02 = cmb.L0(false);
            int i12 = cmb.h6;
            anb.Q(xibVar26, L02, wmbVar, anb.M(i12));
            ba2Var.l0.setPrioritizeTitleOverValue(true);
            ba2Var.S.addView(ba2Var.l0, qoe.o(-1, i2));
            final byte b22 = 7;
            ba2Var.l0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b22;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L022 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L022.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L022.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L022.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L0222 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L0222;
                            ib2Var.s = sd2.T(L0222) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            ba2Var.w0();
            xib xibVar27 = new xib(context2);
            ba2Var.o0 = xibVar27;
            anb.Q(xibVar27, cmb.L0(false), wmbVar, anb.M(i12));
            ba2Var.o0.s(b0(jb6.L0(2131754343)), "", R.drawable.msg_shareout, true);
            ba2Var.S.addView(ba2Var.o0, qoe.o(-1, i2));
            final byte b23 = 8;
            ba2Var.o0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b23;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L022 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L022.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L022.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L022.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L0222 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L0222;
                            ib2Var.s = sd2.T(L0222) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            ba2Var.o0.h(45, ba2Var.E0 == null, false);
            TLRPC.UserFull userFull = ba2Var.E0;
            if (userFull != null) {
                xib xibVar28 = ba2Var.o0;
                if (userFull.starref_program == null) {
                    format = jb6.L0(2131754342);
                    z2 = false;
                } else {
                    z2 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                xibVar28.w(format, z2);
            }
            if (!ba2Var.getMessagesController().l4.B2.f()) {
                ba2Var.o0.setVisibility(8);
            }
            xib xibVar29 = new xib(context2);
            ba2Var.p0 = xibVar29;
            anb.Q(xibVar29, cmb.L0(false), wmbVar, anb.M(i12));
            ba2Var.p0.o(R.drawable.msg_log, jb6.L0(2131753057), true);
            ba2Var.S.addView(ba2Var.p0, qoe.o(-1, i2));
            final byte b24 = 9;
            ba2Var.p0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b24;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L022 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L022.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L022.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L022.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L0222 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L0222;
                            ib2Var.s = sd2.T(L0222) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            xib xibVar30 = new xib(context2);
            ba2Var.q0 = xibVar30;
            anb.Q(xibVar30, cmb.L0(false), wmbVar, anb.M(i12));
            ba2Var.q0.o(R.drawable.msg_media, jb6.L0(2131753058), true);
            ba2Var.S.addView(ba2Var.q0, qoe.o(-1, i2));
            final byte b25 = 10;
            ba2Var.q0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b25;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L022 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L022.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L022.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L022.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L0222 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L0222;
                            ib2Var.s = sd2.T(L0222) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            xib xibVar31 = new xib(context2);
            ba2Var.r0 = xibVar31;
            anb.Q(xibVar31, cmb.L0(false), wmbVar, anb.M(i12));
            ba2Var.r0.o(R.drawable.msg_bot, jb6.L0(2131753066), true);
            ba2Var.S.addView(ba2Var.r0, qoe.o(-1, i2));
            final byte b26 = 11;
            ba2Var.r0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b26;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L022 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L022.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L022.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L022.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L0222 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L0222;
                            ib2Var.s = sd2.T(L0222) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = ba2Var.x0;
        if (chat6 != null) {
            if (!sd2.N(chat6)) {
                ba2Var.S.setVisibility(8);
                ba2Var.H.setVisibility(8);
            }
            t1Var.addView(new bba(context2), qoe.o(-1, i2));
        } else if (ba2Var.D0 != null) {
            ba2Var.s0 = new njb(12, ba2Var.resourceProvider, context2);
            String L03 = jb6.L0(2131753008);
            SpannableString valueOf = SpannableString.valueOf(L03);
            int indexOf = L03.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new aa2((byte) 0), indexOf, indexOf + 10, 33);
            }
            ba2Var.s0.setText(valueOf);
            t1Var.addView(ba2Var.s0, qoe.o(-1, i2));
            xib xibVar32 = new xib(context2);
            ba2Var.u0 = xibVar32;
            fg0 L04 = cmb.L0(true);
            wmb M = anb.M(i);
            int i13 = cmb.h6;
            anb.Q(xibVar32, L04, M, anb.M(i13));
            ba2Var.u0.o(R.drawable.menu_factcheck, jb6.L0(2131752882), false);
            xib xibVar33 = ba2Var.u0;
            int i14 = cmb.p6;
            xibVar33.g(i14, i14);
            t1Var.addView(ba2Var.u0, qoe.o(-1, i2));
            final byte b27 = 13;
            ba2Var.u0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b27;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b32) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L022 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L022.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L022.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L022.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j5 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j5;
                            TLRPC.Chat L0222 = ib2Var.getMessagesController().L0(Long.valueOf(j5));
                            ib2Var.f = L0222;
                            ib2Var.s = sd2.T(L0222) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j6 = kt6.j(9, "chatMode");
                            j6.putLong("chat_id", ba2Var3.w0);
                            j6.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j6));
                            break;
                    }
                }
            });
            njb njbVar2 = new njb(12, ba2Var.resourceProvider, context2);
            ba2Var.t0 = njbVar2;
            njbVar2.setFixedSize(12);
            t1Var.addView(ba2Var.t0, qoe.o(-1, i2));
            xib xibVar34 = ba2Var.u0;
            TLRPC.UserFull userFull2 = ba2Var.E0;
            xibVar34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            njb njbVar3 = ba2Var.t0;
            TLRPC.UserFull userFull3 = ba2Var.E0;
            njbVar3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = ba2Var.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout7 = new LinearLayout(context2);
                ba2Var.T = linearLayout7;
                linearLayout7.setOrientation(1);
                t1Var.addView(ba2Var.T, qoe.o(-1, i2));
                jf5 jf5Var = new jf5(context2);
                jf5Var.setText(jb6.L0(2131753077));
                ba2Var.T.addView(jf5Var, qoe.o(-1, i2));
                xib xibVar35 = new xib(context2);
                ba2Var.m0 = xibVar35;
                anb.Q(xibVar35, cmb.L0(false), wmbVar, anb.M(i13));
                ba2Var.m0.setPrioritizeTitleOverValue(true);
                ba2Var.T.addView(ba2Var.m0, qoe.o(-1, i2));
                final ku0 g = ku0.g(ba2Var.currentAccount);
                final byte b28 = 0;
                ba2Var.m0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: p92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = ba2Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b29 = b28;
                        ku0 ku0Var = g;
                        ba2 ba2Var3 = this.b;
                        switch (b29) {
                            case 0:
                                long j5 = ba2Var3.C0;
                                if (ku0Var.h(j5, false) != null) {
                                    ba2Var3.presentFragment(new au0(1, j5));
                                    break;
                                }
                                break;
                            default:
                                long j6 = ba2Var3.C0;
                                if (ku0Var.h(j6, false) != null) {
                                    ba2Var3.presentFragment(new au0(0, j6));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g.m(j3)) {
                    long i15 = g.i(j3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i15 > 0) {
                        double d = i15 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) gm.o0((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            i4 = i13;
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            ba2Var.m0.s(jb6.L0(2131753075), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    i4 = i13;
                    ba2Var.m0.s(jb6.L0(2131753075), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new ta6(gm.L(30.0f), ba2Var.m0.c), 0, spannableStringBuilder2.length(), 33);
                    ba2Var.m0.s(jb6.L0(2131753075), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    i4 = i13;
                }
                ba2Var.m0.setVisibility(g.b(j3) ? 0 : 8);
                xib xibVar36 = new xib(context2);
                ba2Var.n0 = xibVar36;
                anb.Q(xibVar36, cmb.L0(false), null, anb.M(i4));
                final byte b29 = 1;
                ba2Var.n0.setPrioritizeTitleOverValue(true);
                ba2Var.T.addView(ba2Var.n0, qoe.o(-1, -2));
                ba2Var.n0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: p92
                    public final /* synthetic */ ba2 b;

                    {
                        this.b = ba2Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b292 = b29;
                        ku0 ku0Var = g;
                        ba2 ba2Var3 = this.b;
                        switch (b292) {
                            case 0:
                                long j5 = ba2Var3.C0;
                                if (ku0Var.h(j5, false) != null) {
                                    ba2Var3.presentFragment(new au0(1, j5));
                                    break;
                                }
                                break;
                            default:
                                long j6 = ba2Var3.C0;
                                if (ku0Var.h(j6, false) != null) {
                                    ba2Var3.presentFragment(new au0(0, j6));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g.h(j3, false) != null) {
                    xib xibVar37 = ba2Var.n0;
                    String L05 = jb6.L0(2131753076);
                    if (g.c(j3).amount <= 0) {
                        b1 = "";
                        z = false;
                    } else {
                        z = false;
                        b1 = nxa.b1(false, TextUtils.concat("XTR", nxa.I0(g.c(j3), 0.85f, ' ')), 0.85f, null);
                    }
                    xibVar37.s(L05, b1, R.drawable.menu_premium_main, z);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new ta6(gm.L(30.0f), ba2Var.n0.c), 0, spannableStringBuilder3.length(), 33);
                    ba2Var.n0.s(jb6.L0(2131753076), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                ba2Var.n0.setVisibility(g.a(j3) ? 0 : 8);
                njb njbVar4 = new njb(12, ba2Var.getResourceProvider(), context2);
                njbVar4.setFixedSize(12);
                num2 = num;
                njbVar4.setTag(R.id.fit_width_tag, num2);
                t1Var.addView(njbVar4, qoe.o(-1, 12));
                ba2Var.T.setVisibility((ba2Var.n0.getVisibility() == 0 || ba2Var.m0.getVisibility() == 0) ? 0 : 8);
                chat = ba2Var.x0;
                if ((chat == null && chat.creator) || ((user = ba2Var.D0) != null && user.bot && user.bot_can_edit)) {
                    if (chat != null) {
                        j = chat.linked_community_id;
                        j2 = -chat.id;
                    } else {
                        TLRPC.User user3 = ba2Var.D0;
                        j = user3.linked_community_id;
                        j2 = user3.id;
                    }
                    final long j5 = j2;
                    final long j6 = j;
                    final boolean z8 = ba2Var.D0 != null;
                    if (j6 != 0) {
                        ro2 ro2Var = new ro2(context2, ba2Var.resourceProvider);
                        ba2Var.h0 = ro2Var;
                        ro2Var.a(ba2Var.currentAccount, ba2Var.getMessagesController().L0(Long.valueOf(j6)));
                        ro2 ro2Var2 = ba2Var.h0;
                        final byte b30 = 0;
                        fg0 L06 = cmb.L0(false);
                        int i16 = cmb.h6;
                        anb.Q(ro2Var2, L06, null, anb.M(i16));
                        ba2Var.h0.setOnClickListener(new View.OnClickListener(ba2Var) { // from class: q92
                            public final /* synthetic */ ba2 b;

                            {
                                this.b = ba2Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (b30) {
                                    case 0:
                                        ba2 ba2Var3 = this.b;
                                        oc7 messagesController = ba2Var3.getMessagesController();
                                        long j7 = j6;
                                        if (!sd2.N(messagesController.L0(Long.valueOf(j7)))) {
                                            ba2Var3.showDialog(new pp2(ba2Var3, j7, null, null));
                                            break;
                                        } else {
                                            ba2Var3.presentFragment(new po2(kt6.k(j7, "community_id")));
                                            break;
                                        }
                                    default:
                                        this.b.presentFragment(new io2(kt6.k(j6, "dialog_id")));
                                        break;
                                }
                            }
                        });
                        t1Var.addView(ba2Var.h0, qoe.o(-1, -2));
                        xib xibVar38 = new xib(context2);
                        ba2Var.j0 = xibVar38;
                        xibVar38.o(R.drawable.outline_community_remove_24, jb6.L0(z8 ? 2131751821 : ba2Var.J0 ? 2131751820 : 2131751819), false);
                        xib xibVar39 = ba2Var.j0;
                        int i17 = cmb.o7;
                        xibVar39.g(i17, i17);
                        anb.Q(ba2Var.j0, cmb.L0(false), null, anb.M(i16));
                        ba2Var2 = ba2Var;
                        ba2Var.j0.setOnClickListener(new View.OnClickListener() { // from class: r92
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String M0 = jb6.M0(2131751852, null);
                                ba2 ba2Var3 = ba2.this;
                                ik.s0(ba2Var3, M0, jb6.M0(z8 ? 2131751854 : ba2Var3.J0 ? 2131751853 : 2131751851, null), jb6.M0(2131746054, null), true, new w30(ba2Var3, j5, j6, (byte) 2));
                            }
                        });
                        t1Var.addView(ba2Var2.j0, qoe.o(-1, -2));
                        njb njbVar5 = new njb(12, ba2Var2.getResourceProvider(), context2);
                        ba2Var2.k0 = njbVar5;
                        njbVar5.setFixedSize(14);
                        ba2Var2.k0.setTag(R.id.fit_width_tag, num2);
                        t1Var.addView(ba2Var2.k0, qoe.o(-1, 14));
                    } else {
                        ba2Var2 = ba2Var;
                        xib xibVar40 = new xib(context2);
                        ba2Var2.g0 = xibVar40;
                        xibVar40.g(cmb.u6, cmb.t6);
                        anb.V(ba2Var2.g0.getTextView(), cmb.Yl);
                        anb.Q(ba2Var2.g0, cmb.L0(false), null, anb.M(cmb.h6));
                        ba2Var2.g0.o(R.drawable.msg_groups, jb6.L0(z8 ? 2131751918 : ba2Var2.J0 ? 2131751916 : 2131751913), false);
                        final byte b31 = 1;
                        ba2Var2.g0.setOnClickListener(new View.OnClickListener(ba2Var2) { // from class: q92
                            public final /* synthetic */ ba2 b;

                            {
                                this.b = ba2Var2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (b31) {
                                    case 0:
                                        ba2 ba2Var3 = this.b;
                                        oc7 messagesController = ba2Var3.getMessagesController();
                                        long j7 = j5;
                                        if (!sd2.N(messagesController.L0(Long.valueOf(j7)))) {
                                            ba2Var3.showDialog(new pp2(ba2Var3, j7, null, null));
                                            break;
                                        } else {
                                            ba2Var3.presentFragment(new po2(kt6.k(j7, "community_id")));
                                            break;
                                        }
                                    default:
                                        this.b.presentFragment(new io2(kt6.k(j5, "dialog_id")));
                                        break;
                                }
                            }
                        });
                        njb njbVar6 = new njb(12, ba2Var2.resourceProvider, context2);
                        ba2Var2.i0 = njbVar6;
                        njbVar6.setText(jb6.L0(z8 ? 2131751917 : ba2Var2.J0 ? 2131751915 : 2131751912));
                        t1Var.addView(ba2Var2.g0, qoe.o(-1, -2));
                        t1Var.addView(ba2Var2.i0, qoe.o(-1, -2));
                    }
                } else {
                    ba2Var2 = ba2Var;
                }
                chat2 = ba2Var2.x0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    ba2Var2.d0 = frameLayout3;
                    t1Var.addView(frameLayout3, qoe.o(-1, -2));
                    vkb vkbVar = new vkb(context2);
                    ba2Var2.e0 = vkbVar;
                    anb.X(vkbVar.getTextView(), cmb.o7, null);
                    anb.Q(ba2Var2.e0, cmb.L0(false), null, anb.M(cmb.h6));
                    if (ba2Var2.D0 == null) {
                        ba2Var2.e0.b(jb6.L0(2131751503), false);
                    } else {
                        boolean z9 = ba2Var2.J0;
                        vkb vkbVar2 = ba2Var2.e0;
                        if (z9) {
                            vkbVar2.b(jb6.L0(2131752368), false);
                        } else {
                            vkbVar2.b(jb6.L0(2131751509), false);
                        }
                    }
                    ba2Var2.d0.addView(ba2Var2.e0, qoe.c(-2.0f, -1));
                    final byte b32 = 14;
                    ba2Var2.e0.setOnClickListener(new View.OnClickListener(ba2Var2) { // from class: o92
                        public final /* synthetic */ ba2 b;

                        {
                            this.b = ba2Var2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b322 = b32;
                            byte b42 = 4;
                            gn5 gn5Var = null;
                            ba2 ba2Var3 = this.b;
                            switch (b322) {
                                case 0:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ba2Var3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wg2 wg2Var = new wg2(bundle);
                                    wg2Var.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var);
                                    break;
                                case 1:
                                    y92 y92Var = ba2Var3.R0;
                                    long j32 = ba2Var3.C0;
                                    if (!ba2Var3.s.g()) {
                                        TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                        if (W1 == null) {
                                            TLRPC.Chat L022 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                            TLRPC.ChatPhoto chatPhoto = L022.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L022.photo;
                                                int i92 = chatPhoto2.dc_id;
                                                if (i92 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i92;
                                                }
                                                TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.r0().m1(null, L022.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.r0().T1(null, ba2Var3, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                                int i102 = userProfilePhoto2.dc_id;
                                                if (i102 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i102;
                                                }
                                                PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ba2Var3.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wg2 wg2Var2 = new wg2(bundle2);
                                    wg2Var2.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var2);
                                    break;
                                case 3:
                                    ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                                    break;
                                case 4:
                                    ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                                    break;
                                case 5:
                                    ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                                    break;
                                case 6:
                                    ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                                    break;
                                case 7:
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ba2Var3.C0);
                                    ba2Var3.presentFragment(new uf1(bundle3));
                                    break;
                                case 8:
                                    ba2Var3.presentFragment(new bc(ba2Var3.C0));
                                    break;
                                case 9:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                                    break;
                                case 10:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                                    break;
                                case 11:
                                    l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                                    break;
                                case 12:
                                    ba2Var3.n0();
                                    break;
                                case 13:
                                    ba2Var3.i0();
                                    break;
                                case 14:
                                    ba2 ba2Var4 = this.b;
                                    ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                                    break;
                                case 15:
                                    if (gm.H1(ba2Var3)) {
                                        pc6 pc6Var = new pc6(4);
                                        pc6Var.m0 = -ba2Var3.w0;
                                        TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                        ba2Var3.presentFragment(pc6Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    long j42 = ba2Var3.w0;
                                    xib xibVar72 = ba2Var3.I;
                                    boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                                    qa2 qa2Var = new qa2(null);
                                    qa2Var.N = new ArrayList();
                                    qa2Var.O = new ArrayList();
                                    qa2Var.Q = new ArrayList();
                                    qa2Var.d0 = true;
                                    qa2Var.g0 = new ArrayList();
                                    qa2Var.p0 = new HashMap();
                                    qa2Var.r0 = new da2(qa2Var, (byte) 5);
                                    qa2Var.t0 = false;
                                    qa2Var.a0 = j42;
                                    qa2Var.o0 = z62;
                                    TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                                    qa2Var.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            qa2Var.m0 = tL_chatInviteExported;
                                        } else {
                                            qa2Var.d0(false);
                                        }
                                    }
                                    ba2Var3.presentFragment(qa2Var);
                                    break;
                                case 17:
                                    long j52 = ba2Var3.w0;
                                    ib2 ib2Var = new ib2(null);
                                    ib2Var.w = new ArrayList();
                                    ib2Var.P = false;
                                    ib2Var.Q = false;
                                    ib2Var.F = j52;
                                    TLRPC.Chat L0222 = ib2Var.getMessagesController().L0(Long.valueOf(j52));
                                    ib2Var.f = L0222;
                                    ib2Var.s = sd2.T(L0222) && !ib2Var.f.megagroup;
                                    ib2Var.h = ba2Var3.y0;
                                    ba2Var3.presentFragment(ib2Var);
                                    break;
                                case 18:
                                    wh8 wh8Var = new wh8(ba2Var3.w0);
                                    wh8Var.s = new u92(ba2Var3, b42);
                                    ba2Var3.presentFragment(wh8Var);
                                    break;
                                case 19:
                                    ba2Var3.f0();
                                    break;
                                case 20:
                                    ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                                    ac5Var.c = ba2Var3.M0;
                                    ac5Var.m0 = ba2Var3;
                                    ba2Var3.presentFragment(ac5Var);
                                    break;
                                case 21:
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ba2Var3.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                                    wg2 wg2Var3 = new wg2(bundle4);
                                    wg2Var3.B0(ba2Var3.y0);
                                    ba2Var3.presentFragment(wg2Var3);
                                    break;
                                case 22:
                                    ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                                    ak6Var.m0(chatFull8, chatFull8.exported_invite);
                                    ba2Var3.presentFragment(ak6Var);
                                    break;
                                case 23:
                                    if (!sd2.V(ba2Var3.x0)) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ba2Var3.w0);
                                        zd2 zd2Var = new zd2(bundle5);
                                        TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                        zd2Var.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zd2Var.a == null) {
                                                zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                            }
                                            zd2Var.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zd2Var.w = (byte) 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zd2Var.w = (byte) 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                while (r9 < tL_chatReactionsSome.reactions.size()) {
                                                    if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                        zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                                    }
                                                    r9++;
                                                }
                                                zd2Var.w = (byte) 1;
                                            }
                                        }
                                        ba2Var3.presentFragment(zd2Var);
                                        break;
                                    } else {
                                        ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                        break;
                                    }
                                default:
                                    Bundle j62 = kt6.j(9, "chatMode");
                                    j62.putLong("chat_id", ba2Var3.w0);
                                    j62.putLong("welcome_messages_chat_id", ba2Var3.w0);
                                    ba2Var3.presentFragment(new yv1(j62));
                                    break;
                            }
                        }
                    });
                    t1Var.addView(new bba(context2), qoe.o(-1, -2));
                }
                UndoView undoView = new UndoView(context2);
                ba2Var2.c = undoView;
                hz0Var.addView(undoView, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                cv3 cv3Var6 = ba2Var2.w;
                TLRPC.User user4 = ba2Var2.D0;
                cv3Var6.setText(gw3.l(user4 == null ? bw2.p(user4) : ba2Var2.x0.title, ba2Var2.w.getEditText().getPaint().getFontMetricsInt(), true));
                cv3 cv3Var7 = ba2Var2.w;
                cv3Var7.setSelection(cv3Var7.n());
                chatFull = ba2Var2.y0;
                if (chatFull == null) {
                    ba2Var2.F.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = ba2Var2.E0;
                    if (userFull4 != null) {
                        ba2Var2.F.setText(userFull4.about);
                    }
                }
                ba2Var2.p0();
                ba2Var2.u0(true, false);
                return ba2Var2.fragmentView;
            }
        }
        num2 = num;
        chat = ba2Var.x0;
        if (chat == null) {
        }
        ba2Var2 = ba2Var;
        chat2 = ba2Var2.x0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context2);
            ba2Var2.d0 = frameLayout32;
            t1Var.addView(frameLayout32, qoe.o(-1, -2));
            vkb vkbVar3 = new vkb(context2);
            ba2Var2.e0 = vkbVar3;
            anb.X(vkbVar3.getTextView(), cmb.o7, null);
            anb.Q(ba2Var2.e0, cmb.L0(false), null, anb.M(cmb.h6));
            if (ba2Var2.D0 == null) {
            }
            ba2Var2.d0.addView(ba2Var2.e0, qoe.c(-2.0f, -1));
            final byte b322 = 14;
            ba2Var2.e0.setOnClickListener(new View.OnClickListener(ba2Var2) { // from class: o92
                public final /* synthetic */ ba2 b;

                {
                    this.b = ba2Var2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3222 = b322;
                    byte b42 = 4;
                    gn5 gn5Var = null;
                    ba2 ba2Var3 = this.b;
                    switch (b3222) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ba2Var3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var);
                            break;
                        case 1:
                            y92 y92Var = ba2Var3.R0;
                            long j32 = ba2Var3.C0;
                            if (!ba2Var3.s.g()) {
                                TLRPC.User W1 = j32 == 0 ? null : ba2Var3.getMessagesController().W1(Long.valueOf(j32));
                                if (W1 == null) {
                                    TLRPC.Chat L022 = ba2Var3.getMessagesController().L0(Long.valueOf(ba2Var3.w0));
                                    TLRPC.ChatPhoto chatPhoto = L022.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L022.photo;
                                        int i92 = chatPhoto2.dc_id;
                                        if (i92 != 0) {
                                            chatPhoto2.photo_big.dc_id = i92;
                                        }
                                        TLRPC.ChatFull chatFull5 = ba2Var3.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gn5Var = gn5.j(ba2Var3.y0.chat_photo.video_sizes.get(0), ba2Var3.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.r0().m1(null, L022.photo.photo_big, null, gn5Var, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.r0().T1(null, ba2Var3, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = W1.photo;
                                        int i102 = userProfilePhoto2.dc_id;
                                        if (i102 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i102;
                                        }
                                        PhotoViewer.r0().m1(null, W1.photo.photo_big, null, null, null, null, null, 0, y92Var, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ba2Var3.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wg2 wg2Var2 = new wg2(bundle2);
                            wg2Var2.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var2);
                            break;
                        case 3:
                            ba2Var3.presentFragment(new qv0(ba2Var3.w0));
                            break;
                        case 4:
                            ba2Var3.presentFragment(new mh1(-ba2Var3.w0));
                            break;
                        case 5:
                            ba2Var3.presentFragment(new vg1(ba2Var3.x0));
                            break;
                        case 6:
                            ba2Var3.presentFragment(xza.e0(ba2Var3.x0, false));
                            break;
                        case 7:
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ba2Var3.C0);
                            ba2Var3.presentFragment(new uf1(bundle3));
                            break;
                        case 8:
                            ba2Var3.presentFragment(new bc(ba2Var3.C0));
                            break;
                        case 9:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-intro");
                            break;
                        case 10:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0) + "-commands");
                            break;
                        case 11:
                            l11.u(view.getContext(), "https://t.me/BotFather?start=" + ba2.e0(ba2Var3.D0));
                            break;
                        case 12:
                            ba2Var3.n0();
                            break;
                        case 13:
                            ba2Var3.i0();
                            break;
                        case 14:
                            ba2 ba2Var4 = this.b;
                            ik.r(ba2Var4, false, ba2Var4.x0, null, false, true, true, false, new u92(ba2Var4, (byte) 7));
                            break;
                        case 15:
                            if (gm.H1(ba2Var3)) {
                                pc6 pc6Var = new pc6(4);
                                pc6Var.m0 = -ba2Var3.w0;
                                TLRPC.ChatFull chatFull6 = ba2Var3.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc6Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc6Var.M0 = new u92(ba2Var3, (byte) 6);
                                ba2Var3.presentFragment(pc6Var);
                                break;
                            }
                            break;
                        case 16:
                            long j42 = ba2Var3.w0;
                            xib xibVar72 = ba2Var3.I;
                            boolean z62 = xibVar72 != null && xibVar72.getVisibility() == 0;
                            qa2 qa2Var = new qa2(null);
                            qa2Var.N = new ArrayList();
                            qa2Var.O = new ArrayList();
                            qa2Var.Q = new ArrayList();
                            qa2Var.d0 = true;
                            qa2Var.g0 = new ArrayList();
                            qa2Var.p0 = new HashMap();
                            qa2Var.r0 = new da2(qa2Var, (byte) 5);
                            qa2Var.t0 = false;
                            qa2Var.a0 = j42;
                            qa2Var.o0 = z62;
                            TLRPC.ChatFull chatFull7 = ba2Var3.y0;
                            qa2Var.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    qa2Var.m0 = tL_chatInviteExported;
                                } else {
                                    qa2Var.d0(false);
                                }
                            }
                            ba2Var3.presentFragment(qa2Var);
                            break;
                        case 17:
                            long j52 = ba2Var3.w0;
                            ib2 ib2Var = new ib2(null);
                            ib2Var.w = new ArrayList();
                            ib2Var.P = false;
                            ib2Var.Q = false;
                            ib2Var.F = j52;
                            TLRPC.Chat L0222 = ib2Var.getMessagesController().L0(Long.valueOf(j52));
                            ib2Var.f = L0222;
                            ib2Var.s = sd2.T(L0222) && !ib2Var.f.megagroup;
                            ib2Var.h = ba2Var3.y0;
                            ba2Var3.presentFragment(ib2Var);
                            break;
                        case 18:
                            wh8 wh8Var = new wh8(ba2Var3.w0);
                            wh8Var.s = new u92(ba2Var3, b42);
                            ba2Var3.presentFragment(wh8Var);
                            break;
                        case 19:
                            ba2Var3.f0();
                            break;
                        case 20:
                            ac5 ac5Var = new ac5(-ba2Var3.x0.id);
                            ac5Var.c = ba2Var3.M0;
                            ac5Var.m0 = ba2Var3;
                            ba2Var3.presentFragment(ac5Var);
                            break;
                        case 21:
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ba2Var3.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, (!(ba2Var3.J0 || ba2Var3.x0.gigagroup) || sd2.Y(ba2Var3.x0)) ? 3 : 0);
                            wg2 wg2Var3 = new wg2(bundle4);
                            wg2Var3.B0(ba2Var3.y0);
                            ba2Var3.presentFragment(wg2Var3);
                            break;
                        case 22:
                            ak6 ak6Var = new ak6(ba2Var3.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ba2Var3.y0;
                            ak6Var.m0(chatFull8, chatFull8.exported_invite);
                            ba2Var3.presentFragment(ak6Var);
                            break;
                        case 23:
                            if (!sd2.V(ba2Var3.x0)) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ba2Var3.w0);
                                zd2 zd2Var = new zd2(bundle5);
                                TLRPC.ChatFull chatFull9 = ba2Var3.y0;
                                zd2Var.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zd2Var.a == null) {
                                        zd2Var.a = zd2Var.getMessagesController().L0(Long.valueOf(zd2Var.c));
                                    }
                                    zd2Var.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zd2Var.w = (byte) 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zd2Var.w = (byte) 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        while (r9 < tL_chatReactionsSome.reactions.size()) {
                                            if (tL_chatReactionsSome.reactions.get(r9) instanceof TLRPC.TL_reactionEmoji) {
                                                zd2Var.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(r9)).emoticon);
                                            }
                                            r9++;
                                        }
                                        zd2Var.w = (byte) 1;
                                    }
                                }
                                ba2Var3.presentFragment(zd2Var);
                                break;
                            } else {
                                ba2Var3.presentFragment(new n92(ba2Var3.w0, ba2Var3.y0));
                                break;
                            }
                        default:
                            Bundle j62 = kt6.j(9, "chatMode");
                            j62.putLong("chat_id", ba2Var3.w0);
                            j62.putLong("welcome_messages_chat_id", ba2Var3.w0);
                            ba2Var3.presentFragment(new yv1(j62));
                            break;
                    }
                }
            });
            t1Var.addView(new bba(context2), qoe.o(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        ba2Var2.c = undoView2;
        hz0Var.addView(undoView2, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        cv3 cv3Var62 = ba2Var2.w;
        TLRPC.User user42 = ba2Var2.D0;
        cv3Var62.setText(gw3.l(user42 == null ? bw2.p(user42) : ba2Var2.x0.title, ba2Var2.w.getEditText().getPaint().getFontMetricsInt(), true));
        cv3 cv3Var72 = ba2Var2.w;
        cv3Var72.setSelection(cv3Var72.n());
        chatFull = ba2Var2.y0;
        if (chatFull == null) {
        }
        ba2Var2.p0();
        ba2Var2.u0(true, false);
        return ba2Var2.fragmentView;
    }

    public final void d0() {
        String str;
        if (this.f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().H2.f(-this.w0);
        if (arrayList == null || arrayList.isEmpty()) {
            str = null;
        } else {
            k47 k47Var = (k47) b10.f(1, arrayList);
            str = !TextUtils.isEmpty(k47Var.z) ? k47Var.z.toString() : !TextUtils.isEmpty(k47Var.v) ? k47Var.v.toString() : "";
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = jb6.M0(2131742555, null);
        }
        this.f0.u(jb6.M0(2131742561, null), str, false, R.drawable.menu_welcome_messages, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (java.lang.Math.max(r13 == null ? 0 : r13.participants_count, r12.x0.participants_count) >= getMessagesController().l4.o1.f()) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    @Override // jm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z;
        xib xibVar;
        EditTextBoldCursor editTextBoldCursor;
        int i3 = nm7.T;
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
                d0();
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
                        xibVar = this.R;
                        if (xibVar != null) {
                            xibVar.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z = false;
                    this.G0 = z;
                    xibVar = this.R;
                    if (xibVar != null) {
                    }
                }
                if (sd2.T(this.x0) && !this.y0.hidden_prehistory) {
                    z2 = false;
                }
                this.K0 = z2;
                u0(false, false);
                if (z3) {
                    m0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.v5) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.w0 == longValue) {
                this.F0 = booleanValue;
                this.H0 = booleanValue2;
                if (objArr.length > 3) {
                    this.I0 = ((Boolean) objArr[3]).booleanValue();
                }
                xib xibVar2 = this.R;
                if (xibVar2 != null) {
                    xibVar2.setChecked(this.F0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i5 = oc7.s5;
            if ((intValue & 2) != 0) {
                p0();
            }
            if ((intValue & 1) != 0) {
                w0();
                return;
            }
            return;
        }
        if (i == nm7.b1) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.w0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.z0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.A0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.B0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            tk5 tk5Var = this.parentLayout;
            if (tk5Var == null || tk5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i == nm7.b5) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.w0) {
                TLRPC.ChatFull M0 = getMessagesController().M0(longValue2);
                this.y0 = M0;
                if (M0 != null) {
                    this.L0 = M0.available_reactions;
                }
                x0(true);
                return;
            }
            return;
        }
        if (i != nm7.E3) {
            if (i == nm7.E0) {
                if (((Long) objArr[0]).longValue() == j) {
                    r0(getMessagesController().X1(j));
                    return;
                }
                return;
            } else {
                if (i == nm7.O3) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i == nm7.y1 && (-this.w0) == ((Long) objArr[0]).longValue()) {
                    tk5 tk5Var2 = this.parentLayout;
                    if (tk5Var2 == null || tk5Var2.getLastFragment() != this) {
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
                ku0 g = ku0.g(this.currentAccount);
                this.n0.setVisibility(g.a(j) ? 0 : 8);
                this.n0.w(nxa.b1(false, TextUtils.concat("XTR", nxa.H0(g.c(j), 0.8f, ' ')), 0.85f, null), true);
                xib xibVar3 = this.l0;
                if (xibVar3 != null) {
                    xibVar3.setNeedDivider(g.a(j) || g.b(j));
                }
                this.T.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                ku0 g2 = ku0.g(this.currentAccount);
                this.m0.setVisibility(g2.b(j) ? 0 : 8);
                long i6 = g2.i(j);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i6 > 0) {
                    double d = i6 / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) gm.o0((int) d, 0));
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
                xib xibVar4 = this.l0;
                if (xibVar4 != null) {
                    if (!g2.a(j) && !g2.b(j)) {
                        z2 = false;
                    }
                    xibVar4.setNeedDivider(z2);
                }
                LinearLayout linearLayout = this.T;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
                    i4 = 8;
                }
                linearLayout.setVisibility(i4);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    public final void f0() {
        vi1 vi1Var = new vi1(-this.x0.id);
        vi1Var.m0 = this;
        presentFragment(vi1Var);
        oc7.r1(this.currentAccount).X3.edit().putInt("boostingappearance", oc7.r1(this.currentAccount).X3.getInt("boostingappearance", 0) + 1).apply();
    }

    public final void g0(he heVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, vh1 vh1Var) {
        heVar.dismiss();
        if (getParentActivity() == null) {
            return;
        }
        i46 i46Var = new i46(35, this.currentAccount, getResourceProvider(), getParentActivity(), this);
        i46Var.r1(vh1Var);
        i46Var.q1(tL_premium_boostsStatus, true);
        i46Var.s1(j);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
        if (L0 != null) {
            i46Var.L2 = new lx1(this, L0, (byte) 27);
        }
        showDialog(i46Var);
    }

    @Override // vn5
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override // vn5
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ww9 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        z92 z92Var = this.c0;
        int i = cmb.h6;
        arrayList.add(new cnb(z92Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.c0, 4, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.t6));
        arrayList.add(new cnb(this.c0, 0, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.u6));
        arrayList.add(new cnb(this.U, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.X, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.W, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        xib xibVar = this.V;
        if (xibVar != null) {
            arrayList.add(new cnb(xibVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        arrayList.add(new cnb(this.Y, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.Z, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.J, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.O, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        LinearLayout linearLayout = this.E;
        int i2 = cmb.c6;
        arrayList.add(new cnb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.e0, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.e0, 4, new Class[]{vkb.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.P, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        xib xibVar2 = this.L;
        if (xibVar2 != null) {
            arrayList.add(new cnb(xibVar2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        xib xibVar3 = this.b0;
        if (xibVar3 != null) {
            arrayList.add(new cnb(xibVar3, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        return arrayList;
    }

    public final void h0(FrameLayout frameLayout, View view) {
        if (!this.G0) {
            TLRPC.ChatFull chatFull = this.y0;
            c41.b0(this).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? gm.S2(jb6.G(getMessagesController().l4.o1.f(), "ChannelTopicsForbidden", new Object[0])) : gm.S2(jb6.M0(2131752218, "ChannelTopicsDiscussionForbidden"))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j = -this.w0;
        x34 x34Var = new x34(null);
        x34Var.a = j;
        x34Var.setResourceProvider(this.resourceProvider);
        boolean z = this.F0;
        boolean z2 = this.H0;
        boolean z3 = this.I0;
        qp0 qp0Var = new qp0(this, view, (byte) 1);
        x34Var.c = z;
        x34Var.d = z2;
        x34Var.e = z3;
        x34Var.h = qp0Var;
        presentFragment(x34Var);
    }

    public final void i0() {
        int i = this.currentAccount;
        TL_bots.BotVerifierSettings botVerifierSettings = this.E0.bot_info.verifier_settings;
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        Bundle j = td4.j(16, "onlySelect", "dialogsType", true);
        j.putBoolean("resetDelegate", false);
        nk3 nk3Var = new nk3(j);
        nk3Var.setCurrentAccount(i);
        nk3Var.E2 = new cg(nk3Var, i, this.C0, botVerifierSettings);
        S.presentFragment(nk3Var);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(long j, long j2) {
        oc7.r1(this.currentAccount).V2(j, j2, true, false, new h92(this, (byte) 1));
    }

    public final /* synthetic */ void k0() {
        this.P0 = true;
        nm7 f = nm7.f(this.currentAccount);
        int i = oc7.s5;
        f.k(2, 2);
    }

    public final /* synthetic */ void l0() {
        this.v0 = null;
        long j = this.C0;
        if (j == 0) {
            oc7.r1(this.currentAccount).x(this.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().n1(j);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new t92(this, (byte) 2));
        }
        s0(false, true);
        kc0 kc0Var = this.e;
        Object obj = this.D0;
        if (obj == null) {
            obj = this.x0;
        }
        kc0Var.m(null, null, this.r, obj);
        this.S0.H(0);
        this.c0.e.d();
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new t92(this, (byte) 0));
    }

    public final void n0() {
        this.s.n(this.v0 != null, new v92(this, (byte) 0), new n1(this, (byte) 17), 0);
        this.S0.H(0);
        this.S0.K(43);
        this.c0.e.d();
    }

    public final void o0() {
        cv3 cv3Var;
        String str;
        String str2;
        if (this.O0 || (cv3Var = this.w) == null) {
            return;
        }
        if (cv3Var.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            gm.z3(this.w);
            return;
        }
        this.O0 = true;
        String str3 = "";
        if (this.D0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().p1(this.D0);
            byte b = 4;
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
            this.b = new he(3, null, getParentActivity());
            this.b.setOnCancelListener(new fu0(this, getConnectionsManager().sendRequest(setbotinfo, new pm(this, setbotinfo, (byte) 20)), b));
            this.b.show();
            return;
        }
        byte b2 = 5;
        if (!sd2.T(this.x0) && (!this.K0 || this.F0)) {
            getMessagesController().P(getParentActivity(), this.w0, this, new u92(this, b2), null);
            return;
        }
        if (this.y0 != null && sd2.T(this.x0)) {
            TLRPC.ChatFull chatFull = this.y0;
            boolean z = chatFull.hidden_prehistory;
            boolean z2 = this.K0;
            if (z != z2) {
                chatFull.hidden_prehistory = z2;
                getMessagesController().j5(this.w0, this.K0);
            }
        }
        if (this.s.g()) {
            this.N0 = true;
            he heVar = new he(3, null, getParentActivity());
            this.b = heVar;
            heVar.setOnCancelListener(new ct0(this, b2));
            this.b.show();
            return;
        }
        if (!this.x0.title.equals(this.w.getText().toString())) {
            getMessagesController().y(this.w0, this.w.getText().toString(), null);
        }
        TLRPC.ChatFull chatFull2 = this.y0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            oc7 messagesController = getMessagesController();
            long j = this.w0;
            String obj = this.F.getText().toString();
            TLRPC.ChatFull chatFull3 = this.y0;
            messagesController.getClass();
            TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
            tL_messages_editChatAbout.peer = messagesController.i1(-j);
            tL_messages_editChatAbout.about = obj;
            messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new i65(messagesController, chatFull3, obj, (byte) 21), 64);
        }
        boolean z3 = this.F0;
        TLRPC.Chat chat = this.x0;
        boolean z4 = chat.forum;
        if (z3 != z4 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
            boolean z5 = this.H0 != chat.forum_tabs;
            boolean z6 = this.I0 != chat.forum_sidebar;
            boolean z7 = z3 != z4;
            getMessagesController().i5(this.w0, this.F0, this.H0, this.I0);
            if (this.F0 && !this.H0 && (z7 || z5)) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i = 0; i < fragmentStack.size(); i++) {
                    if ((fragmentStack.get(i) instanceof yv1) && ((yv1) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).a0(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        tk5 parentLayout = getParentLayout();
                        HashSet hashSet = sxb.s1;
                        ((ActionBarLayout) parentLayout).b(i, sxb.F0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (z5 || z6) {
                v0(z5);
            }
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.s.h(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        cv3 cv3Var = this.w;
        if (cv3Var == null || !cv3Var.e) {
            return c0(z);
        }
        if (!z) {
            return false;
        }
        cv3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
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
    
        if (java.lang.Math.max(r5 == null ? 0 : r5.participants_count, r1.participants_count) >= getMessagesController().l4.o1.f()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0131, code lost:
    
        if (r1.linked_chat_id != 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j = this.w0;
        long j2 = this.C0;
        boolean z = true;
        if (j == 0) {
            TLRPC.User W1 = j2 == 0 ? null : getMessagesController().W1(Long.valueOf(j2));
            this.D0 = W1;
            if (W1 == null) {
                TLRPC.User h0 = cf7.Y(this.currentAccount).h0(j2);
                this.D0 = h0;
                if (h0 != null) {
                    getMessagesController().c4(this.D0, true, false);
                    if (this.E0 == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j2));
                        ArrayList I0 = cf7.Y(this.currentAccount).I0(hashSet);
                        if (!I0.isEmpty()) {
                            this.E0 = (TLRPC.UserFull) I0.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            pc0 pc0Var = this.r;
            if (chat == null) {
            }
            wn5 wn5Var = this.s;
            wn5Var.a = this;
            wn5Var.b = this;
            getNotificationCenter().b(this, 2);
            getNotificationCenter().b(this, nm7.y1);
            getNotificationCenter().b(this, nm7.b1);
            if (this.y0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.w0));
        this.x0 = L0;
        if (L0 == null) {
            TLRPC.Chat O = cf7.Y(this.currentAccount).O(this.w0);
            this.x0 = O;
            if (O != null) {
                getMessagesController().V3(this.x0, true);
                if (this.y0 == null) {
                    TLRPC.ChatFull C0 = cf7.Y(this.currentAccount).C0(this.w0, sd2.T(this.x0), new CountDownLatch(1), false, false, 0);
                    this.y0 = C0;
                }
            }
            return false;
        }
        chat = this.x0;
        pc0 pc0Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            pc0Var2.j(5L, this.x0.title, null, null);
            this.J0 = sd2.T(this.x0) && !this.x0.megagroup;
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
                getNotificationCenter().b(this, nm7.T);
                getNotificationCenter().b(this, nm7.v5);
                getNotificationCenter().b(this, nm7.b5);
                getNotificationCenter().b(this, nm7.O3);
            }
            z = false;
            this.G0 = z;
            getNotificationCenter().b(this, nm7.T);
            getNotificationCenter().b(this, nm7.v5);
            getNotificationCenter().b(this, nm7.b5);
            getNotificationCenter().b(this, nm7.O3);
        } else {
            pc0Var2.j(5L, this.D0.first_name, null, null);
            this.J0 = false;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
            this.G0 = false;
            getNotificationCenter().b(this, nm7.E0);
            if (this.D0.bot) {
                getNotificationCenter().b(this, nm7.E3);
            }
        }
        wn5 wn5Var2 = this.s;
        wn5Var2.a = this;
        wn5Var2.b = this;
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, nm7.y1);
        getNotificationCenter().b(this, nm7.b1);
        if (this.y0 != null) {
            m0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        wn5 wn5Var = this.s;
        if (wn5Var != null) {
            wn5Var.c();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, nm7.T);
            getNotificationCenter().n(this, nm7.v5);
            getNotificationCenter().n(this, nm7.b5);
            getNotificationCenter().n(this, nm7.O3);
        } else {
            getNotificationCenter().n(this, nm7.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, nm7.E3);
            }
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.y1);
        getNotificationCenter().n(this, nm7.b1);
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            cv3Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vm) obj).n(null);
        }
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            cv3Var.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.s.j(i, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            cv3Var.s();
            this.w.getEditText().requestFocus();
        }
        t0();
        gm.V2(getParentActivity(), this.classGuid);
        u0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                anb.l(editTextBoldCursor, 30, cmb.F6, null);
            }
            kc0 kc0Var = this.e;
            if (kc0Var != null) {
                kc0Var.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0() {
        TLRPC.FileLocation fileLocation;
        boolean z;
        gn5 m;
        if (this.e == null || this.P0) {
            return;
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.w0));
        TLRPC.User W1 = this.C0 == 0 ? null : getMessagesController().W1(Long.valueOf(this.C0));
        if (L0 == null && W1 == null) {
            return;
        }
        this.D0 = W1;
        this.x0 = L0;
        if (W1 != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
            if (userProfilePhoto != null) {
                fileLocation = userProfilePhoto.photo_small;
                this.v0 = fileLocation;
                m = gn5.m(this.currentAccount, 1, W1);
                this.e.f(W1, this.r);
                if (m != null) {
                    z = true;
                }
                z = false;
            }
            this.e.setImageDrawable(this.r);
            z = false;
        } else {
            TLRPC.ChatPhoto chatPhoto = L0.photo;
            if (chatPhoto != null) {
                TLRPC.FileLocation fileLocation2 = chatPhoto.photo_small;
                W1 = L0;
                fileLocation = fileLocation2;
                this.v0 = fileLocation;
                m = gn5.m(this.currentAccount, 1, W1);
                this.e.f(W1, this.r);
                if (m != null) {
                }
                z = false;
            }
            this.e.setImageDrawable(this.r);
            z = false;
        }
        if (this.c0 != null) {
            if (z || this.s.g()) {
                this.c0.o(R.drawable.msg_addphoto, jb6.M0(2131752150, "ChatSetNewPhoto"), true);
            } else {
                this.c0.o(R.drawable.msg_addphoto, jb6.M0(2131752149, "ChatSetPhotoOrVideo"), true);
            }
            if (this.S0 == null) {
                this.S0 = new p09(R.raw.camera_outline, gm.L(50.0f), gm.L(50.0f), false, null);
            }
            this.c0.e.setTranslationX(-gm.L(8.0f));
            this.c0.e.setAnimation(this.S0);
        }
        if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
            PhotoViewer.r0().r();
        }
        if (this.a0 != null && getMessagesController().l4.C2.f && sd2.V(this.x0)) {
            this.a0.setVisibility(0);
        }
    }

    public final void q0(TLRPC.ChatFull chatFull) {
        vm m;
        this.y0 = chatFull;
        if (chatFull != null) {
            TLRPC.Chat chat = this.x0;
            if (chat == null) {
                chat = getMessagesController().L0(Long.valueOf(this.w0));
                this.x0 = chat;
            }
            this.K0 = !sd2.T(chat) || this.y0.hidden_prehistory;
            this.L0 = this.y0.available_reactions;
            this.Q0.clear();
            ArrayList arrayList = this.Q0;
            TLRPC.Chat chat2 = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && sd2.V(chat2)) {
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
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(z8c.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                m = vm.l(z8c.t0, vm.f(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            m = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? vm.m(z8c.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, vm.f()) : null;
                        }
                        if (m != null) {
                            arrayList2.add(m);
                            m.a(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = hs6.d0(z8c.t0).n;
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList4.get(i2);
                        i2++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            vm l = vm.l(z8c.t0, vm.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l);
                            l.a(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().l4.C2.f && sd2.V(this.x0)) {
                this.a0.setVisibility(0);
            }
        }
        d0();
    }

    public final void r0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j = this.C0;
                this.D0 = j == 0 ? null : getMessagesController().W1(Long.valueOf(j));
            }
            xib xibVar = this.o0;
            if (xibVar != null) {
                xibVar.h(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.w(userFull2.starref_program == null ? jb6.M0(2131754342, null) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            xib xibVar2 = this.u0;
            if (xibVar2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                xibVar2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            njb njbVar = this.t0;
            if (njbVar != null) {
                TLRPC.UserFull userFull4 = this.E0;
                njbVar.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        wn5 wn5Var = this.s;
        if (wn5Var != null) {
            wn5Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z, boolean z2) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView3, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<a91, Float>) property, 1.0f));
        } else {
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<a91, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new y7((byte) 16, (Object) this, z));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wn5 wn5Var = this.s;
        if (wn5Var != null && (str = wn5Var.f) != null) {
            bundle.putString("path", str);
        }
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            String obj = cv3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        xib xibVar;
        xib xibVar2;
        x28 x28Var;
        int v0;
        ArrayList<Integer> arrayList;
        g28 g28Var = this.M;
        if (g28Var != null) {
            TLRPC.Chat chat = this.x0;
            xib xibVar3 = this.O;
            boolean z = (xibVar3 != null && xibVar3.getVisibility() == 0) || ((xibVar = this.R) != null && xibVar.getVisibility() == 0) || ((sd2.n0(this.x0) && sd2.N(this.x0)) || ((xibVar2 = this.N) != null && xibVar2.getVisibility() == 0));
            Paint paint = g28Var.n;
            int i = g28Var.a;
            ylb ylbVar = g28Var.d;
            if (chat != null) {
                g28Var.w = z;
                g28Var.r = new uib(gw3.m(chat.title, cmb.n2.getFontMetricsInt(), false, null, 0), 13.0f, gm.o());
                x28 x28Var2 = g28Var.x;
                if (x28Var2 != null) {
                    x28Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i2 = x28.j;
                    int i3 = tL_emojiStatusCollectible.center_color | (-16777216);
                    x28Var = new x28(i3, i3, i3, tL_emojiStatusCollectible.document_id);
                    g28Var.x = x28Var;
                } else {
                    if (sd2.I(chat) >= 0) {
                        x28 c = x28.c(i, sd2.I(chat));
                        c.a = gm.L(11.0f);
                        c.d();
                        x28Var = c;
                    } else {
                        x28Var = null;
                    }
                    g28Var.x = x28Var;
                }
                if (x28Var != null) {
                    x28Var.e(g28Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
                    int i4 = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                    if (!a || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | (-16777216);
                    int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                    int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                    g28Var.r.m(i4);
                    paint.setColor(cmb.p1(0.1f, i4));
                    x28 x28Var3 = new x28(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
                    x28Var3.a = gm.L(11.0f);
                    x28Var3.d();
                    g28Var.y = x28Var3;
                    x28Var3.e(g28Var);
                    return;
                }
                int F = sd2.F(chat);
                if (F < 7) {
                    int i5 = cmb.q8[F];
                    g28Var.s = i5;
                    v0 = cmb.v0(i5, ylbVar);
                } else {
                    fc7 fc7Var = oc7.r1(z8c.t0).E3;
                    ec7 d = fc7Var != null ? fc7Var.d(F) : null;
                    if (d != null) {
                        g28Var.s = -1;
                        v0 = d.f();
                    } else {
                        int i6 = cmb.q8[0];
                        g28Var.s = i6;
                        v0 = cmb.v0(i6, ylbVar);
                    }
                }
                g28Var.r.m(v0);
                paint.setColor(cmb.p1(0.1f, v0));
                x28 a2 = x28.a(i, F);
                a2.a = gm.L(11.0f);
                a2.d();
                g28Var.y = a2;
                a2.e(g28Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(boolean z, boolean z2) {
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
        xib xibVar;
        xib xibVar2;
        xib xibVar3;
        xib xibVar4;
        String str3;
        int i7;
        xib xibVar5;
        xib xibVar6;
        xib xibVar7;
        xib xibVar8;
        xib xibVar9;
        TLRPC.Chat L0;
        if (z && (L0 = getMessagesController().L0(Long.valueOf(this.w0))) != null) {
            this.x0 = L0;
        }
        boolean t0 = sd2.t0(this.x0);
        njb njbVar = this.Q;
        byte b = 8;
        if (njbVar != null) {
            njbVar.setVisibility((this.J != null || ((xibVar7 = this.K) != null && xibVar7.getVisibility() == 0) || (((xibVar8 = this.O) != null && xibVar8.getVisibility() == 0) || ((xibVar9 = this.I) != null && xibVar9.getVisibility() == 0))) ? 0 : 8);
        }
        xib xibVar10 = this.Z;
        if (xibVar10 != null) {
            xibVar10.setVisibility(sd2.T(this.x0) ? 0 : 8);
        }
        xib xibVar11 = this.K;
        if (xibVar11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.J0 && chatFull2.linked_chat_id == 0)) {
                xibVar11.setVisibility(8);
            } else {
                xibVar11.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(jb6.M0(2131751326, "Discussion"), jb6.M0(2131751318, "DiscussionInfoShort"), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.y0.linked_chat_id));
                    if (L02 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = sd2.K(L02, false);
                        boolean isEmpty = TextUtils.isEmpty(K);
                        xib xibVar12 = this.K;
                        if (isEmpty) {
                            xibVar12.u(jb6.M0(2131751326, "Discussion"), L02.title, false, R.drawable.msg_discuss, true);
                        } else {
                            xibVar12.u(jb6.M0(2131751326, "Discussion"), b10.h("@", K), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String K2 = sd2.K(L02, false);
                        boolean isEmpty2 = TextUtils.isEmpty(K2);
                        xib xibVar13 = this.K;
                        if (isEmpty2) {
                            String M02 = jb6.M0(2131748640, "LinkedChannel");
                            String str4 = L02.title;
                            xib xibVar14 = this.R;
                            xibVar13.u(M02, str4, false, R.drawable.msg_channel, xibVar14 != null && xibVar14.getVisibility() == 0);
                        } else {
                            String M03 = jb6.M0(2131748640, "LinkedChannel");
                            String h = b10.h("@", K2);
                            xib xibVar15 = this.R;
                            xibVar13.u(M03, h, false, R.drawable.msg_channel, xibVar15 != null && xibVar15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        xib xibVar16 = this.I;
        if (xibVar16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                xibVar16.setVisibility(8);
            } else {
                xibVar16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                boolean z4 = channelLocation instanceof TLRPC.TL_channelLocation;
                xib xibVar17 = this.I;
                if (z4) {
                    xibVar17.q(jb6.M0(2131753926, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z2, true);
                } else {
                    xibVar17.q(jb6.M0(2131753926, "AttachLocation"), "Unknown address", z2, true);
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
                        i7 = 2131743607;
                    } else if (z5) {
                        str3 = "TypePrivateRestrictedForwards";
                        i7 = 2131743608;
                    } else {
                        str3 = "TypePrivate";
                        i7 = 2131743611;
                    }
                    M0 = jb6.M0(i7, str3);
                } else {
                    if (t0) {
                        str2 = "TypePublicGroup";
                        i6 = 2131743606;
                    } else if (z5) {
                        str2 = "TypePrivateGroupRestrictedForwards";
                        i6 = 2131743609;
                    } else {
                        str2 = "TypePrivateGroup";
                        i6 = 2131743610;
                    }
                    M0 = jb6.M0(i6, str2);
                }
                String str5 = M0;
                boolean z6 = this.J0;
                xib xibVar18 = this.J;
                if (z6) {
                    String M04 = jb6.M0(2131752214, "ChannelType");
                    xib xibVar19 = this.O;
                    xibVar18.u(M04, str5, false, R.drawable.msg_channel, (xibVar19 != null && xibVar19.getVisibility() == 0) || ((xibVar3 = this.K) != null && xibVar3.getVisibility() == 0) || ((xibVar4 = this.R) != null && xibVar4.getVisibility() == 0));
                } else {
                    String M05 = jb6.M0(2131749149, "GroupType");
                    xib xibVar20 = this.O;
                    xibVar18.u(M05, str5, false, R.drawable.msg_groups, (xibVar20 != null && xibVar20.getVisibility() == 0) || ((xibVar = this.K) != null && xibVar.getVisibility() == 0) || ((xibVar2 = this.R) != null && xibVar2.getVisibility() == 0));
                }
            } else {
                String M06 = !t0 ? jb6.M0(2131743616, "TypeLocationGroupEdit") : String.format(b10.j(new StringBuilder("https://"), getMessagesController().N2, "/%s"), sd2.K(this.x0, false));
                xib xibVar21 = this.J;
                String M07 = jb6.M0(2131743617, "TypeLocationGroup");
                xib xibVar22 = this.O;
                xibVar21.u(M07, M06, false, R.drawable.msg_channel, (xibVar22 != null && xibVar22.getVisibility() == 0) || ((xibVar5 = this.K) != null && xibVar5.getVisibility() == 0) || ((xibVar6 = this.R) != null && xibVar6.getVisibility() == 0));
            }
        }
        byte b2 = 2;
        if (this.O != null) {
            if (!this.K0 || this.F0) {
                str = "ChatHistoryVisible";
                i5 = 2131752165;
            } else {
                str = "ChatHistoryHidden";
                i5 = 2131752169;
            }
            this.O.u(jb6.M0(2131752166, "ChatHistoryShort"), jb6.M0(i5, str), z2, R.drawable.msg_discuss, this.R != null);
            this.O.setEnabled(!this.F0);
            boolean z7 = (this.F0 || t0 || ((chatFull = this.y0) != null && (chatFull.linked_chat_id != 0 || (chatFull.location instanceof TLRPC.TL_channelLocation)))) ? false : true;
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.O.getAlpha() <= 0.0f && !z7) {
                this.O.setVisibility(8);
                t0();
            } else if (this.O.getVisibility() != 0 || this.O.getAlpha() < 1.0f || !z7) {
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                boolean z8 = false;
                while (i8 < this.G.getChildCount()) {
                    LinearLayout linearLayout = this.G;
                    if (z8) {
                        arrayList.add(linearLayout.getChildAt(i8));
                    } else if (linearLayout.getChildAt(i8) == this.O) {
                        z8 = true;
                    }
                    i8++;
                    z8 = z8;
                }
                int i9 = 0;
                boolean z9 = false;
                while (i9 < this.x.getChildCount()) {
                    t1 t1Var = this.x;
                    if (z9) {
                        arrayList.add(t1Var.getChildAt(i9));
                    } else if (t1Var.getChildAt(i9) == this.G) {
                        z9 = true;
                    }
                    i9++;
                    z9 = z9;
                }
                if (this.O.getVisibility() != 0) {
                    this.O.setAlpha(0.0f);
                    this.O.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.O.setVisibility(0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                }
                xib xibVar23 = this.O;
                if (z2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(xibVar23.getAlpha(), z7 ? 1.0f : 0.0f);
                    this.T0 = ofFloat;
                    ofFloat.addUpdateListener(new pl(this, arrayList, b));
                    this.T0.addListener(new qx(this, z7, arrayList, b2));
                    this.T0.setDuration(320L);
                    this.T0.setInterpolator(d53.h);
                    this.T0.start();
                } else {
                    xibVar23.setAlpha(z7 ? 1.0f : 0.0f);
                    this.O.setTranslationY(((-r5.getHeight()) / 2.0f) * (z7 ? 0.0f : 1.0f));
                    this.O.setScaleY(((z7 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.O.setVisibility(z7 ? 0 : 8);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((View) arrayList.get(i11)).setTranslationY(0.0f);
                    }
                    this.T0 = null;
                }
            }
        }
        if (this.U != null) {
            if (this.y0 != null) {
                xib xibVar24 = this.V;
                if (xibVar24 != null) {
                    if (xibVar24.getParent() == null) {
                        i = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, qoe.o(-1, -2));
                    } else {
                        i = 0;
                    }
                    this.V.setVisibility(this.y0.requests_pending > 0 ? i : 8);
                } else {
                    i = 0;
                }
                if (!this.J0 || sd2.Y(this.x0)) {
                    boolean T = sd2.T(this.x0);
                    xib xibVar25 = this.U;
                    if (T) {
                        CharSequence M08 = jb6.M0(2131752321, "ChannelMembers");
                        Object[] objArr = new Object[1];
                        objArr[i] = Integer.valueOf(this.y0.participants_count);
                        xibVar25.u(M08, String.format("%d", objArr), false, R.drawable.msg_groups, true);
                    } else {
                        CharSequence M09 = jb6.M0(2131752321, "ChannelMembers");
                        Object[] objArr2 = new Object[1];
                        objArr2[i] = Integer.valueOf(this.y0.participants.participants.size());
                        xibVar25.u(M09, String.format("%d", objArr2), false, R.drawable.msg_groups, this.V.getVisibility() == 0 ? 1 : i);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (!chat.gigagroup || sd2.Y(chat)) {
                        int i12 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i13 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i13++;
                            }
                            i2 = wg2.o0(tL_chatBannedRights) + i13;
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
                            i3 = i12;
                        } else {
                            i2 = i12;
                            i3 = i2;
                        }
                        xib xibVar26 = this.Y;
                        String M010 = jb6.M0(2131752275, null);
                        Integer valueOf = Integer.valueOf(i2);
                        Integer valueOf2 = Integer.valueOf(i3);
                        Object[] objArr3 = new Object[2];
                        objArr3[i] = valueOf;
                        objArr3[1] = valueOf2;
                        xibVar26.u(M010, String.format("%d/%d", objArr3), z2, R.drawable.msg_permissions, true);
                        z3 = z2;
                    } else {
                        xib xibVar27 = this.Y;
                        CharSequence M011 = jb6.M0(2131752399, null);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        Object[] objArr4 = new Object[1];
                        objArr4[i] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                        CharSequence format = String.format("%d", objArr4);
                        xib xibVar28 = this.Z;
                        xibVar27.u(M011, format, false, R.drawable.msg_user_remove, (xibVar28 == null || xibVar28.getVisibility() != 0) ? i : 1);
                        z3 = z2;
                    }
                    xib xibVar29 = this.V;
                    if (xibVar29 != null) {
                        CharSequence M012 = jb6.M0(2131748392, "MemberRequests");
                        Object[] objArr5 = new Object[1];
                        objArr5[i] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format2 = String.format("%d", objArr5);
                        xib xibVar30 = this.Z;
                        xibVar29.u(M012, format2, false, R.drawable.msg_requests, (xibVar30 == null || xibVar30.getVisibility() != 0) ? i : 1);
                    }
                } else {
                    xib xibVar31 = this.U;
                    String M013 = jb6.M0(2131752227, "ChannelSubscribers");
                    Object[] objArr6 = new Object[1];
                    objArr6[i] = Integer.valueOf(this.y0.participants_count);
                    xibVar31.u(M013, String.format("%d", objArr6), false, R.drawable.msg_groups, true);
                    xib xibVar32 = this.Y;
                    CharSequence M014 = jb6.M0(2131752399, null);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    Object[] objArr7 = new Object[1];
                    objArr7[i] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                    CharSequence format3 = String.format("%d", objArr7);
                    xib xibVar33 = this.Z;
                    xibVar32.u(M014, format3, false, R.drawable.msg_user_remove, (xibVar33 == null || xibVar33.getVisibility() != 0) ? i : 1);
                    z3 = z2;
                }
                xib xibVar34 = this.X;
                String M015 = jb6.M0(2131752464, "ChannelAdministrators");
                boolean T2 = sd2.T(this.x0);
                TLRPC.ChatFull chatFull7 = this.y0;
                if (T2) {
                    i4 = chatFull7.admins_count;
                } else if (chatFull7 == null) {
                    i4 = 1;
                } else {
                    int size = chatFull7.participants.participants.size();
                    int i14 = i;
                    int i15 = i14;
                    while (i14 < size) {
                        TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i14);
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            i15++;
                        }
                        i14++;
                    }
                    i4 = i15;
                }
                Object[] objArr8 = new Object[1];
                objArr8[i] = Integer.valueOf(i4);
                xibVar34.u(M015, String.format("%d", objArr8), false, R.drawable.msg_admins, true);
            } else {
                z3 = z2;
                i = 0;
                if (!this.J0 || sd2.Y(this.x0)) {
                    xib xibVar35 = this.U;
                    String M016 = jb6.M0(2131752321, "ChannelMembers");
                    xib xibVar36 = this.Z;
                    xibVar35.o(R.drawable.msg_groups, M016, xibVar36 != null && xibVar36.getVisibility() == 0);
                    boolean z10 = this.x0.gigagroup;
                    xib xibVar37 = this.Y;
                    if (z10) {
                        String M017 = jb6.M0(2131752399, null);
                        xib xibVar38 = this.Z;
                        xibVar37.o(R.drawable.msg_chats_remove, M017, xibVar38 != null && xibVar38.getVisibility() == 0);
                    } else {
                        xibVar37.o(R.drawable.msg_permissions, jb6.M0(2131752275, null), true);
                    }
                } else {
                    this.U.o(R.drawable.msg_groups, jb6.M0(2131752227, "ChannelSubscribers"), true);
                    xib xibVar39 = this.Y;
                    String M018 = jb6.M0(2131752399, null);
                    xib xibVar40 = this.Z;
                    xibVar39.o(R.drawable.msg_chats_remove, M018, xibVar40 != null && xibVar40.getVisibility() == 0);
                }
                this.X.o(R.drawable.msg_admins, jb6.M0(2131752464, "ChannelAdministrators"), true);
            }
            this.P.setVisibility(sd2.w(1, this.x0) ? i : 8);
            x0(z3);
            if (this.y0 == null || !sd2.y(3, this.x0) || (t0 && this.x0.creator)) {
                this.W.setVisibility(8);
            } else {
                int i16 = this.y0.invitesCount;
                xib xibVar41 = this.W;
                if (i16 > 0) {
                    xibVar41.u(jb6.M0(2131748897, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, R.drawable.msg_link2, true);
                } else {
                    xibVar41.u(jb6.M0(2131748897, "InviteLinks"), "1", false, R.drawable.msg_link2, true);
                }
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z) {
        nk3 nk3Var;
        dj3 dj3Var;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i = 0;
            while (i < fragmentStack.size()) {
                if (fragmentStack.get(i) instanceof yv1) {
                    yv1 yv1Var = (yv1) fragmentStack.get(i);
                    if (yv1Var.getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(yv1Var, false);
                        yv1Var.clearViews();
                        if (((ActionBarLayout) getParentLayout()).b(i, yv1Var)) {
                            nm7.e().j(yv1Var.da);
                        }
                        if (z && !this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.w0);
                            ((ActionBarLayout) getParentLayout()).b(i, new sxb(bundle));
                            i++;
                        }
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof sxb)) {
                    sxb sxbVar = (sxb) fragmentStack.get(i);
                    if (sxbVar.f() != null && sxbVar.f().id == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(sxbVar, false);
                        i--;
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof nk3) && (nk3Var = (nk3) fragmentStack.get(i)) != null && (dj3Var = nk3Var.H3) != null && dj3Var.c()) {
                    nk3Var.H3.a();
                }
                i++;
            }
        }
    }

    @Override // vn5
    public final boolean w() {
        return false;
    }

    public final void w0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() <= 1) {
            this.l0.u(jb6.M0(2131752958, null), "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
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
        this.l0.u(jb6.M0(2131752957, null), jb6.a0(null, null, 2131752956, Integer.valueOf(i), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    public final void x0(boolean z) {
        String str;
        String str2;
        int i;
        TLRPC.ChatFull M0 = getMessagesController().M0(this.w0);
        boolean V = sd2.V(this.x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String M02 = jb6.M0(2131746112, null);
            if (M0 == null || !M0.paid_reactions_available) {
                str = M02;
                this.P.u(jb6.M0(2131746120, null), str, z, R.drawable.msg_reactions2, true);
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
                if (M0 != null && M0.paid_reactions_available) {
                    i2++;
                }
                str2 = i2 == 0 ? jb6.M0(2131746112, null) : String.valueOf(i2);
            } else {
                int min = Math.min(getMediaDataController().n.size(), i2);
                str2 = min == 0 ? jb6.M0(2131746112, null) : jb6.a0(null, null, 2131746117, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
            }
        } else {
            str2 = jb6.M0(2131746119, null);
        }
        str = str2;
        this.P.u(jb6.M0(2131746120, null), str, z, R.drawable.msg_reactions2, true);
    }

    public final void y0(Long l) {
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.L == null) {
            return;
        }
        long j = 0;
        if (!(l != null ? l.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.L.u(jb6.M0(2131746829, null), jb6.M0(2131746819, null), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.x0.linked_monoforum_id));
        if (l != null) {
            j = l.longValue();
        } else if (L0 != null) {
            j = L0.send_paid_messages_stars;
        }
        this.L.u(jb6.M0(2131746829, null), nxa.b1(false, jb6.a0(null, null, 2131746803, Long.valueOf(j)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // vn5
    public final void T() {
    }
}
