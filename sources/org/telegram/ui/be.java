package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ be(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final wm wmVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i3) {
                            case 0:
                                wm.y0(wmVar, tLObject);
                                break;
                            case 1:
                                wm.d1(wmVar, tLObject);
                                break;
                            case 2:
                                wm wmVar2 = wmVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.fc.a(wmVar2)) {
                                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar2);
                                            if (!wmVar2.da() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                wm wmVar3 = wmVar;
                                TLObject tLObject3 = tLObject;
                                wmVar3.F5 = 0;
                                if (tLObject3 == null && wmVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar3.getParentActivity(), wmVar3.ya);
                                    alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar3.showDialog(alertDialog$Builder.a);
                                    mj mjVar = wmVar3.a0;
                                    if (mjVar != null) {
                                        mjVar.b1(null, null, false);
                                        wmVar3.B9(true);
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
                final wm wmVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i10) {
                            case 0:
                                wm.y0(wmVar2, tLObject);
                                break;
                            case 1:
                                wm.d1(wmVar2, tLObject);
                                break;
                            case 2:
                                wm wmVar22 = wmVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.fc.a(wmVar22)) {
                                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar22);
                                            if (!wmVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                wm wmVar3 = wmVar2;
                                TLObject tLObject3 = tLObject;
                                wmVar3.F5 = 0;
                                if (tLObject3 == null && wmVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar3.getParentActivity(), wmVar3.ya);
                                    alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar3.showDialog(alertDialog$Builder.a);
                                    mj mjVar = wmVar3.a0;
                                    if (mjVar != null) {
                                        mjVar.b1(null, null, false);
                                        wmVar3.B9(true);
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
                final wm wmVar3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i11) {
                            case 0:
                                wm.y0(wmVar3, tLObject);
                                break;
                            case 1:
                                wm.d1(wmVar3, tLObject);
                                break;
                            case 2:
                                wm wmVar22 = wmVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.fc.a(wmVar22)) {
                                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar22);
                                            if (!wmVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                wm wmVar32 = wmVar3;
                                TLObject tLObject3 = tLObject;
                                wmVar32.F5 = 0;
                                if (tLObject3 == null && wmVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar32.getParentActivity(), wmVar32.ya);
                                    alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar32.showDialog(alertDialog$Builder.a);
                                    mj mjVar = wmVar32.a0;
                                    if (mjVar != null) {
                                        mjVar.b1(null, null, false);
                                        wmVar32.B9(true);
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
                final wm wmVar4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10 = false;
                        switch (i12) {
                            case 0:
                                wm.y0(wmVar4, tLObject);
                                break;
                            case 1:
                                wm.d1(wmVar4, tLObject);
                                break;
                            case 2:
                                wm wmVar22 = wmVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.fc.a(wmVar22)) {
                                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar22);
                                            if (!wmVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                break;
                            default:
                                wm wmVar32 = wmVar4;
                                TLObject tLObject3 = tLObject;
                                wmVar32.F5 = 0;
                                if (tLObject3 == null && wmVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar32.getParentActivity(), wmVar32.ya);
                                    alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                                    alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar32.showDialog(alertDialog$Builder.a);
                                    mj mjVar = wmVar32.a0;
                                    if (mjVar != null) {
                                        mjVar.b1(null, null, false);
                                        wmVar32.B9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                wm wmVar5 = this.b;
                if (tL_error == null) {
                    wmVar5.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    wmVar5.getClass();
                    break;
                }
            default:
                wm.j1(this.b, tLObject);
                break;
        }
    }
}
