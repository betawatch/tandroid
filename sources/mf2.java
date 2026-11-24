// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mf2 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mf2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // qac
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        l7c l7cVar;
        l7c l7cVar2;
        byte b = this.a;
        String str = "";
        Object obj2 = this.b;
        switch (b) {
            case 0:
                uf2 uf2Var = (uf2) obj2;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        uf2Var.e.put(tL_chatThemeUniqueGift.gift.slug, new tz3(uf2Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    break;
                }
                break;
            case 1:
                w7 w7Var = (w7) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = w7Var.G;
                w7Var.a0 = false;
                w7Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                w7Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = w7Var.n;
                if (matrix == null) {
                    w7Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                w7Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = w7Var.n;
                int[] iArr = w7Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                w7Var.h.setLocalMatrix(w7Var.n);
                paint.setShader(w7Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                gm.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w7Var.invalidate();
                break;
            case 2:
                he heVar = (he) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (heVar.G0 == null) {
                        heVar.G0 = new Paint(1);
                    }
                    heVar.D0 = bitmap2;
                    Bitmap bitmap3 = heVar.D0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    heVar.F0 = bitmapShader;
                    heVar.G0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    heVar.E0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = heVar.E0;
                    int[] iArr2 = heVar.y0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    heVar.F0.setLocalMatrix(heVar.E0);
                    heVar.b1.invalidate();
                    break;
                }
                break;
            case 3:
                ((eh) obj2).run();
                break;
            case 4:
                ((sx) obj2).L.p0 = ((Integer) obj).intValue() - gm.n > gm.L(20.0f);
                break;
            case 5:
                HashMap hashMap = ((kn0) obj2).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 6:
                k47 k47Var = (k47) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = k47Var.k.media;
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
                long j = k47Var.k.date * 1000;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    String b2 = yn0.b(k47Var);
                    TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-k47Var.Z0()));
                    boolean z = L0 != null && sd2.V(L0);
                    b31 b31Var = new b31(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        b31Var.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        b31Var.b.setText(jb6.M0(2131753336, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            b31Var.c(R.raw.forward, 30, 30, new String[0]);
                            b31Var.b.setText(jb6.M0(2131753334, null));
                        } else {
                            b31Var.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            b31Var.b.setText(jb6.M0(2131753335, null));
                        }
                    }
                    b31Var.b.setSingleLine(false);
                    b31Var.b.setMaxLines(2);
                    s31 s31Var = new s31(Q.getResourceProvider(), Q.getParentActivity(), true);
                    s31Var.e(jb6.M0(2131748767, null));
                    s31Var.b = new aa7(payments_giveawayinfo, z, b2, j, tL_messageMediaGiveaway2, Q);
                    b31Var.setButton(s31Var);
                    u31.g(Q, b31Var, 2750).j();
                    break;
                }
                break;
            case 7:
                vp0 vp0Var = (vp0) obj2;
                ArrayList arrayList = vp0Var.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                q7c q7cVar = vp0Var.a;
                if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
                    l7cVar.O(true);
                    break;
                }
                break;
            case 8:
                ks0 ks0Var = (ks0) obj2;
                String str2 = (String) obj;
                ArrayList arrayList2 = ks0Var.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    ks0Var.i(true);
                }
                gm.d3(new x30(ks0Var, str2, (byte) 16), 120L);
                break;
            case 9:
                mw0 mw0Var = ((BotWebViewContainer$WebViewProxy) obj2).b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                String str3 = str;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "'abort'";
                }
                sb.append(str3);
                sb.append(")");
                mw0Var.c(sb.toString());
                break;
            case 10:
                f51 f51Var = (f51) obj2;
                boolean z2 = ((Integer) obj).intValue() > gm.L(20.0f);
                if (f51Var.G != z2) {
                    f51Var.G = z2;
                    if (!z2) {
                        f51Var.a.z0(0);
                        break;
                    }
                }
                break;
            case 11:
                ((pc1) obj2).x(((Integer) obj).intValue());
                break;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                jc1 jc1Var = ((tc1) obj2).f;
                jc1Var.setText(charSequence);
                jc1Var.w(charSequence.length(), charSequence.length());
                break;
            case 13:
                ((fd1) obj2).R(((Long) obj).longValue());
                break;
            case 14:
                gm.c3(new y31((sh1) obj2, (TL_stories.TL_premium_boostsStatus) obj, (byte) 23));
                break;
            case 15:
                gm.c3(new y31((ik1) obj2, (TL_stories.TL_premium_boostsStatus) obj, (byte) 29));
                break;
            case 16:
                ((eg9) obj2).a((vm3) obj);
                break;
            case 17:
                ((jlc) obj2).setEditMenuProgress(((Float) obj).floatValue());
                break;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((p62) obj2).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 19:
                gm.d0(((a82) obj2).s, new bn0((byte) 6));
                break;
            case 20:
                tg9 tg9Var = (tg9) obj2;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i = tg9Var.b;
                int i2 = tg9Var.a;
                ch9 ch9Var = tg9Var.e;
                if (richMessage != null) {
                    ArrayList arrayList3 = ch9Var.t3;
                    ArrayList arrayList4 = ch9Var.t3;
                    if (i2 < arrayList3.size() && i < arrayList4.size()) {
                        of9 of9Var = ch9Var.R3;
                        if (of9Var != null) {
                            of9Var.d();
                        }
                        qg9 qg9Var = ch9Var.v3;
                        if (qg9Var != null) {
                            qg9Var.e(false);
                        }
                        ll0 ll0Var = (ll0) arrayList4.get(i2);
                        ll0 ll0Var2 = (ll0) arrayList4.get(i);
                        String P4 = ch9.w3(ll0Var.b) ? ch9Var.P4(ll0Var) : "";
                        CharSequence charSequence2 = str;
                        if (ch9.w3(ll0Var2.b)) {
                            charSequence2 = ch9Var.P4(ll0Var2);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P4.subSequence(0, Math.max(0, Math.min(tg9Var.c, P4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2.subSequence(Math.max(0, Math.min(tg9Var.d, charSequence2.length())), charSequence2.length()));
                        ArrayList arrayList5 = new ArrayList();
                        ch9.S2(arrayList5, richMessage.blocks, null);
                        if (arrayList5.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            xk9.b(pageblockparagraph, spannableStringBuilder3);
                            arrayList5.add(new ll0(pageblockparagraph, ll0Var.c, ll0Var.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ll0 ll0Var3 = (ll0) arrayList5.get(0);
                                if (ch9.w3(ll0Var3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) xk9.z(ll0Var3.b));
                                    xk9.b(ll0Var3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    xk9.b(pageblockparagraph2, spannableStringBuilder);
                                    arrayList5.add(0, new ll0(pageblockparagraph2, ll0Var.c, ll0Var.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ll0 ll0Var4 = (ll0) b10.f(1, arrayList5);
                                if (ch9.w3(ll0Var4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(xk9.z(ll0Var4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    xk9.b(ll0Var4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    xk9.b(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList5.add(new ll0(pageblockparagraph3, ll0Var2.c, ll0Var2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = ch9Var.s3;
                        if (richMessage2 == null) {
                            ch9Var.s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList6 = richMessage.photos;
                            if (arrayList6 != null) {
                                richMessage2.photos.addAll(arrayList6);
                            }
                            ArrayList<TLRPC.Document> arrayList7 = richMessage.documents;
                            if (arrayList7 != null) {
                                ch9Var.s3.documents.addAll(arrayList7);
                            }
                        }
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            ch9Var.w4((ll0) arrayList5.get(i3));
                        }
                        while (i >= i2) {
                            arrayList4.remove(i);
                            i--;
                        }
                        arrayList4.addAll(i2, arrayList5);
                        ch9Var.t4();
                        ch9Var.g3.O(false);
                        of9 of9Var2 = ch9Var.R3;
                        if (of9Var2 != null) {
                            of9Var2.h();
                        }
                        ch9Var.p3.onContentChanged();
                        ch9Var.post(new ey8(tg9Var, arrayList5.isEmpty() ? null : (ll0) b10.f(1, arrayList5), (byte) 24));
                        break;
                    }
                }
                break;
            case 21:
                ((l82) obj2).a.r.Q1((TL_iv.RichMessage) obj);
                break;
            case 22:
                ((je2) obj2).e.T = (String) obj;
                break;
            case 23:
                wg2 wg2Var = ((sg2) obj2).d;
                wg2Var.A1 = ((Integer) obj).intValue();
                gm.U3(wg2Var.r0, wg2Var.c);
                break;
            case 24:
                hh2 hh2Var = (hh2) obj2;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                hh2Var.H = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : hh2Var.H.connected_bots.get(0);
                hh2Var.I = tL_connectedBot;
                hh2Var.N = tL_connectedBot == null ? null : hh2Var.getMessagesController().W1(Long.valueOf(hh2Var.I.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = hh2Var.I;
                hh2Var.K = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = hh2Var.I;
                hh2Var.J = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                t51 t51Var = hh2Var.w;
                if (t51Var != null) {
                    t51Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                q7c q7cVar2 = hh2Var.c;
                if (q7cVar2 != null && (l7cVar2 = q7cVar2.g3) != null) {
                    l7cVar2.O(true);
                }
                hh2Var.a0(true);
                hh2Var.U = true;
                break;
            case 25:
                cm2 cm2Var = (cm2) obj2;
                cm2Var.k0.n.P = ((Float) obj).floatValue();
                bm2 bm2Var = cm2Var.k0;
                am2 am2Var = bm2Var.d;
                if (am2Var != null) {
                    am2Var.setVolume(bm2Var.n.P);
                    break;
                }
                break;
            case 26:
                io2 io2Var = (io2) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = io2Var.n;
                boolean z3 = arrayList9 == null || arrayList9.isEmpty();
                io2Var.n = arrayList8;
                q7c q7cVar3 = io2Var.f;
                if (q7cVar3 != null) {
                    q7cVar3.g3.O(z3);
                    break;
                }
                break;
            case 27:
                ((tu2) obj2).c0((TL_account.TL_birthday) obj);
                break;
            default:
                ((hz2) obj2).a1((Pair) obj);
                break;
        }
    }
}
