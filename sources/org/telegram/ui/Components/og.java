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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class og extends eu {
    public gd c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
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
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar != null) {
            ynVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        return this.d.W3;
    }

    public final void m(Uri uri, String str) {
        org.telegram.ui.yn ynVar = this.d.P2;
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.o(this, uri, AndroidUtilities.generatePicturePath(ynVar != null && ynVar.v(), MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 12));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar == null || ynVar.getParentActivity() == null) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
        if (!chatActivityEnterView.z2) {
            PhotoViewer.t1().K2(null, ynVar, chatActivityEnterView.W3);
            PhotoViewer.t1().g2(arrayList, 0, 2, false, new ng(this, photoEntry, file), chatActivityEnterView.P2);
        } else {
            AndroidUtilities.hideKeyboard(this);
            AndroidUtilities.runOnUIThread(new c5.v(this, arrayList, file, false, 9), 100L);
        }
    }

    public final void o(t0.i iVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        of ofVar = chatActivityEnterView.L0;
        if (ofVar != null) {
            ofVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.on onVar = chatActivityEnterView.V2;
        if (onVar != null && ynVar != null && onVar.f) {
            ynVar.Qb();
            return;
        }
        t0.h hVar = iVar.a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j3, messageObject, threadMessage2, null, chatActivityEnterView.V2, null, z10, 0, iVar, ynVar != null ? ynVar.D8() : null, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.Q2;
            MessageObject messageObject2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j10, messageObject2, threadMessage, chatActivityEnterView.V2, null, null, null, iVar, 0, null, z10, 0, ynVar == null ? 0 : ynVar.P3, ynVar != null ? ynVar.D8() : null);
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.H(null, true, i10, i11, 0L);
        }
    }

    @Override // org.telegram.ui.Components.eu
    public final void onContextMenuClose() {
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.d2();
        }
    }

    @Override // org.telegram.ui.Components.eu
    public final void onContextMenuOpen() {
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.i();
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
            if (!(chatActivityEnterView.b2 != null) && !chatActivityEnterView.l5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.eu, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.S = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            chatActivityEnterView.o1(chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.u1(chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.S = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.m0();
        }
    }

    @Override // org.telegram.ui.Components.gu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.E0(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.eu, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.b2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.z0 && !chatActivityEnterView.r0()) {
                if (this.c == null) {
                    gd gdVar = new gd(this);
                    this.c = gdVar;
                    final int i10 = 0;
                    gdVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.mg
                        public final /* synthetic */ og b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            og ogVar = this.b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ogVar.d;
                                    int i12 = ChatActivityEnterView.n5;
                                    chatActivityEnterView2.t1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ogVar.d;
                                    chatActivityEnterView3.l3 = false;
                                    chatActivityEnterView3.I0();
                                    break;
                            }
                        }
                    };
                }
                gd gdVar2 = this.c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gdVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                gdVar2.i = false;
                gdVar2.c = 0;
                gdVar2.a(rectF);
                return this.c.b(motionEvent);
            }
            if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.s1(AndroidUtilities.usingHardwareInput ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.z3) {
                    chatActivityEnterView.I0();
                    return true;
                }
                chatActivityEnterView.m1(false, true, false, true);
                chatActivityEnterView.l3 = true;
                final int i11 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.mg
                    public final /* synthetic */ og b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        og ogVar = this.b;
                        switch (i112) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = ogVar.d;
                                int i12 = ChatActivityEnterView.n5;
                                chatActivityEnterView2.t1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = ogVar.d;
                                chatActivityEnterView3.l3 = false;
                                chatActivityEnterView3.I0();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.z0 && !chatActivityEnterView.r0()) {
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

    @Override // org.telegram.ui.Components.gu
    public void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.m1.getForeground() != null) {
            mw0 mw0Var = chatActivityEnterView.m1;
            mw0Var.invalidateDrawable(mw0Var.getForeground());
        }
    }
}
