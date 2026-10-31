package ag;

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
import org.telegram.messenger.d20;
import org.telegram.messenger.fs;
import org.telegram.messenger.jj;
import org.telegram.messenger.m20;
import org.telegram.messenger.qi;
import org.telegram.messenger.ri;
import org.telegram.messenger.u3;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.b40;
import org.telegram.ui.f40;
import org.telegram.ui.hh;
import org.telegram.ui.q8;
import org.telegram.ui.un;
import org.telegram.ui.yb0;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements org.telegram.ui.ActionBar.u1, e2.o, m4.o0, e2.j, NativeInstance.PayloadCallback, m20, t5.b, ri {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // e2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj) {
        m4.t1 t1Var;
        m4.f0 f0Var = (m4.f0) this.c;
        m4.w wVar = (m4.w) this.d;
        try {
            t1Var = (m4.t1) ((j9.y) obj).get();
            t6.l(t1Var, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            e2.a.m("MediaSessionStub", "Session operation failed", e);
            t1Var = new m4.t1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e7) {
            e2.a.m("MediaSessionStub", "Session operation cancelled", e7);
            t1Var = new m4.t1(1);
        } catch (ExecutionException e10) {
            e = e10;
            e2.a.m("MediaSessionStub", "Session operation failed", e);
            t1Var = new m4.t1(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        m4.j1.R0(f0Var, wVar, this.b, t1Var);
    }

    @Override // m4.o0
    public void b(m4.w wVar) {
        byte[] bArr;
        m4.p0 p0Var = (m4.p0) this.c;
        n4.h hVar = (n4.h) this.d;
        if (TextUtils.isEmpty(hVar.a)) {
            e2.a.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i10 = m4.o.a;
        String str = hVar.a;
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var2 = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i11 = 4;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(i11);
        a0Var.b = hVar.r;
        b2.l0 l0Var3 = new b2.l0(a0Var);
        CharSequence charSequence = hVar.b;
        b2.r0 r0Var = new b2.r0();
        r0Var.f = hVar.c;
        r0Var.g = hVar.d;
        r0Var.n = hVar.h;
        r0Var.i = m4.o.c(null);
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
                } catch (IOException e) {
                    e2.a.m("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = hVar.f;
        }
        if (bArr != null) {
            r0Var.b(bArr, 3);
        }
        Bundle bundle = hVar.n;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j10 = bundle2.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j10 != 0) {
                if (j10 == 1) {
                    i11 = 1;
                } else if (j10 == 2) {
                    i11 = 2;
                } else if (j10 == 3) {
                    i11 = 3;
                } else if (j10 != 4) {
                    if (j10 == 5) {
                        i11 = 5;
                    } else if (j10 == 6) {
                        i11 = 6;
                    }
                }
                r0Var.q = Integer.valueOf(i11);
                bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i11 = 0;
            r0Var.q = Integer.valueOf(i11);
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        r0Var.r = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            r0Var.H = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            r0Var.J = e9.n0.u(e9.n0.u(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            r0Var.a = charSequence;
        } else {
            r0Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            r0Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            r0Var.I = bundle2;
        }
        r0Var.s = Boolean.TRUE;
        j9.y l4 = p0Var.h.l(wVar, e9.n0.y(new b2.p0(str2, new b2.f0(d0Var), null, new b2.j0(i0Var), new b2.s0(r0Var), l0Var3)));
        l4.a(new j9.u(0, l4, new a5.a(p0Var, wVar, this.b)), j9.r.a);
    }

    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        zf.n1 n1Var = (zf.n1) this.c;
        HashMap hashMap = (HashMap) this.d;
        zf.o1 o1Var = n1Var.a;
        int i10 = o1Var.P;
        HashMap hashMap2 = o1Var.I;
        if (this.b != i10) {
            return;
        }
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((qi) arrayList.get(i11)).a;
            ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                n1Var.a();
                if (!hashMap2.containsKey(arrayList2)) {
                    hashMap2.put(arrayList2, str2);
                    o1Var.J.add(arrayList2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            o1Var.f();
        }
    }

    @Override // t5.b
    public Object g() {
        ea.d dVar = (ea.d) this.c;
        ((q5.d) dVar.d).x((l5.i) this.d, this.b + 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                String obj = f0Var.getText().toString();
                if (obj.length() <= 32) {
                    s0 d = s0.d(this.b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    x1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.i0.E3(f0Var);
                    break;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 14:
            default:
                StickersActivity.e0((StickersActivity) this.c, (ArrayList) this.d, this.b);
                break;
            case 5:
                un unVar = (un) this.c;
                unVar.getMessagesController().z3(unVar.e, unVar.f, this.b, false, !r10[1], ((boolean[]) this.d)[0]);
                wb B = cc.B(unVar, true, null, null, unVar.xa);
                B.j();
                bb bbVar = B.e;
                bbVar.postDelayed(new hh(0, bbVar), 550L);
                break;
            case 6:
                un.i0((un) this.c, this.b, (jj) this.d);
                break;
            case 7:
                r4 r4Var = (r4) this.c;
                fs fsVar = (fs) this.d;
                String trim = r4Var.getText().toString().trim();
                if (trim.length() <= this.b && !trim.isEmpty()) {
                    fsVar.a(trim);
                    x1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.i0.E3(r4Var);
                    break;
                }
                break;
            case 8:
                lm0 lm0Var = (lm0) this.c;
                TLRPC.Reaction reaction = (TLRPC.Reaction) this.d;
                String obj2 = lm0Var.getText().toString();
                if (obj2.length() <= 12) {
                    vp.r1(this.b).i4(obj2, sg.o0.d(reaction));
                    x1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.i0.E3(lm0Var);
                    break;
                }
            case 10:
                b40 b40Var = (b40) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                f40 f40Var = b40Var.o1;
                u3 u3Var = f40Var.b.R2;
                String obj3 = editTextBoldCursor.getText().toString();
                int i11 = this.b;
                u3Var.A(i11, obj3);
                org.telegram.messenger.i0.v1(editTextBoldCursor);
                f40Var.b.m1().j(i11 == 0 ? 39 : 100, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList = launchActivity.d0;
                if (!arrayList.isEmpty() && org.telegram.messenger.i0.J1((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList))) {
                    yb0 yb0Var = new yb0(0);
                    yb0Var.N0 = new i2.q(hashMap, this.b, 13);
                    launchActivity.t0(yb0Var);
                    break;
                }
                break;
            case 12:
                ((yb0) this.c).K0(900, this.b, (TLRPC.User) this.d);
                break;
            case 13:
                PasscodeActivity.Y((PasscodeActivity) this.c, (ac0) this.d, this.b);
                break;
            case 15:
                SessionsActivity.b0((SessionsActivity) this.c, this.b, (boolean[]) this.d);
                break;
        }
    }

    @Override // org.telegram.messenger.m20
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i10 = this.b;
        String V = jj.V(document, "😀", Integer.valueOf(i10));
        String str = TextUtils.isEmpty(V) ? "😀" : V;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = ui.Z(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = ui.a0(document, str);
        ConnectionsManager.getInstance(d20.s0).sendRequest(tL_stickers_addStickerToSet, new q8(x1Var, i10, document, obj, tL_stickers_addStickerToSet, 3));
        try {
            x1Var.r(350L);
        } catch (Exception unused) {
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        b2.e1 e1Var = (b2.e1) this.c;
        b2.e1 e1Var2 = (b2.e1) this.d;
        b2.d1 d1Var = (b2.d1) obj;
        int i10 = this.b;
        d1Var.h(i10);
        d1Var.s(e1Var, e1Var2, i10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public void run(int i10, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$66(this.b, (boolean[]) this.d, i10, str);
    }

    public /* synthetic */ b0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ b0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
