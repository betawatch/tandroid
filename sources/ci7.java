// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ci7 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0405, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.L1.y) != false) goto L179;
     */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        float height;
        ArrayList<TLRPC.Document> arrayList;
        byte b = this.a;
        int i = 2;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ji7 ji7Var = (ji7) obj2;
                ji7Var.e2 = (String) obj;
                ei7 ei7Var = ji7Var.o2;
                gm.r(ei7Var);
                gm.d3(ei7Var, 100L);
                break;
            case 1:
                gj7 gj7Var = (gj7) obj2;
                View view = (View) obj;
                va vaVar = gj7Var.b;
                if (view instanceof fj7) {
                    vaVar.getClass();
                    int R = RecyclerView.R(view);
                    c6c G = vaVar.g3.G(R);
                    if (G != null) {
                        fj7 fj7Var = (fj7) view;
                        fj7Var.setPosition(gj7Var.b(R));
                        fj7Var.b(gj7Var.f == G.d, true);
                        boolean contains = gj7Var.e.contains(Integer.valueOf(G.d));
                        if (fj7Var.h != contains) {
                            fj7Var.h = contains;
                            fj7Var.invalidate();
                        }
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 2:
                va vaVar2 = (va) obj2;
                View view2 = (View) obj;
                if (view2 instanceof fj7) {
                    r8b r8bVar = (r8b) vaVar2.o3;
                    r8bVar.b.getClass();
                    ((fj7) view2).setPosition(r8bVar.b(RecyclerView.R(view2)));
                    view2.setPressed(false);
                    break;
                }
                break;
            case 3:
                ml7 ml7Var = (ml7) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ml7Var.D0();
                    break;
                }
                break;
            case 4:
                ((View) obj2).invalidate();
                break;
            case 5:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    yr7.s(2131749545, tL_starGiftUnique);
                    break;
                }
                break;
            case 6:
                ((b61) obj2).setLoading(((Boolean) obj).booleanValue());
                break;
            case 7:
                z8b z8bVar = (z8b) ((xv7) obj2);
                v9b v9bVar = z8bVar.u2;
                v9bVar.Y0.p((k47) obj);
                g6b g6bVar = v9bVar.L1;
                if (g6bVar != null && v9bVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(g6bVar.y);
                    boolean z = !isEmpty;
                    ((ae8) v9bVar.k1.c).a(!v9bVar.Y0.j(), false);
                    v9bVar.k1.setVisibility(0);
                    v9bVar.k1.animate().alpha(isEmpty ? 0.0f : 1.0f).withEndAction(new n28((byte) 21, (Object) z8bVar, z)).start();
                }
                if (v9bVar.B0.i()) {
                    ArrayList arrayList2 = v9bVar.B0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (r7 < size) {
                            Object obj3 = arrayList2.get(r7);
                            r7++;
                            g6b g6bVar2 = ((bm2) obj3).n;
                            if (g6bVar2 != null && g6bVar2.K) {
                                break;
                            }
                        }
                    }
                }
                i = -1;
                v9bVar.k0(i, true, true);
                break;
            case 8:
                by7 by7Var = (by7) obj2;
                Integer num = (Integer) obj;
                FrameLayout frameLayout = by7Var.h;
                if (by7Var.getContext() != null) {
                    r7 = by7Var.getContext().getResources().getConfiguration().orientation == 2 ? 1 : 0;
                    int intValue = num.intValue() - gm.n;
                    if (gda.q == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= gm.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((by7Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (r7 != 0 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        d53 d53Var = d53.h;
                        duration.setInterpolator(d53Var).start();
                        by7Var.N.animate().alpha(intValue > gm.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(d53Var);
                        break;
                    }
                }
                break;
            case 9:
                w28 w28Var = (w28) obj2;
                View view3 = (View) obj;
                d38 d38Var = w28Var.q0;
                if (!(view3 instanceof z28)) {
                    if (!(view3 instanceof xib)) {
                        if (!(view3 instanceof v28)) {
                            if (!(view3 instanceof jf5)) {
                                if (!(view3 instanceof j28)) {
                                    if (!(view3 instanceof c38)) {
                                        if (view3 instanceof u28) {
                                            ((u28) view3).updateColors();
                                            break;
                                        }
                                    } else {
                                        w28Var.l((c38) view3);
                                        break;
                                    }
                                } else {
                                    ((j28) view3).d.invalidate();
                                    break;
                                }
                            } else {
                                view3.setBackgroundColor(d38Var.getThemedColor(cmb.c6));
                                break;
                            }
                        } else {
                            view3.setBackgroundColor(d38Var.getThemedColor(cmb.c6));
                            ((v28) view3).updateColors();
                            break;
                        }
                    } else {
                        view3.setBackgroundColor(d38Var.getThemedColor(cmb.c6));
                        ((xib) view3).updateColors();
                        break;
                    }
                } else {
                    view3.setBackgroundColor(d38Var.getThemedColor(cmb.c6));
                    ((z28) view3).updateColors();
                    break;
                }
                break;
            case 10:
                ((r28) obj2).b((Canvas) obj);
                break;
            case 11:
                ((u28) obj2).c.d();
                break;
            case 12:
                oab oabVar = (oab) obj2;
                oabVar.k1 = false;
                oabVar.U();
                break;
            case 13:
                d68 d68Var = (d68) obj2;
                d68Var.E1.b(d68Var.H1, true, 0, ((Long) obj).longValue());
                d68Var.dismiss();
                break;
            case 14:
                lf8 lf8Var = (lf8) obj2;
                nf8 nf8Var = (nf8) obj;
                lf8Var.h = nf8Var;
                lf8Var.c.a(nf8Var, true);
                gm.d3(new q78(lf8Var, (byte) 20), 200L);
                break;
            case 15:
                ((hs1) obj2).E(((Integer) obj).intValue());
                break;
            case 16:
                wh8 wh8Var = (wh8) obj2;
                wh8Var.r = ((Integer) obj).intValue();
                View B1 = wh8Var.d.B1(4);
                if (B1 instanceof njb) {
                    njb njbVar = (njb) B1;
                    if (njbVar.getFixedSize() <= 0 && wh8Var.r > 0) {
                        njbVar.setText(wh8Var.a0());
                        wh8Var.Z(true);
                        break;
                    }
                }
                wh8Var.d.g3.O(true);
                wh8Var.Z(true);
                break;
            case 17:
                f6b f6bVar = (f6b) obj;
                ncc nccVar = ((cl8) obj2).n;
                if (nccVar != null) {
                    nccVar.setHDRInfo(f6bVar);
                    break;
                }
                break;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList3 = privacySettingsActivity.Q;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                break;
            case 19:
                l66[] l66VarArr = (l66[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.e7;
                ViewPropertyAnimator scaleY = l66VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                d53 d53Var2 = d53.h;
                wi8.t(scaleY, d53Var2, 600L);
                l66VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(d53Var2).setDuration(600L).start();
                break;
            case 20:
                tx8 tx8Var = (tx8) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tx8Var.E == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        tx8Var.G = true;
                    } else {
                        tx8Var.E = tL_messages_stickerSet;
                    }
                    tx8Var.e();
                    break;
                }
                break;
            case 21:
                d dVar = (d) obj2;
                Long l = (Long) obj;
                if (!dVar.isFinished) {
                    if (l != null && l.longValue() != Long.MAX_VALUE) {
                        dVar.presentFragment(ProfileActivity.S2(l.longValue()), true);
                        break;
                    } else {
                        gm.c3(new bo6((byte) 14));
                        break;
                    }
                }
                break;
            case 22:
                my8 my8Var = (my8) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                wy8 wy8Var = my8Var.b;
                if (!my8Var.F && tL_exportedContactToken != null) {
                    my8Var.r = tL_exportedContactToken;
                    my8Var.s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = my8Var.c.b;
                    if (!TextUtils.equals(wy8Var.f, str2) || wy8Var.h) {
                        wy8Var.f = str2;
                        wy8Var.h = false;
                        wy8Var.H5 = null;
                        wy8Var.I5 = 0;
                    }
                    if (!TextUtils.equals(wy8Var.d, str)) {
                        wy8Var.d = str;
                        Utilities.e.c(new rn3(str, new oy8(wy8Var, str, (byte) 0)));
                    }
                    wy8Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 23:
                wy8 wy8Var2 = (wy8) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null && (arrayList = tL_messages_stickerSet2.documents) != null && !arrayList.isEmpty()) {
                    wy8Var2.p8 = tL_messages_stickerSet2.documents.get(0);
                }
                wy8Var2.invalidate();
                break;
            case 24:
                lz8 lz8Var = (lz8) obj2;
                lz8Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", lz8Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                yv1 yv1Var = new yv1(bundle);
                yv1Var.Z9 = true;
                lz8Var.presentFragment(yv1Var);
                break;
            case 25:
                gm.t1((a52) obj2);
                gm.d3((Runnable) obj, 80L);
                break;
            case 26:
                wz8 wz8Var = (wz8) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Matrix matrix = wz8Var.L;
                if (!wz8Var.U) {
                    wz8Var.J = bitmap;
                    Bitmap bitmap2 = wz8Var.J;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    wz8Var.K = new BitmapShader(bitmap2, tileMode, tileMode);
                    Paint paint = new Paint(2);
                    wz8Var.M = paint;
                    paint.setShader(wz8Var.K);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    gm.i(colorMatrix, cmb.I.o() ? 0.08f : 1.25f);
                    gm.h(colorMatrix, cmb.I.o() ? 0.02f : -0.15f);
                    wz8Var.M.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    wz8Var.K.setLocalMatrix(matrix);
                    break;
                } else {
                    wz8Var.J.recycle();
                    break;
                }
            case 27:
                y39 y39Var = (y39) obj2;
                y39Var.V1.setLoading(false);
                yn0.j(y39Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 28:
                ((Boolean) obj).getClass();
                ub9 ub9Var = ((xb9) obj2).d;
                if (ub9Var != null) {
                    ub9Var.run();
                    break;
                }
                break;
            default:
                ((jf9) obj2).Q.Q1((TL_iv.RichMessage) obj);
                break;
        }
    }
}
