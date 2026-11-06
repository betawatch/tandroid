package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.l51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.co;
import org.telegram.ui.fo;
import org.telegram.ui.go;
import org.telegram.ui.ss;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ l4(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z9;
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
                k7 k7Var = (k7) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                c20 c20Var = (c20) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z9 = this.b;
                TLObject tLObject = (TLObject) this.h;
                if (k7Var.getContext() != null) {
                    if (tL_error != null && c20Var != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                        c20Var.a(Boolean.TRUE);
                        break;
                    } else {
                        if (c20Var != null) {
                            c20Var.a(Boolean.FALSE);
                        }
                        if (tL_error != null) {
                            k7Var.Q1(tL_error, twoStepVerificationActivity, z9);
                            break;
                        } else {
                            if (twoStepVerificationActivity != null) {
                                twoStepVerificationActivity.t0();
                                twoStepVerificationActivity.finishFragment();
                            }
                            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                                vf.c.v(k7Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url, false);
                                break;
                            } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                                TL_stars.TL_starGiftUnique H1 = k7Var.H1();
                                org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(k7Var.a);
                                org.telegram.ui.Wallet.h hVar = x10.z;
                                String str = H1 != null ? H1.gift_address : null;
                                org.telegram.messenger.g0.r(hVar);
                                x10.x = str;
                                x10.y = 0;
                                if (x10.o == null) {
                                    x10.o = new org.telegram.ui.Wallet.f0(x10);
                                }
                                org.telegram.ui.Wallet.f0 f0Var = x10.o;
                                if (!f0Var.j) {
                                    f0Var.b();
                                    f0Var.f(true);
                                }
                                x10.B().g();
                                x10.E();
                                int i11 = x10.y;
                                long[] jArr = org.telegram.ui.Wallet.n0.P;
                                if (i11 < 7) {
                                    x10.y = i11 + 1;
                                    org.telegram.messenger.g0.i3(hVar, jArr[i11]);
                                }
                                if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                                    org.telegram.messenger.g0.h3(new aa.s((Object) null, (Object) H1.getDocument(), (Object) org.telegram.messenger.hd.M0(2131750100, null), 13));
                                }
                                k7Var.dismiss();
                                break;
                            } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                org.telegram.ui.Components.hc.b0("NULL_ERROR");
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                l2.g1 g1Var = (l2.g1) this.c;
                Pair pair = (Pair) this.d;
                g1Var.b.h.r(((Integer) pair.first).intValue(), (x2.g0) pair.second, (x2.u) this.e, (x2.c0) this.f, (IOException) this.h, this.b);
                break;
            case 2:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                break;
            case 3:
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f;
                Activity activity = (Activity) this.e;
                boolean z10 = this.b;
                TLObject tLObject2 = (TLObject) this.h;
                if (tL_error2 != null) {
                    int i12 = 3;
                    if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                            ConnectionsManager.getInstance(zdVar.o0).sendRequest(new TL_account.getPassword(), new u9(zdVar, twoStepVerificationActivity2, z10, i12), 8);
                            break;
                        } else {
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.t0();
                                twoStepVerificationActivity2.finishFragment();
                            }
                            org.telegram.ui.Components.hc.d0(tL_error2);
                            break;
                        }
                    } else {
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131751298, null);
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder.o(linearLayout);
                        TextView textView = new TextView(activity);
                        int i13 = org.telegram.ui.ActionBar.k6.j5;
                        org.telegram.ui.ActionBar.r6.V(textView, i13, null);
                        textView.setTextSize(1, 16.0f);
                        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131742865, null)));
                        linearLayout.addView(textView, c8.ha.o(-1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(activity);
                        linearLayout2.setOrientation(0);
                        linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView = new ImageView(activity);
                        imageView.setImageResource(R.drawable.list_circle);
                        imageView.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.r6.t(imageView, i13, null, mode);
                        TextView textView2 = new TextView(activity);
                        org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                        textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751301, null)));
                        if (org.telegram.messenger.hd.a0) {
                            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                            linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
                        } else {
                            linearLayout2.addView(imageView, c8.ha.o(-2, -2));
                            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                        }
                        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
                        linearLayout.addView(e10, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        ImageView imageView2 = new ImageView(activity);
                        imageView2.setImageResource(R.drawable.list_circle);
                        imageView2.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
                        org.telegram.ui.ActionBar.r6.t(imageView2, i13, null, mode);
                        TextView textView3 = new TextView(activity);
                        org.telegram.ui.ActionBar.r6.V(textView3, i13, null);
                        textView3.setTextSize(1, 16.0f);
                        textView3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
                        textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751300, null)));
                        if (org.telegram.messenger.hd.a0) {
                            e10.addView(textView3, c8.ha.o(-1, -2));
                            i7 = 5;
                            e10.addView(imageView2, c8.ha.r(-2, -2, 5));
                        } else {
                            i7 = 5;
                            e10.addView(imageView2, c8.ha.o(-2, -2));
                            e10.addView(textView3, c8.ha.o(-1, -2));
                        }
                        if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751292, null), new org.telegram.ui.cd(zdVar));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        } else {
                            TextView textView4 = new TextView(activity);
                            org.telegram.ui.ActionBar.r6.V(textView4, i13, null);
                            textView4.setTextSize(1, 16.0f);
                            org.telegram.messenger.k5.m(textView4, (org.telegram.messenger.hd.a0 ? i7 : 3) | 48, null, 2131751299);
                            linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747830, null), null);
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.showDialog(alertDialog$Builder.a);
                            break;
                        } else {
                            zdVar.m0.showDialog(alertDialog$Builder.a);
                            break;
                        }
                    }
                } else {
                    twoStepVerificationActivity2.t0();
                    twoStepVerificationActivity2.finishFragment();
                    if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        vf.c.t(zdVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject2).url);
                        if (z10) {
                            zdVar.H(true);
                        }
                    }
                    zdVar.J();
                    break;
                }
                break;
            case 4:
                an.A0((an) this.c, (org.telegram.ui.Cells.q1) this.d, this.b, (String) this.e, (TLRPC.User[]) this.f, (CharacterStyle) this.h);
                break;
            case 5:
                an anVar = (an) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                boolean[] zArr = (boolean[]) this.e;
                boolean z11 = this.b;
                ij ijVar = (ij) this.f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    u1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z11) {
                        anVar.createArticleViewer(false).L(ijVar, webPage, null, null);
                        break;
                    } else {
                        try {
                            org.telegram.messenger.g0.u2(ijVar, anVar.getParentActivity(), anVar.xa, false);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            anVar.L6(ijVar);
                            return;
                        }
                    }
                }
                break;
            case 6:
                int i14 = 16;
                co coVar = (co) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.e;
                TLObject tLObject3 = (TLObject) this.h;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                boolean z12 = this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                fo foVar = coVar.a;
                go goVar = foVar.h3;
                goVar.P.remove(tL_channels_toggleUsername.username);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    foVar.z1(tL_username, !z12, false);
                } else if (tL_error3 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error3.text)) {
                    foVar.z1(tL_username, z12, true);
                    goVar.b0();
                } else {
                    org.telegram.messenger.g0.h3(new u7(coVar, tL_username, z12, i14));
                }
                goVar.getMessagesController().t5(goVar.X, tL_username.username, tL_username.active);
                break;
            case 7:
                ((gy) this.c).J((ph.a) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.e, (TLRPC.Document) this.f, this.b, true);
                break;
            case 8:
                ss ssVar = (ss) this.c;
                TLObject tLObject4 = (TLObject) this.h;
                fi.d dVar = (fi.d) this.e;
                boolean z13 = this.b;
                HashSet hashSet = (HashSet) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                if (tLObject4 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    qp.s1(ssVar.a).Y3(updates.users, false);
                    qp.s1(ssVar.a).S3(updates.chats, false);
                    ArrayList y02 = qp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i15 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i15 < size) {
                        Object obj = y02.get(i15);
                        i15++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new l51(10, ssVar, updates));
                    if (groupCall != null && LaunchActivity.G1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        ssVar.dismiss();
                        org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, ssVar.a, tL_inputGroupCall, z13, groupCall, hashSet);
                        break;
                    } else {
                        ssVar.U1 = false;
                        dVar.setLoading(false);
                        break;
                    }
                } else if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    qp.s1(ssVar.a).Y3(groupcall.users, false);
                    qp.s1(ssVar.a).S3(groupcall.chats, false);
                    if (LaunchActivity.G1 == null) {
                        ssVar.U1 = false;
                        dVar.setLoading(false);
                        break;
                    } else {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        ssVar.dismiss();
                        org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, ssVar.a, tL_inputGroupCall2, z13, groupcall.call, hashSet);
                        break;
                    }
                } else if (tL_error4 != null) {
                    org.telegram.ui.Cells.f1.r(ssVar.E, ssVar.I0, tL_error4, false);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                boolean z14 = this.b;
                org.telegram.messenger.q5 q5Var = org.telegram.ui.Wallet.ca.a;
                int i16 = 0;
                while (true) {
                    int i17 = qs.K4;
                    if (i16 < 288) {
                        int i18 = i16 * qs.L4;
                        int i19 = 8;
                        for (int i20 = 0; i20 < 288; i20++) {
                            int i21 = i18 + i20;
                            i19 = (iArr[i21] >>> 24) >= 128 ? 0 : Math.min(i19 + 1, 8);
                            iArr3[i21] = i19;
                        }
                        int i22 = 8;
                        while (i17 >= 0) {
                            int i23 = i18 + i17;
                            i22 = iArr3[i23] == 0 ? 0 : Math.min(i22 + 1, 8);
                            if (i22 < iArr3[i23]) {
                                iArr3[i23] = i22;
                            }
                            i17--;
                        }
                        i16++;
                    } else {
                        int i24 = 0;
                        while (i24 < 288) {
                            for (int i25 = i10; i25 < 288; i25++) {
                                iArr4[i25] = iArr3[(i25 * qs.L4) + i24];
                            }
                            int i26 = i10;
                            while (i26 < 288) {
                                int min = Math.min(i17, i26 + 8);
                                int i27 = 128;
                                for (int max = Math.max(i10, i26 - 8); max <= min; max++) {
                                    int i28 = iArr4[max];
                                    if (i28 < 8) {
                                        int i29 = max - i26;
                                        int i30 = (i29 * i29) + (i28 * i28);
                                        if (i30 < i27) {
                                            i27 = i30;
                                        }
                                    }
                                }
                                iArr3[(i26 * qs.L4) + i24] = org.telegram.ui.Wallet.ca.b[i27];
                                i26++;
                                i10 = 0;
                                i17 = qs.K4;
                            }
                            i24++;
                            i10 = 0;
                            i17 = qs.K4;
                        }
                        int i31 = 0;
                        while (i31 < 82944) {
                            int i32 = iArr[i31];
                            int i33 = i32 >>> 24;
                            int max2 = Math.max(iArr3[i31], i33);
                            if (i33 != 255) {
                                if (i33 == 0) {
                                    i32 = (max2 << 24) | 16777215;
                                } else {
                                    int i34 = ((255 - i33) * max2) / qs.e4;
                                    int i35 = i33 + i34;
                                    int i36 = ((i32 >> 16) & qs.e4) * i33;
                                    int i37 = i34 * qs.e4;
                                    c10 = c11;
                                    i32 = ((((i32 & qs.e4) * i33) + i37) / i35) | ((((((i32 >> 8) & qs.e4) * i33) + i37) / i35) << 8) | (i35 << 24) | (((i36 + i37) / i35) << 16);
                                    iArr2[i31] = i32;
                                    i31++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i31] = i32;
                            i31++;
                            c11 = c10;
                        }
                        if (z14) {
                            int i38 = 0;
                            for (int i39 = 0; i39 < 82944; i39 += 7) {
                                if ((iArr2[i39] >>> 24) > 0) {
                                    i38++;
                                }
                            }
                            if (i38 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, qs.L4, qs.L4, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                Bitmap createBitmap2 = Bitmap.createBitmap(qs.G2, qs.G2, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(createBitmap2).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                bitmap = createBitmap2;
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(b8Var, iArr2, bitmap, 20));
                                break;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(b8Var, iArr2, bitmap, 20));
                    }
                }
        }
    }

    public /* synthetic */ l4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z9;
    }

    public /* synthetic */ l4(org.telegram.ui.zd zdVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, TLObject tLObject) {
        this.a = 3;
        this.c = zdVar;
        this.d = tL_error;
        this.f = twoStepVerificationActivity;
        this.e = activity;
        this.b = z9;
        this.h = tLObject;
    }

    public /* synthetic */ l4(an anVar, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, boolean z9, ij ijVar, TLRPC.TL_webPage tL_webPage) {
        this.a = 5;
        this.c = anVar;
        this.d = u1Var;
        this.e = zArr;
        this.b = z9;
        this.f = ijVar;
        this.h = tL_webPage;
    }

    public /* synthetic */ l4(an anVar, org.telegram.ui.Cells.q1 q1Var, boolean z9, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = 4;
        this.c = anVar;
        this.d = q1Var;
        this.b = z9;
        this.e = str;
        this.f = userArr;
        this.h = characterStyle;
    }

    public /* synthetic */ l4(co coVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z9, TLRPC.TL_error tL_error) {
        this.a = 6;
        this.c = coVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f = tL_username;
        this.b = z9;
        this.d = tL_error;
    }

    public /* synthetic */ l4(gy gyVar, ph.a aVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z9) {
        this.a = 7;
        this.c = gyVar;
        this.d = aVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f = document;
        this.b = z9;
    }

    public /* synthetic */ l4(ss ssVar, TLObject tLObject, fi.d dVar, boolean z9, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.c = ssVar;
        this.h = tLObject;
        this.e = dVar;
        this.b = z9;
        this.f = hashSet;
        this.d = tL_error;
    }
}
