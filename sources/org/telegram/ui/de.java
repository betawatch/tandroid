package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ de(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final an anVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z9 = false;
                        switch (i7) {
                            case 0:
                                an.y0(anVar, tLObject);
                                break;
                            case 1:
                                an.d1(anVar, tLObject);
                                break;
                            case 2:
                                an anVar2 = anVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(anVar2)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar2);
                                            if (!anVar2.da() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                an anVar3 = anVar;
                                TLObject tLObject3 = tLObject;
                                anVar3.E5 = 0;
                                if (tLObject3 == null && anVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar3.getParentActivity(), anVar3.xa);
                                    alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar3.showDialog(alertDialog$Builder.a);
                                    qj qjVar = anVar3.Z;
                                    if (qjVar != null) {
                                        qjVar.b1(null, null, false);
                                        anVar3.B9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final an anVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z9 = false;
                        switch (i10) {
                            case 0:
                                an.y0(anVar2, tLObject);
                                break;
                            case 1:
                                an.d1(anVar2, tLObject);
                                break;
                            case 2:
                                an anVar22 = anVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(anVar22)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar22);
                                            if (!anVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                an anVar3 = anVar2;
                                TLObject tLObject3 = tLObject;
                                anVar3.E5 = 0;
                                if (tLObject3 == null && anVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar3.getParentActivity(), anVar3.xa);
                                    alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar3.showDialog(alertDialog$Builder.a);
                                    qj qjVar = anVar3.Z;
                                    if (qjVar != null) {
                                        qjVar.b1(null, null, false);
                                        anVar3.B9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 2;
                final an anVar3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z9 = false;
                        switch (i11) {
                            case 0:
                                an.y0(anVar3, tLObject);
                                break;
                            case 1:
                                an.d1(anVar3, tLObject);
                                break;
                            case 2:
                                an anVar22 = anVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(anVar22)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar22);
                                            if (!anVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                an anVar32 = anVar3;
                                TLObject tLObject3 = tLObject;
                                anVar32.E5 = 0;
                                if (tLObject3 == null && anVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar32.getParentActivity(), anVar32.xa);
                                    alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar32.showDialog(alertDialog$Builder.a);
                                    qj qjVar = anVar32.Z;
                                    if (qjVar != null) {
                                        qjVar.b1(null, null, false);
                                        anVar32.B9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 3;
                final an anVar4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z9 = false;
                        switch (i12) {
                            case 0:
                                an.y0(anVar4, tLObject);
                                break;
                            case 1:
                                an.d1(anVar4, tLObject);
                                break;
                            case 2:
                                an anVar22 = anVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(anVar22)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar22);
                                            if (!anVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                an anVar32 = anVar4;
                                TLObject tLObject3 = tLObject;
                                anVar32.E5 = 0;
                                if (tLObject3 == null && anVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar32.getParentActivity(), anVar32.xa);
                                    alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar32.showDialog(alertDialog$Builder.a);
                                    qj qjVar = anVar32.Z;
                                    if (qjVar != null) {
                                        qjVar.b1(null, null, false);
                                        anVar32.B9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                an anVar5 = this.b;
                if (tL_error == null) {
                    anVar5.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    anVar5.getClass();
                    break;
                }
            default:
                an.j1(this.b, tLObject);
                break;
        }
    }
}
