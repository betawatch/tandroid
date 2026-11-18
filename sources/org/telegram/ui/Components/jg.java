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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class jg extends mt {
    public tc e2;
    public final /* synthetic */ ChatActivityEnterView f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.mt
    public final void E() {
        kg kgVar = this.f2.N3;
        if (kgVar != null) {
            kgVar.i2();
        }
    }

    @Override // org.telegram.ui.Components.mt
    public final void F() {
        kg kgVar = this.f2.N3;
        if (kgVar != null) {
            kgVar.g();
        }
    }

    public final void J(Uri uri, String str) {
        org.telegram.ui.bn bnVar = this.f2.D3;
        Utilities.e.c(new k7(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), bnVar != null && bnVar.z()), 3));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar == null || bnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(0);
        if (!chatActivityEnterView.n3) {
            PhotoViewer.p1().I2(null, bnVar, chatActivityEnterView.K4);
            PhotoViewer.p1().f2(arrayList, 0, 2, false, new ig(this, efVar, file), chatActivityEnterView.D3);
        } else {
            org.telegram.messenger.g0.v1(this);
            org.telegram.messenger.g0.h3(new a9.h(this, arrayList, file, false, 9), 100L);
        }
    }

    public final void L(of ofVar, boolean z10, int i7, int i10) {
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.fj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        org.telegram.ui.fg0 fg0Var = chatActivityEnterView.M0;
        if (fg0Var != null) {
            fg0Var.h(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.rm rmVar = chatActivityEnterView.J3;
        if (rmVar != null && bnVar != null && rmVar.f) {
            bnVar.yc();
            return;
        }
        t0.h hVar = (t0.h) ofVar.b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.E3;
            org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.zy.T(cVar, null, null, c10, null, "image/gif", j3, fjVar, threadMessage2, null, chatActivityEnterView.J3, z10, ofVar, bnVar != null ? bnVar.Y8() : null);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.E3;
            org.telegram.messenger.fj fjVar2 = chatActivityEnterView.H3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.zy.Y(cVar2, c11, j10, fjVar2, threadMessage, ofVar, null, z10, 0, bnVar != null ? bnVar.Y8() : null);
        }
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.H(null, true, i7, i10, 0L);
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
        boolean z10 = false;
        if (this.f2.b0) {
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
                    if (!z10) {
                    }
                    if (z10) {
                    }
                }
                i7 = 4;
                if (!z10) {
                }
                if (z10) {
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
                            z10 = true;
                        }
                    }
                    i7 = 4;
                } else {
                    i7 = 1;
                }
                if ((!z10 || i7 != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z10) {
                        D(null);
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
    public final org.telegram.ui.ActionBar.i6 getResourcesProvider() {
        return this.f2.K4;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null) {
            bnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.y0(menu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i7 = ChatActivityEnterView.n7;
            if (!(chatActivityEnterView.P2 != null) && !chatActivityEnterView.k7) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new b0(this, 17));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new b0(this, 17));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.f2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            chatActivityEnterView.P1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.V1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.T = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        kg kgVar = this.f2.N3;
        if (kgVar != null) {
            kgVar.b0();
        }
    }

    @Override // org.telegram.ui.Components.pt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        y60 y60Var;
        gf gfVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.G();
        }
        fe feVar = chatActivityEnterView.R0;
        if (feVar == null) {
            return;
        }
        boolean z10 = (chatActivityEnterView.D3 == null || (gfVar = chatActivityEnterView.F0) == null || gfVar.getSelectionEnd() == chatActivityEnterView.F0.getSelectionStart()) ? false : true;
        if (feVar.x != z10) {
            feVar.x = z10;
            feVar.invalidate();
        }
        if (z10 || (y60Var = chatActivityEnterView.T6) == null) {
            return;
        }
        y60Var.v();
        chatActivityEnterView.T6 = null;
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f2;
            chatActivityEnterView.L2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.P2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.s4 && chatActivityEnterView.p4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.M0()) {
                if (this.e2 == null) {
                    tc tcVar = new tc(this);
                    this.e2 = tcVar;
                    final int i7 = 0;
                    tcVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.hg
                        public final /* synthetic */ jg b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10 = i7;
                            jg jgVar = this.b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = jgVar.f2;
                                    int i11 = ChatActivityEnterView.n7;
                                    chatActivityEnterView2.U1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = jgVar.f2;
                                    chatActivityEnterView3.Z3 = false;
                                    chatActivityEnterView3.f1();
                                    break;
                            }
                        }
                    };
                }
                tc tcVar2 = this.e2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                tcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                tcVar2.i = false;
                tcVar2.c = 0;
                tcVar2.a(rectF);
                return this.e2.b(motionEvent);
            }
            if (chatActivityEnterView.O0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.F2 != 0) {
                    chatActivityEnterView.L1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.T1(org.telegram.messenger.g0.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.n4) {
                    chatActivityEnterView.f1();
                    return true;
                }
                chatActivityEnterView.M1(false, true, false, true);
                chatActivityEnterView.Z3 = true;
                final int i10 = 1;
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.hg
                    public final /* synthetic */ jg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        jg jgVar = this.b;
                        switch (i102) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = jgVar.f2;
                                int i11 = ChatActivityEnterView.n7;
                                chatActivityEnterView2.U1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = jgVar.f2;
                                chatActivityEnterView3.Z3 = false;
                                chatActivityEnterView3.f1();
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
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.M0()) {
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

    @Override // org.telegram.ui.Components.pt
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f2;
        if (chatActivityEnterView.a2.getForeground() != null) {
            au0 au0Var = chatActivityEnterView.a2;
            au0Var.invalidateDrawable(au0Var.getForeground());
        }
    }
}
