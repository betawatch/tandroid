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
import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.an;
import org.telegram.ui.hw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        p41 p41Var;
        p41 p41Var2;
        p41 p41Var3;
        int i7;
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.b;
                tg.h0 h0Var = (tg.h0) obj;
                if (h0Var == null) {
                    l7Var.e1();
                    break;
                } else {
                    l7Var.k2 = h0Var.e;
                    l7Var.j2 = h0Var.f;
                    break;
                }
            case 1:
                ((h8) this.b).n.a0.C1 = ((Integer) obj).intValue();
                break;
            case 2:
                ((p9) this.b).h((z10) obj);
                break;
            case 3:
                ((jg.m) this.b).M((TLRPC.User) obj);
                break;
            case 4:
                TLRPC.User user = (TLRPC.User) obj;
                cm0 cm0Var = (cm0) ((jg.h0) this.b);
                hw hwVar = cm0Var.L0;
                if (user != null) {
                    yw ywVar = hwVar.M0;
                    if (ywVar != null) {
                        ywVar.W3();
                    }
                    np.s1(hwVar.K0).x3(null, user, null, 0, null, false, false);
                    cm0Var.Q(user.id, user);
                    break;
                }
                break;
            case 5:
                ((ji.m) ((xi.e) this.b).d).j(obj);
                break;
            case 6:
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
            case 7:
                org.telegram.messenger.g0.d0(((kg.g0) this.b).s, new fi.e(3));
                break;
            case 8:
                kg.q0 q0Var = (kg.q0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                q0Var.H = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : q0Var.H.connected_bots.get(0);
                q0Var.I = tL_connectedBot;
                q0Var.N = tL_connectedBot == null ? null : q0Var.getMessagesController().a2(Long.valueOf(q0Var.I.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = q0Var.I;
                q0Var.K = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = q0Var.I;
                q0Var.J = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                kg.a0 a0Var = q0Var.w;
                if (a0Var != null) {
                    a0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                u41 u41Var = q0Var.c;
                if (u41Var != null && (p41Var = u41Var.g3) != null) {
                    p41Var.O(true);
                }
                q0Var.d0(true);
                q0Var.U = true;
                break;
            case 9:
                kg.s0 s0Var = (kg.s0) this.b;
                s0Var.w = s0Var.d[((Integer) obj).intValue()];
                s0Var.a0(true);
                break;
            case 10:
                kg.r1 r1Var = (kg.r1) this.b;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", r1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                an anVar = new an(bundle);
                anVar.Y9 = true;
                r1Var.presentFragment(anVar);
                break;
            case 11:
                org.telegram.messenger.g0.v1((kg.x0) this.b);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                break;
            case 12:
                ki.s sVar = (ki.s) this.b;
                ArrayList arrayList = sVar.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                u41 u41Var2 = sVar.a;
                if (u41Var2 != null && (p41Var2 = u41Var2.g3) != null) {
                    p41Var2.O(true);
                    break;
                }
                break;
            case 13:
                li.e eVar = (li.e) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = eVar.n;
                boolean z11 = arrayList3 == null || arrayList3.isEmpty();
                eVar.n = arrayList2;
                u41 u41Var3 = eVar.f;
                if (u41Var3 != null) {
                    u41Var3.g3.O(z11);
                    break;
                }
                break;
            case 14:
                oi.h3 h3Var = (oi.h3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = h3Var.b;
                int i11 = h3Var.a;
                oi.q3 q3Var = h3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList4 = q3Var.t3;
                    ArrayList arrayList5 = q3Var.t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        oi.d2 d2Var = q3Var.R3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        oi.e3 e3Var = q3Var.v3;
                        if (e3Var != null) {
                            e3Var.f(false);
                        }
                        oi.a aVar = (oi.a) arrayList5.get(i11);
                        oi.a aVar2 = (oi.a) arrayList5.get(i10);
                        String P4 = oi.q3.D3(aVar.b) ? q3Var.P4(aVar) : "";
                        CharSequence P42 = oi.q3.D3(aVar2.b) ? q3Var.P4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P4.subSequence(0, Math.max(0, Math.min(h3Var.c, P4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(P42.subSequence(Math.max(0, Math.min(h3Var.d, P42.length())), P42.length()));
                        ArrayList arrayList6 = new ArrayList();
                        oi.q3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            oi.y5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new oi.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                oi.a aVar3 = (oi.a) arrayList6.get(0);
                                if (oi.q3.D3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) oi.y5.A(aVar3.b));
                                    oi.y5.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    oi.y5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new oi.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                oi.a aVar4 = (oi.a) i5.c.h(1, arrayList6);
                                if (oi.q3.D3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(oi.y5.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    oi.y5.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    oi.y5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new oi.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = q3Var.s3;
                        if (richMessage2 == null) {
                            q3Var.s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                q3Var.s3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            q3Var.y4((oi.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        q3Var.v4();
                        q3Var.g3.O(false);
                        oi.d2 d2Var2 = q3Var.R3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        q3Var.p3.onContentChanged();
                        q3Var.post(new kg.t1(29, h3Var, arrayList6.isEmpty() ? null : (oi.a) i5.c.h(1, arrayList6)));
                        break;
                    }
                }
                break;
            case 15:
                ((oi.k) this.b).a.r.Y1((TL_iv.RichMessage) obj);
                break;
            case 16:
                ((oi.z1) this.b).Q.Y1((TL_iv.RichMessage) obj);
                break;
            case 17:
                oi.q3 q3Var2 = (oi.q3) this.b;
                String str = (String) obj;
                q3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    q3Var2.V1(pageblockmath);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = w0Var.G;
                w0Var.a0 = false;
                w0Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                w0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = w0Var.n;
                if (matrix == null) {
                    w0Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                w0Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = w0Var.n;
                int[] iArr = w0Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                w0Var.h.setLocalMatrix(w0Var.n);
                paint.setShader(w0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w0Var.invalidate();
                break;
            case 19:
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
            case 20:
                org.telegram.messenger.g0.v1((ft) this.b);
                org.telegram.messenger.g0.i3((Runnable) obj, 80L);
                break;
            case 21:
                org.telegram.ui.web.s0 s0Var2 = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                s0Var2.d(sb2.toString());
                break;
            case 22:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                x0Var.f = (ArrayList) obj;
                bi.v3 v3Var = x0Var.a;
                if (v3Var.H) {
                    v3Var.g3.O(true);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.b;
                n1Var.r = ((ArrayList) obj).size();
                bi.v3 v3Var2 = n1Var.a;
                if (v3Var2 != null && (p41Var3 = v3Var2.g3) != null && v3Var2.H) {
                    p41Var3.O(true);
                    break;
                }
                break;
            case 24:
                rh.h hVar = (rh.h) this.b;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.s) == 2 || i7 == 3)) {
                    hVar.s = 1;
                }
                hVar.h.run();
                break;
            case 25:
                sg.v vVar = (sg.v) this.b;
                sg.x0 x0Var2 = (sg.x0) obj;
                sg.u0 u0Var = vVar.a;
                if (x0Var2 != null) {
                    float currentWeight = u0Var.getCurrentWeight();
                    x0Var2.f = currentWeight;
                    double d = vVar.p;
                    if (d > 0.0d) {
                        x0Var2.f = (float) ((d / vVar.q) * currentWeight);
                    }
                    if (x0Var2.a.o() == 4) {
                        x0Var2.k *= x0Var2.f;
                    }
                }
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new sg.d0(painting, x0Var2, 1));
                    break;
                }
                break;
            case 26:
                sh.b bVar = (sh.b) this.b;
                sh.c cVar = (sh.c) obj;
                bVar.h = cVar;
                bVar.c.b(cVar, true);
                org.telegram.messenger.g0.i3(new q2.d(bVar, 12), 200L);
                break;
            case 27:
                c5 c5Var = (c5) this.b;
                TextureView textureView = (TextureView) obj;
                c5Var.x0 = textureView;
                if (textureView != null) {
                    c5Var.r0.addView(textureView, 0);
                    break;
                }
                break;
            case 28:
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
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? 0.08f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.07f);
                l2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                l2Var.w = new Matrix();
                break;
            default:
                ((ug.j0) this.b).y1((HashMap) obj);
                break;
        }
    }
}
