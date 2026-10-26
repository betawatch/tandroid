package org.telegram.ui.Components;

import android.view.PointerIcon;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class zm0 {
    public static void a(View view, String str) {
        int i10;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "col-resize":
            case "ew-resize":
            case "e-resize":
            case "w-resize":
                i10 = 1014;
                break;
            case "se-resize":
            case "nw-resize":
            case "nwse-resize":
                i10 = 1017;
                break;
            case "n-resize":
            case "s-resize":
            case "row-resize":
            case "ns-resize":
                i10 = 1015;
                break;
            case "vertical-text":
                i10 = 1009;
                break;
            case "progress":
            case "wait":
                i10 = 1004;
                break;
            case "ne-resize":
            case "sw-resize":
            case "nesw-resize":
                i10 = 1016;
                break;
            case "pointer":
                i10 = 1002;
                break;
            case "zoom-in":
                i10 = 1018;
                break;
            case "cell":
                i10 = 1006;
                break;
            case "copy":
                i10 = 1011;
                break;
            case "grab":
                i10 = 1020;
                break;
            case "help":
                i10 = 1003;
                break;
            case "move":
            case "all-scroll":
                i10 = 1013;
                break;
            case "none":
                break;
            case "text":
                i10 = 1008;
                break;
            case "grabbing":
                i10 = 1021;
                break;
            case "alias":
                i10 = 1010;
                break;
            case "not-allowed":
            case "no-drop":
                i10 = 1012;
                break;
            case "zoom-out":
                i10 = 1019;
                break;
            case "context-menu":
                i10 = 1001;
                break;
            case "crosshair":
                i10 = 1007;
                break;
            default:
                view.setPointerIcon(null);
                return;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), i10));
    }
}
