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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ oe(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final wn wnVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                wn.X0(wnVar, tLObject);
                                break;
                            case 1:
                                wn.k0(wnVar, tLObject);
                                break;
                            case 2:
                                wn wnVar2 = wnVar;
                                TLObject tLObject2 = tLObject;
                                wnVar2.E5 = 0;
                                if (tLObject2 == null && wnVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar2.getParentActivity(), 0, wnVar2.ua);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar2.showDialog(alertDialog$Builder.a);
                                    jk jkVar = wnVar2.Y;
                                    if (jkVar != null) {
                                        jkVar.Y0(null, null, false);
                                        wnVar2.r9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                wn wnVar3 = wnVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(wnVar3)) {
                                            org.telegram.ui.Components.wc.b0(wnVar3).k(!wnVar3.R9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final wn wnVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                wn.X0(wnVar2, tLObject);
                                break;
                            case 1:
                                wn.k0(wnVar2, tLObject);
                                break;
                            case 2:
                                wn wnVar22 = wnVar2;
                                TLObject tLObject2 = tLObject;
                                wnVar22.E5 = 0;
                                if (tLObject2 == null && wnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar22.getParentActivity(), 0, wnVar22.ua);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar22.showDialog(alertDialog$Builder.a);
                                    jk jkVar = wnVar22.Y;
                                    if (jkVar != null) {
                                        jkVar.Y0(null, null, false);
                                        wnVar22.r9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                wn wnVar3 = wnVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(wnVar3)) {
                                            org.telegram.ui.Components.wc.b0(wnVar3).k(!wnVar3.R9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final wn wnVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                wn.X0(wnVar3, tLObject);
                                break;
                            case 1:
                                wn.k0(wnVar3, tLObject);
                                break;
                            case 2:
                                wn wnVar22 = wnVar3;
                                TLObject tLObject2 = tLObject;
                                wnVar22.E5 = 0;
                                if (tLObject2 == null && wnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar22.getParentActivity(), 0, wnVar22.ua);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar22.showDialog(alertDialog$Builder.a);
                                    jk jkVar = wnVar22.Y;
                                    if (jkVar != null) {
                                        jkVar.Y0(null, null, false);
                                        wnVar22.r9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                wn wnVar32 = wnVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(wnVar32)) {
                                            org.telegram.ui.Components.wc.b0(wnVar32).k(!wnVar32.R9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final wn wnVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                wn.X0(wnVar4, tLObject);
                                break;
                            case 1:
                                wn.k0(wnVar4, tLObject);
                                break;
                            case 2:
                                wn wnVar22 = wnVar4;
                                TLObject tLObject2 = tLObject;
                                wnVar22.E5 = 0;
                                if (tLObject2 == null && wnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar22.getParentActivity(), 0, wnVar22.ua);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar22.showDialog(alertDialog$Builder.a);
                                    jk jkVar = wnVar22.Y;
                                    if (jkVar != null) {
                                        jkVar.Y0(null, null, false);
                                        wnVar22.r9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                wn wnVar32 = wnVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(wnVar32)) {
                                            org.telegram.ui.Components.wc.b0(wnVar32).k(!wnVar32.R9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                wn wnVar5 = this.b;
                if (tL_error == null) {
                    wnVar5.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    wnVar5.getClass();
                    break;
                }
            default:
                wn.n1(this.b, tLObject);
                break;
        }
    }
}
