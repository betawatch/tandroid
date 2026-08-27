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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class zf extends lt {
    public tc c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
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
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        if (rnVar != null) {
            rnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.d.R3;
    }

    public final void m(Uri uri, String str) {
        org.telegram.ui.rn rnVar = this.d.K2;
        Utilities.globalQueue.postRunnable(new org.telegram.ui.ActionBar.i3(this, uri, AndroidUtilities.generatePicturePath(rnVar != null && rnVar.x(), MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 8));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        if (rnVar == null || rnVar.getParentActivity() == null) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
        if (chatActivityEnterView.u2) {
            AndroidUtilities.hideKeyboard(this);
            AndroidUtilities.runOnUIThread(new com.google.android.gms.common.api.internal.q1(this, arrayList, file, 12), 100L);
        } else {
            PhotoViewer.t1().K2(null, rnVar, chatActivityEnterView.R3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new yf(this, photoEntry, file), chatActivityEnterView.K2);
        }
    }

    public final void o(t0.j jVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        ye yeVar = chatActivityEnterView.H0;
        if (yeVar != null) {
            yeVar.h(true);
            chatActivityEnterView.H0 = null;
        }
        org.telegram.ui.hn hnVar = chatActivityEnterView.Q2;
        if (hnVar != null && rnVar != null && hnVar.f) {
            rnVar.Rb();
            return;
        }
        t0.i iVar = jVar.a;
        if (iVar.k().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.N;
            Uri c10 = iVar.c();
            long j10 = chatActivityEnterView.L2;
            MessageObject messageObject = chatActivityEnterView.O2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j10, messageObject, threadMessage2, null, chatActivityEnterView.Q2, null, z10, 0, jVar, rnVar != null ? rnVar.C8() : null, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.N;
            Uri c11 = iVar.c();
            long j11 = chatActivityEnterView.L2;
            MessageObject messageObject2 = chatActivityEnterView.O2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j11, messageObject2, threadMessage, chatActivityEnterView.Q2, null, null, null, jVar, 0, null, z10, 0, rnVar == null ? 0 : rnVar.N3, rnVar != null ? rnVar.C8() : null);
        }
        ag agVar = chatActivityEnterView.U2;
        if (agVar != null) {
            agVar.w(null, true, i10, i11, 0L);
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void onContextMenuClose() {
        ag agVar = this.d.U2;
        if (agVar != null) {
            agVar.N1();
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void onContextMenuOpen() {
        ag agVar = this.d.U2;
        if (agVar != null) {
            agVar.e();
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
                return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th) {
            FileLog.e(th);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.lt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.O = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.O) {
            chatActivityEnterView.P = getLineCount();
            chatActivityEnterView.o1(chatActivityEnterView.P > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.u1(chatActivityEnterView.P > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.O = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ag agVar = this.d.U2;
        if (agVar != null) {
            agVar.N();
        }
    }

    @Override // org.telegram.ui.Components.nt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        ag agVar = this.d.U2;
        if (agVar != null) {
            agVar.o0(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.lt, android.widget.EditText, android.widget.TextView
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
                    tc tcVar = new tc(this);
                    this.c = tcVar;
                    final int i10 = 0;
                    tcVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.xf
                        public final /* synthetic */ zf b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            zf zfVar = this.b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = zfVar.d;
                                    int i12 = ChatActivityEnterView.i5;
                                    chatActivityEnterView2.t1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = zfVar.d;
                                    chatActivityEnterView3.g3 = false;
                                    chatActivityEnterView3.I0();
                                    break;
                            }
                        }
                    };
                }
                tc tcVar2 = this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                tcVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                tcVar2.i = false;
                tcVar2.c = 0;
                tcVar2.a(rectF);
                return this.c.b(motionEvent);
            }
            if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.Q0.u(false);
                    requestFocus();
                }
                chatActivityEnterView.s1(AndroidUtilities.usingHardwareInput ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.u3) {
                    chatActivityEnterView.I0();
                    return true;
                }
                chatActivityEnterView.m1(false, true, false, true);
                chatActivityEnterView.g3 = true;
                final int i11 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.xf
                    public final /* synthetic */ zf b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        zf zfVar = this.b;
                        switch (i112) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = zfVar.d;
                                int i12 = ChatActivityEnterView.i5;
                                chatActivityEnterView2.t1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = zfVar.d;
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
            } catch (Exception e9) {
                FileLog.e(e9);
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

    @Override // org.telegram.ui.Components.nt
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.h1.getForeground() != null) {
            zu0 zu0Var = chatActivityEnterView.h1;
            zu0Var.invalidateDrawable(zu0Var.getForeground());
        }
    }
}
