package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class iz0 extends pj0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.e3 = editorAlert;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean E0(float f10) {
        return f10 >= ((float) ((org.telegram.messenger.g0.L(48.0f) + this.e3.v1) + org.telegram.messenger.g0.m));
    }
}
