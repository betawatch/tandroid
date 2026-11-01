package i2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.messenger.s5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.vy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.Wallet.ga;
import org.telegram.ui.bp;
import org.telegram.ui.cp;
import org.telegram.ui.ld;
import org.telegram.ui.le;
import org.telegram.ui.tt;
import org.telegram.ui.un;
import org.telegram.ui.wd;
import org.telegram.ui.zo;
import rh.e4;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        char c10;
        char c11 = '\b';
        Object obj = null;
        boolean z10 = true;
        int i11 = 0;
        switch (this.a) {
            case 0:
                i1 i1Var = (i1) this.c;
                Pair pair = (Pair) this.d;
                i1Var.b.h.B(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f, (IOException) this.h, this.b);
                break;
            case 1:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                break;
            case 2:
                le leVar = (le) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f;
                boolean z11 = this.b;
                TLObject tLObject = (TLObject) this.h;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(leVar.o0).sendRequest(new TL_account.getPassword(), new wd(leVar, twoStepVerificationActivity, z11, 0), 8);
                            break;
                        } else {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            cc.d0(tL_error);
                            break;
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        alertDialog$Builder.a.R = dd.L0(2131751298, null);
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        TextView textView = new TextView(activity);
                        int i12 = t6.j5;
                        a7.V(textView, i12, null);
                        textView.setTextSize(1, 16.0f);
                        textView.setGravity((dd.X ? 5 : 3) | 48);
                        textView.setText(org.telegram.messenger.i0.W2(dd.L0(2131742889, null)));
                        linearLayout.addView(textView, b6.o(-1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(activity);
                        linearLayout2.setOrientation(0);
                        linearLayout.addView(linearLayout2, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(activity);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(dd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), dd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        a7.t(imageView, i12, null, mode);
                        TextView textView2 = new TextView(activity);
                        a7.V(textView2, i12, null);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity((dd.X ? 5 : 3) | 48);
                        textView2.setText(org.telegram.messenger.i0.W2(dd.L0(2131751301, null)));
                        if (dd.X) {
                            linearLayout2.addView(textView2, b6.o(-1, -2));
                            linearLayout2.addView(imageView, b6.r(-2, -2, 5));
                        } else {
                            linearLayout2.addView(imageView, b6.o(-2, -2));
                            linearLayout2.addView(textView2, b6.o(-1, -2));
                        }
                        LinearLayout e = m5.e(activity, 0);
                        linearLayout.addView(e, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(activity);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(dd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), dd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
                        a7.t(imageView2, i12, null, mode);
                        TextView textView3 = new TextView(activity);
                        a7.V(textView3, i12, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((dd.X ? 5 : 3) | 48);
                        textView3.setText(org.telegram.messenger.i0.W2(dd.L0(2131751300, null)));
                        if (dd.X) {
                            e.addView(textView3, b6.o(-1, -2));
                            i10 = 5;
                            e.addView(imageView2, b6.r(-2, -2, 5));
                        } else {
                            i10 = 5;
                            e.addView(imageView2, b6.o(-2, -2));
                            e.addView(textView3, b6.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error.text)) {
                            alertDialog$Builder.k(dd.L0(2131751292, null), new ld(leVar));
                            alertDialog$Builder.h(dd.L0(2131752589, null), null);
                        } else {
                            TextView textView4 = new TextView(activity);
                            a7.V(textView4, i12, null);
                            textView4.setTextSize(1, 16.0f);
                            if (!dd.X) {
                                i10 = 3;
                            }
                            m5.l(textView4, i10 | 48, null, 2131751299);
                            linearLayout.addView(textView4, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            alertDialog$Builder.h(dd.L0(2131747847, null), null);
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                            break;
                        } else {
                            leVar.m0.showDialog(alertDialog$Builder.a);
                            break;
                        }
                    }
                } else {
                    twoStepVerificationActivity.t0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        gf.f.r(leVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                        if (z11) {
                            leVar.H(true);
                        }
                    }
                    leVar.J();
                    break;
                }
                break;
            case 3:
                un.u1((un) this.c, (org.telegram.ui.Cells.q1) this.d, this.b, (String) this.e, (TLRPC.User[]) this.f, (CharacterStyle) this.h);
                break;
            case 4:
                un unVar = (un) this.c;
                x1 x1Var = (x1) this.d;
                boolean[] zArr = (boolean[]) this.e;
                boolean z12 = this.b;
                kj kjVar = (kj) this.f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    x1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z12) {
                        unVar.createArticleViewer(false).L(kjVar, webPage, null, null);
                        break;
                    } else {
                        try {
                            org.telegram.messenger.i0.u2(kjVar, unVar.getParentActivity(), unVar.xa, false);
                            break;
                        } catch (Exception e7) {
                            f8.g(e7, true);
                            unVar.J6(kjVar);
                            return;
                        }
                    }
                }
                break;
            case 5:
                zo zoVar = (zo) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                boolean z13 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                bp bpVar = zoVar.a;
                cp cpVar = bpVar.h3;
                cpVar.P.remove(tL_channels_toggleUsername.username);
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    bpVar.z1(tL_username, !z13, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    bpVar.z1(tL_username, z13, true);
                    cpVar.b0();
                } else {
                    org.telegram.messenger.i0.g3(new ag.j0(zoVar, tL_username, z13, 13));
                }
                cpVar.getMessagesController().q5(cpVar.X, tL_username.username, tL_username.active);
                break;
            case 6:
                ((vy) this.c).K((fh.a) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f, (TLRPC.Document) this.h, this.b, true);
                break;
            case 7:
                tt ttVar = (tt) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                vh.d dVar = (vh.d) this.e;
                boolean z14 = this.b;
                HashSet hashSet = (HashSet) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    wp.r1(ttVar.a).V3(updates.users, false);
                    wp.r1(ttVar.a).P3(updates.chats, false);
                    ArrayList y02 = wp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i13 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i13 < size) {
                        Object obj2 = y02.get(i13);
                        i13++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    Utilities.d.c(new org.telegram.ui.Components.voip.u(4, ttVar, updates));
                    if (groupCall != null && LaunchActivity.I1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        ttVar.dismiss();
                        org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, ttVar.a, tL_inputGroupCall, z14, groupCall, hashSet);
                        break;
                    } else {
                        ttVar.U1 = false;
                        dVar.setLoading(false);
                        break;
                    }
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    wp.r1(ttVar.a).V3(groupcall.users, false);
                    wp.r1(ttVar.a).P3(groupcall.chats, false);
                    if (LaunchActivity.I1 == null) {
                        ttVar.U1 = false;
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        ttVar.dismiss();
                        org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, ttVar.a, tL_inputGroupCall2, z14, groupcall.call, hashSet);
                        break;
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.s(ttVar.E, ttVar.I0, tL_error3, false);
                    break;
                }
                break;
            case 8:
                g8 g8Var = (g8) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                boolean z15 = this.b;
                s5 s5Var = ga.a;
                int i14 = 0;
                while (true) {
                    int i15 = at.K4;
                    if (i14 < 288) {
                        int i16 = i14 * at.L4;
                        int i17 = 8;
                        int i18 = 0;
                        while (i18 < 288) {
                            int i19 = i16 + i18;
                            boolean z16 = z10;
                            i17 = (iArr[i19] >>> 24) >= 128 ? 0 : Math.min(i17 + 1, 8);
                            iArr3[i19] = i17;
                            i18++;
                            z10 = z16;
                        }
                        boolean z17 = z10;
                        int i20 = 8;
                        while (i15 >= 0) {
                            int i21 = i16 + i15;
                            i20 = iArr3[i21] == 0 ? 0 : Math.min(i20 + 1, 8);
                            if (i20 < iArr3[i21]) {
                                iArr3[i21] = i20;
                            }
                            i15--;
                        }
                        i14++;
                        z10 = z17;
                    } else {
                        boolean z18 = z10;
                        int i22 = 0;
                        while (i22 < 288) {
                            for (int i23 = i11; i23 < 288; i23++) {
                                iArr4[i23] = iArr3[(i23 * at.L4) + i22];
                            }
                            int i24 = i11;
                            while (i24 < 288) {
                                int min = Math.min(i15, i24 + 8);
                                int i25 = 128;
                                for (int max = Math.max(i11, i24 - 8); max <= min; max++) {
                                    int i26 = iArr4[max];
                                    if (i26 < 8) {
                                        int i27 = max - i24;
                                        int i28 = (i27 * i27) + (i26 * i26);
                                        if (i28 < i25) {
                                            i25 = i28;
                                        }
                                    }
                                }
                                iArr3[(i24 * at.L4) + i22] = ga.b[i25];
                                i24++;
                                i11 = 0;
                                i15 = at.K4;
                            }
                            i22++;
                            i11 = 0;
                            i15 = at.K4;
                        }
                        int i29 = 0;
                        while (i29 < 82944) {
                            int i30 = iArr[i29];
                            int i31 = i30 >>> 24;
                            int max2 = Math.max(iArr3[i29], i31);
                            if (i31 != 255) {
                                if (i31 == 0) {
                                    i30 = (max2 << 24) | 16777215;
                                } else {
                                    int i32 = ((255 - i31) * max2) / at.e4;
                                    int i33 = i31 + i32;
                                    int i34 = ((i30 >> 16) & at.e4) * i31;
                                    int i35 = i32 * at.e4;
                                    c10 = c11;
                                    i30 = ((((i30 & at.e4) * i31) + i35) / i33) | ((((((i30 >> 8) & at.e4) * i31) + i35) / i33) << 8) | (i33 << 24) | (((i34 + i35) / i33) << 16);
                                    iArr2[i29] = i30;
                                    i29++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i29] = i30;
                            i29++;
                            c11 = c10;
                        }
                        if (z15) {
                            int i36 = 0;
                            for (int i37 = 0; i37 < 82944; i37 += 7) {
                                if ((iArr2[i37] >>> 24) > 0) {
                                    i36++;
                                }
                            }
                            if (i36 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, at.L4, at.L4, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, z18);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                Bitmap createBitmap2 = Bitmap.createBitmap(at.G2, at.G2, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(z18 ? 1 : 0);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(createBitmap2).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                bitmap = createBitmap2;
                                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.g(g8Var, iArr2, bitmap, 20));
                                break;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.g(g8Var, iArr2, bitmap, 20));
                    }
                }
            default:
                e4 e4Var = (e4) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                r20 r20Var = (r20) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f;
                boolean z19 = this.b;
                TLObject tLObject4 = (TLObject) this.h;
                if (e4Var.getContext() != null) {
                    if (tL_error4 != null && r20Var != null && tL_error4.text.startsWith("TMP_PASSWORD")) {
                        r20Var.a(Boolean.TRUE);
                        break;
                    } else {
                        if (r20Var != null) {
                            r20Var.a(Boolean.FALSE);
                        }
                        if (tL_error4 != null) {
                            e4Var.Q1(tL_error4, twoStepVerificationActivity2, z19);
                            break;
                        } else {
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.t0();
                                twoStepVerificationActivity2.finishFragment();
                            }
                            if (tLObject4 instanceof TL_stars.starGiftWithdrawalUrl) {
                                gf.f.t(e4Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject4).url);
                                break;
                            } else if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                                TL_stars.TL_starGiftUnique H1 = e4Var.H1();
                                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(e4Var.a);
                                org.telegram.ui.Wallet.h hVar = x10.z;
                                String str = H1 != null ? H1.gift_address : null;
                                org.telegram.messenger.i0.r(hVar);
                                x10.x = str;
                                x10.y = 0;
                                if (x10.o == null) {
                                    x10.o = new org.telegram.ui.Wallet.c0(x10);
                                }
                                org.telegram.ui.Wallet.c0 c0Var = x10.o;
                                if (!c0Var.j) {
                                    c0Var.b();
                                    c0Var.f(true);
                                }
                                x10.B().g();
                                x10.E();
                                int i38 = x10.y;
                                long[] jArr = org.telegram.ui.Wallet.k0.P;
                                if (i38 < 7) {
                                    x10.y = i38 + 1;
                                    org.telegram.messenger.i0.h3(hVar, jArr[i38]);
                                }
                                if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                                    org.telegram.messenger.i0.g3(new v41(obj, H1.getDocument(), dd.L0(2131750110, null), 25));
                                }
                                e4Var.dismiss();
                                break;
                            } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                                cc.b0("NULL_ERROR");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
        this.h = obj5;
    }

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
        this.h = tLObject;
    }

    public /* synthetic */ h1(un unVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 3;
        this.c = unVar;
        this.d = q1Var;
        this.b = z10;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }
}
