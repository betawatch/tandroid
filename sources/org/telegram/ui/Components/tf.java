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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class tf extends xs {
    public nc Z1;
    public final /* synthetic */ ChatActivityEnterView a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.a2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.xs
    public final void D() {
        uf ufVar = this.a2.a3;
        if (ufVar != null) {
            ufVar.O1();
        }
    }

    @Override // org.telegram.ui.Components.xs
    public final void E() {
        uf ufVar = this.a2.a3;
        if (ufVar != null) {
            ufVar.f();
        }
    }

    public final void I(Uri uri, String str) {
        org.telegram.ui.wm wmVar = this.a2.Q2;
        Utilities.e.c(new e7(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), wmVar != null && wmVar.z()), 2));
    }

    public final void J(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.a2;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar == null || wmVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList.get(0);
        if (chatActivityEnterView.A2) {
            org.telegram.messenger.g0.v1(this);
            org.telegram.messenger.g0.i3(new com.google.android.gms.common.api.internal.j1(this, arrayList, file, 8), 100L);
        } else {
            PhotoViewer.v1().N2(null, wmVar, chatActivityEnterView.X3);
            PhotoViewer.v1().j2(arrayList, 0, 2, false, new sf(this, yeVar, file), chatActivityEnterView.Q2);
        }
    }

    public final void K(y00 y00Var, boolean z10, int i3, int i10) {
        org.telegram.messenger.zi threadMessage;
        org.telegram.messenger.zi threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.a2;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        se seVar = chatActivityEnterView.M0;
        if (seVar != null) {
            seVar.g(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.mm mmVar = chatActivityEnterView.W2;
        if (mmVar != null && wmVar != null && mmVar.f) {
            wmVar.uc();
            return;
        }
        t0.h hVar = (t0.h) y00Var.a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri a10 = hVar.a();
            long j10 = chatActivityEnterView.R2;
            org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.yy.T(cVar, null, null, a10, null, "image/gif", j10, ziVar, threadMessage2, null, chatActivityEnterView.W2, z10, y00Var, wmVar != null ? wmVar.W8() : null);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri a11 = hVar.a();
            long j11 = chatActivityEnterView.R2;
            org.telegram.messenger.zi ziVar2 = chatActivityEnterView.U2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.messenger.yy.Y(cVar2, a11, j11, ziVar2, threadMessage, y00Var, null, z10, 0, wmVar != null ? wmVar.W8() : null);
        }
        uf ufVar = chatActivityEnterView.a3;
        if (ufVar != null) {
            ufVar.G(null, true, i3, i10, 0L);
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
        int i3;
        boolean z10 = false;
        if (this.a2.b0) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
            int i10 = 4;
            if (keyEvent.isShiftPressed()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i3 = 8;
                        }
                        i3 = 0;
                    } else {
                        i3 = 256;
                    }
                    if (!z10) {
                    }
                    if (z10) {
                    }
                }
                i3 = 4;
                if (!z10) {
                }
                if (z10) {
                }
            } else {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 30) {
                    if (keyCode2 != 33) {
                        if (keyCode2 == 37) {
                            i3 = 2;
                        } else if (keyCode2 != 39) {
                            if (keyCode2 == 49) {
                                i3 = 16;
                            }
                            i3 = 0;
                        } else {
                            i3 = 0;
                            z10 = true;
                        }
                    }
                    i3 = 4;
                } else {
                    i3 = 1;
                }
                if ((!z10 || i3 != 0) && getSelectionStart() != getSelectionEnd()) {
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
                                if ((c(selectionStart, selectionEnd) & i3) == 0) {
                                    if (i3 == 4) {
                                        i10 = 49435;
                                    } else if (i3 == 16384) {
                                        i10 = 32772;
                                    } else if (i3 == 32768) {
                                        i10 = 16388;
                                    }
                                    b(i10, selectionStart, selectionEnd);
                                    a(i3, selectionStart, selectionEnd);
                                    return true;
                                }
                                b(i3, selectionStart, selectionEnd);
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
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.a2.X3;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.a2;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar != null) {
            wmVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.e0(menu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ChatActivityEnterView chatActivityEnterView = this.a2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i3 = ChatActivityEnterView.t5;
            if (!(chatActivityEnterView.c2 != null) && !chatActivityEnterView.q5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new t(this, 18));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        boolean z10 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
        ChatActivityEnterView chatActivityEnterView = this.a2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i3, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            chatActivityEnterView.o1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            chatActivityEnterView.u1(chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim()));
        }
        chatActivityEnterView.T = false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        uf ufVar = this.a2.a3;
        if (ufVar != null) {
            ufVar.g0();
        }
    }

    @Override // org.telegram.ui.Components.bt, android.widget.TextView
    public final void onSelectionChanged(int i3, int i10) {
        f60 f60Var;
        ve veVar;
        super.onSelectionChanged(i3, i10);
        ChatActivityEnterView chatActivityEnterView = this.a2;
        uf ufVar = chatActivityEnterView.a3;
        if (ufVar != null) {
            ufVar.F();
        }
        ud udVar = chatActivityEnterView.R0;
        if (udVar == null) {
            return;
        }
        boolean z10 = (chatActivityEnterView.Q2 == null || (veVar = chatActivityEnterView.F0) == null || veVar.getSelectionEnd() == chatActivityEnterView.F0.getSelectionStart()) ? false : true;
        if (udVar.x != z10) {
            udVar.x = z10;
            udVar.invalidate();
        }
        if (z10 || (f60Var = chatActivityEnterView.Z4) == null) {
            return;
        }
        f60Var.u();
        chatActivityEnterView.Z4 = null;
    }

    @Override // org.telegram.ui.Components.xs, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i3) {
        if (i3 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.a2;
            chatActivityEnterView.Y1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.c2 == null) {
                I(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.a2;
        if (!chatActivityEnterView.F3 && chatActivityEnterView.C3 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.p0()) {
                if (this.Z1 == null) {
                    nc ncVar = new nc(this);
                    this.Z1 = ncVar;
                    final int i3 = 0;
                    ncVar.h = new Runnable(this) { // from class: org.telegram.ui.Components.rf
                        public final /* synthetic */ tf b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10 = i3;
                            tf tfVar = this.b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = tfVar.a2;
                                    int i11 = ChatActivityEnterView.t5;
                                    chatActivityEnterView2.t1();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = tfVar.a2;
                                    chatActivityEnterView3.m3 = false;
                                    chatActivityEnterView3.H0();
                                    break;
                            }
                        }
                    };
                }
                nc ncVar2 = this.Z1;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ncVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                ncVar2.i = false;
                ncVar2.c = 0;
                ncVar2.a(rectF);
                return this.Z1.b(motionEvent);
            }
            if (chatActivityEnterView.r0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.S1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                chatActivityEnterView.s1(org.telegram.messenger.g0.D ? 0 : 2, 0, true, true);
                if (!chatActivityEnterView.A3) {
                    chatActivityEnterView.H0();
                    return true;
                }
                chatActivityEnterView.m1(false, true, false, true);
                chatActivityEnterView.m3 = true;
                final int i10 = 1;
                org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.rf
                    public final /* synthetic */ tf b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        tf tfVar = this.b;
                        switch (i102) {
                            case 0:
                                ChatActivityEnterView chatActivityEnterView2 = tfVar.a2;
                                int i11 = ChatActivityEnterView.t5;
                                chatActivityEnterView2.t1();
                                break;
                            default:
                                ChatActivityEnterView chatActivityEnterView3 = tfVar.a2;
                                chatActivityEnterView3.m3 = false;
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
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.a2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.p0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i3, rect);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.g0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override // org.telegram.ui.Components.bt
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.a2;
        if (chatActivityEnterView.n1.getForeground() != null) {
            qt0 qt0Var = chatActivityEnterView.n1;
            qt0Var.invalidateDrawable(qt0Var.getForeground());
        }
    }
}
