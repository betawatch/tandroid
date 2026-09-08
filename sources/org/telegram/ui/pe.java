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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ pe(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final co coVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.df
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                co.G0(coVar, tLObject);
                                break;
                            case 1:
                                co.K0(coVar, tLObject);
                                break;
                            case 2:
                                co coVar2 = coVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(coVar2)) {
                                            org.telegram.ui.Components.yc.a0(coVar2).k(!coVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                break;
                            default:
                                co coVar3 = coVar;
                                TLObject tLObject3 = tLObject;
                                coVar3.o5 = 0;
                                if (tLObject3 == null && coVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar3.getParentActivity(), 0, coVar3.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    coVar3.showDialog(alertDialog$Builder.a);
                                    mk mkVar = coVar3.Y;
                                    if (mkVar != null) {
                                        mkVar.c1(null, null, false);
                                        coVar3.e9(true);
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
                final co coVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.df
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                co.G0(coVar2, tLObject);
                                break;
                            case 1:
                                co.K0(coVar2, tLObject);
                                break;
                            case 2:
                                co coVar22 = coVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(coVar22)) {
                                            org.telegram.ui.Components.yc.a0(coVar22).k(!coVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                break;
                            default:
                                co coVar3 = coVar2;
                                TLObject tLObject3 = tLObject;
                                coVar3.o5 = 0;
                                if (tLObject3 == null && coVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar3.getParentActivity(), 0, coVar3.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    coVar3.showDialog(alertDialog$Builder.a);
                                    mk mkVar = coVar3.Y;
                                    if (mkVar != null) {
                                        mkVar.c1(null, null, false);
                                        coVar3.e9(true);
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
                final co coVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.df
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                co.G0(coVar3, tLObject);
                                break;
                            case 1:
                                co.K0(coVar3, tLObject);
                                break;
                            case 2:
                                co coVar22 = coVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(coVar22)) {
                                            org.telegram.ui.Components.yc.a0(coVar22).k(!coVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                break;
                            default:
                                co coVar32 = coVar3;
                                TLObject tLObject3 = tLObject;
                                coVar32.o5 = 0;
                                if (tLObject3 == null && coVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar32.getParentActivity(), 0, coVar32.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    coVar32.showDialog(alertDialog$Builder.a);
                                    mk mkVar = coVar32.Y;
                                    if (mkVar != null) {
                                        mkVar.c1(null, null, false);
                                        coVar32.e9(true);
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
                final co coVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.df
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                co.G0(coVar4, tLObject);
                                break;
                            case 1:
                                co.K0(coVar4, tLObject);
                                break;
                            case 2:
                                co coVar22 = coVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(coVar22)) {
                                            org.telegram.ui.Components.yc.a0(coVar22).k(!coVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                break;
                            default:
                                co coVar32 = coVar4;
                                TLObject tLObject3 = tLObject;
                                coVar32.o5 = 0;
                                if (tLObject3 == null && coVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar32.getParentActivity(), 0, coVar32.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    coVar32.showDialog(alertDialog$Builder.a);
                                    mk mkVar = coVar32.Y;
                                    if (mkVar != null) {
                                        mkVar.c1(null, null, false);
                                        coVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                co coVar5 = this.b;
                if (tL_error == null) {
                    coVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    coVar5.getClass();
                    break;
                }
            default:
                co.Z0(this.b, tLObject);
                break;
        }
    }
}
