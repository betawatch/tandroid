package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ oe(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final xn xnVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                xn.G0(xnVar, tLObject);
                                break;
                            case 1:
                                xn.K0(xnVar, tLObject);
                                break;
                            case 2:
                                xn xnVar2 = xnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(xnVar2)) {
                                            org.telegram.ui.Components.qc.a0(xnVar2).k(!xnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        return;
                                    }
                                }
                                break;
                            default:
                                xn xnVar3 = xnVar;
                                TLObject tLObject3 = tLObject;
                                xnVar3.l5 = 0;
                                if (tLObject3 == null && xnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar3.getParentActivity(), 0, xnVar3.ba);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    xnVar3.showDialog(alertDialog$Builder.a);
                                    jk jkVar = xnVar3.V;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        xnVar3.e9(true);
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
                final xn xnVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                xn.G0(xnVar2, tLObject);
                                break;
                            case 1:
                                xn.K0(xnVar2, tLObject);
                                break;
                            case 2:
                                xn xnVar22 = xnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(xnVar22)) {
                                            org.telegram.ui.Components.qc.a0(xnVar22).k(!xnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        return;
                                    }
                                }
                                break;
                            default:
                                xn xnVar3 = xnVar2;
                                TLObject tLObject3 = tLObject;
                                xnVar3.l5 = 0;
                                if (tLObject3 == null && xnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar3.getParentActivity(), 0, xnVar3.ba);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    xnVar3.showDialog(alertDialog$Builder.a);
                                    jk jkVar = xnVar3.V;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        xnVar3.e9(true);
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
                final xn xnVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                xn.G0(xnVar3, tLObject);
                                break;
                            case 1:
                                xn.K0(xnVar3, tLObject);
                                break;
                            case 2:
                                xn xnVar22 = xnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(xnVar22)) {
                                            org.telegram.ui.Components.qc.a0(xnVar22).k(!xnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        return;
                                    }
                                }
                                break;
                            default:
                                xn xnVar32 = xnVar3;
                                TLObject tLObject3 = tLObject;
                                xnVar32.l5 = 0;
                                if (tLObject3 == null && xnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar32.getParentActivity(), 0, xnVar32.ba);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    xnVar32.showDialog(alertDialog$Builder.a);
                                    jk jkVar = xnVar32.V;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        xnVar32.e9(true);
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
                final xn xnVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                xn.G0(xnVar4, tLObject);
                                break;
                            case 1:
                                xn.K0(xnVar4, tLObject);
                                break;
                            case 2:
                                xn xnVar22 = xnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(xnVar22)) {
                                            org.telegram.ui.Components.qc.a0(xnVar22).k(!xnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        return;
                                    }
                                }
                                break;
                            default:
                                xn xnVar32 = xnVar4;
                                TLObject tLObject3 = tLObject;
                                xnVar32.l5 = 0;
                                if (tLObject3 == null && xnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar32.getParentActivity(), 0, xnVar32.ba);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    xnVar32.showDialog(alertDialog$Builder.a);
                                    jk jkVar = xnVar32.V;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        xnVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                xn xnVar5 = this.b;
                if (tL_error == null) {
                    xnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    xnVar5.getClass();
                    break;
                }
            default:
                xn.Z0(this.b, tLObject);
                break;
        }
    }
}
