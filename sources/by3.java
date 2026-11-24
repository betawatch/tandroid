// default package

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class by3 extends InputConnectionWrapper {
    public final EditText a;
    public final nf5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by3(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        nf5 nf5Var = new nf5((byte) 19);
        this.a = editText;
        this.b = nf5Var;
        if (wx3.j != null) {
            wx3 a = wx3.a();
            if (a.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            sk skVar = a.e;
            skVar.getClass();
            Bundle bundle = editorInfo.extras;
            rf7 rf7Var = (rf7) ((e7a) skVar.c).a;
            int a2 = rf7Var.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? rf7Var.b.getInt(a2 + rf7Var.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return hi2.y(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return hi2.y(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
