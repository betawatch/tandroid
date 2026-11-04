package k2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import b8.kg;
import b8.zb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kg.w1;
import kg.y1;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.ii;
import org.telegram.messenger.li;
import org.telegram.messenger.or;
import org.telegram.messenger.q10;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.c30;
import org.telegram.ui.la0;
import org.telegram.ui.pg;
import org.telegram.ui.wm;
import org.telegram.ui.x20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements g2.p, ii, org.telegram.ui.ActionBar.p1, o4.n0, g2.k, NativeInstance.PayloadCallback, q10, v5.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(int i3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // g2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj) {
        o4.r1 r1Var;
        o4.e0 e0Var = (o4.e0) this.c;
        o4.v vVar = (o4.v) this.d;
        try {
            r1Var = (o4.r1) ((l9.y) obj).get();
            zb.k(r1Var, "SessionResult must not be null");
        } catch (InterruptedException e10) {
            e = e10;
            g2.a.m("MediaSessionStub", "Session operation failed", e);
            r1Var = new o4.r1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e11) {
            g2.a.m("MediaSessionStub", "Session operation cancelled", e11);
            r1Var = new o4.r1(1);
        } catch (ExecutionException e12) {
            e = e12;
            g2.a.m("MediaSessionStub", "Session operation failed", e);
            r1Var = new o4.r1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        o4.h1.R0(e0Var, vVar, this.b, r1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o4.n0
    public void c(o4.v vVar) {
        byte[] bArr;
        o4.o0 o0Var = (o4.o0) this.c;
        p4.h hVar = (p4.h) this.d;
        if (TextUtils.isEmpty(hVar.a)) {
            g2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i3 = o4.n.a;
        String str = hVar.a;
        d2.b0 b0Var = new d2.b0();
        g9.g0 g0Var = g9.i0.b;
        g9.s1 s1Var = g9.s1.e;
        List list = Collections.EMPTY_LIST;
        d2.g0 g0Var2 = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(13, false);
        a0Var.b = hVar.r;
        d2.j0 j0Var2 = new d2.j0(a0Var);
        CharSequence charSequence = hVar.b;
        d2.p0 p0Var = new d2.p0();
        p0Var.f = hVar.c;
        p0Var.g = hVar.d;
        p0Var.n = hVar.h;
        p0Var.i = o4.n.c(null);
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
                    g2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e10);
                }
            }
            bArr = hVar.f;
        }
        int i10 = 3;
        if (bArr != null) {
            p0Var.b(bArr, 3);
        }
        Bundle bundle = hVar.n;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j10 = bundle2.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j10 != 0) {
                if (j10 == 1) {
                    i10 = 1;
                } else if (j10 == 2) {
                    i10 = 2;
                } else if (j10 != 3) {
                    if (j10 == 4) {
                        i10 = 4;
                    } else if (j10 == 5) {
                        i10 = 5;
                    } else if (j10 == 6) {
                        i10 = 6;
                    }
                }
                p0Var.q = Integer.valueOf(i10);
                bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            p0Var.q = Integer.valueOf(i10);
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        p0Var.r = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            p0Var.H = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            p0Var.J = g9.i0.q(g9.i0.q(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            p0Var.a = charSequence;
        } else {
            p0Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            p0Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            p0Var.I = bundle2;
        }
        p0Var.s = Boolean.TRUE;
        l9.y l10 = o0Var.h.l(vVar, g9.i0.u(new d2.n0(str2, new d2.d0(b0Var), null, new d2.h0(g0Var2), new d2.q0(p0Var), j0Var2)));
        l10.b(new l9.u((int) (null == true ? 1 : 0), (Object) l10, (Object) new kg(o0Var, vVar, this.b)), l9.r.a);
    }

    @Override // v5.b
    public Object d() {
        ha.c cVar = (ha.c) this.c;
        ((p7.d) cVar.d).E((n5.i) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 2:
                lg.s sVar = (lg.s) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = sVar.getText().toString();
                if (obj.length() <= 32) {
                    lg.z d = lg.z.d(this.b);
                    TL_account.TL_businessChatLink c2 = d.c(tL_businessChatLink.link);
                    if (c2 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c2.message;
                        tL_inputBusinessChatLink.entities = c2.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c2, tL_inputBusinessChatLink, null);
                    }
                    s1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.F3(sVar);
                    break;
                }
            case 3:
            case 4:
            case 5:
            case 10:
            case 15:
            default:
                StickersActivity.f0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
            case 6:
                wm wmVar = (wm) this.c;
                wmVar.getMessagesController().C3(wmVar.e, wmVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                ac B = fc.B(wmVar, true, null, null, wmVar.ya);
                B.j();
                fb fbVar = B.e;
                fbVar.postDelayed(new pg(0, fbVar), 550L);
                break;
            case 7:
                wm.J0((wm) this.c, this.b, (zi) this.d);
                break;
            case 8:
                s4 s4Var = (s4) this.c;
                or orVar = (or) this.d;
                String trim = s4Var.getText().toString().trim();
                if (trim.length() <= this.b && !trim.isEmpty()) {
                    orVar.a(trim);
                    s1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.F3(s4Var);
                    break;
                }
                break;
            case 9:
                nl0 nl0Var = (nl0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = nl0Var.getText().toString();
                if (obj2.length() <= 12) {
                    hp.s1(this.b).l4(dh.n0.d(reaction), obj2);
                    s1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.F3(nl0Var);
                    break;
                }
            case 11:
                x20 x20Var = (x20) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                c30 c30Var = x20Var.p1;
                r3 r3Var = c30Var.b.S2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i10 = this.b;
                r3Var.A(i10, obj3);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                c30Var.b.m1().j(i10 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.e0;
                if (!arrayList.isEmpty() && org.telegram.messenger.g0.J1((d2) p1.h(1, arrayList))) {
                    la0 la0Var = new la0(0);
                    la0Var.H0 = new q(hashMap, this.b, 12);
                    launchActivity.t0(la0Var);
                    break;
                }
                break;
            case 13:
                ((la0) this.c).I0(900, this.b, (TLRPC.User) this.d);
                break;
            case 14:
                PasscodeActivity.Z((PasscodeActivity) this.c, (cb0) this.d, this.b);
                break;
            case 16:
                SessionsActivity.c0((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
        }
    }

    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        w1 w1Var = (w1) this.c;
        HashMap hashMap = (HashMap) this.d;
        y1 y1Var = w1Var.a;
        int i3 = y1Var.Q;
        HashMap hashMap2 = y1Var.J;
        if (this.b != i3) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((hi) arrayList.get(i10)).a;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                w1Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    y1Var.K.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            y1Var.f();
        }
    }

    @Override // org.telegram.messenger.q10
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i3 = this.b;
        String V = zi.V(document, "😀", Integer.valueOf(i3));
        String str = TextUtils.isEmpty(V) ? "😀" : V;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = li.Z(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = li.a0(document, str);
        ConnectionsManager.getInstance(h10.t0).sendRequest(tL_stickers_addStickerToSet, new cg.j0(s1Var, i3, document, obj, tL_stickers_addStickerToSet, 8));
        try {
            s1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override // g2.p
    public void invoke(Object obj) {
        d2.d1 d1Var = (d2.d1) this.c;
        d2.d1 d1Var2 = (d2.d1) this.d;
        d2.c1 c1Var = (d2.c1) obj;
        int i3 = this.b;
        c1Var.i(i3);
        c1Var.q(d1Var, d1Var2, i3);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i3, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i3, str);
    }

    public /* synthetic */ y(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    public /* synthetic */ y(Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
    }
}
