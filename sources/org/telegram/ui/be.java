package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class be implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ be(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final an anVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i7) {
                            case 0:
                                an.B0(anVar, tLObject);
                                break;
                            case 1:
                                an.q0(anVar, tLObject);
                                break;
                            case 2:
                                an anVar2 = anVar;
                                TLObject tLObject2 = tLObject;
                                anVar2.F5 = 0;
                                if (tLObject2 == null && anVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar2.getParentActivity(), anVar2.Aa);
                                    alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar2.showDialog(alertDialog$Builder.a);
                                    qj qjVar = anVar2.a0;
                                    if (qjVar != null) {
                                        qjVar.s1(null, null, false);
                                        anVar2.D9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                an anVar3 = anVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(anVar3)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar3);
                                            if (!anVar3.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
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
                final an anVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i10) {
                            case 0:
                                an.B0(anVar2, tLObject);
                                break;
                            case 1:
                                an.q0(anVar2, tLObject);
                                break;
                            case 2:
                                an anVar22 = anVar2;
                                TLObject tLObject2 = tLObject;
                                anVar22.F5 = 0;
                                if (tLObject2 == null && anVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar22.getParentActivity(), anVar22.Aa);
                                    alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar22.showDialog(alertDialog$Builder.a);
                                    qj qjVar = anVar22.a0;
                                    if (qjVar != null) {
                                        qjVar.s1(null, null, false);
                                        anVar22.D9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                an anVar3 = anVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(anVar3)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar3);
                                            if (!anVar3.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
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
                final an anVar3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i11) {
                            case 0:
                                an.B0(anVar3, tLObject);
                                break;
                            case 1:
                                an.q0(anVar3, tLObject);
                                break;
                            case 2:
                                an anVar22 = anVar3;
                                TLObject tLObject2 = tLObject;
                                anVar22.F5 = 0;
                                if (tLObject2 == null && anVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar22.getParentActivity(), anVar22.Aa);
                                    alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar22.showDialog(alertDialog$Builder.a);
                                    qj qjVar = anVar22.a0;
                                    if (qjVar != null) {
                                        qjVar.s1(null, null, false);
                                        anVar22.D9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                an anVar32 = anVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(anVar32)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar32);
                                            if (!anVar32.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
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
                final an anVar4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i12) {
                            case 0:
                                an.B0(anVar4, tLObject);
                                break;
                            case 1:
                                an.q0(anVar4, tLObject);
                                break;
                            case 2:
                                an anVar22 = anVar4;
                                TLObject tLObject2 = tLObject;
                                anVar22.F5 = 0;
                                if (tLObject2 == null && anVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar22.getParentActivity(), anVar22.Aa);
                                    alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar22.showDialog(alertDialog$Builder.a);
                                    qj qjVar = anVar22.a0;
                                    if (qjVar != null) {
                                        qjVar.s1(null, null, false);
                                        anVar22.D9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                an anVar32 = anVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(anVar32)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar32);
                                            if (!anVar32.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
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
                an anVar5 = this.b;
                if (tL_error == null) {
                    anVar5.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    anVar5.getClass();
                    break;
                }
            default:
                an.n1(this.b, tLObject);
                break;
        }
    }
}
