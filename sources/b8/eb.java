package b8;

import android.net.Uri;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class eb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c2;
        if (str == null) {
            return -1;
        }
        String n4 = d2.u0.n(str);
        n4.getClass();
        switch (n4.hashCode()) {
            case -2123537834:
                if (n4.equals("audio/eac3-joc")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384011:
                if (n4.equals("video/mp2p")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384007:
                if (n4.equals("video/mp2t")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1662095187:
                if (n4.equals("video/webm")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1606874997:
                if (n4.equals("audio/amr-wb")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487656890:
                if (n4.equals("image/avif")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (n4.equals("image/heic")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (n4.equals("image/heif")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (n4.equals("image/jpeg")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (n4.equals("image/webp")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1248337486:
                if (n4.equals("application/mp4")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1079884372:
                if (n4.equals("video/x-msvideo")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (n4.equals("text/vtt")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -879272239:
                if (n4.equals("image/bmp")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (n4.equals("image/png")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -387023398:
                if (n4.equals("audio/x-matroska")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -43467528:
                if (n4.equals("application/webm")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 13915911:
                if (n4.equals("video/x-flv")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (n4.equals("audio/ac3")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (n4.equals("audio/ac4")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 187078669:
                if (n4.equals("audio/amr")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 187090232:
                if (n4.equals("audio/mp4")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 187091926:
                if (n4.equals("audio/ogg")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 187099443:
                if (n4.equals("audio/wav")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 1331848029:
                if (n4.equals("video/mp4")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 1503095341:
                if (n4.equals("audio/3gpp")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (n4.equals("audio/eac3")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (n4.equals("audio/flac")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 1504824762:
                if (n4.equals("audio/midi")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (n4.equals("audio/mpeg")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 1505118770:
                if (n4.equals("audio/webm")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 2039520277:
                if (n4.equals("video/x-matroska")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
        }
        return -1;
    }

    public static int b(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
