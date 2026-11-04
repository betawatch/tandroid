package gi;

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
import android.util.Pair;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hp;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.xs;
import org.telegram.ui.cw;
import org.telegram.ui.uw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j8(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        f41 f41Var;
        f41 f41Var2;
        f41 f41Var3;
        int i3;
        switch (this.a) {
            case 0:
                ((k8) this.b).n.a0.z1 = ((Integer) obj).intValue();
                break;
            case 1:
                ((s9) this.b).h((u10) obj);
                break;
            case 2:
                ii.s sVar = (ii.s) this.b;
                ArrayList arrayList = sVar.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                l41 l41Var = sVar.a;
                if (l41Var != null && (f41Var = l41Var.g3) != null) {
                    f41Var.O(true);
                    break;
                }
                break;
            case 3:
                ji.e eVar = (ji.e) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = eVar.n;
                boolean z10 = arrayList3 == null || arrayList3.isEmpty();
                eVar.n = arrayList2;
                l41 l41Var2 = eVar.f;
                if (l41Var2 != null) {
                    l41Var2.g3.O(z10);
                    break;
                }
                break;
            case 4:
                ((kg.m) this.b).M((TLRPC.User) obj);
                break;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                bm0 bm0Var = (bm0) ((kg.e0) this.b);
                cw cwVar = bm0Var.L0;
                if (user != null) {
                    uw uwVar = cwVar.M0;
                    if (uwVar != null) {
                        uwVar.W3();
                    }
                    hp.s1(cwVar.K0).x3(null, user, null, 0, null, false, false);
                    bm0Var.Q(user.id, user);
                    break;
                }
                break;
            case 6:
                lg.m mVar = (lg.m) this.b;
                boolean z11 = ((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f);
                if (mVar.G != z11) {
                    mVar.G = z11;
                    if (!z11) {
                        mVar.a.y0(0);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.messenger.g0.d0(((lg.h0) this.b).s, new ei.e(3));
                break;
            case 8:
                lg.r0 r0Var = (lg.r0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                r0Var.H = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : r0Var.H.connected_bots.get(0);
                r0Var.I = tL_connectedBot;
                r0Var.N = tL_connectedBot == null ? null : r0Var.getMessagesController().a2(Long.valueOf(r0Var.I.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = r0Var.I;
                r0Var.K = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = r0Var.I;
                r0Var.J = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                lg.b0 b0Var = r0Var.w;
                if (b0Var != null) {
                    b0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                l41 l41Var3 = r0Var.c;
                if (l41Var3 != null && (f41Var2 = l41Var3.g3) != null) {
                    f41Var2.O(true);
                }
                r0Var.d0(true);
                r0Var.U = true;
                break;
            case 9:
                lg.t0 t0Var = (lg.t0) this.b;
                t0Var.w = t0Var.d[((Integer) obj).intValue()];
                t0Var.a0(true);
                break;
            case 10:
                lg.r1 r1Var = (lg.r1) this.b;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", r1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                wm wmVar = new wm(bundle);
                wmVar.W9 = true;
                r1Var.presentFragment(wmVar);
                break;
            case 11:
                org.telegram.messenger.g0.v1((lg.y0) this.b);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                break;
            case 12:
                mi.k3 k3Var = (mi.k3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = k3Var.b;
                int i11 = k3Var.a;
                mi.t3 t3Var = k3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList4 = t3Var.t3;
                    ArrayList arrayList5 = t3Var.t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        mi.g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        mi.h3 h3Var = t3Var.v3;
                        if (h3Var != null) {
                            h3Var.f(false);
                        }
                        mi.a aVar = (mi.a) arrayList5.get(i11);
                        mi.a aVar2 = (mi.a) arrayList5.get(i10);
                        String P4 = mi.t3.D3(aVar.b) ? t3Var.P4(aVar) : "";
                        CharSequence P42 = mi.t3.D3(aVar2.b) ? t3Var.P4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P4.subSequence(0, Math.max(0, Math.min(k3Var.c, P4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(P42.subSequence(Math.max(0, Math.min(k3Var.d, P42.length())), P42.length()));
                        ArrayList arrayList6 = new ArrayList();
                        mi.t3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            mi.b6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new mi.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                mi.a aVar3 = (mi.a) arrayList6.get(0);
                                if (mi.t3.D3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) mi.b6.A(aVar3.b));
                                    mi.b6.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    mi.b6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new mi.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                mi.a aVar4 = (mi.a) k2.p1.h(1, arrayList6);
                                if (mi.t3.D3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(mi.b6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    mi.b6.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    mi.b6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new mi.a(pageblockparagraph3, aVar2.c, aVar2.d));
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
                            t3Var.y4((mi.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        t3Var.v4();
                        t3Var.g3.O(false);
                        mi.g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.p3.onContentChanged();
                        t3Var.post(new m2.s(8, k3Var, arrayList6.isEmpty() ? null : (mi.a) k2.p1.h(1, arrayList6)));
                        break;
                    }
                }
                break;
            case 13:
                ((mi.l) this.b).a.r.Y1((TL_iv.RichMessage) obj);
                break;
            case 14:
                ((mi.c2) this.b).Q.Y1((TL_iv.RichMessage) obj);
                break;
            case 15:
                mi.t3 t3Var2 = (mi.t3) this.b;
                String str = (String) obj;
                t3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    t3Var2.V1(pageblockmath);
                    break;
                }
                break;
            case 16:
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
            case 17:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    s1Var.getClass();
                    break;
                } else {
                    if (s1Var.I0 == null) {
                        s1Var.I0 = new Paint(1);
                    }
                    s1Var.F0 = bitmap2;
                    Bitmap bitmap3 = s1Var.F0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    s1Var.H0 = bitmapShader;
                    s1Var.I0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    s1Var.G0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = s1Var.G0;
                    int[] iArr2 = s1Var.A0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    s1Var.H0.setLocalMatrix(s1Var.G0);
                    s1Var.d1.invalidate();
                    break;
                }
            case 18:
                org.telegram.messenger.g0.v1((xs) this.b);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                break;
            case 19:
                org.telegram.ui.web.t0 t0Var2 = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                t0Var2.d(sb2.toString());
                break;
            case 20:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.b;
                y0Var.f = (ArrayList) obj;
                ai.h4 h4Var = y0Var.a;
                if (h4Var.H) {
                    h4Var.g3.O(true);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) this.b;
                m1Var.r = ((ArrayList) obj).size();
                ai.h4 h4Var2 = m1Var.a;
                if (h4Var2 != null && (f41Var3 = h4Var2.g3) != null && h4Var2.H) {
                    f41Var3.O(true);
                    break;
                }
                break;
            case 22:
                sh.h hVar = (sh.h) this.b;
                if (((sh.b) obj) == sh.b.d && ((i3 = hVar.s) == 2 || i3 == 3)) {
                    hVar.s = 1;
                }
                hVar.h.run();
                break;
            case 23:
                tg.w wVar = (tg.w) this.b;
                tg.x0 x0Var = (tg.x0) obj;
                tg.u0 u0Var = wVar.a;
                if (x0Var != null) {
                    float currentWeight = u0Var.getCurrentWeight();
                    x0Var.f = currentWeight;
                    double d = wVar.p;
                    if (d > 0.0d) {
                        x0Var.f = (float) ((d / wVar.q) * currentWeight);
                    }
                    if (x0Var.a.o() == 4) {
                        x0Var.k *= x0Var.f;
                    }
                }
                tg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new tg.e0(painting, x0Var, 1));
                    break;
                }
                break;
            case 24:
                th.b bVar = (th.b) this.b;
                th.c cVar = (th.c) obj;
                bVar.h = cVar;
                bVar.c.b(cVar, true);
                org.telegram.messenger.g0.i3(new r4.u(bVar, 9), 200L);
                break;
            case 25:
                c5 c5Var = (c5) this.b;
                TextureView textureView = (TextureView) obj;
                c5Var.x0 = textureView;
                if (textureView != null) {
                    c5Var.r0.addView(textureView, 0);
                    break;
                }
                break;
            case 26:
                ug.j2 j2Var = (ug.j2) this.b;
                j2Var.n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                j2Var.s = paint2;
                Bitmap bitmap4 = j2Var.n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                j2Var.r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? 0.08f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.07f);
                j2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                j2Var.w = new Matrix();
                break;
            case 27:
                ((vg.i0) this.b).y1((HashMap) obj);
                break;
            case 28:
                vg.t1 t1Var = (vg.t1) this.b;
                boolean e10 = lc.e(131072);
                if (t1Var.e != e10) {
                    t1Var.e = e10;
                    t1Var.invalidate();
                    break;
                }
                break;
            default:
                wh.h.d1((wh.h) this.b, (Pair) obj);
                break;
        }
    }
}
