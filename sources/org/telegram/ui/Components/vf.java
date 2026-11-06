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
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class vf extends ys {
    public pc Y1;
    public final /* synthetic */ ChatActivityEnterView Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Z1 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ys
    public final void D() {
        wf wfVar = this.Z1.Z2;
        if (wfVar != null) {
            wfVar.T1();
        }
    }

    @Override // org.telegram.ui.Components.ys
    public final void E() {
        wf wfVar = this.Z1.Z2;
        if (wfVar != null) {
            wfVar.b();
        }
    }

    public final void I(Uri uri, String str) {
        org.telegram.ui.an anVar = this.Z1.P2;
        Utilities.e.c(new l2.z0(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), anVar != null && anVar.z()), 28));
    }

    public final void J(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        if (anVar == null || anVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList.get(0);
        if (!chatActivityEnterView.z2) {
            PhotoViewer.p1().H2(null, anVar, chatActivityEnterView.W3);
            PhotoViewer.p1().e2(arrayList, 0, 2, false, new uf(this, gfVar, file), chatActivityEnterView.P2);
        } else {
            org.telegram.messenger.g0.v1(this);
            org.telegram.messenger.g0.i3(new a9.h(this, arrayList, file, false, 9), 100L);
        }
    }

    public final void K(qt qtVar, boolean z9, int i7, int i10) {
        org.telegram.messenger.ij threadMessage;
        org.telegram.messenger.ij threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        ue ueVar = chatActivityEnterView.L0;
        if (ueVar != null) {
            ueVar.g(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.qm qmVar = chatActivityEnterView.V2;
        if (qmVar != null && anVar != null && qmVar.f) {
            anVar.uc();
            return;
        }
        t0.h hVar = (t0.h) qtVar.b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.R;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.Q2;
            org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.gz.T(cVar, null, null, c10, null, "image/gif", j3, ijVar, threadMessage2, null, chatActivityEnterView.V2, z9, qtVar, anVar != null ? anVar.W8() : null);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.R;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.Q2;
            org.telegram.messenger.ij ijVar2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.gz.Y(cVar2, c11, j10, ijVar2, threadMessage, qtVar, null, z9, 0, anVar != null ? anVar.W8() : null);
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.F(null, true, i7, i10, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i7;
        boolean z9 = false;
        if (this.Z1.a0) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
            int i10 = 4;
            if (keyEvent.isShiftPressed()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i7 = 8;
                        }
                        i7 = 0;
                    } else {
                        i7 = 256;
                    }
                    if (!z9) {
                    }
                    if (z9) {
                    }
                }
                i7 = 4;
                if (!z9) {
                }
                if (z9) {
                }
            } else {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 30) {
                    if (keyCode2 != 33) {
                        if (keyCode2 == 37) {
                            i7 = 2;
                        } else if (keyCode2 != 39) {
                            if (keyCode2 == 49) {
                                i7 = 16;
                            }
                            i7 = 0;
                        } else {
                            i7 = 0;
                            z9 = true;
                        }
                    }
                    i7 = 4;
                } else {
                    i7 = 1;
                }
                if ((!z9 || i7 != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z9) {
                        C(null);
                        return true;
                    }
                    if (getText() != null) {
                        int selectionStart = getSelectionStart();
                        int selectionEnd = getSelectionEnd();
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            if (selectionStart > selectionEnd) {
                                selectionEnd = selectionStart;
                                selectionStart = selectionEnd;
                            }
                            if (selectionStart < selectionEnd) {
                                if ((c(selectionStart, selectionEnd) & i7) == 0) {
                                    if (i7 == 4) {
                                        i10 = 49435;
                                    } else if (i7 == 16384) {
                                        i10 = 32772;
                                    } else if (i7 == 32768) {
                                        i10 = 16388;
                                    }
                                    b(i10, selectionStart, selectionEnd);
                                    a(i7, selectionStart, selectionEnd);
                                    return true;
                                }
                                b(i7, selectionStart, selectionEnd);
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.Z1.W3;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        if (anVar != null) {
            anVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.e0(menu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i7 = ChatActivityEnterView.s5;
            if (!(chatActivityEnterView.b2 != null) && !chatActivityEnterView.p5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new u(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new u(this, 18));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.ys, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        boolean z9 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        chatActivityEnterView.S = z9;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            chatActivityEnterView.p1(chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.v1(chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.S = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        wf wfVar = this.Z1.Z2;
        if (wfVar != null) {
            wfVar.j0();
        }
    }

    @Override // org.telegram.ui.Components.ct, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        k60 k60Var;
        xe xeVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.E();
        }
        wd wdVar = chatActivityEnterView.Q0;
        if (wdVar == null) {
            return;
        }
        boolean z9 = (chatActivityEnterView.P2 == null || (xeVar = chatActivityEnterView.E0) == null || xeVar.getSelectionEnd() == chatActivityEnterView.E0.getSelectionStart()) ? false : true;
        if (wdVar.x != z9) {
            wdVar.x = z9;
            wdVar.invalidate();
        }
        if (z9 || (k60Var = chatActivityEnterView.Y4) == null) {
            return;
        }
        k60Var.u();
        chatActivityEnterView.Y4 = null;
    }

    @Override // org.telegram.ui.Components.ys, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.Z1;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.b2 == null) {
                I(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.z0 && !chatActivityEnterView.q0()) {
                if (this.Y1 == null) {
                    pc pcVar = new pc(this);
                    this.Y1 = pcVar;
                    final int i7 = 0;
                    pcVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.tf
                        public final /* synthetic */ vf b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10 = i7;
                            vf vfVar = this.b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = vfVar.Z1;
                                    int i11 = ChatActivityEnterView.s5;
                                    chatActivityEnterView2.u1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = vfVar.Z1;
                                    chatActivityEnterView3.l3 = false;
                                    chatActivityEnterView3.I0();
                                    break;
                            }
                        }
                    };
                }
                pc pcVar2 = this.Y1;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                pcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                pcVar2.i = false;
                pcVar2.c = 0;
                pcVar2.a(rectF);
                return this.Y1.b(motionEvent);
            }
            if (chatActivityEnterView.s0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.t1(org.telegram.messenger.g0.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.z3) {
                    chatActivityEnterView.I0();
                    return true;
                }
                chatActivityEnterView.n1(false, true, false, true);
                chatActivityEnterView.l3 = true;
                final int i10 = 1;
                org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.tf
                    public final /* synthetic */ vf b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        vf vfVar = this.b;
                        switch (i102) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = vfVar.Z1;
                                int i11 = ChatActivityEnterView.s5;
                                chatActivityEnterView2.u1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = vfVar.Z1;
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (!chatActivityEnterView.z0 && !chatActivityEnterView.q0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.g0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // org.telegram.ui.Components.ct
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (chatActivityEnterView.m1.getForeground() != null) {
            rt0 rt0Var = chatActivityEnterView.m1;
            rt0Var.invalidateDrawable(rt0Var.getForeground());
        }
    }
}
