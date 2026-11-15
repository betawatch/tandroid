package ai;

import a8.ja;
import a8.xa;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.r3;
import org.telegram.messenger.si;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.an;
import org.telegram.ui.d30;
import org.telegram.ui.h30;
import org.telegram.ui.ld0;
import org.telegram.ui.pa0;
import org.telegram.ui.sg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements pi, org.telegram.ui.ActionBar.q1, h2.o, NativeInstance.PayloadCallback, v10, p4.l0, h2.j, w5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r1(int i7, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // h2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj) {
        p4.m1 m1Var;
        p4.d0 d0Var = (p4.d0) this.c;
        p4.v vVar = (p4.v) this.d;
        try {
            m1Var = (p4.m1) ((m9.y) obj).get();
            ja.k(m1Var, "SessionResult must not be null");
        } catch (InterruptedException e10) {
            e = e10;
            h2.a.m("MediaSessionStub", "Session operation failed", e);
            m1Var = new p4.m1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e11) {
            h2.a.m("MediaSessionStub", "Session operation cancelled", e11);
            m1Var = new p4.m1(1);
        } catch (ExecutionException e12) {
            e = e12;
            h2.a.m("MediaSessionStub", "Session operation failed", e);
            m1Var = new p4.m1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        p4.c1.r1(d0Var, vVar, this.b, m1Var);
    }

    @Override // org.telegram.messenger.pi
    public void c(String str, ArrayList arrayList) {
        jg.a2 a2Var = (jg.a2) this.c;
        HashMap hashMap = (HashMap) this.d;
        jg.c2 c2Var = a2Var.a;
        int i7 = c2Var.Q;
        HashMap hashMap2 = c2Var.J;
        if (this.b != i7) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((oi) arrayList.get(i10)).a;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                a2Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    c2Var.K.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            c2Var.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4.l0
    public void f(p4.v vVar) {
        byte[] bArr;
        p4.m0 m0Var = (p4.m0) this.c;
        q4.h hVar = (q4.h) this.d;
        if (TextUtils.isEmpty(hVar.a)) {
            h2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i7 = p4.n.a;
        String str = hVar.a;
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.b;
        h9.s1 s1Var = h9.s1.e;
        List list = Collections.EMPTY_LIST;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(21, false);
        a0Var.b = hVar.r;
        e2.h0 h0Var2 = new e2.h0(a0Var);
        CharSequence charSequence = hVar.b;
        e2.n0 n0Var = new e2.n0();
        n0Var.f = hVar.c;
        n0Var.g = hVar.d;
        n0Var.n = hVar.h;
        n0Var.i = p4.n.c(null);
        Bitmap bitmap = hVar.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (hVar.f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        hVar.f = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } catch (IOException e10) {
                    h2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e10);
                }
            }
            bArr = hVar.f;
        }
        int i10 = 3;
        if (bArr != null) {
            n0Var.b(bArr, 3);
        }
        Bundle bundle = hVar.n;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j3 = bundle2.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j3 != 0) {
                if (j3 == 1) {
                    i10 = 1;
                } else if (j3 == 2) {
                    i10 = 2;
                } else if (j3 != 3) {
                    if (j3 == 4) {
                        i10 = 4;
                    } else if (j3 == 5) {
                        i10 = 5;
                    } else if (j3 == 6) {
                        i10 = 6;
                    }
                }
                n0Var.q = Integer.valueOf(i10);
                bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            n0Var.q = Integer.valueOf(i10);
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        n0Var.r = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            n0Var.H = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            n0Var.J = h9.i0.q(h9.i0.q(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            n0Var.a = charSequence;
        } else {
            n0Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            n0Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            n0Var.I = bundle2;
        }
        n0Var.s = Boolean.TRUE;
        m9.y l10 = m0Var.h.l(vVar, h9.i0.u(new e2.l0(str2, new e2.b0(zVar), null, new e2.f0(e0Var), new e2.o0(n0Var), h0Var2)));
        l10.b(new m9.u((int) (null == true ? 1 : 0), (Object) l10, (Object) new xa(m0Var, vVar, this.b)), m9.r.a);
    }

    @Override // w5.b
    public Object g() {
        ia.c cVar = (ia.c) this.c;
        ((ld0) cVar.d).H((o5.i) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 2:
                kg.s sVar = (kg.s) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() <= 32) {
                    kg.y d = kg.y.d(this.b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    t1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.E3(sVar);
                    break;
                }
            case 3:
            case 4:
            case 9:
            case 14:
            default:
                StickersActivity.f0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
            case 5:
                an anVar = (an) this.c;
                anVar.getMessagesController().C3(anVar.e, anVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                xb B = cc.B(anVar, true, null, null, anVar.Aa);
                B.j();
                cb cbVar = B.e;
                cbVar.postDelayed(new sg(0, cbVar), 550L);
                break;
            case 6:
                an.M0((an) this.c, this.b, (gj) this.d);
                break;
            case 7:
                s4 s4Var = (s4) this.c;
                tr trVar = (tr) this.d;
                String trim = s4Var.getText().toString().trim();
                if (trim.length() <= this.b && !trim.isEmpty()) {
                    trVar.a(trim);
                    t1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.E3(s4Var);
                    break;
                }
                break;
            case 8:
                ol0 ol0Var = (ol0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = ol0Var.getText().toString();
                if (obj2.length() <= 12) {
                    np.s1(this.b).l4(ch.p0.d(reaction), obj2);
                    t1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.E3(ol0Var);
                    break;
                }
            case 10:
                d30 d30Var = (d30) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                h30 h30Var = d30Var.s1;
                r3 r3Var = h30Var.b.V2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i10 = this.b;
                r3Var.A(i10, obj3);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                h30Var.b.n1().j(i10 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.e0;
                if (!arrayList.isEmpty() && org.telegram.messenger.g0.J1((org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList))) {
                    pa0 pa0Var = new pa0(0);
                    pa0Var.H0 = new s1(hashMap, this.b, 14);
                    launchActivity.t0(pa0Var);
                    break;
                }
                break;
            case 12:
                ((pa0) this.c).I0(900, this.b, (TLRPC.User) this.d);
                break;
            case 13:
                PasscodeActivity.Z((PasscodeActivity) this.c, (ib0) this.d, this.b);
                break;
            case 15:
                SessionsActivity.c0((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        e2.b1 b1Var = (e2.b1) this.c;
        e2.b1 b1Var2 = (e2.b1) this.d;
        e2.a1 a1Var = (e2.a1) obj;
        int i7 = this.b;
        a1Var.g(i7);
        a1Var.s(b1Var, b1Var2, i7);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i7 = this.b;
        String V = gj.V(document, "😀", Integer.valueOf(i7));
        String str = TextUtils.isEmpty(V) ? "😀" : V;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = si.Z(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = si.a0(document, str);
        ConnectionsManager.getInstance(m10.t0).sendRequest(tL_stickers_addStickerToSet, new bg.k0(t1Var, i7, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            t1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i7, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i7, str);
    }

    public /* synthetic */ r1(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ r1(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
