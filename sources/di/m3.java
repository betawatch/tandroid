package di;

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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ly;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.bd;
import org.telegram.ui.eo;
import org.telegram.ui.go;
import org.telegram.ui.ho;
import org.telegram.ui.vs;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m3(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
        this.h = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        Bitmap bitmap;
        char c10;
        int i10 = 5;
        char c11 = '\b';
        int i11 = 0;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                z10 z10Var = (z10) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z10 = this.b;
                TLObject tLObject = (TLObject) this.h;
                if (c6Var.getContext() != null) {
                    if (tL_error != null && z10Var != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                        z10Var.a(Boolean.TRUE);
                        break;
                    } else {
                        if (z10Var != null) {
                            z10Var.a(Boolean.FALSE);
                        }
                        if (tL_error != null) {
                            c6Var.Q1(tL_error, twoStepVerificationActivity, z10);
                            break;
                        } else {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                                vf.c.v(c6Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url, false);
                                break;
                            } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                                TL_stars.TL_starGiftUnique H1 = c6Var.H1();
                                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(c6Var.a);
                                org.telegram.ui.Wallet.h hVar = x10.z;
                                String str = H1 != null ? H1.gift_address : null;
                                org.telegram.messenger.g0.r(hVar);
                                x10.x = str;
                                x10.y = 0;
                                if (x10.o == null) {
                                    x10.o = new org.telegram.ui.Wallet.d0(x10);
                                }
                                org.telegram.ui.Wallet.d0 d0Var = x10.o;
                                if (!d0Var.j) {
                                    d0Var.b();
                                    d0Var.f(true);
                                }
                                x10.B().g();
                                x10.E();
                                int i12 = x10.y;
                                long[] jArr = org.telegram.ui.Wallet.l0.P;
                                if (i12 < 7) {
                                    x10.y = i12 + 1;
                                    org.telegram.messenger.g0.i3(hVar, jArr[i12]);
                                }
                                if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                                    org.telegram.messenger.g0.h3(new aa.r((Object) null, (Object) H1.getDocument(), (Object) hd.M0(2131750101, null), 19));
                                }
                                c6Var.dismiss();
                                break;
                            } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                org.telegram.ui.Components.cc.b0("NULL_ERROR");
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                l2.c1 c1Var = (l2.c1) this.c;
                Pair pair = (Pair) this.d;
                c1Var.b.h.r(((Integer) pair.first).intValue(), (x2.f0) pair.second, (x2.t) this.e, (x2.b0) this.f, (IOException) this.h, this.b);
                break;
            case 2:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                break;
            case 3:
                xd xdVar = (xd) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f;
                Activity activity = (Activity) this.e;
                boolean z11 = this.b;
                TLObject tLObject2 = (TLObject) this.h;
                if (tL_error2 != null) {
                    int i13 = 3;
                    if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                            ConnectionsManager.getInstance(xdVar.p0).sendRequest(new TL_account.getPassword(), new k8(xdVar, twoStepVerificationActivity2, z11, i13), 8);
                            break;
                        } else {
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.t0();
                                twoStepVerificationActivity2.finishFragment();
                            }
                            org.telegram.ui.Components.cc.d0(tL_error2);
                            break;
                        }
                    } else {
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        alertDialog$Builder.a.S = hd.M0(2131751297, null);
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        TextView textView = new TextView(activity);
                        int i14 = org.telegram.ui.ActionBar.j6.j5;
                        org.telegram.ui.ActionBar.q6.U(textView, i14, null);
                        textView.setTextSize(1, 16.0f);
                        textView.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131742864, null)));
                        linearLayout.addView(textView, c8.ja.o(-1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(activity);
                        linearLayout2.setOrientation(0);
                        linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(activity);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.q6.s(imageView, i14, null, mode);
                        TextView textView2 = new TextView(activity);
                        org.telegram.ui.ActionBar.q6.U(textView2, i14, null);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131751300, null)));
                        if (hd.a0) {
                            linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                            linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
                        } else {
                            linearLayout2.addView(imageView, c8.ja.o(-2, -2));
                            linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                        }
                        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
                        linearLayout.addView(e10, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(activity);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        org.telegram.ui.ActionBar.q6.s(imageView2, i14, null, mode);
                        TextView textView3 = new TextView(activity);
                        org.telegram.ui.ActionBar.q6.U(textView3, i14, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView3.setText(org.telegram.messenger.g0.X2(hd.M0(2131751299, null)));
                        if (hd.a0) {
                            e10.addView(textView3, c8.ja.o(-1, -2));
                            i7 = 5;
                            e10.addView(imageView2, c8.ja.r(-2, -2, 5));
                        } else {
                            i7 = 5;
                            e10.addView(imageView2, c8.ja.o(-2, -2));
                            e10.addView(textView3, c8.ja.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                            alertDialog$Builder.k(hd.M0(2131751291, null), new bd(xdVar));
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                        } else {
                            TextView textView4 = new TextView(activity);
                            org.telegram.ui.ActionBar.q6.U(textView4, i14, null);
                            textView4.setTextSize(1, 16.0f);
                            org.telegram.messenger.k5.l(textView4, (hd.a0 ? i7 : 3) | 48, null, 2131751298);
                            linearLayout.addView(textView4, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            alertDialog$Builder.h(hd.M0(2131747831, null), null);
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.showDialog(alertDialog$Builder.a);
                            break;
                        } else {
                            xdVar.n0.showDialog(alertDialog$Builder.a);
                            break;
                        }
                    }
                } else {
                    twoStepVerificationActivity2.t0();
                    twoStepVerificationActivity2.finishFragment();
                    if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        vf.c.t(xdVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject2).url);
                        if (z11) {
                            xdVar.H(true);
                        }
                    }
                    xdVar.J();
                    break;
                }
                break;
            case 4:
                an.X0((an) this.c, (org.telegram.ui.Cells.q1) this.d, this.b, (String) this.e, (TLRPC.User[]) this.f, (CharacterStyle) this.h);
                break;
            case 5:
                an anVar = (an) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                boolean[] zArr = (boolean[]) this.e;
                boolean z12 = this.b;
                gj gjVar = (gj) this.f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    t1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z12) {
                        anVar.createArticleViewer(false).L(gjVar, webPage, null, null);
                        break;
                    } else {
                        try {
                            org.telegram.messenger.g0.u2(gjVar, anVar.getParentActivity(), anVar.Aa, false);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            anVar.M6(gjVar);
                            return;
                        }
                    }
                }
                break;
            case 6:
                int i15 = 16;
                eo eoVar = (eo) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.e;
                TLObject tLObject3 = (TLObject) this.h;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                boolean z13 = this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                go goVar = eoVar.a;
                ho hoVar = goVar.i3;
                hoVar.Q.remove(tL_channels_toggleUsername.username);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    goVar.z1(tL_username, !z13, false);
                } else if (tL_error3 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error3.text)) {
                    goVar.z1(tL_username, z13, true);
                    hoVar.b0();
                } else {
                    org.telegram.messenger.g0.h3(new m6(eoVar, tL_username, z13, i15));
                }
                hoVar.getMessagesController().u5(hoVar.Y, tL_username.username, tL_username.active);
                break;
            case 7:
                ((ly) this.c).K((ph.a) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.e, (TLRPC.Document) this.f, this.b, true);
                break;
            case 8:
                vs vsVar = (vs) this.c;
                TLObject tLObject4 = (TLObject) this.h;
                hi.d dVar = (hi.d) this.e;
                boolean z14 = this.b;
                HashSet hashSet = (HashSet) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                if (tLObject4 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    np.s1(vsVar.a).Y3(updates.users, false);
                    np.s1(vsVar.a).S3(updates.chats, false);
                    ArrayList y02 = np.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i16 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i16 < size) {
                        Object obj = y02.get(i16);
                        i16++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.ui.Components.voip.u(i10, vsVar, updates));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        vsVar.dismiss();
                        org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, vsVar.a, tL_inputGroupCall, z14, groupCall, hashSet);
                        break;
                    } else {
                        vsVar.Y1 = false;
                        dVar.setLoading(false);
                        break;
                    }
                } else if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    np.s1(vsVar.a).Y3(groupcall.users, false);
                    np.s1(vsVar.a).S3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        vsVar.Y1 = false;
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        vsVar.dismiss();
                        org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, vsVar.a, tL_inputGroupCall2, z14, groupcall.call, hashSet);
                        break;
                    }
                } else if (tL_error4 != null) {
                    org.telegram.ui.Cells.y0.q(vsVar.F, vsVar.J0, tL_error4, false);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                boolean z15 = this.b;
                org.telegram.messenger.q5 q5Var = org.telegram.ui.Wallet.ea.a;
                int i17 = 0;
                while (true) {
                    int i18 = ns.K4;
                    if (i17 < 288) {
                        int i19 = i17 * ns.L4;
                        int i20 = 8;
                        for (int i21 = 0; i21 < 288; i21++) {
                            int i22 = i19 + i21;
                            i20 = (iArr[i22] >>> 24) >= 128 ? 0 : Math.min(i20 + 1, 8);
                            iArr3[i22] = i20;
                        }
                        int i23 = 8;
                        while (i18 >= 0) {
                            int i24 = i19 + i18;
                            i23 = iArr3[i24] == 0 ? 0 : Math.min(i23 + 1, 8);
                            if (i23 < iArr3[i24]) {
                                iArr3[i24] = i23;
                            }
                            i18--;
                        }
                        i17++;
                    } else {
                        int i25 = 0;
                        while (i25 < 288) {
                            for (int i26 = i11; i26 < 288; i26++) {
                                iArr4[i26] = iArr3[(i26 * ns.L4) + i25];
                            }
                            int i27 = i11;
                            while (i27 < 288) {
                                int min = Math.min(i18, i27 + 8);
                                int i28 = 128;
                                for (int max = Math.max(i11, i27 - 8); max <= min; max++) {
                                    int i29 = iArr4[max];
                                    if (i29 < 8) {
                                        int i30 = max - i27;
                                        int i31 = (i30 * i30) + (i29 * i29);
                                        if (i31 < i28) {
                                            i28 = i31;
                                        }
                                    }
                                }
                                iArr3[(i27 * ns.L4) + i25] = org.telegram.ui.Wallet.ea.b[i28];
                                i27++;
                                i11 = 0;
                                i18 = ns.K4;
                            }
                            i25++;
                            i11 = 0;
                            i18 = ns.K4;
                        }
                        int i32 = 0;
                        while (i32 < 82944) {
                            int i33 = iArr[i32];
                            int i34 = i33 >>> 24;
                            int max2 = Math.max(iArr3[i32], i34);
                            if (i34 != 255) {
                                if (i34 == 0) {
                                    i33 = (max2 << 24) | 16777215;
                                } else {
                                    int i35 = ((255 - i34) * max2) / ns.e4;
                                    int i36 = i34 + i35;
                                    int i37 = ((i33 >> 16) & ns.e4) * i34;
                                    int i38 = i35 * ns.e4;
                                    c10 = c11;
                                    i33 = ((((i33 & ns.e4) * i34) + i38) / i36) | ((((((i33 >> 8) & ns.e4) * i34) + i38) / i36) << 8) | (i36 << 24) | (((i37 + i38) / i36) << 16);
                                    iArr2[i32] = i33;
                                    i32++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i32] = i33;
                            i32++;
                            c11 = c10;
                        }
                        if (z15) {
                            int i39 = 0;
                            for (int i40 = 0; i40 < 82944; i40 += 7) {
                                if ((iArr2[i40] >>> 24) > 0) {
                                    i39++;
                                }
                            }
                            if (i39 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, ns.L4, ns.L4, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                bitmap = Bitmap.createBitmap(ns.G2, ns.G2, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(b8Var, iArr2, bitmap, 21));
                                break;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(b8Var, iArr2, bitmap, 21));
                    }
                }
        }
    }

    public /* synthetic */ m3(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z10;
    }

    public /* synthetic */ m3(xd xdVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.a = 3;
        this.c = xdVar;
        this.d = tL_error;
        this.f = twoStepVerificationActivity;
        this.e = activity;
        this.b = z10;
        this.h = tLObject;
    }

    public /* synthetic */ m3(an anVar, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, boolean z10, gj gjVar, TLRPC.TL_webPage tL_webPage) {
        this.a = 5;
        this.c = anVar;
        this.d = t1Var;
        this.e = zArr;
        this.b = z10;
        this.f = gjVar;
        this.h = tL_webPage;
    }

    public /* synthetic */ m3(an anVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 4;
        this.c = anVar;
        this.d = q1Var;
        this.b = z10;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }

    public /* synthetic */ m3(eo eoVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.a = 6;
        this.c = eoVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f = tL_username;
        this.b = z10;
        this.d = tL_error;
    }

    public /* synthetic */ m3(ly lyVar, ph.a aVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.a = 7;
        this.c = lyVar;
        this.d = aVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f = document;
        this.b = z10;
    }

    public /* synthetic */ m3(vs vsVar, TLObject tLObject, hi.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.c = vsVar;
        this.h = tLObject;
        this.e = dVar;
        this.b = z10;
        this.f = hashSet;
        this.d = tL_error;
    }
}
