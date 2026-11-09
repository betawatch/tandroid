package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ de(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final cn cnVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z9 = false;
                        switch (i7) {
                            case 0:
                                cn.B0(cnVar, tLObject);
                                break;
                            case 1:
                                cn.q0(cnVar, tLObject);
                                break;
                            case 2:
                                cn cnVar2 = cnVar;
                                TLObject tLObject2 = tLObject;
                                cnVar2.E5 = 0;
                                if (tLObject2 == null && cnVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar2.getParentActivity(), cnVar2.za);
                                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar2.showDialog(alertDialog$Builder.a);
                                    sj sjVar = cnVar2.Z;
                                    if (sjVar != null) {
                                        sjVar.c1(null, null, false);
                                        cnVar2.C9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                cn cnVar3 = cnVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(cnVar3)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar3);
                                            if (!cnVar3.ea() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
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
                final cn cnVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z9 = false;
                        switch (i10) {
                            case 0:
                                cn.B0(cnVar2, tLObject);
                                break;
                            case 1:
                                cn.q0(cnVar2, tLObject);
                                break;
                            case 2:
                                cn cnVar22 = cnVar2;
                                TLObject tLObject2 = tLObject;
                                cnVar22.E5 = 0;
                                if (tLObject2 == null && cnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar22.getParentActivity(), cnVar22.za);
                                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar22.showDialog(alertDialog$Builder.a);
                                    sj sjVar = cnVar22.Z;
                                    if (sjVar != null) {
                                        sjVar.c1(null, null, false);
                                        cnVar22.C9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                cn cnVar3 = cnVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(cnVar3)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar3);
                                            if (!cnVar3.ea() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
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
                final cn cnVar3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z9 = false;
                        switch (i11) {
                            case 0:
                                cn.B0(cnVar3, tLObject);
                                break;
                            case 1:
                                cn.q0(cnVar3, tLObject);
                                break;
                            case 2:
                                cn cnVar22 = cnVar3;
                                TLObject tLObject2 = tLObject;
                                cnVar22.E5 = 0;
                                if (tLObject2 == null && cnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar22.getParentActivity(), cnVar22.za);
                                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar22.showDialog(alertDialog$Builder.a);
                                    sj sjVar = cnVar22.Z;
                                    if (sjVar != null) {
                                        sjVar.c1(null, null, false);
                                        cnVar22.C9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                cn cnVar32 = cnVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(cnVar32)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar32);
                                            if (!cnVar32.ea() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
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
                final cn cnVar4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z9 = false;
                        switch (i12) {
                            case 0:
                                cn.B0(cnVar4, tLObject);
                                break;
                            case 1:
                                cn.q0(cnVar4, tLObject);
                                break;
                            case 2:
                                cn cnVar22 = cnVar4;
                                TLObject tLObject2 = tLObject;
                                cnVar22.E5 = 0;
                                if (tLObject2 == null && cnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar22.getParentActivity(), cnVar22.za);
                                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar22.showDialog(alertDialog$Builder.a);
                                    sj sjVar = cnVar22.Z;
                                    if (sjVar != null) {
                                        sjVar.c1(null, null, false);
                                        cnVar22.C9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                cn cnVar32 = cnVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(cnVar32)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar32);
                                            if (!cnVar32.ea() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
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
                cn cnVar5 = this.b;
                if (tL_error == null) {
                    cnVar5.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    cnVar5.getClass();
                    break;
                }
            default:
                cn.n1(this.b, tLObject);
                break;
        }
    }
}
