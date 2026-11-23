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
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ty;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bd;
import org.telegram.ui.bn;
import org.telegram.ui.go;
import org.telegram.ui.io;
import org.telegram.ui.jo;
import org.telegram.ui.ss;
import org.telegram.ui.ws;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ o3(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
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
        char c11 = '\b';
        int i10 = 0;
        switch (this.a) {
            case 0:
                int i11 = 24;
                f6 f6Var = (f6) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                y10 y10Var = (y10) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z10 = this.b;
                TLObject tLObject = (TLObject) this.h;
                long j3 = f6Var.T1;
                if (f6Var.getContext() != null) {
                    if (tL_error != null && y10Var != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                        y10Var.a(Boolean.TRUE);
                        break;
                    } else {
                        if (y10Var != null) {
                            y10Var.a(Boolean.FALSE);
                        }
                        if (tL_error != null) {
                            f6Var.Y1(tL_error, twoStepVerificationActivity, z10);
                            break;
                        } else {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                                vf.c.v(f6Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url, false);
                                break;
                            } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                                TL_stars.TL_starGiftUnique M1 = f6Var.M1();
                                org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(f6Var.a);
                                String str = M1 != null ? M1.gift_address : null;
                                String str2 = M1 != null ? M1.slug : null;
                                org.telegram.ui.Wallet.h hVar = D.B;
                                org.telegram.messenger.g0.r(hVar);
                                D.y = str;
                                D.z = str2;
                                D.A = 0;
                                D.B().e();
                                D.H().g();
                                D.K();
                                int i12 = D.A;
                                long[] jArr = org.telegram.ui.Wallet.u0.S;
                                if (i12 < 7) {
                                    D.A = i12 + 1;
                                    org.telegram.messenger.g0.h3(hVar, jArr[i12]);
                                }
                                long e10 = k10.i(f6Var.a).e();
                                y8.y(f6Var.a, false).O(e10);
                                if (j3 != 0 && j3 != e10) {
                                    y8.y(f6Var.a, false).O(j3);
                                }
                                if (M1 != null && !TextUtils.isEmpty(M1.slug)) {
                                    int i13 = f6Var.a;
                                    String str3 = M1.slug;
                                    if (!TextUtils.isEmpty(str3)) {
                                        org.telegram.messenger.g0.h3(new bi.r4(i13, 0, str3, true), bi.x4.b[0]);
                                    }
                                    org.telegram.messenger.g0.g3(new aa.r((Object) new ai.n(8), (Object) M1.getDocument(), (Object) hd.N0(2131750084, null), i11));
                                }
                                f6Var.dismiss();
                                break;
                            } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                org.telegram.ui.Components.lc.c0("NULL_ERROR");
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                l2.c1 c1Var = (l2.c1) this.c;
                Pair pair = (Pair) this.d;
                c1Var.b.h.r(((Integer) pair.first).intValue(), (x2.g0) pair.second, (x2.u) this.e, (x2.c0) this.f, (IOException) this.h, this.b);
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
                    int i14 = 3;
                    if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                            ConnectionsManager.getInstance(xdVar.p0).sendRequest(new TL_account.getPassword(), new o8(xdVar, twoStepVerificationActivity2, z11, i14), 8);
                            break;
                        } else {
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.t0();
                                twoStepVerificationActivity2.finishFragment();
                            }
                            org.telegram.ui.Components.lc.e0(tL_error2);
                            break;
                        }
                    } else {
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        alertDialog$Builder.a.S = hd.N0(2131751285, null);
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        TextView textView = new TextView(activity);
                        int i15 = org.telegram.ui.ActionBar.m6.j5;
                        org.telegram.ui.ActionBar.t6.U(textView, i15, null);
                        textView.setTextSize(1, 16.0f);
                        textView.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView.setText(org.telegram.messenger.g0.W2(hd.N0(2131742598, null)));
                        linearLayout.addView(textView, c8.ma.o(-1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(activity);
                        linearLayout2.setOrientation(0);
                        linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(activity);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.t6.s(imageView, i15, null, mode);
                        TextView textView2 = new TextView(activity);
                        org.telegram.ui.ActionBar.t6.U(textView2, i15, null);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView2.setText(org.telegram.messenger.g0.W2(hd.N0(2131751288, null)));
                        if (hd.a0) {
                            linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                            linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
                        } else {
                            linearLayout2.addView(imageView, c8.ma.o(-2, -2));
                            linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                        }
                        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 0);
                        linearLayout.addView(f10, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(activity);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        org.telegram.ui.ActionBar.t6.s(imageView2, i15, null, mode);
                        TextView textView3 = new TextView(activity);
                        org.telegram.ui.ActionBar.t6.U(textView3, i15, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((hd.a0 ? 5 : 3) | 48);
                        textView3.setText(org.telegram.messenger.g0.W2(hd.N0(2131751287, null)));
                        if (hd.a0) {
                            f10.addView(textView3, c8.ma.o(-1, -2));
                            i7 = 5;
                            f10.addView(imageView2, c8.ma.r(-2, -2, 5));
                        } else {
                            i7 = 5;
                            f10.addView(imageView2, c8.ma.o(-2, -2));
                            f10.addView(textView3, c8.ma.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                            alertDialog$Builder.k(hd.N0(2131751279, null), new bd(xdVar));
                            alertDialog$Builder.h(hd.N0(2131752577, null), null);
                        } else {
                            TextView textView4 = new TextView(activity);
                            org.telegram.ui.ActionBar.t6.U(textView4, i15, null);
                            textView4.setTextSize(1, 16.0f);
                            org.telegram.messenger.f3.k(textView4, (hd.a0 ? i7 : 3) | 48, null, 2131751286);
                            linearLayout.addView(textView4, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            alertDialog$Builder.h(hd.N0(2131747637, null), null);
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
                bn.X0((bn) this.c, (org.telegram.ui.Cells.r1) this.d, this.b, (String) this.e, (TLRPC.User[]) this.f, (CharacterStyle) this.h);
                break;
            case 5:
                bn bnVar = (bn) this.c;
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
                        bnVar.createArticleViewer(false).L(gjVar, webPage, null, null);
                        break;
                    } else {
                        try {
                            org.telegram.messenger.g0.u2(gjVar, bnVar.getParentActivity(), bnVar.Ba, false);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            bnVar.M6(gjVar);
                            return;
                        }
                    }
                }
                break;
            case 6:
                int i16 = 16;
                go goVar = (go) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.e;
                TLObject tLObject3 = (TLObject) this.h;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                boolean z13 = this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                io ioVar = goVar.a;
                jo joVar = ioVar.i3;
                joVar.Q.remove(tL_channels_toggleUsername.username);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    ioVar.z1(tL_username, !z13, false);
                } else if (tL_error3 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error3.text)) {
                    ioVar.z1(tL_username, z13, true);
                    joVar.b0();
                } else {
                    org.telegram.messenger.g0.g3(new p6(goVar, tL_username, z13, i16));
                }
                joVar.getMessagesController().F5(joVar.Y, tL_username.username, tL_username.active);
                break;
            case 7:
                ((ty) this.c).K((ph.a) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.e, (TLRPC.Document) this.f, this.b, true);
                break;
            case 8:
                ws wsVar = (ws) this.c;
                TLObject tLObject4 = (TLObject) this.h;
                hi.e eVar = (hi.e) this.e;
                boolean z14 = this.b;
                HashSet hashSet = (HashSet) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                if (tLObject4 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    np.u1(wsVar.a).f4(updates.users, false);
                    np.u1(wsVar.a).Z3(updates.chats, false);
                    ArrayList A0 = np.A0(updates, TL_update.TL_updateGroupCall.class);
                    int size = A0.size();
                    int i17 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i17 < size) {
                        Object obj = A0.get(i17);
                        i17++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new ss(2, wsVar, updates));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        wsVar.dismiss();
                        org.telegram.ui.Components.voip.b2.g(LaunchActivity.H1, wsVar.a, tL_inputGroupCall, z14, groupCall, hashSet);
                        break;
                    } else {
                        wsVar.Y1 = false;
                        eVar.setLoading(false);
                        break;
                    }
                } else if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    np.u1(wsVar.a).f4(groupcall.users, false);
                    np.u1(wsVar.a).Z3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        wsVar.Y1 = false;
                        eVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        wsVar.dismiss();
                        org.telegram.ui.Components.voip.b2.g(LaunchActivity.H1, wsVar.a, tL_inputGroupCall2, z14, groupcall.call, hashSet);
                        break;
                    }
                } else if (tL_error4 != null) {
                    org.telegram.ui.Cells.c0.t(wsVar.F, wsVar.J0, tL_error4, false);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.q8 q8Var = (org.telegram.ui.Wallet.q8) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                boolean z15 = this.b;
                org.telegram.messenger.r5 r5Var = org.telegram.ui.Wallet.sa.a;
                int i18 = 0;
                while (true) {
                    int i19 = ls.K4;
                    if (i18 < 288) {
                        int i20 = i18 * ls.L4;
                        int i21 = 8;
                        for (int i22 = 0; i22 < 288; i22++) {
                            int i23 = i20 + i22;
                            i21 = (iArr[i23] >>> 24) >= 128 ? 0 : Math.min(i21 + 1, 8);
                            iArr3[i23] = i21;
                        }
                        int i24 = 8;
                        while (i19 >= 0) {
                            int i25 = i20 + i19;
                            i24 = iArr3[i25] == 0 ? 0 : Math.min(i24 + 1, 8);
                            if (i24 < iArr3[i25]) {
                                iArr3[i25] = i24;
                            }
                            i19--;
                        }
                        i18++;
                    } else {
                        int i26 = 0;
                        while (i26 < 288) {
                            for (int i27 = i10; i27 < 288; i27++) {
                                iArr4[i27] = iArr3[(i27 * ls.L4) + i26];
                            }
                            int i28 = i10;
                            while (i28 < 288) {
                                int min = Math.min(i19, i28 + 8);
                                int i29 = 128;
                                for (int max = Math.max(i10, i28 - 8); max <= min; max++) {
                                    int i30 = iArr4[max];
                                    if (i30 < 8) {
                                        int i31 = max - i28;
                                        int i32 = (i31 * i31) + (i30 * i30);
                                        if (i32 < i29) {
                                            i29 = i32;
                                        }
                                    }
                                }
                                iArr3[(i28 * ls.L4) + i26] = org.telegram.ui.Wallet.sa.b[i29];
                                i28++;
                                i10 = 0;
                                i19 = ls.K4;
                            }
                            i26++;
                            i10 = 0;
                            i19 = ls.K4;
                        }
                        int i33 = 0;
                        while (i33 < 82944) {
                            int i34 = iArr[i33];
                            int i35 = i34 >>> 24;
                            int max2 = Math.max(iArr3[i33], i35);
                            if (i35 != 255) {
                                if (i35 == 0) {
                                    i34 = (max2 << 24) | 16777215;
                                } else {
                                    int i36 = ((255 - i35) * max2) / ls.e4;
                                    int i37 = i35 + i36;
                                    int i38 = ((i34 >> 16) & ls.e4) * i35;
                                    int i39 = i36 * ls.e4;
                                    c10 = c11;
                                    i34 = ((((i34 & ls.e4) * i35) + i39) / i37) | ((((((i34 >> 8) & ls.e4) * i35) + i39) / i37) << 8) | (i37 << 24) | (((i38 + i39) / i37) << 16);
                                    iArr2[i33] = i34;
                                    i33++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i33] = i34;
                            i33++;
                            c11 = c10;
                        }
                        if (z15) {
                            int i40 = 0;
                            for (int i41 = 0; i41 < 82944; i41 += 7) {
                                if ((iArr2[i41] >>> 24) > 0) {
                                    i40++;
                                }
                            }
                            if (i40 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, ls.L4, ls.L4, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                bitmap = Bitmap.createBitmap(ls.G2, ls.G2, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.p(q8Var, iArr2, bitmap, 21));
                                break;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.p(q8Var, iArr2, bitmap, 21));
                    }
                }
        }
    }

    public /* synthetic */ o3(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z10;
    }

    public /* synthetic */ o3(xd xdVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.a = 3;
        this.c = xdVar;
        this.d = tL_error;
        this.f = twoStepVerificationActivity;
        this.e = activity;
        this.b = z10;
        this.h = tLObject;
    }

    public /* synthetic */ o3(bn bnVar, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, boolean z10, gj gjVar, TLRPC.TL_webPage tL_webPage) {
        this.a = 5;
        this.c = bnVar;
        this.d = t1Var;
        this.e = zArr;
        this.b = z10;
        this.f = gjVar;
        this.h = tL_webPage;
    }

    public /* synthetic */ o3(bn bnVar, org.telegram.ui.Cells.r1 r1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 4;
        this.c = bnVar;
        this.d = r1Var;
        this.b = z10;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }

    public /* synthetic */ o3(go goVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.a = 6;
        this.c = goVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f = tL_username;
        this.b = z10;
        this.d = tL_error;
    }

    public /* synthetic */ o3(ty tyVar, ph.a aVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.a = 7;
        this.c = tyVar;
        this.d = aVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f = document;
        this.b = z10;
    }

    public /* synthetic */ o3(ws wsVar, TLObject tLObject, hi.e eVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.c = wsVar;
        this.h = tLObject;
        this.e = eVar;
        this.b = z10;
        this.f = hashSet;
        this.d = tL_error;
    }
}
