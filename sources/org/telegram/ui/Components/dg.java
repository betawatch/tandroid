package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class dg extends xt {
    public xc c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.d = chatActivityEnterView;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        boolean z4 = false;
        if (this.d.U) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
            if (keyEvent.isShiftPressed()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i10 = 8;
                        }
                        i10 = 0;
                    } else {
                        i10 = 256;
                    }
                    if (!z4) {
                    }
                    if (z4) {
                    }
                }
                i10 = 4;
                if (!z4) {
                }
                if (z4) {
                }
            } else {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 30) {
                    if (keyCode2 != 33) {
                        if (keyCode2 == 37) {
                            i10 = 2;
                        } else if (keyCode2 != 39) {
                            if (keyCode2 == 49) {
                                i10 = 16;
                            }
                            i10 = 0;
                        } else {
                            i10 = 0;
                            z4 = true;
                        }
                    }
                    i10 = 4;
                } else {
                    i10 = 1;
                }
                if ((!z4 || i10 != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z4) {
                        makeSelectedUrl();
                        return true;
                    }
                    toggleStyleForSelection(i10);
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null) {
            xnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        return this.d.S3;
    }

    public final void m(Uri uri, String str) {
        org.telegram.ui.xn xnVar = this.d.L2;
        Utilities.globalQueue.postRunnable(new mh.p6(this, uri, AndroidUtilities.generatePicturePath(xnVar != null && xnVar.w(), MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 26));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar == null || xnVar.getParentActivity() == null) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
        if (chatActivityEnterView.v2) {
            AndroidUtilities.hideKeyboard(this);
            AndroidUtilities.runOnUIThread(new com.google.android.gms.common.api.internal.s1(this, arrayList, file, 8), 100L);
        } else {
            PhotoViewer.t1().K2(null, xnVar, chatActivityEnterView.S3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new cg(this, photoEntry, file), chatActivityEnterView.L2);
        }
    }

    public final void o(t0.i iVar, boolean z4, int i10, int i11) {
        MessageObject threadMessage;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        cf cfVar = chatActivityEnterView.I0;
        if (cfVar != null) {
            cfVar.h(true);
            chatActivityEnterView.I0 = null;
        }
        org.telegram.ui.nn nnVar = chatActivityEnterView.R2;
        if (nnVar != null && xnVar != null && nnVar.f) {
            xnVar.Rb();
            return;
        }
        t0.h hVar = iVar.a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.O;
            Uri a2 = hVar.a();
            long j10 = chatActivityEnterView.M2;
            MessageObject messageObject = chatActivityEnterView.P2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, a2, null, "image/gif", j10, messageObject, threadMessage2, null, chatActivityEnterView.R2, null, z4, 0, iVar, xnVar != null ? xnVar.C8() : null, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.O;
            Uri a10 = hVar.a();
            long j11 = chatActivityEnterView.M2;
            MessageObject messageObject2 = chatActivityEnterView.P2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, a10, j11, messageObject2, threadMessage, chatActivityEnterView.R2, null, null, null, iVar, 0, null, z4, 0, xnVar == null ? 0 : xnVar.O3, xnVar != null ? xnVar.C8() : null);
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.C(null, true, i10, i11, 0L);
        }
    }

    @Override // org.telegram.ui.Components.xt
    public final void onContextMenuClose() {
        eg egVar = this.d.V2;
        if (egVar != null) {
            egVar.n2();
        }
    }

    @Override // org.telegram.ui.Components.xt
    public final void onContextMenuOpen() {
        eg egVar = this.d.V2;
        if (egVar != null) {
            egVar.h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i10 = ChatActivityEnterView.j5;
            if (!(chatActivityEnterView.X1 != null) && !chatActivityEnterView.h5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.xt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z4 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.P = z4;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.P) {
            chatActivityEnterView.Q = getLineCount();
            chatActivityEnterView.p1(chatActivityEnterView.Q > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.v1(chatActivityEnterView.Q > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.P = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        eg egVar = this.d.V2;
        if (egVar != null) {
            egVar.o0();
        }
    }

    @Override // org.telegram.ui.Components.zt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        eg egVar = this.d.V2;
        if (egVar != null) {
            egVar.J0(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.xt, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.T1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.X1 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.A3 && chatActivityEnterView.x3 == null) {
            if (!chatActivityEnterView.w0 && !chatActivityEnterView.r0()) {
                if (this.c == null) {
                    xc xcVar = new xc(this);
                    this.c = xcVar;
                    final int i10 = 0;
                    xcVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.bg
                        public final /* synthetic */ dg b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            dg dgVar = this.b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = dgVar.d;
                                    int i12 = ChatActivityEnterView.j5;
                                    chatActivityEnterView2.u1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = dgVar.d;
                                    chatActivityEnterView3.h3 = false;
                                    chatActivityEnterView3.I0();
                                    break;
                            }
                        }
                    };
                }
                xc xcVar2 = this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xcVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                xcVar2.i = false;
                xcVar2.c = 0;
                xcVar2.a(rectF);
                return this.c.b(motionEvent);
            }
            if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.N1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.R0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.t1(AndroidUtilities.usingHardwareInput ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.v3) {
                    chatActivityEnterView.I0();
                    return true;
                }
                chatActivityEnterView.n1(false, true, false, true);
                chatActivityEnterView.h3 = true;
                final int i11 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.bg
                    public final /* synthetic */ dg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        dg dgVar = this.b;
                        switch (i112) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = dgVar.d;
                                int i12 = ChatActivityEnterView.j5;
                                chatActivityEnterView2.u1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = dgVar.d;
                                chatActivityEnterView3.h3 = false;
                                chatActivityEnterView3.I0();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.w0 && !chatActivityEnterView.r0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // org.telegram.ui.Components.zt
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.i1.getForeground() != null) {
            qv0 qv0Var = chatActivityEnterView.i1;
            qv0Var.invalidateDrawable(qv0Var.getForeground());
        }
    }
}
