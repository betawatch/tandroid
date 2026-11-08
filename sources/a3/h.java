package a3;

import ab.c0;
import ab.d0;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.k7;
import bi.v3;
import bi.w2;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import di.i4;
import di.k9;
import di.z3;
import fi.m1;
import fi.q8;
import fi.s8;
import fi.y1;
import fi.z1;
import h9.f0;
import h9.i0;
import h9.t1;
import hi.c4;
import hi.v2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.i1;
import kg.x0;
import li.b2;
import li.f2;
import li.l1;
import li.q3;
import li.t3;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.gz;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.ri;
import org.telegram.messenger.t0;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.wr;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.d4;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.wk;
import org.telegram.ui.an;
import org.telegram.ui.gl0;
import org.telegram.ui.ld;
import org.telegram.ui.qw;
import org.telegram.ui.w91;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements p, SuccessContinuation, androidx.car.app.utils.b, Continuation, qw, wr, k9, ri, r1, OnFailureListener, gl0, vk, m0, fb0, t4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(g1.a aVar, CancellationSignal cancellationSignal, Executor executor, v0.g gVar) {
        this.a = 10;
        this.c = cancellationSignal;
        this.b = executor;
        this.d = gVar;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 27:
                wk wkVar = (wk) this.c;
                wkVar.n0.d((TLRPC.TL_messageMediaGeo) this.b, wkVar.o0, z9, i7, ((Long) this.d).longValue());
                wkVar.b.a(true);
                break;
            default:
                bn bnVar = (bn) this.c;
                bnVar.j0.b((TLRPC.TL_messageMediaToDo) this.b, null, null, null, z9, i7, ((Long) this.d).longValue());
                bnVar.b.a(true);
                break;
        }
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.wr
    public void a(String str) {
        z3 z3Var = (z3) this.c;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.b;
        f6 f6Var = (f6) this.d;
        i4 i4Var = z3Var.x;
        i4Var.getStoriesController().r(i4Var.k1, str, new v3(z3Var, storyItem, f6Var, 3));
    }

    @Override // org.telegram.ui.gl0
    public void b(int i7) {
        switch (this.a) {
            case 12:
                v2 v2Var = (v2) this.c;
                mb0 mb0Var = (mb0) this.d;
                String str = (String) this.b;
                if (i7 != 3) {
                    mb0Var.dismiss();
                }
                v2Var.d.D.G(str, f1.A(i7).toLowerCase(Locale.ROOT), false);
                break;
            default:
                mb0 mb0Var2 = (mb0) this.c;
                c4 c4Var = (c4) this.d;
                String str2 = (String) this.b;
                if (i7 != 3) {
                    mb0Var2.dismiss();
                }
                c4Var.getWebViewContainer().G(str2, f1.A(i7).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        w.b bVar;
        switch (this.a) {
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.b;
                Object obj = this.d;
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
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.c;
                Exception exc = (Exception) this.d;
                String str2 = (String) this.b;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    break;
                } catch (w.f e11) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e11);
                }
        }
    }

    @Override // org.telegram.ui.Components.vk
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        switch (this.a) {
            case 14:
                li.p pVar = (li.p) this.c;
                li.a aVar = (li.a) this.b;
                di diVar = (di) this.d;
                t3 t3Var = pVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    f2 f2Var = t3Var.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    f2 f2Var2 = t3Var.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    pVar.a0(true);
                    diVar.a(true);
                    t3Var.post(new li.f(pVar, aVar, 0));
                    break;
                }
                break;
            default:
                b2 b2Var = (b2) this.c;
                li.a aVar2 = (li.a) this.b;
                di diVar2 = (di) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    f2 f2Var3 = b2Var.P.Q3;
                    if (f2Var3 != null) {
                        f2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    f2 f2Var4 = b2Var.P.Q3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    diVar2.a(true);
                    b2Var.P.post(new l1(b2Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.ri
    public void e(String str, ArrayList arrayList) {
        int i7;
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        y1 y1Var = (y1) this.c;
        String str2 = (String) this.b;
        ui uiVar = (ui) this.d;
        ArrayList arrayList6 = y1Var.h;
        SparseIntArray sparseIntArray = y1Var.D;
        ArrayList arrayList7 = y1Var.n;
        z1 z1Var = y1Var.N;
        ArrayList arrayList8 = y1Var.w;
        HashSet hashSet = y1Var.L;
        ArrayList arrayList9 = y1Var.s;
        if (TextUtils.equals(str2, y1Var.H)) {
            ArrayList j3 = i6.j(y1Var.H, null);
            int i12 = 0;
            for (int i13 = 0; i13 < j3.size(); i13++) {
                try {
                    qi qiVar = new qi();
                    qiVar.a = ((g6) j3.get(i13)).c.toString();
                    arrayList5.add(qiVar);
                } catch (Exception unused) {
                }
            }
            y1Var.y = 0;
            arrayList9.clear();
            arrayList8.clear();
            sparseIntArray.clear();
            arrayList7.clear();
            int i14 = 1;
            y1Var.y++;
            arrayList9.add(null);
            arrayList8.add(0L);
            if (z1Var.a == 0) {
                hashSet.clear();
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    qi qiVar2 = (qi) arrayList5.get(i15);
                    String str3 = qiVar2.a;
                    if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) y1Var.d.get(qiVar2.a)) != null) {
                        hashSet.addAll(arrayList4);
                    }
                }
                arrayList8.addAll(hashSet);
                for (int i16 = 0; i16 < hashSet.size(); i16++) {
                    arrayList9.add(null);
                }
                y1Var.y = hashSet.size() + y1Var.y;
                i7 = 1;
                i10 = 0;
            } else {
                HashMap hashMap = uiVar.d0;
                int i17 = 0;
                while (i17 < arrayList5.size()) {
                    qi qiVar3 = (qi) arrayList5.get(i17);
                    int i18 = i12;
                    String str4 = qiVar3.a;
                    if (str4 == null || str4.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(qiVar3.a)) == null || arrayList3.isEmpty()) {
                        i11 = i14;
                    } else {
                        i11 = i14;
                        for (int i19 = i18; i19 < arrayList3.size(); i19++) {
                            TLRPC.Document document = (TLRPC.Document) arrayList3.get(i19);
                            if (document != null && !arrayList9.contains(document)) {
                                arrayList9.add(document);
                                y1Var.y++;
                            }
                        }
                    }
                    i17++;
                    i12 = i18;
                    i14 = i11;
                }
                i7 = i14;
                i10 = i12;
                ArrayList arrayList10 = uiVar.s0[i10];
                int i20 = i10;
                while (i20 < arrayList5.size()) {
                    qi qiVar4 = (qi) arrayList5.get(i20);
                    String str5 = qiVar4.a;
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
                                String V = ij.V(arrayList2.get(i22), null, null);
                                if (V != null && V.contains(qiVar4.a)) {
                                    arrayList9.add(arrayList2.get(i22));
                                    y1Var.y++;
                                }
                            }
                        }
                    }
                    i20++;
                    arrayList5 = arrayList;
                }
            }
            String O3 = g0.O3((y1Var.H + "").toLowerCase());
            for (int i23 = i10; i23 < arrayList6.size(); i23++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i23);
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String O32 = g0.O3((tL_messages_stickerSet.set.title + "").toLowerCase());
                    if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                        int size = arrayList7.size();
                        arrayList7.add(tL_messages_stickerSet);
                        sparseIntArray.put(y1Var.y, size);
                        arrayList9.add(null);
                        y1Var.y++;
                        arrayList9.addAll(tL_messages_stickerSet.documents);
                        y1Var.y = tL_messages_stickerSet.documents.size() + y1Var.y;
                    }
                }
            }
            int i24 = i7;
            boolean z9 = (arrayList8.size() > i24 || arrayList9.size() > i24) ? i10 : i24;
            y1Var.x = z9;
            if (z9 != 0) {
                y1Var.y += i24;
            }
            if (z9 == 0) {
                y1Var.K += i24;
            }
            y1Var.I = y1Var.H;
            y1Var.f();
            boolean z10 = i10;
            m1.z1(z1Var.b, z10 ? 1 : 0, z10 ? 1 : 0);
            z1Var.f.c(z10);
            z1Var.e.n(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 9:
                ((s8) this.c).N0((q8) this.b, (Runnable) this.d, true);
                break;
            case 11:
                Activity activity = (Activity) this.c;
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + t0.b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                nVar.a(bool, bool);
                break;
            case 13:
                i1 i1Var = (i1) this.c;
                boolean[] zArr2 = (boolean[]) this.b;
                TLRPC.User user = (TLRPC.User) this.d;
                i1Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    qp.s1(i1Var.f).d7.edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    i1Var.G();
                    break;
                }
                break;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.b;
                li.c4 c4Var = (li.c4) this.d;
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
                boolean[] zArr3 = (boolean[]) this.c;
                c20 c20Var = (c20) this.b;
                u1[] u1VarArr = (u1[]) this.d;
                zArr3[0] = true;
                c20Var.a(Boolean.FALSE);
                u1VarArr[0].dismiss();
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ij ijVar = (ij) this.b;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                Activity activity2 = chatActivityEnterView.O2;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    gz.C(chatActivityEnterView.Q).o0(ijVar, keyboardButtonProto);
                    break;
                } else {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.i3 = ijVar;
                    chatActivityEnterView.j3 = keyboardButtonProto;
                    break;
                }
            case 24:
                di diVar = (di) this.c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i11 = diVar.D3;
                if (tL_attachMenuBot == null) {
                    ui.b0(i11).L1(user2.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = qp.s1(i11).q1(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new ld(11, diVar, tL_attachMenuBot), 66);
                    break;
                }
            case 26:
                ik ikVar = (ik) this.c;
                x0 x0Var = (x0) this.b;
                c2 c2Var = (c2) this.d;
                TextView textView = ikVar.U;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim3 = x0Var.getText().toString().trim();
                    ikVar.s0 = TextUtils.isEmpty(trim3) ? null : trim3;
                    ikVar.t0 = !c2Var.b();
                    if (TextUtils.isEmpty(ikVar.s0)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(ikVar.s0);
                        textView.setVisibility(0);
                    }
                    ikVar.k0();
                    u1Var.dismiss();
                    ikVar.a0();
                    break;
                } else {
                    int i12 = -ikVar.v0;
                    ikVar.v0 = i12;
                    g0.G3(i12, x0Var, null);
                    break;
                }
            default:
                bn bnVar = (bn) this.c;
                View view = (View) this.b;
                a6 a6Var = (a6) this.d;
                bnVar.getClass();
                view.setTag(null);
                bnVar.c0(view, a6Var, false);
                break;
        }
    }

    @Override // a3.p
    public t1 h(int i7, e2.m1 m1Var, int[] iArr) {
        n nVar = (n) this.c;
        String str = (String) this.b;
        String str2 = (String) this.d;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.a; i10++) {
            p10.c(new o(i7, m1Var, i10, nVar, iArr[i10], str, str2));
        }
        return p10.f();
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        t4 t4Var = (t4) this.c;
        boolean[] zArr = (boolean[]) this.b;
        h9.f1 f1Var = (h9.f1) this.d;
        if (i7 == 1) {
            t4Var.L(2147483646, 0, zArr[0]);
            ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
        }
    }

    @Override // org.telegram.ui.Components.fb0
    public void n(hb0 hb0Var, int i7) {
        switch (this.a) {
            case 19:
                v4.g(null, null, 0L, 0L, 0, (hb0) this.c, (org.telegram.ui.Components.c4) this.b, (d4) this.d);
                break;
            default:
                v4.g(null, null, 0L, 0L, 0, (hb0) this.c, (u3) this.b, (org.telegram.ui.Components.v3) this.d);
                break;
        }
    }

    @Override // di.k9
    public void o(Canvas canvas, RectF rectF, float f10) {
        o7 o7Var = (o7) this.c;
        ui0 ui0Var = (ui0) this.b;
        int[] iArr = (int[]) this.d;
        o7Var.c(canvas, rectF, f10);
        o7Var.f(canvas, rectF, f10);
        if (o7Var.h) {
            o7Var.b(canvas, rectF, f10);
        } else {
            o7Var.e(canvas, rectF, f10);
        }
        if (ui0Var != null && ui0Var.a0 && ui0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            ui0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e10) {
        w0.i hVar;
        CancellationSignal cancellationSignal = (CancellationSignal) this.c;
        Executor executor = (Executor) this.b;
        v0.g gVar = (v0.g) this.d;
        kotlin.jvm.internal.j.e(e10, "e");
        if (e10 instanceof com.google.android.gms.common.api.f) {
            int statusCode = ((com.google.android.gms.common.api.f) e10).getStatusCode();
            if (statusCode == 16) {
                hVar = new w0.g(e10.getMessage());
            } else if (b1.d.b.contains(Integer.valueOf(statusCode))) {
                hVar = new w0.j(e10.getMessage());
            } else {
                hVar = new w0.h(2, "Get digital credential failed, failure: " + e10);
            }
        } else {
            hVar = new w0.h(2, "Get digital credential failed, failure: " + e10);
        }
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        executor.execute(new b1.g(gVar, hVar, 2));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
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

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        switch (this.a) {
            case 5:
                k7 k7Var = (k7) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                ww wwVar2 = (ww) this.d;
                if (!arrayList.isEmpty()) {
                    long j3 = ((xr) arrayList.get(0)).a;
                    Long l10 = (Long) org.telegram.messenger.d4.f(k7Var.a).r.get(tL_starGiftUnique.slug);
                    long longValue = l10 != null ? l10.longValue() : 0L;
                    if (longValue == 0 || longValue == j3) {
                        org.telegram.messenger.d4.f(k7Var.a).s(j3, new ig.b(null, tL_starGiftUnique.slug), null, true);
                        wwVar2.presentFragment(an.ra(j3), true);
                    } else {
                        v4.k0(k7Var.getContext(), k7Var.I0, k7Var.a, tL_starGiftUnique, longValue, new w2(k7Var, j3, tL_starGiftUnique, wwVar2, 1));
                    }
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ij ijVar = (ij) this.b;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                an anVar = chatActivityEnterView.P2;
                TLRPC.Message message = ijVar.k;
                long j10 = message.from_id.user_id;
                long j11 = message.via_bot_id;
                if (j11 != 0) {
                    j10 = j11;
                }
                TLRPC.User a22 = qp.s1(chatActivityEnterView.R.a).a2(Long.valueOf(j10));
                if (a22 != null) {
                    long j12 = ((xr) arrayList.get(0)).a;
                    ui.b0(chatActivityEnterView.Q).Q1(j12, 0, "@" + t10.n(a22) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
                    if (j12 == chatActivityEnterView.Q2) {
                        wwVar.finishFragment();
                        break;
                    } else if (!m5.C(j12)) {
                        Bundle bundle = new Bundle();
                        if (m5.E(j12)) {
                            bundle.putLong("user_id", j12);
                        } else {
                            bundle.putLong("chat_id", -j12);
                        }
                        if (qp.s1(chatActivityEnterView.R.a).E(bundle, wwVar, null, null)) {
                            if (!anVar.presentFragment(new an(bundle), true)) {
                                wwVar.finishFragment();
                                break;
                            } else if (!g0.Q1()) {
                                anVar.removeSelfFromStack();
                                break;
                            }
                        }
                    } else {
                        wwVar.finishFragment();
                        break;
                    }
                } else {
                    wwVar.finishFragment();
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ h(Object obj, Object obj2, String str, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.c;
        String str = (String) this.b;
        c0 c0Var = (c0) this.d;
        String str2 = (String) obj;
        d0 c10 = FirebaseMessaging.c(firebaseMessaging.b);
        o9.g gVar = firebaseMessaging.a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.b)) {
            d = "";
        } else {
            d = gVar.d();
        }
        String a10 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a11 = c0.a(System.currentTimeMillis(), str2, a10);
            if (a11 != null) {
                SharedPreferences.Editor edit = c10.a.edit();
                edit.putString(d + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.r() || c0Var == null || !str2.equals(c0Var.a)) {
            o9.g gVar2 = firebaseMessaging.a;
            gVar2.a();
            String str3 = gVar2.b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(str3);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                boolean r10 = firebaseMessaging.d.r();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (r10) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new ab.k(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
