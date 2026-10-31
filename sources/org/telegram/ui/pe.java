package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ pe(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final un unVar = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bf
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i10) {
                            case 0:
                                un.X0(unVar, tLObject);
                                break;
                            case 1:
                                un.n0(unVar, tLObject);
                                break;
                            case 2:
                                un unVar2 = unVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(unVar2)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar2);
                                            if (!unVar2.T9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                un unVar3 = unVar;
                                TLObject tLObject3 = tLObject;
                                unVar3.E5 = 0;
                                if (tLObject3 == null && unVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar3.getParentActivity(), unVar3.xa);
                                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    unVar3.showDialog(alertDialog$Builder.a);
                                    mk mkVar = unVar3.Z;
                                    if (mkVar != null) {
                                        mkVar.a1(null, null, false);
                                        unVar3.r9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final un unVar2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bf
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i11) {
                            case 0:
                                un.X0(unVar2, tLObject);
                                break;
                            case 1:
                                un.n0(unVar2, tLObject);
                                break;
                            case 2:
                                un unVar22 = unVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(unVar22)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar22);
                                            if (!unVar22.T9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                un unVar3 = unVar2;
                                TLObject tLObject3 = tLObject;
                                unVar3.E5 = 0;
                                if (tLObject3 == null && unVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar3.getParentActivity(), unVar3.xa);
                                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    unVar3.showDialog(alertDialog$Builder.a);
                                    mk mkVar = unVar3.Z;
                                    if (mkVar != null) {
                                        mkVar.a1(null, null, false);
                                        unVar3.r9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 2;
                final un unVar3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bf
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i12) {
                            case 0:
                                un.X0(unVar3, tLObject);
                                break;
                            case 1:
                                un.n0(unVar3, tLObject);
                                break;
                            case 2:
                                un unVar22 = unVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(unVar22)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar22);
                                            if (!unVar22.T9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                un unVar32 = unVar3;
                                TLObject tLObject3 = tLObject;
                                unVar32.E5 = 0;
                                if (tLObject3 == null && unVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar32.getParentActivity(), unVar32.xa);
                                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    unVar32.showDialog(alertDialog$Builder.a);
                                    mk mkVar = unVar32.Z;
                                    if (mkVar != null) {
                                        mkVar.a1(null, null, false);
                                        unVar32.r9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 3;
                final un unVar4 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.bf
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i13) {
                            case 0:
                                un.X0(unVar4, tLObject);
                                break;
                            case 1:
                                un.n0(unVar4, tLObject);
                                break;
                            case 2:
                                un unVar22 = unVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(unVar22)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar22);
                                            if (!unVar22.T9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                un unVar32 = unVar4;
                                TLObject tLObject3 = tLObject;
                                unVar32.E5 = 0;
                                if (tLObject3 == null && unVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar32.getParentActivity(), unVar32.xa);
                                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    unVar32.showDialog(alertDialog$Builder.a);
                                    mk mkVar = unVar32.Z;
                                    if (mkVar != null) {
                                        mkVar.a1(null, null, false);
                                        unVar32.r9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                un unVar5 = this.b;
                if (tL_error == null) {
                    unVar5.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    unVar5.getClass();
                    break;
                }
            default:
                un.h1(this.b, tLObject);
                break;
        }
    }
}
