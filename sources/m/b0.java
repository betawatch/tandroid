package m;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        r0.e eVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                eVar = new r0.d(clipData, 3);
            } else {
                r0.f fVar = new r0.f();
                fVar.b = clipData;
                fVar.c = 3;
                eVar = fVar;
            }
            r0.j0.i(textView, eVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        r0.e eVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            eVar = new r0.d(clipData, 3);
        } else {
            r0.f fVar = new r0.f();
            fVar.b = clipData;
            fVar.c = 3;
            eVar = fVar;
        }
        r0.j0.i(view, eVar.build());
        return true;
    }
}
