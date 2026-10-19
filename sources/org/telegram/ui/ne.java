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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ ne(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final qn qnVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                qn.l1(qnVar, tLObject);
                                break;
                            case 1:
                                qn.V0(qnVar, tLObject);
                                break;
                            case 2:
                                qn qnVar2 = qnVar;
                                TLObject tLObject2 = tLObject;
                                qnVar2.o5 = 0;
                                if (tLObject2 == null && qnVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar2.getParentActivity(), 0, qnVar2.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar2.showDialog(alertDialog$Builder.a);
                                    fk fkVar = qnVar2.Y;
                                    if (fkVar != null) {
                                        fkVar.Z0(null, null, false);
                                        qnVar2.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                qn qnVar3 = qnVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(qnVar3)) {
                                            org.telegram.ui.Components.xc.a0(qnVar3).k(!qnVar3.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final qn qnVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                qn.l1(qnVar2, tLObject);
                                break;
                            case 1:
                                qn.V0(qnVar2, tLObject);
                                break;
                            case 2:
                                qn qnVar22 = qnVar2;
                                TLObject tLObject2 = tLObject;
                                qnVar22.o5 = 0;
                                if (tLObject2 == null && qnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar22.getParentActivity(), 0, qnVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar22.showDialog(alertDialog$Builder.a);
                                    fk fkVar = qnVar22.Y;
                                    if (fkVar != null) {
                                        fkVar.Z0(null, null, false);
                                        qnVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                qn qnVar3 = qnVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(qnVar3)) {
                                            org.telegram.ui.Components.xc.a0(qnVar3).k(!qnVar3.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 3;
                final qn qnVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                qn.l1(qnVar3, tLObject);
                                break;
                            case 1:
                                qn.V0(qnVar3, tLObject);
                                break;
                            case 2:
                                qn qnVar22 = qnVar3;
                                TLObject tLObject2 = tLObject;
                                qnVar22.o5 = 0;
                                if (tLObject2 == null && qnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar22.getParentActivity(), 0, qnVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar22.showDialog(alertDialog$Builder.a);
                                    fk fkVar = qnVar22.Y;
                                    if (fkVar != null) {
                                        fkVar.Z0(null, null, false);
                                        qnVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                qn qnVar32 = qnVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(qnVar32)) {
                                            org.telegram.ui.Components.xc.a0(qnVar32).k(!qnVar32.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 2;
                final qn qnVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                qn.l1(qnVar4, tLObject);
                                break;
                            case 1:
                                qn.V0(qnVar4, tLObject);
                                break;
                            case 2:
                                qn qnVar22 = qnVar4;
                                TLObject tLObject2 = tLObject;
                                qnVar22.o5 = 0;
                                if (tLObject2 == null && qnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar22.getParentActivity(), 0, qnVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar22.showDialog(alertDialog$Builder.a);
                                    fk fkVar = qnVar22.Y;
                                    if (fkVar != null) {
                                        fkVar.Z0(null, null, false);
                                        qnVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                qn qnVar32 = qnVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(qnVar32)) {
                                            org.telegram.ui.Components.xc.a0(qnVar32).k(!qnVar32.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
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
                    qnVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    qnVar5.getClass();
                    break;
                }
            default:
                qn.e1(this.b, tLObject);
                break;
        }
    }
}
