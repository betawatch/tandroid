// default package

import android.graphics.Canvas;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mhc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mhc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                ((VoIPService) this.b).lambda$startScreenCapture$61((TLRPC.Updates) this.c);
                return;
            case 1:
                ((VoIPService) this.b).lambda$startGroupCall$24((TL_update.TL_updateGroupCall) this.c);
                return;
            case 2:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$59((bs1) this.c);
                return;
            case 3:
                gjc gjcVar = (gjc) this.b;
                yic yicVar = (yic) this.c;
                if (gjcVar.c == 0 && gjcVar.K == yicVar && yicVar.R) {
                    yicVar.R = false;
                    yicVar.f0 = -1;
                    yicVar.invalidate();
                    return;
                }
                return;
            case 4:
                gjc gjcVar2 = (gjc) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (gjcVar2.X == editTextBoldCursor) {
                    gl.E3(editTextBoldCursor);
                    return;
                }
                return;
            case 5:
                gjc gjcVar3 = (gjc) this.b;
                String str = (String) this.c;
                gjcVar3.i0 = false;
                if (gjcVar3.c == 0) {
                    yic yicVar2 = gjcVar3.K;
                    if (yicVar2 != null) {
                        yicVar2.setBusy(false);
                        return;
                    }
                    return;
                }
                if (str == null || str.trim().isEmpty()) {
                    Log.d("VoiceLive", "field: style failed");
                    yic yicVar3 = gjcVar3.K;
                    if (yicVar3 != null) {
                        yicVar3.setBusy(false);
                        return;
                    }
                    return;
                }
                gjcVar3.e0 = str.trim();
                gjcVar3.f0 = gjcVar3.b().size();
                yic yicVar4 = gjcVar3.K;
                if (yicVar4 != null) {
                    yicVar4.setRevertShown(true);
                    gjcVar3.K.setRebuildNext(true);
                }
                gjcVar3.p();
                yic yicVar5 = gjcVar3.K;
                if (yicVar5 != null) {
                    yicVar5.setRebuildNext(false);
                    gjcVar3.K.setBusy(false);
                    return;
                }
                return;
            case 6:
                ((AudioManager) this.b).setCommunicationDevice((AudioDeviceInfo) this.c);
                return;
            case 7:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$4((i8c) this.c);
                return;
            case 8:
                ekc ekcVar = (ekc) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                aec aecVar = (aec) ekcVar.c;
                if (atomicBoolean.get()) {
                    new Thread(new mhc(aecVar, atomicBoolean, (byte) 9), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 9:
                aec aecVar2 = (aec) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (aecVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) aecVar2.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 10:
                i8c i8cVar = (i8c) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.c;
                i8cVar.a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 11:
                TextView[] textViewArr = (TextView[]) this.b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(k96.M0(2131748587, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new u86(gl.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 12:
                ((be5) this.b).a(((TL_wallet.walletTransaction[]) this.c)[0]);
                return;
            case 13:
                cj7[] cj7VarArr = (cj7[]) this.b;
                cj7VarArr[0].setOnDismissListener(new ph8((TLRPC.User) this.c, (byte) 16));
                cj7VarArr[0].dismiss();
                return;
            case 14:
                ((xw0) this.b).a((Canvas) this.c);
                return;
            case 15:
                ((pmc) this.b).e((Canvas) this.c);
                return;
            case 16:
                ((pmc) this.b).f((Canvas) this.c);
                return;
            case 17:
                ((ViewGroup) this.c).removeView(((anc) this.b).h);
                return;
            case 18:
                cnc cncVar = (cnc) this.b;
                enc encVar = (enc) this.c;
                cncVar.getClass();
                try {
                    EGLDisplay eGLDisplay = cncVar.i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = cncVar.k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, cncVar.j);
                        EGLSurface eGLSurface2 = encVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(cncVar.i, eGLSurface2);
                        }
                        encVar.h = EGL14.EGL_NO_SURFACE;
                        if (cncVar.f.length == 0) {
                            cncVar.b();
                        }
                    }
                    return;
                } finally {
                    encVar.b.release();
                }
            case 19:
                ((p8c) this.b).a((TL_wallet.walletTransaction) this.c);
                return;
            case 20:
                koc kocVar = (koc) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (kocVar.b1 || userFull == null) {
                    return;
                }
                kocVar.D1 = SystemClock.elapsedRealtime();
                TL_wallet.card cardVar = userFull.wallet_card;
                if (cardVar == null) {
                    cardVar = new TL_wallet.card();
                }
                kocVar.d(cardVar);
                return;
            case 21:
                noc nocVar = (noc) this.b;
                d dVar = (d) this.c;
                if (dVar instanceof hmc) {
                    nocVar.getClass();
                    if (u21.a(dVar)) {
                        u21.b0(dVar).I(R.raw.contact_check, k96.M0(2131742845, null), k96.M0(2131742844, null)).j();
                    }
                }
                nocVar.finishFragment();
                return;
            case 22:
                toc tocVar = (toc) this.b;
                g15 g15Var = (g15) this.c;
                tocVar.getClass();
                g15Var.C();
                tocVar.a.g3.O(true);
                return;
            case 23:
                toc tocVar2 = (toc) this.b;
                c cVar = (c) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tocVar2.getResourceProvider(), tocVar2.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131742888, null);
                alertDialog$Builder.a.U = k96.M0(2131742890, null);
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.j(k96.M0(2131742893, null), new cwb(tocVar2, cVar, (byte) 10));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 24:
                hd[] hdVarArr = (hd[]) this.b;
                Runnable runnable = (Runnable) this.c;
                hdVarArr[0].dismiss();
                runnable.run();
                return;
            case 25:
                ((ViewGroup) this.c).removeView(((cqc) this.b).h);
                return;
            case 26:
                irc ircVar = (irc) this.b;
                int[] iArr = (int[]) this.c;
                int i3 = iArr[0] - 1;
                iArr[0] = i3;
                if (i3 == 0) {
                    ircVar.a.D0(true);
                    return;
                }
                return;
            case 27:
                orc orcVar = (orc) this.b;
                String str2 = (String) this.c;
                orcVar.d.clear();
                orcVar.e.clear();
                orcVar.f = true;
                orcVar.F(str2, "", true);
                orcVar.h = str2;
                orcVar.f();
                orcVar.E = null;
                return;
            case 28:
                orc orcVar2 = (orc) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity = orcVar2.F;
                i = ((d) wallpapersListActivity).currentAccount;
                na7.q1(i).b4(tL_contacts_resolvedPeer.users, false);
                i2 = ((d) wallpapersListActivity).currentAccount;
                na7.q1(i2).V3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str3 = orcVar2.y;
                orcVar2.y = null;
                orcVar2.F(str3, "", false);
                return;
            default:
                int[] iArr2 = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i4 = iArr2[0];
                if (i4 != 0) {
                    connectionsManager.cancelRequest(i4, true);
                    iArr2[0] = 0;
                    return;
                }
                return;
        }
    }
}
