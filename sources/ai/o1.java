package ai;

import a8.ma;
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
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ni;
import org.telegram.messenger.oi;
import org.telegram.messenger.ri;
import org.telegram.messenger.rr;
import org.telegram.messenger.s10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Wallet.o6;
import org.telegram.ui.bn;
import org.telegram.ui.f30;
import org.telegram.ui.j30;
import org.telegram.ui.pa0;
import org.telegram.ui.sg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements org.telegram.ui.ActionBar.q1, oi, h2.o, NativeInstance.PayloadCallback, s10, p4.m0, h2.j, w5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o1(int i7, Object obj, Object obj2, int i10) {
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
        p4.n1 n1Var;
        p4.d0 d0Var = (p4.d0) this.c;
        p4.v vVar = (p4.v) this.d;
        try {
            n1Var = (p4.n1) ((m9.y) obj).get();
            ma.k(n1Var, "SessionResult must not be null");
        } catch (InterruptedException e10) {
            e = e10;
            h2.a.m("MediaSessionStub", "Session operation failed", e);
            n1Var = new p4.n1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e11) {
            h2.a.m("MediaSessionStub", "Session operation cancelled", e11);
            n1Var = new p4.n1(1);
        } catch (ExecutionException e12) {
            e = e12;
            h2.a.m("MediaSessionStub", "Session operation failed", e);
            n1Var = new p4.n1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        p4.d1.r1(d0Var, vVar, this.b, n1Var);
    }

    @Override // org.telegram.messenger.oi
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
            String str2 = ((ni) arrayList.get(i10)).a;
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
    @Override // p4.m0
    public void f(p4.v vVar) {
        byte[] bArr;
        p4.n0 n0Var = (p4.n0) this.c;
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
        e2.n0 n0Var2 = new e2.n0();
        n0Var2.f = hVar.c;
        n0Var2.g = hVar.d;
        n0Var2.n = hVar.h;
        n0Var2.i = p4.n.c(null);
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
            n0Var2.b(bArr, 3);
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
                n0Var2.q = Integer.valueOf(i10);
                bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            n0Var2.q = Integer.valueOf(i10);
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        n0Var2.r = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            n0Var2.H = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            n0Var2.J = h9.i0.q(h9.i0.q(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            n0Var2.a = charSequence;
        } else {
            n0Var2.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            n0Var2.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            n0Var2.I = bundle2;
        }
        n0Var2.s = Boolean.TRUE;
        m9.y l10 = n0Var.h.l(vVar, h9.i0.u(new e2.l0(str2, new e2.b0(zVar), null, new e2.f0(e0Var), new e2.o0(n0Var2), h0Var2)));
        l10.b(new m9.u((int) (null == true ? 1 : 0), (Object) l10, (Object) new xa(n0Var, vVar, this.b)), m9.r.a);
    }

    @Override // w5.b
    public Object h() {
        ia.c cVar = (ia.c) this.c;
        ((i61) cVar.d).N((o5.i) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                o6.N0(this.b, (Context) this.c, (i6) this.d);
                break;
            case 2:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.f0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
            case 3:
                kg.s sVar = (kg.s) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() <= 32) {
                    kg.z d = kg.z.d(this.b);
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
                    org.telegram.messenger.g0.D3(sVar);
                    break;
                }
            case 6:
                bn bnVar = (bn) this.c;
                bnVar.getMessagesController().J3(bnVar.e, bnVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                fc B = kc.B(bnVar, true, null, null, bnVar.Ba);
                B.j();
                kb kbVar = B.e;
                kbVar.postDelayed(new sg(0, kbVar), 550L);
                break;
            case 7:
                bn.M0((bn) this.c, this.b, (fj) this.d);
                break;
            case 8:
                a5 a5Var = (a5) this.c;
                rr rrVar = (rr) this.d;
                String trim = a5Var.getText().toString().trim();
                if (trim.length() <= this.b && !trim.isEmpty()) {
                    rrVar.a(trim);
                    t1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.D3(a5Var);
                    break;
                }
                break;
            case 9:
                yl0 yl0Var = (yl0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = yl0Var.getText().toString();
                if (obj2.length() <= 12) {
                    mp.u1(this.b).t4(ch.p0.d(reaction), obj2);
                    t1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.D3(yl0Var);
                    break;
                }
            case 11:
                f30 f30Var = (f30) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                j30 j30Var = f30Var.s1;
                t3 t3Var = j30Var.b.V2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i10 = this.b;
                t3Var.A(i10, obj3);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                j30Var.b.o1().j(i10 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.e0;
                if (!arrayList.isEmpty() && org.telegram.messenger.g0.J1((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList))) {
                    pa0 pa0Var = new pa0(0);
                    pa0Var.M0 = new n1(hashMap, this.b, 13);
                    launchActivity.t0(pa0Var);
                    break;
                }
                break;
            case 13:
                ((pa0) this.c).I0(900, this.b, (TLRPC.User) this.d);
                break;
            case 14:
                PasscodeActivity.Z((PasscodeActivity) this.c, (qb0) this.d, this.b);
                break;
            case 16:
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

    @Override // org.telegram.messenger.s10
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i7 = this.b;
        String V = fj.V(document, "😀", Integer.valueOf(i7));
        String str = TextUtils.isEmpty(V) ? "😀" : V;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = ri.b0(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = ri.c0(document, str);
        ConnectionsManager.getInstance(i10.t0).sendRequest(tL_stickers_addStickerToSet, new bg.l0(t1Var, i7, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            t1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i7, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i7, str);
    }

    public /* synthetic */ o1(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ o1(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
