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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class gg extends st {
    public ad c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
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
                            i10 = 8;
                        }
                        i10 = 0;
                    } else {
                        i10 = 256;
                    }
                    if (!z10) {
                    }
                    if (z10) {
                    }
                }
                i10 = 4;
                if (!z10) {
                }
                if (z10) {
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
                            z10 = true;
                        }
                    }
                    i10 = 4;
                } else {
                    i10 = 1;
                }
                if ((!z10 || i10 != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z10) {
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
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar != null) {
            tnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.d.R3;
    }

    public final void m(Uri uri, String str) {
        org.telegram.ui.tn tnVar = this.d.K2;
        Utilities.globalQueue.postRunnable(new g(this, uri, AndroidUtilities.generatePicturePath(tnVar != null && tnVar.w(), MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 3));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar == null || tnVar.getParentActivity() == null) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
        if (chatActivityEnterView.u2) {
            AndroidUtilities.hideKeyboard(this);
            AndroidUtilities.runOnUIThread(new com.google.android.gms.common.api.internal.q1(this, arrayList, file, 9), 100L);
        } else {
            PhotoViewer.t1().K2(null, tnVar, chatActivityEnterView.R3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new fg(this, photoEntry, file), chatActivityEnterView.K2);
        }
    }

    public final void o(t0.i iVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        ff ffVar = chatActivityEnterView.H0;
        if (ffVar != null) {
            ffVar.h(true);
            chatActivityEnterView.H0 = null;
        }
        org.telegram.ui.jn jnVar = chatActivityEnterView.Q2;
        if (jnVar != null && tnVar != null && jnVar.f) {
            tnVar.Rb();
            return;
        }
        t0.h hVar = iVar.a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.N;
            Uri c3 = hVar.c();
            long j10 = chatActivityEnterView.L2;
            MessageObject messageObject = chatActivityEnterView.O2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c3, null, "image/gif", j10, messageObject, threadMessage2, null, chatActivityEnterView.Q2, null, z10, 0, iVar, tnVar != null ? tnVar.C8() : null, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.N;
            Uri c6 = hVar.c();
            long j11 = chatActivityEnterView.L2;
            MessageObject messageObject2 = chatActivityEnterView.O2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c6, j11, messageObject2, threadMessage, chatActivityEnterView.Q2, null, null, null, iVar, 0, null, z10, 0, tnVar == null ? 0 : tnVar.N3, tnVar != null ? tnVar.C8() : null);
        }
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.D(null, true, i10, i11, 0L);
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void onContextMenuClose() {
        hg hgVar = this.d.U2;
        if (hgVar != null) {
            hgVar.d2();
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void onContextMenuOpen() {
        hg hgVar = this.d.U2;
        if (hgVar != null) {
            hgVar.i();
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
            int i10 = ChatActivityEnterView.i5;
            if (!(chatActivityEnterView.W1 != null) && !chatActivityEnterView.g5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new u(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new u(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.st, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.O = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.O) {
            chatActivityEnterView.P = getLineCount();
            chatActivityEnterView.p1(chatActivityEnterView.P > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.v1(chatActivityEnterView.P > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.O = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        hg hgVar = this.d.U2;
        if (hgVar != null) {
            hgVar.k0();
        }
    }

    @Override // org.telegram.ui.Components.ut, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        hg hgVar = this.d.U2;
        if (hgVar != null) {
            hgVar.E0(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.st, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.S1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.W1 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.z3 && chatActivityEnterView.w3 == null) {
            if (!chatActivityEnterView.v0 && !chatActivityEnterView.r0()) {
                if (this.c == null) {
                    ad adVar = new ad(this);
                    this.c = adVar;
                    final int i10 = 0;
                    adVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.eg
                        public final /* synthetic */ gg b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            gg ggVar = this.b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ggVar.d;
                                    int i12 = ChatActivityEnterView.i5;
                                    chatActivityEnterView2.u1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ggVar.d;
                                    chatActivityEnterView3.g3 = false;
                                    chatActivityEnterView3.I0();
                                    break;
                            }
                        }
                    };
                }
                ad adVar2 = this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                adVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f9 = 0;
                rectF.set(f9, f9, measuredWidth, measuredHeight);
                adVar2.i = false;
                adVar2.c = 0;
                adVar2.a(rectF);
                return this.c.b(motionEvent);
            }
            if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.Q0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.t1(AndroidUtilities.usingHardwareInput ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.u3) {
                    chatActivityEnterView.I0();
                    return true;
                }
                chatActivityEnterView.n1(false, true, false, true);
                chatActivityEnterView.g3 = true;
                final int i11 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.eg
                    public final /* synthetic */ gg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        gg ggVar = this.b;
                        switch (i112) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = ggVar.d;
                                int i12 = ChatActivityEnterView.i5;
                                chatActivityEnterView2.u1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = ggVar.d;
                                chatActivityEnterView3.g3 = false;
                                chatActivityEnterView3.I0();
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
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.v0 && !chatActivityEnterView.r0()) {
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

    @Override // org.telegram.ui.Components.ut
    public void setOffsetY(float f9) {
        super.setOffsetY(f9);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.h1.getForeground() != null) {
            hv0 hv0Var = chatActivityEnterView.h1;
            hv0Var.invalidateDrawable(hv0Var.getForeground());
        }
    }
}
