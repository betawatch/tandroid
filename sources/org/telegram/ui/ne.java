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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ne(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final sn snVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                sn.o1(snVar, tLObject);
                                break;
                            case 1:
                                sn.a1(snVar, tLObject);
                                break;
                            case 2:
                                sn snVar2 = snVar;
                                TLObject tLObject2 = tLObject;
                                snVar2.A5 = 0;
                                if (tLObject2 == null && snVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar2.getParentActivity(), 0, snVar2.qa);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    snVar2.showDialog(alertDialog$Builder.a);
                                    gk gkVar = snVar2.Y;
                                    if (gkVar != null) {
                                        gkVar.Z0(null, null, false);
                                        snVar2.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                sn snVar3 = snVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(snVar3)) {
                                            org.telegram.ui.Components.xc.a0(snVar3).k(!snVar3.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final sn snVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                sn.o1(snVar2, tLObject);
                                break;
                            case 1:
                                sn.a1(snVar2, tLObject);
                                break;
                            case 2:
                                sn snVar22 = snVar2;
                                TLObject tLObject2 = tLObject;
                                snVar22.A5 = 0;
                                if (tLObject2 == null && snVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar22.getParentActivity(), 0, snVar22.qa);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    snVar22.showDialog(alertDialog$Builder.a);
                                    gk gkVar = snVar22.Y;
                                    if (gkVar != null) {
                                        gkVar.Z0(null, null, false);
                                        snVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                sn snVar3 = snVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(snVar3)) {
                                            org.telegram.ui.Components.xc.a0(snVar3).k(!snVar3.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final sn snVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                sn.o1(snVar3, tLObject);
                                break;
                            case 1:
                                sn.a1(snVar3, tLObject);
                                break;
                            case 2:
                                sn snVar22 = snVar3;
                                TLObject tLObject2 = tLObject;
                                snVar22.A5 = 0;
                                if (tLObject2 == null && snVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar22.getParentActivity(), 0, snVar22.qa);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    snVar22.showDialog(alertDialog$Builder.a);
                                    gk gkVar = snVar22.Y;
                                    if (gkVar != null) {
                                        gkVar.Z0(null, null, false);
                                        snVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                sn snVar32 = snVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(snVar32)) {
                                            org.telegram.ui.Components.xc.a0(snVar32).k(!snVar32.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                final sn snVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                sn.o1(snVar4, tLObject);
                                break;
                            case 1:
                                sn.a1(snVar4, tLObject);
                                break;
                            case 2:
                                sn snVar22 = snVar4;
                                TLObject tLObject2 = tLObject;
                                snVar22.A5 = 0;
                                if (tLObject2 == null && snVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar22.getParentActivity(), 0, snVar22.qa);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    snVar22.showDialog(alertDialog$Builder.a);
                                    gk gkVar = snVar22.Y;
                                    if (gkVar != null) {
                                        gkVar.Z0(null, null, false);
                                        snVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                sn snVar32 = snVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(snVar32)) {
                                            org.telegram.ui.Components.xc.a0(snVar32).k(!snVar32.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
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
                sn snVar5 = this.b;
                if (tL_error == null) {
                    snVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    snVar5.getClass();
                    break;
                }
            default:
                sn.h1(this.b, tLObject);
                break;
        }
    }
}
