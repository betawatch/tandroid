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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class rf extends mt {
    public jc Y1;
    public final /* synthetic */ ChatActivityEnterView Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.Z1 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.mt
    public final void D() {
        sf sfVar = this.Z1.Z2;
        if (sfVar != null) {
            sfVar.O1();
        }
    }

    @Override // org.telegram.ui.Components.mt
    public final void E() {
        sf sfVar = this.Z1.Z2;
        if (sfVar != null) {
            sfVar.k();
        }
    }

    public final void I(Uri uri, String str) {
        org.telegram.ui.un unVar = this.Z1.P2;
        Utilities.e.c(new li.s(this, uri, org.telegram.messenger.i0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), unVar != null && unVar.z()), 28));
    }

    public final void J(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar == null || unVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(0);
        if (!chatActivityEnterView.z2) {
            PhotoViewer.v1().N2(null, unVar, chatActivityEnterView.W3);
            PhotoViewer.v1().j2(arrayList, 0, 2, false, new qf(this, efVar, file), chatActivityEnterView.P2);
        } else {
            org.telegram.messenger.i0.v1(this);
            org.telegram.messenger.i0.h3(new c5.w(this, arrayList, file, false, 7), 100L);
        }
    }

    public final void K(m2.t tVar, boolean z10, int i10, int i11) {
        org.telegram.messenger.jj threadMessage;
        org.telegram.messenger.jj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        pe peVar = chatActivityEnterView.L0;
        if (peVar != null) {
            peVar.g(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && unVar != null && knVar.f) {
            unVar.kc();
            return;
        }
        t0.h hVar = (t0.h) tVar.b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.R;
            Uri a2 = hVar.a();
            long j10 = chatActivityEnterView.Q2;
            org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.qz.T(cVar, null, null, a2, null, "image/gif", j10, jjVar, threadMessage2, null, chatActivityEnterView.V2, z10, tVar, unVar != null ? unVar.P8() : null);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.R;
            Uri a10 = hVar.a();
            long j11 = chatActivityEnterView.Q2;
            org.telegram.messenger.jj jjVar2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.qz.Y(cVar2, a10, j11, jjVar2, threadMessage, tVar, null, z10, 0, unVar != null ? unVar.P8() : null);
        }
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.E(null, true, i10, i11, 0L);
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
        int i10;
        boolean z10 = false;
        if (this.Z1.a0) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
            int i11 = 4;
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
                                if ((c(selectionStart, selectionEnd) & i10) == 0) {
                                    if (i10 == 4) {
                                        i11 = 49435;
                                    } else if (i10 == 16384) {
                                        i11 = 32772;
                                    } else if (i10 == 32768) {
                                        i11 = 16388;
                                    }
                                    b(i11, selectionStart, selectionEnd);
                                    a(i10, selectionStart, selectionEnd);
                                    return true;
                                }
                                b(i10, selectionStart, selectionEnd);
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
    public final org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        return this.Z1.W3;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null) {
            unVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.d0(menu);
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
            int i10 = ChatActivityEnterView.s5;
            if (!(chatActivityEnterView.b2 != null) && !chatActivityEnterView.p5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        chatActivityEnterView.S = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            chatActivityEnterView.n1(chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.t1(chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.S = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        sf sfVar = this.Z1.Z2;
        if (sfVar != null) {
            sfVar.X();
        }
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        z60 z60Var;
        se seVar;
        super.onSelectionChanged(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.D();
        }
        rd rdVar = chatActivityEnterView.Q0;
        if (rdVar == null) {
            return;
        }
        boolean z10 = (chatActivityEnterView.P2 == null || (seVar = chatActivityEnterView.E0) == null || seVar.getSelectionEnd() == chatActivityEnterView.E0.getSelectionStart()) ? false : true;
        if (rdVar.x != z10) {
            rdVar.x = z10;
            rdVar.invalidate();
        }
        if (z10 || (z60Var = chatActivityEnterView.Y4) == null) {
            return;
        }
        z60Var.u();
        chatActivityEnterView.Y4 = null;
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.Z1;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.b2 == null) {
                I(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.z0 && !chatActivityEnterView.o0()) {
                if (this.Y1 == null) {
                    jc jcVar = new jc(this);
                    this.Y1 = jcVar;
                    final int i10 = 0;
                    jcVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.pf
                        public final /* synthetic */ rf b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            rf rfVar = this.b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = rfVar.Z1;
                                    int i12 = ChatActivityEnterView.s5;
                                    chatActivityEnterView2.s1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = rfVar.Z1;
                                    chatActivityEnterView3.l3 = false;
                                    chatActivityEnterView3.G0();
                                    break;
                            }
                        }
                    };
                }
                jc jcVar2 = this.Y1;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                jcVar2.getClass();
                RectF rectF = org.telegram.messenger.i0.P;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                jcVar2.i = false;
                jcVar2.c = 0;
                jcVar2.a(rectF);
                return this.Y1.b(motionEvent);
            }
            if (chatActivityEnterView.q0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.r1(org.telegram.messenger.i0.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.z3) {
                    chatActivityEnterView.G0();
                    return true;
                }
                chatActivityEnterView.l1(false, true, false, true);
                chatActivityEnterView.l3 = true;
                final int i11 = 1;
                org.telegram.messenger.i0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.pf
                    public final /* synthetic */ rf b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        rf rfVar = this.b;
                        switch (i112) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = rfVar.Z1;
                                int i12 = ChatActivityEnterView.s5;
                                chatActivityEnterView2.s1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = rfVar.Z1;
                                chatActivityEnterView3.l3 = false;
                                chatActivityEnterView3.G0();
                                break;
                        }
                    }
                }, 200L);
                return true;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (!chatActivityEnterView.z0 && !chatActivityEnterView.o0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.i0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // org.telegram.ui.Components.qt
    public void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.Z1;
        if (chatActivityEnterView.m1.getForeground() != null) {
            uu0 uu0Var = chatActivityEnterView.m1;
            uu0Var.invalidateDrawable(uu0Var.getForeground());
        }
    }
}
