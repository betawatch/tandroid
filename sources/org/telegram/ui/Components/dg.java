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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class dg extends mt {
    public wc c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
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
        int i9;
        boolean z10 = false;
        if (this.d.T) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
            if (keyEvent.isShiftPressed()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i9 = 8;
                        }
                        i9 = 0;
                    } else {
                        i9 = 256;
                    }
                    if (!z10) {
                    }
                    if (z10) {
                    }
                }
                i9 = 4;
                if (!z10) {
                }
                if (z10) {
                }
            } else {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 30) {
                    if (keyCode2 != 33) {
                        if (keyCode2 == 37) {
                            i9 = 2;
                        } else if (keyCode2 != 39) {
                            if (keyCode2 == 49) {
                                i9 = 16;
                            }
                            i9 = 0;
                        } else {
                            i9 = 0;
                            z10 = true;
                        }
                    }
                    i9 = 4;
                } else {
                    i9 = 1;
                }
                if ((!z10 || i9 != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z10) {
                        makeSelectedUrl();
                        return true;
                    }
                    toggleStyleForSelection(i9);
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null) {
            qnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.g0(menu);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.b6 getResourcesProvider() {
        return this.d.R3;
    }

    public final void m(Uri uri, String str) {
        org.telegram.ui.qn qnVar = this.d.K2;
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.e(this, uri, AndroidUtilities.generatePicturePath(qnVar != null && qnVar.w(), MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 14));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar == null || qnVar.getParentActivity() == null) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
        if (chatActivityEnterView.u2) {
            AndroidUtilities.hideKeyboard(this);
            AndroidUtilities.runOnUIThread(new com.google.android.gms.common.api.internal.q1(this, arrayList, file, 12), 100L);
        } else {
            PhotoViewer.t1().K2(null, qnVar, chatActivityEnterView.R3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new cg(this, photoEntry, file), chatActivityEnterView.K2);
        }
    }

    public final void o(t0.j jVar, boolean z10, int i9, int i10) {
        MessageObject threadMessage;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        cf cfVar = chatActivityEnterView.H0;
        if (cfVar != null) {
            cfVar.h(true);
            chatActivityEnterView.H0 = null;
        }
        org.telegram.ui.gn gnVar = chatActivityEnterView.Q2;
        if (gnVar != null && qnVar != null && gnVar.f) {
            qnVar.Rb();
            return;
        }
        t0.i iVar = jVar.a;
        if (iVar.j().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.N;
            Uri c10 = iVar.c();
            long j10 = chatActivityEnterView.L2;
            MessageObject messageObject = chatActivityEnterView.O2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j10, messageObject, threadMessage2, null, chatActivityEnterView.Q2, null, z10, 0, jVar, qnVar != null ? qnVar.C8() : null, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.N;
            Uri c11 = iVar.c();
            long j11 = chatActivityEnterView.L2;
            MessageObject messageObject2 = chatActivityEnterView.O2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j11, messageObject2, threadMessage, chatActivityEnterView.Q2, null, null, null, jVar, 0, null, z10, 0, qnVar == null ? 0 : qnVar.N3, qnVar != null ? qnVar.C8() : null);
        }
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.y(null, true, i9, i10, 0L);
        }
    }

    @Override // org.telegram.ui.Components.mt
    public final void onContextMenuClose() {
        eg egVar = this.d.U2;
        if (egVar != null) {
            egVar.J1();
        }
    }

    @Override // org.telegram.ui.Components.mt
    public final void onContextMenuOpen() {
        eg egVar = this.d.U2;
        if (egVar != null) {
            egVar.e();
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
            int i9 = ChatActivityEnterView.i5;
            if (!(chatActivityEnterView.W1 != null) && !chatActivityEnterView.g5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th) {
            FileLog.e(th);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.O = z10;
        super.onMeasure(i9, i10);
        if (chatActivityEnterView.O) {
            chatActivityEnterView.P = getLineCount();
            chatActivityEnterView.p1(chatActivityEnterView.P > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.v1(chatActivityEnterView.P > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.O = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        eg egVar = this.d.U2;
        if (egVar != null) {
            egVar.Q();
        }
    }

    @Override // org.telegram.ui.Components.ot, android.widget.TextView
    public final void onSelectionChanged(int i9, int i10) {
        super.onSelectionChanged(i9, i10);
        eg egVar = this.d.U2;
        if (egVar != null) {
            egVar.p0(i9, i10);
        }
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i9) {
        if (i9 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.S1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.W1 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i9);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.z3 && chatActivityEnterView.w3 == null) {
            if (!chatActivityEnterView.v0 && !chatActivityEnterView.q0()) {
                if (this.c == null) {
                    wc wcVar = new wc(this);
                    this.c = wcVar;
                    final int i9 = 0;
                    wcVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.bg
                        public final /* synthetic */ dg b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10 = i9;
                            dg dgVar = this.b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = dgVar.d;
                                    int i11 = ChatActivityEnterView.i5;
                                    chatActivityEnterView2.u1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = dgVar.d;
                                    chatActivityEnterView3.g3 = false;
                                    chatActivityEnterView3.H0();
                                    break;
                            }
                        }
                    };
                }
                wc wcVar2 = this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                wcVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                wcVar2.i = false;
                wcVar2.c = 0;
                wcVar2.a(rectF);
                return this.c.b(motionEvent);
            }
            if (chatActivityEnterView.s0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.Q0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.t1(AndroidUtilities.usingHardwareInput ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.u3) {
                    chatActivityEnterView.H0();
                    return true;
                }
                chatActivityEnterView.n1(false, true, false, true);
                chatActivityEnterView.g3 = true;
                final int i10 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.bg
                    public final /* synthetic */ dg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        dg dgVar = this.b;
                        switch (i102) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = dgVar.d;
                                int i11 = ChatActivityEnterView.i5;
                                chatActivityEnterView2.u1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = dgVar.d;
                                chatActivityEnterView3.g3 = false;
                                chatActivityEnterView3.H0();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i9, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.v0 && !chatActivityEnterView.q0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i9, rect);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // org.telegram.ui.Components.ot
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.h1.getForeground() != null) {
            xu0 xu0Var = chatActivityEnterView.h1;
            xu0Var.invalidateDrawable(xu0Var.getForeground());
        }
    }
}
