package ag;

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
import bi.d4;
import bi.q3;
import bi.q6;
import bi.u3;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import vh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        boolean z10;
        p51 p51Var;
        int i10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        p51 p51Var2;
        int i11 = this.a;
        String str = "";
        int i12 = 0;
        int i13 = 1;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                w wVar = (w) obj2;
                boolean z11 = ((Integer) obj).intValue() > org.telegram.messenger.i0.L(20.0f);
                if (wVar.F != z11) {
                    wVar.F = z11;
                    if (!z11) {
                        wVar.a.y0(0);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.messenger.i0.d0(((h1) obj2).s, new z0(i12));
                break;
            case 2:
                t1 t1Var = (t1) obj2;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                t1Var.G = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : t1Var.G.connected_bots.get(0);
                t1Var.H = tL_connectedBot;
                t1Var.M = tL_connectedBot == null ? null : t1Var.getMessagesController().Z1(Long.valueOf(t1Var.H.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = t1Var.H;
                t1Var.J = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = t1Var.H;
                t1Var.I = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                x0 x0Var = t1Var.w;
                if (x0Var != null) {
                    x0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                u51 u51Var = t1Var.c;
                if (u51Var == null || (p51Var = u51Var.f3) == null) {
                    z10 = true;
                } else {
                    z10 = true;
                    p51Var.O(true);
                }
                t1Var.c0(z10);
                t1Var.T = z10;
                break;
            case 3:
                v1 v1Var = (v1) obj2;
                v1Var.w = v1Var.d[((Integer) obj).intValue()];
                v1Var.Z(true);
                break;
            case 4:
                z2 z2Var = (z2) obj2;
                z2Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", z2Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                un unVar = new un(bundle);
                unVar.V9 = true;
                z2Var.presentFragment(unVar);
                break;
            case 5:
                org.telegram.messenger.i0.v1((a2) obj2);
                org.telegram.messenger.i0.h3((Runnable) obj, 80L);
                break;
            case 6:
                u3 u3Var = (u3) obj2;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i14 = u3Var.b;
                int i15 = u3Var.a;
                d4 d4Var = u3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList = d4Var.s3;
                    ArrayList arrayList2 = d4Var.s3;
                    if (i15 < arrayList.size() && i14 < arrayList2.size()) {
                        bi.o2 o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                        }
                        q3 q3Var = d4Var.u3;
                        if (q3Var != null) {
                            q3Var.f(false);
                        }
                        bi.a aVar = (bi.a) arrayList2.get(i15);
                        bi.a aVar2 = (bi.a) arrayList2.get(i14);
                        String P4 = d4.D3(aVar.b) ? d4Var.P4(aVar) : "";
                        CharSequence charSequence = str;
                        if (d4.D3(aVar2.b)) {
                            charSequence = d4Var.P4(aVar2);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P4.subSequence(0, Math.max(0, Math.min(u3Var.c, P4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(u3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList3 = new ArrayList();
                        d4.Z2(arrayList3, richMessage.blocks, null);
                        if (arrayList3.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            q6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList3.add(new bi.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                bi.a aVar3 = (bi.a) arrayList3.get(0);
                                if (d4.D3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) q6.A(aVar3.b));
                                    q6.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    q6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList3.add(0, new bi.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                bi.a aVar4 = (bi.a) i0.a.g(1, arrayList3);
                                if (d4.D3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(q6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    q6.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    q6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList3.add(new bi.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = d4Var.r3;
                        if (richMessage2 == null) {
                            d4Var.r3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList4 = richMessage.photos;
                            if (arrayList4 != null) {
                                richMessage2.photos.addAll(arrayList4);
                            }
                            ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                            if (arrayList5 != null) {
                                d4Var.r3.documents.addAll(arrayList5);
                            }
                        }
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            d4Var.y4((bi.a) arrayList3.get(i16));
                        }
                        while (i14 >= i15) {
                            arrayList2.remove(i14);
                            i14--;
                        }
                        arrayList2.addAll(i15, arrayList3);
                        d4Var.v4();
                        d4Var.f3.O(false);
                        bi.o2 o2Var2 = d4Var.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                        }
                        d4Var.o3.onContentChanged();
                        d4Var.post(new a1.f(22, u3Var, arrayList3.isEmpty() ? null : (bi.a) i0.a.g(1, arrayList3)));
                        break;
                    }
                }
                break;
            case 7:
                ((bi.p) obj2).a.r.X1((TL_iv.RichMessage) obj);
                break;
            case 8:
                ((bi.k2) obj2).P.X1((TL_iv.RichMessage) obj);
                break;
            case 9:
                d4 d4Var2 = (d4) obj2;
                String str2 = (String) obj;
                d4Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    d4Var2.U1(pageblockmath);
                    break;
                }
                break;
            case 10:
                hh.i iVar = (hh.i) obj2;
                if (((hh.b) obj) == hh.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 11:
                ig.a0 a0Var = (ig.a0) obj2;
                ig.f1 f1Var = (ig.f1) obj;
                ig.c1 c1Var = a0Var.a;
                if (f1Var != null) {
                    float currentWeight = c1Var.getCurrentWeight();
                    f1Var.f = currentWeight;
                    double d = a0Var.p;
                    if (d > 0.0d) {
                        f1Var.f = (float) ((d / a0Var.q) * currentWeight);
                    }
                    if (f1Var.a.o() == 4) {
                        f1Var.k *= f1Var.f;
                    }
                }
                ig.q0 painting = c1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new ig.l0(painting, f1Var, i13));
                    break;
                }
                break;
            case 12:
                ih.d dVar = (ih.d) obj2;
                ih.f fVar = (ih.f) obj;
                dVar.h = fVar;
                dVar.c.b(fVar, true);
                org.telegram.messenger.i0.h3(new gg.c(dVar, 10), 200L);
                break;
            case 13:
                s3 s3Var = (s3) obj2;
                TextureView textureView = (TextureView) obj;
                s3Var.w0 = textureView;
                if (textureView != null) {
                    s3Var.q0.addView(textureView, 0);
                    break;
                }
                break;
            case 14:
                jg.d3 d3Var = (jg.d3) obj2;
                d3Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                d3Var.s = paint;
                Bitmap bitmap = d3Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                d3Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix, t6.I.q() ? 0.08f : 0.25f);
                org.telegram.messenger.i0.h(colorMatrix, t6.I.q() ? -0.02f : -0.07f);
                d3Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d3Var.w = new Matrix();
                break;
            case 15:
                ((kg.q0) obj2).y1((HashMap) obj);
                break;
            case 16:
                kg.g2 g2Var = (kg.g2) obj2;
                boolean e = sc.e(131072);
                if (g2Var.e != e) {
                    g2Var.e = e;
                    g2Var.invalidate();
                    break;
                }
                break;
            case 17:
                lh.g.d1((lh.g) obj2, (Pair) obj);
                break;
            case 18:
                jj jjVar = (jj) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = jjVar.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j10 = jjVar.k.date * 1000;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = mg.p.b(jjVar);
                    TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(-jjVar.Z0()));
                    boolean z12 = L0 != null && w3.V(L0);
                    eb ebVar = new eb(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ebVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ebVar.b.setText(cd.L0(2131753371, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ebVar.c(R.raw.forward, 30, 30, new String[0]);
                            ebVar.b.setText(cd.L0(2131753369, null));
                        } else {
                            ebVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ebVar.b.setText(cd.L0(2131753370, null));
                        }
                    }
                    ebVar.b.setSingleLine(false);
                    ebVar.b.setMaxLines(2);
                    ub ubVar = new ub(Q.getParentActivity(), Q.getResourceProvider(), true);
                    ubVar.e(cd.L0(2131749020, null));
                    ubVar.b = new n0(payments_giveawayinfo, z12, b10, j10, tL_messageMediaGiveaway2, Q);
                    ebVar.setButton(ubVar);
                    wb.g(Q, ebVar, 2750).j();
                    break;
                }
                break;
            case 19:
                mg.o1 o1Var = (mg.o1) obj2;
                o1Var.S1.setLoading(false);
                mg.p.j(o1Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 20:
                mh.j jVar = (mh.j) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = jVar.K;
                if (jVar.T) {
                    jVar.I.recycle();
                    break;
                } else {
                    jVar.I = bitmap2;
                    Bitmap bitmap3 = jVar.I;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    jVar.J = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    Paint paint2 = new Paint(2);
                    jVar.L = paint2;
                    paint2.setShader(jVar.J);
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    org.telegram.messenger.i0.i(colorMatrix2, t6.I.q() ? 0.08f : 1.25f);
                    org.telegram.messenger.i0.h(colorMatrix2, t6.I.q() ? 0.02f : -0.15f);
                    jVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    jVar.J.setLocalMatrix(matrix);
                    break;
                }
            case 21:
                HashMap hashMap = ((ng.b) obj2).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 22:
                ((ng.f) obj2).F((TLObject) obj);
                break;
            case 23:
                HashMap hashMap2 = ((ng.i) obj2).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 24:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                Paint paint3 = y0Var.F;
                y0Var.W = false;
                y0Var.f = bitmap4;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                y0Var.h = new BitmapShader(bitmap4, tileMode3, tileMode3);
                Matrix matrix2 = y0Var.n;
                if (matrix2 == null) {
                    y0Var.n = new Matrix();
                } else {
                    matrix2.reset();
                }
                y0Var.n.postScale(8.0f, 8.0f);
                Matrix matrix3 = y0Var.n;
                int[] iArr = y0Var.r;
                matrix3.postTranslate(-iArr[0], -iArr[1]);
                y0Var.h.setLocalMatrix(y0Var.n);
                paint3.setShader(y0Var.h);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix3, -0.2f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                y0Var.invalidate();
                break;
            case 25:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                Bitmap bitmap5 = (Bitmap) obj;
                if (bitmap5 == null) {
                    x1Var.getClass();
                    break;
                } else {
                    if (x1Var.H0 == null) {
                        x1Var.H0 = new Paint(1);
                    }
                    x1Var.E0 = bitmap5;
                    Bitmap bitmap6 = x1Var.E0;
                    Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader2 = new BitmapShader(bitmap6, tileMode4, tileMode4);
                    x1Var.G0 = bitmapShader2;
                    x1Var.H0.setShader(bitmapShader2);
                    Matrix matrix4 = new Matrix();
                    x1Var.F0 = matrix4;
                    matrix4.postScale(8.0f, 8.0f);
                    Matrix matrix5 = x1Var.F0;
                    int[] iArr2 = x1Var.z0;
                    matrix5.postTranslate(-iArr2[0], -iArr2[1]);
                    x1Var.G0.setLocalMatrix(x1Var.F0);
                    x1Var.c1.invalidate();
                    break;
                }
            case 26:
                org.telegram.messenger.i0.v1((mt) obj2);
                org.telegram.messenger.i0.h3((Runnable) obj, 80L);
                break;
            case 27:
                org.telegram.ui.web.v0 v0Var = ((BotWebViewContainer$WebViewProxy) obj2).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                String str3 = str;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "'abort'";
                }
                sb2.append(str3);
                sb2.append(")");
                v0Var.d(sb2.toString());
                break;
            case 28:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj2;
                b1Var.f = (ArrayList) obj;
                ii iiVar = b1Var.a;
                if (iiVar.G) {
                    iiVar.f3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.web.p1 p1Var = (org.telegram.ui.web.p1) obj2;
                p1Var.r = ((ArrayList) obj).size();
                ii iiVar2 = p1Var.a;
                if (iiVar2 != null && (p51Var2 = iiVar2.f3) != null && iiVar2.G) {
                    p51Var2.O(true);
                    break;
                }
                break;
        }
    }
}
