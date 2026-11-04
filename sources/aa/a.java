package aa;

import ai.m;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import ci.l2;
import ci.l6;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ei.b4;
import ei.h9;
import ei.j4;
import ei.m9;
import gi.r8;
import gi.t8;
import gi.x1;
import gi.y1;
import ii.d4;
import ii.v2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import l9.q;
import l9.r;
import l9.y;
import lg.y0;
import m2.s;
import mi.c2;
import mi.c4;
import mi.g2;
import mi.m1;
import mi.p;
import mi.q3;
import mi.t3;
import o4.b1;
import o4.e0;
import o4.e1;
import o4.n0;
import o4.n1;
import o4.o0;
import o4.r1;
import o4.v;
import o4.v0;
import o4.w;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.ii;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.or;
import org.telegram.messenger.pr;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l0;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.cl0;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Continuation, androidx.car.app.utils.b, nw, or, m9, ii, p1, cl0, tk, n0, q, l0, ab0, r4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 27:
                uk ukVar = (uk) this.b;
                ukVar.o0.d((TLRPC.TL_messageMediaGeo) this.c, ukVar.p0, z10, i3, ((Long) this.d).longValue());
                ukVar.b.a(true);
                break;
            default:
                an anVar = (an) this.b;
                anVar.k0.c((TLRPC.TL_messageMediaToDo) this.c, null, null, null, z10, i3, ((Long) this.d).longValue());
                anVar.b.a(true);
                break;
        }
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.or
    public void a(String str) {
        b4 b4Var = (b4) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        e6 e6Var = (e6) this.d;
        j4 j4Var = b4Var.x;
        j4Var.getStoriesController().r(j4Var.l1, str, new m(b4Var, storyItem, e6Var, 5));
    }

    @Override // l9.q
    public y apply(Object obj) {
        int i3 = this.a;
        int i10 = 3;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i3) {
            case 15:
                e0 e0Var = (e0) obj4;
                Handler handler = e0Var.l;
                s sVar = new s(e0Var, (v) obj3, new lg.y(e0Var, (v0) obj2, (w) obj, 14));
                r1 r1Var = new r1(0);
                String str = g2.n0.a;
                l9.e0 e0Var2 = new l9.e0();
                g2.n0.W(handler, new h9(e0Var2, sVar, r1Var, i10));
                return e0Var2;
            default:
                e0 e0Var3 = (e0) obj4;
                v vVar = (v) obj3;
                List list = (List) obj;
                Handler handler2 = e0Var3.l;
                s sVar2 = new s(e0Var3, vVar, new b1(e0Var3, (e1) obj2, vVar, list, 0));
                r1 r1Var2 = new r1(0);
                String str2 = g2.n0.a;
                l9.e0 e0Var4 = new l9.e0();
                g2.n0.W(handler2, new h9(e0Var4, sVar2, r1Var2, i10));
                return e0Var4;
        }
    }

    @Override // o4.n0
    public void c(v vVar) {
        o0 o0Var = (o0) this.b;
        Bundle bundle = (Bundle) this.c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        e0 e0Var = o0Var.h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        l9.w n4 = e0Var.n(vVar);
        if (resultReceiver != null) {
            n4.b(new s(15, n4, resultReceiver), r.a);
        }
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        w.b bVar;
        switch (this.a) {
            case 1:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str = (String) this.d;
                Object obj = this.c;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e10) {
                        androidx.car.app.utils.g.f(iOnDoneCallback, str, e10);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                break;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.b;
                Exception exc = (Exception) this.c;
                String str2 = (String) this.d;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    break;
                } catch (w.f e11) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e11);
                }
        }
    }

    @Override // org.telegram.ui.Components.tk
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        switch (this.a) {
            case 11:
                p pVar = (p) this.b;
                mi.a aVar = (mi.a) this.c;
                bi biVar = (bi) this.d;
                t3 t3Var = pVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    g2 g2Var2 = t3Var.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    pVar.a0(true);
                    biVar.a(true);
                    t3Var.post(new mi.g(pVar, aVar, 0));
                    break;
                }
                break;
            default:
                c2 c2Var = (c2) this.b;
                mi.a aVar2 = (mi.a) this.c;
                bi biVar2 = (bi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    g2 g2Var3 = c2Var.Q.R3;
                    if (g2Var3 != null) {
                        g2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    g2 g2Var4 = c2Var.Q.R3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    biVar2.a(true);
                    c2Var.Q.post(new m1(c2Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.cl0
    public void e(int i3) {
        switch (this.a) {
            case 9:
                v2 v2Var = (v2) this.b;
                hb0 hb0Var = (hb0) this.c;
                String str = (String) this.d;
                if (i3 != 3) {
                    hb0Var.dismiss();
                }
                v2Var.d.E.F(str, f1.D(i3).toLowerCase(Locale.ROOT), false);
                break;
            default:
                hb0 hb0Var2 = (hb0) this.b;
                d4 d4Var = (d4) this.c;
                String str2 = (String) this.d;
                if (i3 != 3) {
                    hb0Var2.dismiss();
                }
                d4Var.getWebViewContainer().F(str2, f1.D(i3).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // ei.m9
    public void f(Canvas canvas, RectF rectF, float f10) {
        n7 n7Var = (n7) this.b;
        yi0 yi0Var = (yi0) this.c;
        int[] iArr = (int[]) this.d;
        n7Var.c(canvas, rectF, f10);
        n7Var.f(canvas, rectF, f10);
        if (n7Var.h) {
            n7Var.b(canvas, rectF, f10);
        } else {
            n7Var.e(canvas, rectF, f10);
        }
        if (yi0Var != null && yi0Var.b0 && yi0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            yi0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        switch (this.a) {
            case 7:
                ((t8) this.b).N0((r8) this.c, (Runnable) this.d, true);
                break;
            case 8:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + t0.b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                pVar.a(bool, bool);
                break;
            case 10:
                kg.e1 e1Var = (kg.e1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                e1Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    hp.s1(e1Var.f).d7.edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    e1Var.G();
                    break;
                }
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                c4 c4Var = (c4) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i10 = c4Var.a;
                    q3 q3Var = c4Var.b;
                    switch (i10) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            q3Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            q3Var.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 17:
                boolean[] zArr3 = (boolean[]) this.b;
                u10 u10Var = (u10) this.c;
                s1[] s1VarArr = (s1[]) this.d;
                zArr3[0] = true;
                u10Var.a(Boolean.FALSE);
                s1VarArr[0].dismiss();
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                zi ziVar = (zi) this.c;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                Activity activity2 = chatActivityEnterView.P2;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    yy.C(chatActivityEnterView.R).o0(ziVar, keyboardButtonProto);
                    break;
                } else {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.j3 = ziVar;
                    chatActivityEnterView.k3 = keyboardButtonProto;
                    break;
                }
            case 24:
                bi biVar = (bi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i11 = biVar.E3;
                if (tL_attachMenuBot == null) {
                    li.b0(i11).L1(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = hp.s1(i11).q1(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new h6(14, biVar, tL_attachMenuBot), 66);
                    break;
                }
            case 26:
                hk hkVar = (hk) this.b;
                y0 y0Var = (y0) this.c;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.d;
                TextView textView = hkVar.V;
                if (y0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim3 = y0Var.getText().toString().trim();
                    hkVar.t0 = TextUtils.isEmpty(trim3) ? null : trim3;
                    hkVar.u0 = !c2Var.b();
                    if (TextUtils.isEmpty(hkVar.t0)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(hkVar.t0);
                        textView.setVisibility(0);
                    }
                    hkVar.k0();
                    s1Var.dismiss();
                    hkVar.a0();
                    break;
                } else {
                    int i12 = -hkVar.w0;
                    hkVar.w0 = i12;
                    g0.G3(i12, y0Var, null);
                    break;
                }
            default:
                an anVar = (an) this.b;
                View view = (View) this.c;
                z5 z5Var = (z5) this.d;
                anVar.getClass();
                view.setTag(null);
                anVar.c0(view, z5Var, false);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        int i3;
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        x1 x1Var = (x1) this.b;
        String str2 = (String) this.c;
        li liVar = (li) this.d;
        ArrayList arrayList6 = x1Var.h;
        SparseIntArray sparseIntArray = x1Var.E;
        ArrayList arrayList7 = x1Var.n;
        y1 y1Var = x1Var.O;
        ArrayList arrayList8 = x1Var.w;
        HashSet hashSet = x1Var.M;
        ArrayList arrayList9 = x1Var.s;
        if (TextUtils.equals(str2, x1Var.I)) {
            ArrayList j10 = i6.j(x1Var.I, null);
            int i12 = 0;
            for (int i13 = 0; i13 < j10.size(); i13++) {
                try {
                    hi hiVar = new hi();
                    hiVar.a = ((g6) j10.get(i13)).c.toString();
                    arrayList5.add(hiVar);
                } catch (Exception unused) {
                }
            }
            x1Var.y = 0;
            arrayList9.clear();
            arrayList8.clear();
            sparseIntArray.clear();
            arrayList7.clear();
            int i14 = 1;
            x1Var.y++;
            arrayList9.add(null);
            arrayList8.add(0L);
            if (y1Var.a == 0) {
                hashSet.clear();
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    hi hiVar2 = (hi) arrayList5.get(i15);
                    String str3 = hiVar2.a;
                    if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) x1Var.d.get(hiVar2.a)) != null) {
                        hashSet.addAll(arrayList4);
                    }
                }
                arrayList8.addAll(hashSet);
                for (int i16 = 0; i16 < hashSet.size(); i16++) {
                    arrayList9.add(null);
                }
                x1Var.y = hashSet.size() + x1Var.y;
                i3 = 1;
                i10 = 0;
            } else {
                HashMap hashMap = liVar.e0;
                int i17 = 0;
                while (i17 < arrayList5.size()) {
                    hi hiVar3 = (hi) arrayList5.get(i17);
                    int i18 = i12;
                    String str4 = hiVar3.a;
                    if (str4 == null || str4.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(hiVar3.a)) == null || arrayList3.isEmpty()) {
                        i11 = i14;
                    } else {
                        i11 = i14;
                        for (int i19 = i18; i19 < arrayList3.size(); i19++) {
                            TLRPC.Document document = (TLRPC.Document) arrayList3.get(i19);
                            if (document != null && !arrayList9.contains(document)) {
                                arrayList9.add(document);
                                x1Var.y++;
                            }
                        }
                    }
                    i17++;
                    i12 = i18;
                    i14 = i11;
                }
                i3 = i14;
                i10 = i12;
                ArrayList arrayList10 = liVar.t0[i10];
                int i20 = i10;
                while (i20 < arrayList5.size()) {
                    hi hiVar4 = (hi) arrayList5.get(i20);
                    String str5 = hiVar4.a;
                    if (str5 != null && !str5.startsWith("animated_")) {
                        for (int i21 = i10; i21 < arrayList10.size(); i21++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i21);
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            } else if (!stickerSetCovered.covers.isEmpty()) {
                                arrayList2 = stickerSetCovered.covers;
                            } else if (stickerSetCovered.cover != null) {
                                ArrayList<TLRPC.Document> arrayList11 = new ArrayList<>();
                                arrayList11.add(stickerSetCovered.cover);
                                arrayList2 = arrayList11;
                            }
                            for (int i22 = i10; i22 < arrayList2.size(); i22++) {
                                String V = zi.V(arrayList2.get(i22), null, null);
                                if (V != null && V.contains(hiVar4.a)) {
                                    arrayList9.add(arrayList2.get(i22));
                                    x1Var.y++;
                                }
                            }
                        }
                    }
                    i20++;
                    arrayList5 = arrayList;
                }
            }
            String O3 = g0.O3((x1Var.I + "").toLowerCase());
            for (int i23 = i10; i23 < arrayList6.size(); i23++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i23);
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String O32 = g0.O3((tL_messages_stickerSet.set.title + "").toLowerCase());
                    if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                        int size = arrayList7.size();
                        arrayList7.add(tL_messages_stickerSet);
                        sparseIntArray.put(x1Var.y, size);
                        arrayList9.add(null);
                        x1Var.y++;
                        arrayList9.addAll(tL_messages_stickerSet.documents);
                        x1Var.y = tL_messages_stickerSet.documents.size() + x1Var.y;
                    }
                }
            }
            int i24 = i3;
            boolean z10 = (arrayList8.size() > i24 || arrayList9.size() > i24) ? i10 : i24;
            x1Var.x = z10;
            if (z10 != 0) {
                x1Var.y += i24;
            }
            if (z10 == 0) {
                x1Var.L += i24;
            }
            x1Var.J = x1Var.I;
            x1Var.f();
            boolean z11 = i10;
            gi.m1.z1(y1Var.b, z11 ? 1 : 0, z11 ? 1 : 0);
            y1Var.f.c(z11);
            y1Var.e.n(z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        r4 r4Var = (r4) this.b;
        boolean[] zArr = (boolean[]) this.c;
        hi.d dVar = (hi.d) this.d;
        if (i3 == 1) {
            r4Var.L(2147483646, 0, zArr[0]);
            ((t2) dVar.b).y0.run();
        }
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        switch (this.a) {
            case 19:
                t4.g(null, null, 0L, 0L, 0, (cb0) this.b, (a4) this.c, (org.telegram.ui.Components.b4) this.d);
                break;
            default:
                t4.g(null, null, 0L, 0L, 0, (cb0) this.b, (s3) this.c, (org.telegram.ui.Components.t3) this.d);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.d;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        switch (this.a) {
            case 3:
                l6 l6Var = (l6) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                uw uwVar2 = (uw) this.d;
                if (!arrayList.isEmpty()) {
                    long j10 = ((pr) arrayList.get(0)).a;
                    Long l10 = (Long) org.telegram.messenger.d4.f(l6Var.a).r.get(tL_starGiftUnique.slug);
                    long longValue = l10 != null ? l10.longValue() : 0L;
                    if (longValue == 0 || longValue == j10) {
                        org.telegram.messenger.d4.f(l6Var.a).s(j10, new jg.b(null, tL_starGiftUnique.slug), null, true);
                        uwVar2.presentFragment(wm.ra(j10), true);
                    } else {
                        t4.m0(l6Var.getContext(), l6Var.J0, l6Var.a, tL_starGiftUnique, longValue, new l2(l6Var, j10, tL_starGiftUnique, uwVar2, 1));
                    }
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                zi ziVar = (zi) this.c;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                wm wmVar = chatActivityEnterView.Q2;
                TLRPC.Message message = ziVar.k;
                long j11 = message.from_id.user_id;
                long j12 = message.via_bot_id;
                if (j12 != 0) {
                    j11 = j12;
                }
                TLRPC.User a22 = hp.s1(chatActivityEnterView.S.a).a2(Long.valueOf(j11));
                if (a22 != null) {
                    long j13 = ((pr) arrayList.get(0)).a;
                    li.b0(chatActivityEnterView.R).Q1(j13, 0, "@" + l10.n(a22) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
                    if (j13 == chatActivityEnterView.R2) {
                        uwVar.finishFragment();
                        break;
                    } else if (!m5.C(j13)) {
                        Bundle bundle = new Bundle();
                        if (m5.E(j13)) {
                            bundle.putLong("user_id", j13);
                        } else {
                            bundle.putLong("chat_id", -j13);
                        }
                        if (hp.s1(chatActivityEnterView.S.a).E(bundle, uwVar, null, null)) {
                            if (!wmVar.presentFragment(new wm(bundle), true)) {
                                uwVar.finishFragment();
                                break;
                            } else if (!g0.Q1()) {
                                wmVar.removeSelfFromStack();
                                break;
                            }
                        }
                    } else {
                        uwVar.finishFragment();
                        break;
                    }
                } else {
                    uwVar.finishFragment();
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ a(o0 o0Var, n1 n1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 14;
        this.b = o0Var;
        this.c = bundle;
        this.d = resultReceiver;
    }
}
