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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ je(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final qn qnVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                qn.F0(qnVar, tLObject);
                                break;
                            case 1:
                                qn.K0(qnVar, tLObject);
                                break;
                            case 2:
                                qn qnVar2 = qnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.oc.a(qnVar2)) {
                                            org.telegram.ui.Components.oc.a0(qnVar2).k(!qnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                break;
                            default:
                                qn qnVar3 = qnVar;
                                TLObject tLObject3 = tLObject;
                                qnVar3.k5 = 0;
                                if (tLObject3 == null && qnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar3.getParentActivity(), 0, qnVar3.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar3.showDialog(alertDialog$Builder.a);
                                    ak akVar = qnVar3.U;
                                    if (akVar != null) {
                                        akVar.c1(null, null, false);
                                        qnVar3.e9(true);
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
                final qn qnVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                qn.F0(qnVar2, tLObject);
                                break;
                            case 1:
                                qn.K0(qnVar2, tLObject);
                                break;
                            case 2:
                                qn qnVar22 = qnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.oc.a(qnVar22)) {
                                            org.telegram.ui.Components.oc.a0(qnVar22).k(!qnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                break;
                            default:
                                qn qnVar3 = qnVar2;
                                TLObject tLObject3 = tLObject;
                                qnVar3.k5 = 0;
                                if (tLObject3 == null && qnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar3.getParentActivity(), 0, qnVar3.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar3.showDialog(alertDialog$Builder.a);
                                    ak akVar = qnVar3.U;
                                    if (akVar != null) {
                                        akVar.c1(null, null, false);
                                        qnVar3.e9(true);
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
                final qn qnVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                qn.F0(qnVar3, tLObject);
                                break;
                            case 1:
                                qn.K0(qnVar3, tLObject);
                                break;
                            case 2:
                                qn qnVar22 = qnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.oc.a(qnVar22)) {
                                            org.telegram.ui.Components.oc.a0(qnVar22).k(!qnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                break;
                            default:
                                qn qnVar32 = qnVar3;
                                TLObject tLObject3 = tLObject;
                                qnVar32.k5 = 0;
                                if (tLObject3 == null && qnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar32.getParentActivity(), 0, qnVar32.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar32.showDialog(alertDialog$Builder.a);
                                    ak akVar = qnVar32.U;
                                    if (akVar != null) {
                                        akVar.c1(null, null, false);
                                        qnVar32.e9(true);
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
                final qn qnVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                qn.F0(qnVar4, tLObject);
                                break;
                            case 1:
                                qn.K0(qnVar4, tLObject);
                                break;
                            case 2:
                                qn qnVar22 = qnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.oc.a(qnVar22)) {
                                            org.telegram.ui.Components.oc.a0(qnVar22).k(!qnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                break;
                            default:
                                qn qnVar32 = qnVar4;
                                TLObject tLObject3 = tLObject;
                                qnVar32.k5 = 0;
                                if (tLObject3 == null && qnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar32.getParentActivity(), 0, qnVar32.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar32.showDialog(alertDialog$Builder.a);
                                    ak akVar = qnVar32.U;
                                    if (akVar != null) {
                                        akVar.c1(null, null, false);
                                        qnVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                qn qnVar5 = this.b;
                if (tL_error == null) {
                    qnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    qnVar5.getClass();
                    break;
                }
            default:
                qn.Z0(this.b, tLObject);
                break;
        }
    }
}
