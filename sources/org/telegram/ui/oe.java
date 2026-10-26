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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ oe(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final un unVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                un.O0(unVar, tLObject);
                                break;
                            case 1:
                                un.y0(unVar, tLObject);
                                break;
                            case 2:
                                un unVar2 = unVar;
                                TLObject tLObject2 = tLObject;
                                unVar2.A5 = 0;
                                if (tLObject2 == null && unVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar2.getParentActivity(), 0, unVar2.qa);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    unVar2.showDialog(alertDialog$Builder.a);
                                    hk hkVar = unVar2.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        unVar2.o9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                un unVar3 = unVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(unVar3)) {
                                            org.telegram.ui.Components.wc.b0(unVar3).k(!unVar3.O9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final un unVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                un.O0(unVar2, tLObject);
                                break;
                            case 1:
                                un.y0(unVar2, tLObject);
                                break;
                            case 2:
                                un unVar22 = unVar2;
                                TLObject tLObject2 = tLObject;
                                unVar22.A5 = 0;
                                if (tLObject2 == null && unVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar22.getParentActivity(), 0, unVar22.qa);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    unVar22.showDialog(alertDialog$Builder.a);
                                    hk hkVar = unVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        unVar22.o9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                un unVar3 = unVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(unVar3)) {
                                            org.telegram.ui.Components.wc.b0(unVar3).k(!unVar3.O9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final un unVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                un.O0(unVar3, tLObject);
                                break;
                            case 1:
                                un.y0(unVar3, tLObject);
                                break;
                            case 2:
                                un unVar22 = unVar3;
                                TLObject tLObject2 = tLObject;
                                unVar22.A5 = 0;
                                if (tLObject2 == null && unVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar22.getParentActivity(), 0, unVar22.qa);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    unVar22.showDialog(alertDialog$Builder.a);
                                    hk hkVar = unVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        unVar22.o9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                un unVar32 = unVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(unVar32)) {
                                            org.telegram.ui.Components.wc.b0(unVar32).k(!unVar32.O9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final un unVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                un.O0(unVar4, tLObject);
                                break;
                            case 1:
                                un.y0(unVar4, tLObject);
                                break;
                            case 2:
                                un unVar22 = unVar4;
                                TLObject tLObject2 = tLObject;
                                unVar22.A5 = 0;
                                if (tLObject2 == null && unVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar22.getParentActivity(), 0, unVar22.qa);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    unVar22.showDialog(alertDialog$Builder.a);
                                    hk hkVar = unVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        unVar22.o9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                un unVar32 = unVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(unVar32)) {
                                            org.telegram.ui.Components.wc.b0(unVar32).k(!unVar32.O9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                un unVar5 = this.b;
                if (tL_error == null) {
                    unVar5.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    unVar5.getClass();
                    break;
                }
            default:
                un.f1(this.b, tLObject);
                break;
        }
    }
}
