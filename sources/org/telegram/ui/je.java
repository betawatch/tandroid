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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ je(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final rn rnVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                rn.G0(rnVar, tLObject);
                                break;
                            case 1:
                                rn.K0(rnVar, tLObject);
                                break;
                            case 2:
                                rn rnVar2 = rnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.mc.a(rnVar2)) {
                                            org.telegram.ui.Components.mc.a0(rnVar2).k(!rnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        return;
                                    }
                                }
                                break;
                            default:
                                rn rnVar3 = rnVar;
                                TLObject tLObject3 = tLObject;
                                rnVar3.k5 = 0;
                                if (tLObject3 == null && rnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar3.getParentActivity(), 0, rnVar3.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    rnVar3.showDialog(alertDialog$Builder.a);
                                    ck ckVar = rnVar3.U;
                                    if (ckVar != null) {
                                        ckVar.b1(null, null, false);
                                        rnVar3.e9(true);
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
                final rn rnVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                rn.G0(rnVar2, tLObject);
                                break;
                            case 1:
                                rn.K0(rnVar2, tLObject);
                                break;
                            case 2:
                                rn rnVar22 = rnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.mc.a(rnVar22)) {
                                            org.telegram.ui.Components.mc.a0(rnVar22).k(!rnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        return;
                                    }
                                }
                                break;
                            default:
                                rn rnVar3 = rnVar2;
                                TLObject tLObject3 = tLObject;
                                rnVar3.k5 = 0;
                                if (tLObject3 == null && rnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar3.getParentActivity(), 0, rnVar3.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    rnVar3.showDialog(alertDialog$Builder.a);
                                    ck ckVar = rnVar3.U;
                                    if (ckVar != null) {
                                        ckVar.b1(null, null, false);
                                        rnVar3.e9(true);
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
                final rn rnVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                rn.G0(rnVar3, tLObject);
                                break;
                            case 1:
                                rn.K0(rnVar3, tLObject);
                                break;
                            case 2:
                                rn rnVar22 = rnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.mc.a(rnVar22)) {
                                            org.telegram.ui.Components.mc.a0(rnVar22).k(!rnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        return;
                                    }
                                }
                                break;
                            default:
                                rn rnVar32 = rnVar3;
                                TLObject tLObject3 = tLObject;
                                rnVar32.k5 = 0;
                                if (tLObject3 == null && rnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar32.getParentActivity(), 0, rnVar32.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    rnVar32.showDialog(alertDialog$Builder.a);
                                    ck ckVar = rnVar32.U;
                                    if (ckVar != null) {
                                        ckVar.b1(null, null, false);
                                        rnVar32.e9(true);
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
                final rn rnVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ue
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                rn.G0(rnVar4, tLObject);
                                break;
                            case 1:
                                rn.K0(rnVar4, tLObject);
                                break;
                            case 2:
                                rn rnVar22 = rnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.mc.a(rnVar22)) {
                                            org.telegram.ui.Components.mc.a0(rnVar22).k(!rnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        return;
                                    }
                                }
                                break;
                            default:
                                rn rnVar32 = rnVar4;
                                TLObject tLObject3 = tLObject;
                                rnVar32.k5 = 0;
                                if (tLObject3 == null && rnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar32.getParentActivity(), 0, rnVar32.aa);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    rnVar32.showDialog(alertDialog$Builder.a);
                                    ck ckVar = rnVar32.U;
                                    if (ckVar != null) {
                                        ckVar.b1(null, null, false);
                                        rnVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                rn rnVar5 = this.b;
                if (tL_error == null) {
                    rnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    rnVar5.getClass();
                    break;
                }
            default:
                rn.Z0(this.b, tLObject);
                break;
        }
    }
}
