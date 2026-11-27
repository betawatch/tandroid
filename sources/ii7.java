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
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ii7 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ii7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x03d7, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.L1.y) != false) goto L171;
     */
    @Override // pcc
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
                pi7 pi7Var = (pi7) obj2;
                pi7Var.e2 = (String) obj;
                ki7 ki7Var = pi7Var.o2;
                hl.r(ki7Var);
                hl.d3(ki7Var, 100L);
                break;
            case 1:
                mj7 mj7Var = (mj7) obj2;
                View view = (View) obj;
                wa waVar = mj7Var.b;
                if (view instanceof lj7) {
                    waVar.getClass();
                    int S = RecyclerView.S(view);
                    b8c G = waVar.g3.G(S);
                    if (G != null) {
                        lj7 lj7Var = (lj7) view;
                        lj7Var.setPosition(mj7Var.b(S));
                        lj7Var.b(mj7Var.f == G.d, true);
                        boolean contains = mj7Var.e.contains(Integer.valueOf(G.d));
                        if (lj7Var.h != contains) {
                            lj7Var.h = contains;
                            lj7Var.invalidate();
                        }
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 2:
                wa waVar2 = (wa) obj2;
                View view2 = (View) obj;
                if (view2 instanceof lj7) {
                    nab nabVar = (nab) waVar2.o3;
                    nabVar.b.getClass();
                    ((lj7) view2).setPosition(nabVar.b(RecyclerView.S(view2)));
                    view2.setPressed(false);
                    break;
                }
                break;
            case 3:
                rl7 rl7Var = (rl7) obj2;
                if (((Boolean) obj).booleanValue()) {
                    rl7Var.E0();
                    break;
                }
                break;
            case 4:
                lm7 lm7Var = (lm7) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                HashSet hashSet = lm7Var.d;
                if (!hashSet.remove(num)) {
                    hashSet.add(num);
                }
                lm7.L0(lm7Var.b[0]);
                lm7Var.M0(true);
                break;
            case 5:
                ((View) obj2).invalidate();
                break;
            case 6:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    vs7.s(2131749557, tL_starGiftUnique);
                    break;
                }
                break;
            case 7:
                ((c51) obj2).setLoading(((Boolean) obj).booleanValue());
                break;
            case 8:
                vab vabVar = (vab) ((dx7) obj2);
                rbb rbbVar = vabVar.o2;
                rbbVar.Y0.p((r47) obj);
                c8b c8bVar = rbbVar.L1;
                if (c8bVar != null && rbbVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(c8bVar.y);
                    boolean z = !isEmpty;
                    ((mf8) rbbVar.k1.c).a(!rbbVar.Y0.j(), false);
                    rbbVar.k1.setVisibility(0);
                    rbbVar.k1.animate().alpha(isEmpty ? 0.0f : 1.0f).withEndAction(new q38((byte) 21, (Object) vabVar, z)).start();
                }
                if (rbbVar.B0.i()) {
                    ArrayList arrayList2 = rbbVar.B0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (r7 < size) {
                            Object obj3 = arrayList2.get(r7);
                            r7++;
                            c8b c8bVar2 = ((jl2) obj3).n;
                            if (c8bVar2 != null && c8bVar2.K) {
                                break;
                            }
                        }
                    }
                }
                i = -1;
                rbbVar.k0(i, true, true);
                break;
            case 9:
                fz7 fz7Var = (fz7) obj2;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = fz7Var.h;
                if (fz7Var.getContext() != null) {
                    r7 = fz7Var.getContext().getResources().getConfiguration().orientation == 2 ? 1 : 0;
                    int intValue = num2.intValue() - hl.n;
                    if (xea.q == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= hl.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((fz7Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (r7 != 0 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        k43 k43Var = k43.h;
                        duration.setInterpolator(k43Var).start();
                        fz7Var.N.animate().alpha(intValue > hl.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(k43Var);
                        break;
                    }
                }
                break;
            case 10:
                a48 a48Var = (a48) obj2;
                View view3 = (View) obj;
                h48 h48Var = a48Var.q0;
                if (!(view3 instanceof d48)) {
                    if (!(view3 instanceof skb)) {
                        if (!(view3 instanceof z38)) {
                            if (!(view3 instanceof mf5)) {
                                if (!(view3 instanceof m38)) {
                                    if (!(view3 instanceof g48)) {
                                        if (view3 instanceof y38) {
                                            ((y38) view3).updateColors();
                                            break;
                                        }
                                    } else {
                                        a48Var.l((g48) view3);
                                        break;
                                    }
                                } else {
                                    ((m38) view3).d.invalidate();
                                    break;
                                }
                            } else {
                                view3.setBackgroundColor(h48Var.getThemedColor(aob.d6));
                                break;
                            }
                        } else {
                            view3.setBackgroundColor(h48Var.getThemedColor(aob.d6));
                            ((z38) view3).updateColors();
                            break;
                        }
                    } else {
                        view3.setBackgroundColor(h48Var.getThemedColor(aob.d6));
                        ((skb) view3).updateColors();
                        break;
                    }
                } else {
                    view3.setBackgroundColor(h48Var.getThemedColor(aob.d6));
                    ((d48) view3).updateColors();
                    break;
                }
                break;
            case 11:
                ((u38) obj2).b((Canvas) obj);
                break;
            case 12:
                ((y38) obj2).c.d();
                break;
            case 13:
                lcb lcbVar = (lcb) obj2;
                lcbVar.k1 = false;
                lcbVar.U();
                break;
            case 14:
                r78 r78Var = (r78) obj2;
                r78Var.E1.b(r78Var.H1, true, 0, ((Long) obj).longValue());
                r78Var.dismiss();
                break;
            case 15:
                xg8 xg8Var = (xg8) obj2;
                zg8 zg8Var = (zg8) obj;
                xg8Var.h = zg8Var;
                xg8Var.c.a(zg8Var, true);
                hl.d3(new x38(xg8Var, (byte) 28), 200L);
                break;
            case 16:
                ((ir1) obj2).F(((Integer) obj).intValue());
                break;
            case 17:
                ij8 ij8Var = (ij8) obj2;
                ij8Var.r = ((Integer) obj).intValue();
                View C1 = ij8Var.d.C1(4);
                if (C1 instanceof ilb) {
                    ilb ilbVar = (ilb) C1;
                    if (ilbVar.getFixedSize() <= 0 && ij8Var.r > 0) {
                        ilbVar.setText(ij8Var.Z());
                        ij8Var.Y(true);
                        break;
                    }
                }
                ij8Var.d.g3.O(true);
                ij8Var.Y(true);
                break;
            case 18:
                b8b b8bVar = (b8b) obj;
                kec kecVar = ((mm8) obj2).n;
                if (kecVar != null) {
                    kecVar.setHDRInfo(b8bVar);
                    break;
                }
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList3 = privacySettingsActivity.Q;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                privacySettingsActivity.F0(true);
                break;
            case 20:
                p66[] p66VarArr = (p66[]) obj2;
                Boolean bool = (Boolean) obj;
                RectF rectF = ProfileActivity.Z6;
                ViewPropertyAnimator scaleY = p66VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                k43 k43Var2 = k43.h;
                ik8.t(scaleY, k43Var2, 600L);
                p66VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(k43Var2).setDuration(600L).start();
                break;
            case 21:
                dz8 dz8Var = (dz8) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (dz8Var.E == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        dz8Var.G = true;
                    } else {
                        dz8Var.E = tL_messages_stickerSet;
                    }
                    dz8Var.e();
                    break;
                }
                break;
            case 22:
                vz8 vz8Var = (vz8) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                f09 f09Var = vz8Var.b;
                if (!vz8Var.F && tL_exportedContactToken != null) {
                    vz8Var.r = tL_exportedContactToken;
                    vz8Var.s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = vz8Var.c.b;
                    if (!TextUtils.equals(f09Var.f, str2) || f09Var.h) {
                        f09Var.f = str2;
                        f09Var.h = false;
                        f09Var.H5 = null;
                        f09Var.I5 = 0;
                    }
                    if (!TextUtils.equals(f09Var.d, str)) {
                        f09Var.d = str;
                        Utilities.e.c(new ym3(str, new xz8(f09Var, str, (byte) 0)));
                    }
                    f09Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 23:
                f09 f09Var2 = (f09) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null && (arrayList = tL_messages_stickerSet2.documents) != null && !arrayList.isEmpty()) {
                    f09Var2.p8 = tL_messages_stickerSet2.documents.get(0);
                }
                f09Var2.invalidate();
                break;
            case 24:
                w09 w09Var = (w09) obj2;
                w09Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", w09Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                zu1 zu1Var = new zu1(bundle);
                zu1Var.Z9 = true;
                w09Var.presentFragment(zu1Var);
                break;
            case 25:
                hl.t1((f42) obj2);
                hl.d3((Runnable) obj, 80L);
                break;
            case 26:
                i19 i19Var = (i19) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Matrix matrix = i19Var.L;
                if (!i19Var.U) {
                    i19Var.J = bitmap;
                    Bitmap bitmap2 = i19Var.J;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    i19Var.K = new BitmapShader(bitmap2, tileMode, tileMode);
                    Paint paint = new Paint(2);
                    i19Var.M = paint;
                    paint.setShader(i19Var.K);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    hl.i(colorMatrix, aob.I.o() ? 0.08f : 1.25f);
                    hl.h(colorMatrix, aob.I.o() ? 0.02f : -0.15f);
                    i19Var.M.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    i19Var.K.setLocalMatrix(matrix);
                    break;
                } else {
                    i19Var.J.recycle();
                    break;
                }
            case 27:
                j59 j59Var = (j59) obj2;
                j59Var.V1.setLoading(false);
                ym0.j(j59Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 28:
                ((Boolean) obj).getClass();
                jd9 jd9Var = ((ld9) obj2).d;
                if (jd9Var != null) {
                    jd9Var.run();
                    break;
                }
                break;
            default:
                ((yg9) obj2).Q.R1((TL_iv.RichMessage) obj);
                break;
        }
    }
}
