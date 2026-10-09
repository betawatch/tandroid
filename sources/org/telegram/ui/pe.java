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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ pe(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final zn znVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zn.l1(znVar, tLObject);
                                break;
                            case 1:
                                zn.V0(znVar, tLObject);
                                break;
                            case 2:
                                zn znVar2 = znVar;
                                TLObject tLObject2 = tLObject;
                                znVar2.o5 = 0;
                                if (tLObject2 == null && znVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar2.getParentActivity(), 0, znVar2.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar2.showDialog(alertDialog$Builder.a);
                                    ok okVar = znVar2.Y;
                                    if (okVar != null) {
                                        okVar.a1(null, null, false);
                                        znVar2.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                zn znVar3 = znVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.ad.a(znVar3)) {
                                            org.telegram.ui.Components.ad.a0(znVar3).k(!znVar3.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final zn znVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zn.l1(znVar2, tLObject);
                                break;
                            case 1:
                                zn.V0(znVar2, tLObject);
                                break;
                            case 2:
                                zn znVar22 = znVar2;
                                TLObject tLObject2 = tLObject;
                                znVar22.o5 = 0;
                                if (tLObject2 == null && znVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar22.getParentActivity(), 0, znVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar22.showDialog(alertDialog$Builder.a);
                                    ok okVar = znVar22.Y;
                                    if (okVar != null) {
                                        okVar.a1(null, null, false);
                                        znVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                zn znVar3 = znVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.ad.a(znVar3)) {
                                            org.telegram.ui.Components.ad.a0(znVar3).k(!znVar3.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 3;
                final zn znVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                zn.l1(znVar3, tLObject);
                                break;
                            case 1:
                                zn.V0(znVar3, tLObject);
                                break;
                            case 2:
                                zn znVar22 = znVar3;
                                TLObject tLObject2 = tLObject;
                                znVar22.o5 = 0;
                                if (tLObject2 == null && znVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar22.getParentActivity(), 0, znVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar22.showDialog(alertDialog$Builder.a);
                                    ok okVar = znVar22.Y;
                                    if (okVar != null) {
                                        okVar.a1(null, null, false);
                                        znVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                zn znVar32 = znVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.ad.a(znVar32)) {
                                            org.telegram.ui.Components.ad.a0(znVar32).k(!znVar32.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 2;
                final zn znVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                zn.l1(znVar4, tLObject);
                                break;
                            case 1:
                                zn.V0(znVar4, tLObject);
                                break;
                            case 2:
                                zn znVar22 = znVar4;
                                TLObject tLObject2 = tLObject;
                                znVar22.o5 = 0;
                                if (tLObject2 == null && znVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar22.getParentActivity(), 0, znVar22.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar22.showDialog(alertDialog$Builder.a);
                                    ok okVar = znVar22.Y;
                                    if (okVar != null) {
                                        okVar.a1(null, null, false);
                                        znVar22.j9(true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                zn znVar32 = znVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.ad.a(znVar32)) {
                                            org.telegram.ui.Components.ad.a0(znVar32).k(!znVar32.K9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                zn znVar5 = this.b;
                if (tL_error == null) {
                    znVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    znVar5.getClass();
                    break;
                }
            default:
                zn.e1(this.b, tLObject);
                break;
        }
    }
}
