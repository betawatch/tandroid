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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ he(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final tn tnVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.se
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                tn.G0(tnVar, tLObject);
                                break;
                            case 1:
                                tn.K0(tnVar, tLObject);
                                break;
                            case 2:
                                tn tnVar2 = tnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.tc.a(tnVar2)) {
                                            org.telegram.ui.Components.tc.a0(tnVar2).k(!tnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                break;
                            default:
                                tn tnVar3 = tnVar;
                                TLObject tLObject3 = tLObject;
                                tnVar3.k5 = 0;
                                if (tLObject3 == null && tnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar3.getParentActivity(), 0, tnVar3.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    tnVar3.showDialog(alertDialog$Builder.a);
                                    dk dkVar = tnVar3.U;
                                    if (dkVar != null) {
                                        dkVar.c1(null, null, false);
                                        tnVar3.e9(true);
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
                final tn tnVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.se
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                tn.G0(tnVar2, tLObject);
                                break;
                            case 1:
                                tn.K0(tnVar2, tLObject);
                                break;
                            case 2:
                                tn tnVar22 = tnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.tc.a(tnVar22)) {
                                            org.telegram.ui.Components.tc.a0(tnVar22).k(!tnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                break;
                            default:
                                tn tnVar3 = tnVar2;
                                TLObject tLObject3 = tLObject;
                                tnVar3.k5 = 0;
                                if (tLObject3 == null && tnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar3.getParentActivity(), 0, tnVar3.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    tnVar3.showDialog(alertDialog$Builder.a);
                                    dk dkVar = tnVar3.U;
                                    if (dkVar != null) {
                                        dkVar.c1(null, null, false);
                                        tnVar3.e9(true);
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
                final tn tnVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.se
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                tn.G0(tnVar3, tLObject);
                                break;
                            case 1:
                                tn.K0(tnVar3, tLObject);
                                break;
                            case 2:
                                tn tnVar22 = tnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.tc.a(tnVar22)) {
                                            org.telegram.ui.Components.tc.a0(tnVar22).k(!tnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                break;
                            default:
                                tn tnVar32 = tnVar3;
                                TLObject tLObject3 = tLObject;
                                tnVar32.k5 = 0;
                                if (tLObject3 == null && tnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar32.getParentActivity(), 0, tnVar32.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    tnVar32.showDialog(alertDialog$Builder.a);
                                    dk dkVar = tnVar32.U;
                                    if (dkVar != null) {
                                        dkVar.c1(null, null, false);
                                        tnVar32.e9(true);
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
                final tn tnVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.se
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                tn.G0(tnVar4, tLObject);
                                break;
                            case 1:
                                tn.K0(tnVar4, tLObject);
                                break;
                            case 2:
                                tn tnVar22 = tnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.tc.a(tnVar22)) {
                                            org.telegram.ui.Components.tc.a0(tnVar22).k(!tnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                break;
                            default:
                                tn tnVar32 = tnVar4;
                                TLObject tLObject3 = tLObject;
                                tnVar32.k5 = 0;
                                if (tLObject3 == null && tnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar32.getParentActivity(), 0, tnVar32.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    tnVar32.showDialog(alertDialog$Builder.a);
                                    dk dkVar = tnVar32.U;
                                    if (dkVar != null) {
                                        dkVar.c1(null, null, false);
                                        tnVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                tn tnVar5 = this.b;
                if (tL_error == null) {
                    tnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    tnVar5.getClass();
                    break;
                }
            default:
                tn.Z0(this.b, tLObject);
                break;
        }
    }
}
