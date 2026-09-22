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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class lg extends bu {
    public dd c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
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
        if (this.d.a0) {
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
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        if (boVar != null) {
            boVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.i0(menu);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.d.V3;
    }

    public final void m(Uri uri, String str) {
        org.telegram.ui.bo boVar = this.d.O2;
        Utilities.globalQueue.postRunnable(new org.telegram.ui.ActionBar.p(this, uri, AndroidUtilities.generatePicturePath(boVar != null && boVar.v(), MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 9));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        if (boVar == null || boVar.getParentActivity() == null) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
        if (!chatActivityEnterView.y2) {
            PhotoViewer.t1().J2(null, boVar, chatActivityEnterView.V3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new kg(this, photoEntry, file), chatActivityEnterView.O2);
        } else {
            AndroidUtilities.hideKeyboard(this);
            AndroidUtilities.runOnUIThread(new c5.v(this, arrayList, file, false, 9), 100L);
        }
    }

    public final void o(t0.j jVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        kf kfVar = chatActivityEnterView.L0;
        if (kfVar != null) {
            kfVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.rn rnVar = chatActivityEnterView.U2;
        if (rnVar != null && boVar != null && rnVar.f) {
            boVar.Rb();
            return;
        }
        t0.i iVar = jVar.a;
        if (iVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = iVar.c();
            long j3 = chatActivityEnterView.P2;
            MessageObject messageObject = chatActivityEnterView.S2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j3, messageObject, threadMessage2, null, chatActivityEnterView.U2, null, z10, 0, jVar, boVar != null ? boVar.C8() : null, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = iVar.c();
            long j10 = chatActivityEnterView.P2;
            MessageObject messageObject2 = chatActivityEnterView.S2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j10, messageObject2, threadMessage, chatActivityEnterView.U2, null, null, null, jVar, 0, null, z10, 0, boVar == null ? 0 : boVar.R3, boVar != null ? boVar.C8() : null);
        }
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar != null) {
            mgVar.H(null, true, i10, i11, 0L);
        }
    }

    @Override // org.telegram.ui.Components.bu
    public final void onContextMenuClose() {
        mg mgVar = this.d.Y2;
        if (mgVar != null) {
            mgVar.d2();
        }
    }

    @Override // org.telegram.ui.Components.bu
    public final void onContextMenuOpen() {
        mg mgVar = this.d.Y2;
        if (mgVar != null) {
            mgVar.l();
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
            int i10 = ChatActivityEnterView.n5;
            if (!(chatActivityEnterView.a2 != null) && !chatActivityEnterView.l5) {
                t0.c.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.c.b(editorInfo, null);
            return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.bu, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.S = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            chatActivityEnterView.q1(chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.w1(chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.S = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        mg mgVar = this.d.Y2;
        if (mgVar != null) {
            mgVar.m0();
        }
    }

    @Override // org.telegram.ui.Components.du, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        mg mgVar = this.d.Y2;
        if (mgVar != null) {
            mgVar.E0(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.bu, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.W1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.a2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.D3 && chatActivityEnterView.A3 == null) {
            if (!chatActivityEnterView.z0 && !chatActivityEnterView.s0()) {
                if (this.c == null) {
                    dd ddVar = new dd(this);
                    this.c = ddVar;
                    final int i10 = 0;
                    ddVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.jg
                        public final /* synthetic */ lg b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            lg lgVar = this.b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = lgVar.d;
                                    int i12 = ChatActivityEnterView.n5;
                                    chatActivityEnterView2.v1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = lgVar.d;
                                    chatActivityEnterView3.k3 = false;
                                    chatActivityEnterView3.J0();
                                    break;
                            }
                        }
                    };
                }
                dd ddVar2 = this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ddVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                ddVar2.i = false;
                ddVar2.c = 0;
                ddVar2.a(rectF);
                return this.c.b(motionEvent);
            }
            if (chatActivityEnterView.u0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.n1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.u1(AndroidUtilities.usingHardwareInput ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.y3) {
                    chatActivityEnterView.J0();
                    return true;
                }
                chatActivityEnterView.o1(false, true, false, true);
                chatActivityEnterView.k3 = true;
                final int i11 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.jg
                    public final /* synthetic */ lg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        lg lgVar = this.b;
                        switch (i112) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = lgVar.d;
                                int i12 = ChatActivityEnterView.n5;
                                chatActivityEnterView2.v1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = lgVar.d;
                                chatActivityEnterView3.k3 = false;
                                chatActivityEnterView3.J0();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.z0 && !chatActivityEnterView.s0()) {
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

    @Override // org.telegram.ui.Components.du
    public void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.l1.getForeground() != null) {
            pv0 pv0Var = chatActivityEnterView.l1;
            pv0Var.invalidateDrawable(pv0Var.getForeground());
        }
    }
}
