package m;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class d1 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i7, int i10, TextView textView, TextPaint textPaint, g1 g1Var) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i10 == -1) {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        hyphenationFrequency.setMaxLines(i10);
        try {
            g1Var.a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
