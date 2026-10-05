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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ pe(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final yn ynVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ef
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                yn.C0(ynVar, tLObject);
                                break;
                            case 1:
                                yn.G0(ynVar, tLObject);
                                break;
                            case 2:
                                yn ynVar2 = ynVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(ynVar2)) {
                                            org.telegram.ui.Components.yc.a0(ynVar2).k(!ynVar2.E9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                break;
                            default:
                                yn ynVar3 = ynVar;
                                TLObject tLObject3 = tLObject;
                                ynVar3.m5 = 0;
                                if (tLObject3 == null && ynVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar3.getParentActivity(), 0, ynVar3.ca);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    ynVar3.showDialog(alertDialog$Builder.a);
                                    jk jkVar = ynVar3.W;
                                    if (jkVar != null) {
                                        jkVar.b1(null, null, false);
                                        ynVar3.f9(true);
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
                final yn ynVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ef
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                yn.C0(ynVar2, tLObject);
                                break;
                            case 1:
                                yn.G0(ynVar2, tLObject);
                                break;
                            case 2:
                                yn ynVar22 = ynVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(ynVar22)) {
                                            org.telegram.ui.Components.yc.a0(ynVar22).k(!ynVar22.E9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                break;
                            default:
                                yn ynVar3 = ynVar2;
                                TLObject tLObject3 = tLObject;
                                ynVar3.m5 = 0;
                                if (tLObject3 == null && ynVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar3.getParentActivity(), 0, ynVar3.ca);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    ynVar3.showDialog(alertDialog$Builder.a);
                                    jk jkVar = ynVar3.W;
                                    if (jkVar != null) {
                                        jkVar.b1(null, null, false);
                                        ynVar3.f9(true);
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
                final yn ynVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ef
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                yn.C0(ynVar3, tLObject);
                                break;
                            case 1:
                                yn.G0(ynVar3, tLObject);
                                break;
                            case 2:
                                yn ynVar22 = ynVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(ynVar22)) {
                                            org.telegram.ui.Components.yc.a0(ynVar22).k(!ynVar22.E9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                break;
                            default:
                                yn ynVar32 = ynVar3;
                                TLObject tLObject3 = tLObject;
                                ynVar32.m5 = 0;
                                if (tLObject3 == null && ynVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar32.getParentActivity(), 0, ynVar32.ca);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    ynVar32.showDialog(alertDialog$Builder.a);
                                    jk jkVar = ynVar32.W;
                                    if (jkVar != null) {
                                        jkVar.b1(null, null, false);
                                        ynVar32.f9(true);
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
                final yn ynVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ef
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                yn.C0(ynVar4, tLObject);
                                break;
                            case 1:
                                yn.G0(ynVar4, tLObject);
                                break;
                            case 2:
                                yn ynVar22 = ynVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(ynVar22)) {
                                            org.telegram.ui.Components.yc.a0(ynVar22).k(!ynVar22.E9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                break;
                            default:
                                yn ynVar32 = ynVar4;
                                TLObject tLObject3 = tLObject;
                                ynVar32.m5 = 0;
                                if (tLObject3 == null && ynVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar32.getParentActivity(), 0, ynVar32.ca);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    ynVar32.showDialog(alertDialog$Builder.a);
                                    jk jkVar = ynVar32.W;
                                    if (jkVar != null) {
                                        jkVar.b1(null, null, false);
                                        ynVar32.f9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                yn ynVar5 = this.b;
                if (tL_error == null) {
                    ynVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    ynVar5.getClass();
                    break;
                }
            default:
                yn.Y0(this.b, tLObject);
                break;
        }
    }
}
