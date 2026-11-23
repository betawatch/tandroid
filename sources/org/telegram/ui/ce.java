package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ ce(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final bn bnVar = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.we
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i7) {
                            case 0:
                                bn.B0(bnVar, tLObject);
                                break;
                            case 1:
                                bn.q0(bnVar, tLObject);
                                break;
                            case 2:
                                bn bnVar2 = bnVar;
                                TLObject tLObject2 = tLObject;
                                bnVar2.G5 = 0;
                                if (tLObject2 == null && bnVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar2.getParentActivity(), bnVar2.Ba);
                                    alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.hd.N0(2131751259, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar2.showDialog(alertDialog$Builder.a);
                                    rj rjVar = bnVar2.a0;
                                    if (rjVar != null) {
                                        rjVar.E1(null, null, false);
                                        bnVar2.D9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                bn bnVar3 = bnVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.lc.a(bnVar3)) {
                                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar3);
                                            if (!bnVar3.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            b02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final bn bnVar2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.we
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i10) {
                            case 0:
                                bn.B0(bnVar2, tLObject);
                                break;
                            case 1:
                                bn.q0(bnVar2, tLObject);
                                break;
                            case 2:
                                bn bnVar22 = bnVar2;
                                TLObject tLObject2 = tLObject;
                                bnVar22.G5 = 0;
                                if (tLObject2 == null && bnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar22.getParentActivity(), bnVar22.Ba);
                                    alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.hd.N0(2131751259, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar22.showDialog(alertDialog$Builder.a);
                                    rj rjVar = bnVar22.a0;
                                    if (rjVar != null) {
                                        rjVar.E1(null, null, false);
                                        bnVar22.D9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                bn bnVar3 = bnVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.lc.a(bnVar3)) {
                                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar3);
                                            if (!bnVar3.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            b02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 3;
                final bn bnVar3 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.we
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i11) {
                            case 0:
                                bn.B0(bnVar3, tLObject);
                                break;
                            case 1:
                                bn.q0(bnVar3, tLObject);
                                break;
                            case 2:
                                bn bnVar22 = bnVar3;
                                TLObject tLObject2 = tLObject;
                                bnVar22.G5 = 0;
                                if (tLObject2 == null && bnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar22.getParentActivity(), bnVar22.Ba);
                                    alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.hd.N0(2131751259, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar22.showDialog(alertDialog$Builder.a);
                                    rj rjVar = bnVar22.a0;
                                    if (rjVar != null) {
                                        rjVar.E1(null, null, false);
                                        bnVar22.D9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                bn bnVar32 = bnVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.lc.a(bnVar32)) {
                                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar32);
                                            if (!bnVar32.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            b02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 2;
                final bn bnVar4 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.we
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i12) {
                            case 0:
                                bn.B0(bnVar4, tLObject);
                                break;
                            case 1:
                                bn.q0(bnVar4, tLObject);
                                break;
                            case 2:
                                bn bnVar22 = bnVar4;
                                TLObject tLObject2 = tLObject;
                                bnVar22.G5 = 0;
                                if (tLObject2 == null && bnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar22.getParentActivity(), bnVar22.Ba);
                                    alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.hd.N0(2131751259, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar22.showDialog(alertDialog$Builder.a);
                                    rj rjVar = bnVar22.a0;
                                    if (rjVar != null) {
                                        rjVar.E1(null, null, false);
                                        bnVar22.D9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                bn bnVar32 = bnVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.lc.a(bnVar32)) {
                                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar32);
                                            if (!bnVar32.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            b02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                bn bnVar5 = this.b;
                if (tL_error == null) {
                    bnVar5.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    bnVar5.getClass();
                    break;
                }
            default:
                bn.n1(this.b, tLObject);
                break;
        }
    }
}
