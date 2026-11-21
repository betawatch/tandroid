package hi;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ot;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.kw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s6 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        c51 c51Var;
        c51 c51Var2;
        c51 c51Var3;
        int i7;
        switch (this.a) {
            case 0:
                u6 u6Var = (u6) this.b;
                Long l10 = (Long) obj;
                u6Var.A2 = false;
                TLRPC.User c22 = l10 == null ? null : mp.u1(u6Var.a).c2(l10);
                u6Var.z2 = c22;
                u6Var.B2 = c22 == null;
                if (c22 != null) {
                    u6Var.h1();
                    break;
                }
                break;
            case 1:
                k7 k7Var = (k7) this.b;
                tg.i0 i0Var = (tg.i0) obj;
                if (i0Var == null) {
                    k7Var.f1();
                    break;
                } else {
                    k7Var.k2 = i0Var.e;
                    k7Var.j2 = i0Var.f;
                    break;
                }
            case 2:
                ((g8) this.b).n.a0.C1 = ((Integer) obj).intValue();
                break;
            case 3:
                ((p9) this.b).h((x10) obj);
                break;
            case 4:
                ((jg.m) this.b).M((TLRPC.User) obj);
                break;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                nm0 nm0Var = (nm0) ((jg.h0) this.b);
                kw kwVar = nm0Var.L0;
                if (user != null) {
                    cx cxVar = kwVar.M0;
                    if (cxVar != null) {
                        cxVar.W3();
                    }
                    mp.u1(kwVar.K0).E3(null, user, null, 0, null, false, false);
                    nm0Var.Q(user.id, user);
                    break;
                }
                break;
            case 6:
                ((ji.o) ((xi.e) this.b).d).k(obj);
                break;
            case 7:
                kg.n nVar = (kg.n) this.b;
                boolean z10 = ((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f);
                if (nVar.G != z10) {
                    nVar.G = z10;
                    if (!z10) {
                        nVar.a.y0(0);
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.messenger.g0.d0(((kg.h0) this.b).s, new fi.e(3));
                break;
            case 9:
                kg.s0 s0Var = (kg.s0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                s0Var.H = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : s0Var.H.connected_bots.get(0);
                s0Var.I = tL_connectedBot;
                s0Var.N = tL_connectedBot == null ? null : s0Var.getMessagesController().c2(Long.valueOf(s0Var.I.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = s0Var.I;
                s0Var.K = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = s0Var.I;
                s0Var.J = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                kg.b0 b0Var = s0Var.w;
                if (b0Var != null) {
                    b0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                h51 h51Var = s0Var.c;
                if (h51Var != null && (c51Var = h51Var.g3) != null) {
                    c51Var.O(true);
                }
                s0Var.d0(true);
                s0Var.U = true;
                break;
            case 10:
                kg.u0 u0Var = (kg.u0) this.b;
                u0Var.w = u0Var.d[((Integer) obj).intValue()];
                u0Var.a0(true);
                break;
            case 11:
                kg.s1 s1Var = (kg.s1) this.b;
                s1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", s1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                bn bnVar = new bn(bundle);
                bnVar.Z9 = true;
                s1Var.presentFragment(bnVar);
                break;
            case 12:
                org.telegram.messenger.g0.v1((kg.z0) this.b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                break;
            case 13:
                ki.q qVar = (ki.q) this.b;
                ArrayList arrayList = qVar.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                h51 h51Var2 = qVar.a;
                if (h51Var2 != null && (c51Var2 = h51Var2.g3) != null) {
                    c51Var2.O(true);
                    break;
                }
                break;
            case 14:
                li.g gVar = (li.g) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = gVar.n;
                boolean z11 = arrayList3 == null || arrayList3.isEmpty();
                gVar.n = arrayList2;
                h51 h51Var3 = gVar.f;
                if (h51Var3 != null) {
                    h51Var3.g3.O(z11);
                    break;
                }
                break;
            case 15:
                oi.k3 k3Var = (oi.k3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = k3Var.b;
                int i11 = k3Var.a;
                oi.t3 t3Var = k3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList4 = t3Var.t3;
                    ArrayList arrayList5 = t3Var.t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        oi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        oi.h3 h3Var = t3Var.v3;
                        if (h3Var != null) {
                            h3Var.f(false);
                        }
                        oi.a aVar = (oi.a) arrayList5.get(i11);
                        oi.a aVar2 = (oi.a) arrayList5.get(i10);
                        String P4 = oi.t3.D3(aVar.b) ? t3Var.P4(aVar) : "";
                        CharSequence P42 = oi.t3.D3(aVar2.b) ? t3Var.P4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P4.subSequence(0, Math.max(0, Math.min(k3Var.c, P4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(P42.subSequence(Math.max(0, Math.min(k3Var.d, P42.length())), P42.length()));
                        ArrayList arrayList6 = new ArrayList();
                        oi.t3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            oi.a6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new oi.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                oi.a aVar3 = (oi.a) arrayList6.get(0);
                                if (oi.t3.D3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) oi.a6.A(aVar3.b));
                                    oi.a6.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    oi.a6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new oi.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                oi.a aVar4 = (oi.a) i5.c.h(1, arrayList6);
                                if (oi.t3.D3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(oi.a6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    oi.a6.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    oi.a6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new oi.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = t3Var.s3;
                        if (richMessage2 == null) {
                            t3Var.s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                t3Var.s3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            t3Var.y4((oi.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        t3Var.v4();
                        t3Var.g3.O(false);
                        oi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.p3.onContentChanged();
                        t3Var.post(new oi.t(4, k3Var, arrayList6.isEmpty() ? null : (oi.a) i5.c.h(1, arrayList6)));
                        break;
                    }
                }
                break;
            case 16:
                ((oi.k) this.b).a.r.Y1((TL_iv.RichMessage) obj);
                break;
            case 17:
                ((oi.b2) this.b).Q.Y1((TL_iv.RichMessage) obj);
                break;
            case 18:
                oi.t3 t3Var2 = (oi.t3) this.b;
                String str = (String) obj;
                t3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    t3Var2.V1(pageblockmath);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = v0Var.G;
                v0Var.a0 = false;
                v0Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                v0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = v0Var.n;
                if (matrix == null) {
                    v0Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                v0Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = v0Var.n;
                int[] iArr = v0Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                v0Var.h.setLocalMatrix(v0Var.n);
                paint.setShader(v0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v0Var.invalidate();
                break;
            case 20:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    t1Var.getClass();
                    break;
                } else {
                    if (t1Var.G0 == null) {
                        t1Var.G0 = new Paint(1);
                    }
                    t1Var.D0 = bitmap2;
                    Bitmap bitmap3 = t1Var.D0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    t1Var.F0 = bitmapShader;
                    t1Var.G0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    t1Var.E0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = t1Var.E0;
                    int[] iArr2 = t1Var.y0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    t1Var.F0.setLocalMatrix(t1Var.E0);
                    t1Var.b1.invalidate();
                    break;
                }
            case 21:
                org.telegram.messenger.g0.v1((ot) this.b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                break;
            case 22:
                org.telegram.ui.web.s0 s0Var2 = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                s0Var2.d(sb2.toString());
                break;
            case 23:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                x0Var.f = (ArrayList) obj;
                bi.g6 g6Var = x0Var.a;
                if (g6Var.H) {
                    g6Var.g3.O(true);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.b;
                n1Var.r = ((ArrayList) obj).size();
                bi.g6 g6Var2 = n1Var.a;
                if (g6Var2 != null && (c51Var3 = g6Var2.g3) != null && g6Var2.H) {
                    c51Var3.O(true);
                    break;
                }
                break;
            case 25:
                rh.h hVar = (rh.h) this.b;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.s) == 2 || i7 == 3)) {
                    hVar.s = 1;
                }
                hVar.h.run();
                break;
            case 26:
                sg.v vVar = (sg.v) this.b;
                sg.x0 x0Var2 = (sg.x0) obj;
                sg.u0 u0Var2 = vVar.a;
                if (x0Var2 != null) {
                    float currentWeight = u0Var2.getCurrentWeight();
                    x0Var2.f = currentWeight;
                    double d = vVar.p;
                    if (d > 0.0d) {
                        x0Var2.f = (float) ((d / vVar.q) * currentWeight);
                    }
                    if (x0Var2.a.o() == 4) {
                        x0Var2.k *= x0Var2.f;
                    }
                }
                sg.i0 painting = u0Var2.getPainting();
                if (painting.L == null) {
                    painting.f.f(new sg.d0(painting, x0Var2, 1));
                    break;
                }
                break;
            case 27:
                sh.b bVar = (sh.b) this.b;
                sh.c cVar = (sh.c) obj;
                bVar.h = cVar;
                bVar.c.b(cVar, true);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(bVar, 15), 200L);
                break;
            case 28:
                a5 a5Var = (a5) this.b;
                TextureView textureView = (TextureView) obj;
                a5Var.x0 = textureView;
                if (textureView != null) {
                    a5Var.r0.addView(textureView, 0);
                    break;
                }
                break;
            default:
                tg.l2 l2Var = (tg.l2) this.b;
                l2Var.n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                l2Var.s = paint2;
                Bitmap bitmap4 = l2Var.n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                l2Var.r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.m6.I.q() ? 0.08f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.m6.I.q() ? -0.02f : -0.07f);
                l2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                l2Var.w = new Matrix();
                break;
        }
    }
}
