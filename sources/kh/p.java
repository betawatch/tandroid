package kh;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p implements TextWatcher {
    public final /* synthetic */ View[] a;
    public final /* synthetic */ s b;

    public p(s sVar, View[] viewArr) {
        this.b = sVar;
        this.a = viewArr;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        View[] viewArr = this.a;
        try {
            boolean z4 = ((long) Integer.parseInt(editable.toString())) >= this.b.i0.getMinimumBid();
            viewArr[0].animate().alpha(z4 ? 1.0f : 0.6f).setDuration(180L).start();
            viewArr[0].setEnabled(z4);
            viewArr[0].setClickable(z4);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
