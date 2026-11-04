package org.scilab.forge.jlatexmath;

import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
class PredefMacroInfo extends MacroInfo {
    private int id;

    public PredefMacroInfo(int i3, int i10, int i11) {
        super(i10, i11);
        this.id = i3;
    }

    private static final Object invokeID(int i3, TeXParser teXParser, String[] strArr) {
        try {
            switch (i3) {
                case 0:
                    return PredefMacros.newcommand_macro(teXParser, strArr);
                case 1:
                    return PredefMacros.renewcommand_macro(teXParser, strArr);
                case 2:
                    return PredefMacros.rule_macro(teXParser, strArr);
                case 3:
                case 4:
                    return PredefMacros.hvspace_macro(teXParser, strArr);
                case 5:
                case 6:
                case 7:
                    return PredefMacros.clrlap_macro(teXParser, strArr);
                case 8:
                case 9:
                case 10:
                    return PredefMacros.mathclrlap_macro(teXParser, strArr);
                case 11:
                    return PredefMacros.includegraphics_macro(teXParser, strArr);
                case 12:
                    return PredefMacros.cfrac_macro(teXParser, strArr);
                case 13:
                    return PredefMacros.frac_macro(teXParser, strArr);
                case 14:
                    return PredefMacros.sfrac_macro(teXParser, strArr);
                case 15:
                    return PredefMacros.genfrac_macro(teXParser, strArr);
                case 16:
                    return PredefMacros.over_macro(teXParser, strArr);
                case 17:
                    return PredefMacros.overwithdelims_macro(teXParser, strArr);
                case 18:
                    return PredefMacros.atop_macro(teXParser, strArr);
                case 19:
                    return PredefMacros.atopwithdelims_macro(teXParser, strArr);
                case 20:
                    return PredefMacros.choose_macro(teXParser, strArr);
                case 21:
                    return PredefMacros.underscore_macro(teXParser, strArr);
                case 22:
                    return PredefMacros.mbox_macro(teXParser, strArr);
                case 23:
                    return PredefMacros.text_macro(teXParser, strArr);
                case 24:
                    return PredefMacros.intertext_macro(teXParser, strArr);
                case 25:
                    return PredefMacros.binom_macro(teXParser, strArr);
                case 26:
                    return PredefMacros.mathbf_macro(teXParser, strArr);
                case 27:
                    return PredefMacros.bf_macro(teXParser, strArr);
                case 28:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 29:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case hs.T /* 30 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case hs.U /* 31 */:
                    return PredefMacros.mathit_macro(teXParser, strArr);
                case 32:
                    return PredefMacros.it_macro(teXParser, strArr);
                case 33:
                    return PredefMacros.mathrm_macro(teXParser, strArr);
                case 34:
                    return PredefMacros.rm_macro(teXParser, strArr);
                case 35:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 36:
                    return PredefMacros.mathsf_macro(teXParser, strArr);
                case 37:
                    return PredefMacros.sf_macro(teXParser, strArr);
                case 38:
                    return PredefMacros.mathtt_macro(teXParser, strArr);
                case 39:
                    return PredefMacros.tt_macro(teXParser, strArr);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case hs.o0 /* 51 */:
                case hs.p0 /* 52 */:
                case hs.q0 /* 53 */:
                case hs.r0 /* 54 */:
                case hs.s0 /* 55 */:
                case hs.t0 /* 56 */:
                case hs.u0 /* 57 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case hs.v0 /* 58 */:
                    return PredefMacros.T_macro(teXParser, strArr);
                case hs.w0 /* 59 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case hs.x0 /* 60 */:
                    return PredefMacros.accent_macro(teXParser, strArr);
                case hs.y0 /* 61 */:
                    return PredefMacros.grkaccent_macro(teXParser, strArr);
                case hs.z0 /* 62 */:
                case hs.A0 /* 63 */:
                case 64:
                case 65:
                case hs.D0 /* 66 */:
                case hs.E0 /* 67 */:
                case hs.F0 /* 68 */:
                case hs.G0 /* 69 */:
                case hs.H0 /* 70 */:
                case hs.I0 /* 71 */:
                case hs.J0 /* 72 */:
                case hs.K0 /* 73 */:
                case hs.L0 /* 74 */:
                case hs.M0 /* 75 */:
                    return PredefMacros.accent_macros(teXParser, strArr);
                case hs.N0 /* 76 */:
                    return PredefMacros.nbsp_macro(teXParser, strArr);
                case hs.O0 /* 77 */:
                    return PredefMacros.smallmatrixATATenv_macro(teXParser, strArr);
                case hs.P0 /* 78 */:
                    return PredefMacros.matrixATATenv_macro(teXParser, strArr);
                case hs.Q0 /* 79 */:
                    return PredefMacros.overrightarrow_macro(teXParser, strArr);
                case 80:
                    return PredefMacros.overleftarrow_macro(teXParser, strArr);
                case hs.S0 /* 81 */:
                    return PredefMacros.overleftrightarrow_macro(teXParser, strArr);
                case hs.T0 /* 82 */:
                    return PredefMacros.underrightarrow_macro(teXParser, strArr);
                case hs.U0 /* 83 */:
                    return PredefMacros.underleftarrow_macro(teXParser, strArr);
                case hs.V0 /* 84 */:
                    return PredefMacros.underleftrightarrow_macro(teXParser, strArr);
                case hs.W0 /* 85 */:
                    return PredefMacros.xleftarrow_macro(teXParser, strArr);
                case hs.X0 /* 86 */:
                    return PredefMacros.xrightarrow_macro(teXParser, strArr);
                case hs.Y0 /* 87 */:
                    return PredefMacros.underbrace_macro(teXParser, strArr);
                case hs.Z0 /* 88 */:
                    return PredefMacros.overbrace_macro(teXParser, strArr);
                case hs.a1 /* 89 */:
                    return PredefMacros.underbrack_macro(teXParser, strArr);
                case hs.b1 /* 90 */:
                    return PredefMacros.overbrack_macro(teXParser, strArr);
                case hs.c1 /* 91 */:
                    return PredefMacros.underparen_macro(teXParser, strArr);
                case hs.d1 /* 92 */:
                    return PredefMacros.overparen_macro(teXParser, strArr);
                case hs.e1 /* 93 */:
                case hs.f1 /* 94 */:
                    return PredefMacros.sqrt_macro(teXParser, strArr);
                case hs.g1 /* 95 */:
                    return PredefMacros.overline_macro(teXParser, strArr);
                case 96:
                    return PredefMacros.underline_macro(teXParser, strArr);
                case hs.i1 /* 97 */:
                    return PredefMacros.mathop_macro(teXParser, strArr);
                case hs.j1 /* 98 */:
                    return PredefMacros.mathpunct_macro(teXParser, strArr);
                case hs.k1 /* 99 */:
                    return PredefMacros.mathord_macro(teXParser, strArr);
                case hs.l1 /* 100 */:
                    return PredefMacros.mathrel_macro(teXParser, strArr);
                case 101:
                    return PredefMacros.mathinner_macro(teXParser, strArr);
                case hs.n1 /* 102 */:
                    return PredefMacros.mathbin_macro(teXParser, strArr);
                case hs.o1 /* 103 */:
                    return PredefMacros.mathopen_macro(teXParser, strArr);
                case hs.p1 /* 104 */:
                    return PredefMacros.mathclose_macro(teXParser, strArr);
                case hs.q1 /* 105 */:
                    return PredefMacros.joinrel_macro(teXParser, strArr);
                case hs.r1 /* 106 */:
                    return PredefMacros.smash_macro(teXParser, strArr);
                case hs.s1 /* 107 */:
                    return PredefMacros.vdots_macro(teXParser, strArr);
                case hs.t1 /* 108 */:
                    return PredefMacros.ddots_macro(teXParser, strArr);
                case hs.u1 /* 109 */:
                    return PredefMacros.iddots_macro(teXParser, strArr);
                case hs.v1 /* 110 */:
                    return PredefMacros.nolimits_macro(teXParser, strArr);
                case hs.w1 /* 111 */:
                    return PredefMacros.limits_macro(teXParser, strArr);
                case hs.x1 /* 112 */:
                    return PredefMacros.normal_macro(teXParser, strArr);
                case hs.y1 /* 113 */:
                    return PredefMacros.leftparenthesis_macro(teXParser, strArr);
                case hs.z1 /* 114 */:
                    return PredefMacros.leftbracket_macro(teXParser, strArr);
                case hs.A1 /* 115 */:
                    return PredefMacros.left_macro(teXParser, strArr);
                case hs.B1 /* 116 */:
                    return PredefMacros.middle_macro(teXParser, strArr);
                case hs.C1 /* 117 */:
                    return PredefMacros.cr_macro(teXParser, strArr);
                case hs.D1 /* 118 */:
                    return PredefMacros.multicolumn_macro(teXParser, strArr);
                case hs.E1 /* 119 */:
                    return PredefMacros.hdotsfor_macro(teXParser, strArr);
                case 120:
                    return PredefMacros.arrayATATenv_macro(teXParser, strArr);
                case hs.F1 /* 121 */:
                    return PredefMacros.alignATATenv_macro(teXParser, strArr);
                case hs.G1 /* 122 */:
                    return PredefMacros.alignedATATenv_macro(teXParser, strArr);
                case hs.H1 /* 123 */:
                    return PredefMacros.flalignATATenv_macro(teXParser, strArr);
                case hs.I1 /* 124 */:
                    return PredefMacros.alignatATATenv_macro(teXParser, strArr);
                case hs.J1 /* 125 */:
                    return PredefMacros.alignedatATATenv_macro(teXParser, strArr);
                case hs.K1 /* 126 */:
                    return PredefMacros.multlineATATenv_macro(teXParser, strArr);
                case hs.L1 /* 127 */:
                    return PredefMacros.gatherATATenv_macro(teXParser, strArr);
                case 128:
                    return PredefMacros.gatheredATATenv_macro(teXParser, strArr);
                case hs.N1 /* 129 */:
                    return PredefMacros.shoveright_macro(teXParser, strArr);
                case hs.O1 /* 130 */:
                    return PredefMacros.shoveleft_macro(teXParser, strArr);
                case hs.P1 /* 131 */:
                    return PredefMacros.backslashcr_macro(teXParser, strArr);
                case hs.Q1 /* 132 */:
                    return PredefMacros.newenvironment_macro(teXParser, strArr);
                case 133:
                    return PredefMacros.renewenvironment_macro(teXParser, strArr);
                case 134:
                    return PredefMacros.makeatletter_macro(teXParser, strArr);
                case hs.R1 /* 135 */:
                    return PredefMacros.makeatother_macro(teXParser, strArr);
                case hs.S1 /* 136 */:
                case hs.T1 /* 137 */:
                    return PredefMacros.fbox_macro(teXParser, strArr);
                case hs.U1 /* 138 */:
                    return PredefMacros.stackrel_macro(teXParser, strArr);
                case hs.V1 /* 139 */:
                    return PredefMacros.stackbin_macro(teXParser, strArr);
                case hs.W1 /* 140 */:
                    return PredefMacros.accentset_macro(teXParser, strArr);
                case hs.X1 /* 141 */:
                    return PredefMacros.underaccent_macro(teXParser, strArr);
                case hs.Y1 /* 142 */:
                    return PredefMacros.undertilde_macro(teXParser, strArr);
                case hs.Z1 /* 143 */:
                    return PredefMacros.overset_macro(teXParser, strArr);
                case hs.a2 /* 144 */:
                    return PredefMacros.Braket_macro(teXParser, strArr);
                case hs.b2 /* 145 */:
                    return PredefMacros.Set_macro(teXParser, strArr);
                case hs.c2 /* 146 */:
                    return PredefMacros.underset_macro(teXParser, strArr);
                case hs.d2 /* 147 */:
                    return PredefMacros.boldsymbol_macro(teXParser, strArr);
                case hs.e2 /* 148 */:
                    return PredefMacros.LaTeX_macro(teXParser, strArr);
                case hs.f2 /* 149 */:
                    return PredefMacros.GeoGebra_macro(teXParser, strArr);
                case hs.g2 /* 150 */:
                    return PredefMacros.big_macro(teXParser, strArr);
                case hs.h2 /* 151 */:
                    return PredefMacros.Big_macro(teXParser, strArr);
                case hs.i2 /* 152 */:
                    return PredefMacros.bigg_macro(teXParser, strArr);
                case hs.j2 /* 153 */:
                    return PredefMacros.Bigg_macro(teXParser, strArr);
                case hs.k2 /* 154 */:
                    return PredefMacros.bigl_macro(teXParser, strArr);
                case hs.l2 /* 155 */:
                    return PredefMacros.Bigl_macro(teXParser, strArr);
                case hs.m2 /* 156 */:
                    return PredefMacros.biggl_macro(teXParser, strArr);
                case hs.n2 /* 157 */:
                    return PredefMacros.Biggl_macro(teXParser, strArr);
                case hs.o2 /* 158 */:
                    return PredefMacros.bigr_macro(teXParser, strArr);
                case hs.p2 /* 159 */:
                    return PredefMacros.Bigr_macro(teXParser, strArr);
                case hs.q2 /* 160 */:
                    return PredefMacros.biggr_macro(teXParser, strArr);
                case hs.r2 /* 161 */:
                    return PredefMacros.Biggr_macro(teXParser, strArr);
                case hs.s2 /* 162 */:
                    return PredefMacros.displaystyle_macro(teXParser, strArr);
                case hs.t2 /* 163 */:
                    return PredefMacros.textstyle_macro(teXParser, strArr);
                case hs.u2 /* 164 */:
                    return PredefMacros.scriptstyle_macro(teXParser, strArr);
                case hs.v2 /* 165 */:
                    return PredefMacros.scriptscriptstyle_macro(teXParser, strArr);
                case hs.w2 /* 166 */:
                    return PredefMacros.sideset_macro(teXParser, strArr);
                case hs.x2 /* 167 */:
                    return PredefMacros.prescript_macro(teXParser, strArr);
                case hs.y2 /* 168 */:
                    return PredefMacros.rotatebox_macro(teXParser, strArr);
                case hs.z2 /* 169 */:
                    return PredefMacros.reflectbox_macro(teXParser, strArr);
                case hs.A2 /* 170 */:
                    return PredefMacros.scalebox_macro(teXParser, strArr);
                case hs.B2 /* 171 */:
                    return PredefMacros.resizebox_macro(teXParser, strArr);
                case hs.C2 /* 172 */:
                    return PredefMacros.raisebox_macro(teXParser, strArr);
                case hs.D2 /* 173 */:
                    return PredefMacros.shadowbox_macro(teXParser, strArr);
                case hs.E2 /* 174 */:
                    return PredefMacros.ovalbox_macro(teXParser, strArr);
                case hs.F2 /* 175 */:
                    return PredefMacros.doublebox_macro(teXParser, strArr);
                case hs.G2 /* 176 */:
                    return PredefMacros.phantom_macro(teXParser, strArr);
                case hs.H2 /* 177 */:
                    return PredefMacros.hphantom_macro(teXParser, strArr);
                case hs.I2 /* 178 */:
                    return PredefMacros.vphantom_macro(teXParser, strArr);
                case hs.J2 /* 179 */:
                    return PredefMacros.spATbreve_macro(teXParser, strArr);
                case hs.K2 /* 180 */:
                    return PredefMacros.spAThat_macro(teXParser, strArr);
                case hs.L2 /* 181 */:
                    return PredefMacros.definecolor_macro(teXParser, strArr);
                case hs.M2 /* 182 */:
                    return PredefMacros.textcolor_macro(teXParser, strArr);
                case hs.N2 /* 183 */:
                    return PredefMacros.fgcolor_macro(teXParser, strArr);
                case hs.O2 /* 184 */:
                    return PredefMacros.bgcolor_macro(teXParser, strArr);
                case hs.P2 /* 185 */:
                    return PredefMacros.colorbox_macro(teXParser, strArr);
                case hs.Q2 /* 186 */:
                    return PredefMacros.fcolorbox_macro(teXParser, strArr);
                case hs.R2 /* 187 */:
                    return PredefMacros.cedilla_macro(teXParser, strArr);
                case hs.S2 /* 188 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case hs.T2 /* 189 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case hs.U2 /* 190 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case hs.V2 /* 191 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case hs.W2 /* 192 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case hs.X2 /* 193 */:
                    return PredefMacros.tcaron_macro(teXParser, strArr);
                case hs.Y2 /* 194 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case hs.Z2 /* 195 */:
                    return PredefMacros.ogonek_macro(teXParser, strArr);
                case hs.a3 /* 196 */:
                    return PredefMacros.cong_macro(teXParser, strArr);
                case hs.b3 /* 197 */:
                    return PredefMacros.doteq_macro(teXParser, strArr);
                case hs.c3 /* 198 */:
                    return PredefMacros.jlmDynamic_macro(teXParser, strArr);
                case hs.d3 /* 199 */:
                    return PredefMacros.jlmExternalFont_macro(teXParser, strArr);
                case hs.e3 /* 200 */:
                    return PredefMacros.jlmText_macro(teXParser, strArr);
                case hs.f3 /* 201 */:
                    return PredefMacros.jlmTextit_macro(teXParser, strArr);
                case hs.g3 /* 202 */:
                    return PredefMacros.jlmTextbf_macro(teXParser, strArr);
                case 203:
                    return PredefMacros.jlmTextitbf_macro(teXParser, strArr);
                case hs.i3 /* 204 */:
                    return PredefMacros.DeclareMathSizes_macro(teXParser, strArr);
                case hs.j3 /* 205 */:
                    return PredefMacros.magnification_macro(teXParser, strArr);
                case hs.k3 /* 206 */:
                    return PredefMacros.hline_macro(teXParser, strArr);
                case hs.l3 /* 207 */:
                case 208:
                case hs.m3 /* 209 */:
                case hs.n3 /* 210 */:
                case hs.o3 /* 211 */:
                case hs.p3 /* 212 */:
                case hs.q3 /* 213 */:
                case hs.r3 /* 214 */:
                case hs.s3 /* 215 */:
                case hs.t3 /* 216 */:
                    return PredefMacros.size_macros(teXParser, strArr);
                case hs.u3 /* 217 */:
                    return PredefMacros.jlatexmathcumsup_macro(teXParser, strArr);
                case hs.v3 /* 218 */:
                    return PredefMacros.jlatexmathcumsub_macro(teXParser, strArr);
                case hs.w3 /* 219 */:
                    return PredefMacros.hstrok_macro(teXParser, strArr);
                case hs.x3 /* 220 */:
                    return PredefMacros.Hstrok_macro(teXParser, strArr);
                case hs.y3 /* 221 */:
                    return PredefMacros.dstrok_macro(teXParser, strArr);
                case hs.z3 /* 222 */:
                    return PredefMacros.Dstrok_macro(teXParser, strArr);
                case hs.A3 /* 223 */:
                    return PredefMacros.dotminus_macro(teXParser, strArr);
                case hs.B3 /* 224 */:
                    return PredefMacros.ratio_macro(teXParser, strArr);
                case hs.C3 /* 225 */:
                    return PredefMacros.smallfrowneq_macro(teXParser, strArr);
                case hs.D3 /* 226 */:
                    return PredefMacros.geoprop_macro(teXParser, strArr);
                case 227:
                    return PredefMacros.minuscolon_macro(teXParser, strArr);
                case hs.E3 /* 228 */:
                    return PredefMacros.minuscoloncolon_macro(teXParser, strArr);
                case hs.F3 /* 229 */:
                    return PredefMacros.simcolon_macro(teXParser, strArr);
                case hs.G3 /* 230 */:
                    return PredefMacros.simcoloncolon_macro(teXParser, strArr);
                case hs.H3 /* 231 */:
                    return PredefMacros.approxcolon_macro(teXParser, strArr);
                case hs.I3 /* 232 */:
                    return PredefMacros.approxcoloncolon_macro(teXParser, strArr);
                case TLRPC.LAYER /* 233 */:
                    return PredefMacros.coloncolon_macro(teXParser, strArr);
                case hs.J3 /* 234 */:
                    return PredefMacros.equalscolon_macro(teXParser, strArr);
                case hs.K3 /* 235 */:
                    return PredefMacros.equalscoloncolon_macro(teXParser, strArr);
                case hs.L3 /* 236 */:
                    return PredefMacros.colonminus_macro(teXParser, strArr);
                case hs.M3 /* 237 */:
                    return PredefMacros.coloncolonminus_macro(teXParser, strArr);
                case hs.N3 /* 238 */:
                    return PredefMacros.colonequals_macro(teXParser, strArr);
                case hs.O3 /* 239 */:
                    return PredefMacros.coloncolonequals_macro(teXParser, strArr);
                case hs.P3 /* 240 */:
                    return PredefMacros.colonsim_macro(teXParser, strArr);
                case hs.Q3 /* 241 */:
                    return PredefMacros.coloncolonsim_macro(teXParser, strArr);
                case hs.R3 /* 242 */:
                    return PredefMacros.colonapprox_macro(teXParser, strArr);
                case hs.S3 /* 243 */:
                    return PredefMacros.coloncolonapprox_macro(teXParser, strArr);
                case hs.T3 /* 244 */:
                    return PredefMacros.kern_macro(teXParser, strArr);
                case hs.U3 /* 245 */:
                    return PredefMacros.char_macro(teXParser, strArr);
                case hs.V3 /* 246 */:
                case hs.W3 /* 247 */:
                    return PredefMacros.romannumeral_macro(teXParser, strArr);
                case hs.X3 /* 248 */:
                    return PredefMacros.textcircled_macro(teXParser, strArr);
                case hs.Y3 /* 249 */:
                    return PredefMacros.textsc_macro(teXParser, strArr);
                case hs.Z3 /* 250 */:
                    return PredefMacros.sc_macro(teXParser, strArr);
                case hs.a4 /* 251 */:
                case hs.b4 /* 252 */:
                case hs.c4 /* 253 */:
                case hs.d4 /* 254 */:
                case hs.e4 /* 255 */:
                case 256:
                case hs.g4 /* 257 */:
                case hs.h4 /* 258 */:
                case hs.i4 /* 259 */:
                case hs.j4 /* 260 */:
                    return PredefMacros.muskip_macros(teXParser, strArr);
                case hs.k4 /* 261 */:
                    return PredefMacros.quad_macro(teXParser, strArr);
                case hs.l4 /* 262 */:
                    return PredefMacros.surd_macro(teXParser, strArr);
                case hs.m4 /* 263 */:
                    return PredefMacros.iint_macro(teXParser, strArr);
                case hs.n4 /* 264 */:
                    return PredefMacros.iiint_macro(teXParser, strArr);
                case hs.o4 /* 265 */:
                    return PredefMacros.iiiint_macro(teXParser, strArr);
                case hs.p4 /* 266 */:
                    return PredefMacros.idotsint_macro(teXParser, strArr);
                case hs.q4 /* 267 */:
                    return PredefMacros.int_macro(teXParser, strArr);
                case hs.r4 /* 268 */:
                    return PredefMacros.oint_macro(teXParser, strArr);
                case hs.s4 /* 269 */:
                    return PredefMacros.lmoustache_macro(teXParser, strArr);
                case hs.t4 /* 270 */:
                    return PredefMacros.rmoustache_macro(teXParser, strArr);
                case hs.u4 /* 271 */:
                    return PredefMacros.insertBreakMark_macro(teXParser, strArr);
                case hs.v4 /* 272 */:
                    return PredefMacros.jlmXML_macro(teXParser, strArr);
                case hs.w4 /* 273 */:
                    return PredefMacros.above_macro(teXParser, strArr);
                case hs.x4 /* 274 */:
                    return PredefMacros.abovewithdelims_macro(teXParser, strArr);
                case hs.y4 /* 275 */:
                    return PredefMacros.st_macro(teXParser, strArr);
                case hs.z4 /* 276 */:
                    return PredefMacros.fcscore_macro(teXParser, strArr);
                case hs.A4 /* 277 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case hs.B4 /* 278 */:
                    return PredefMacros.qquad_macro(teXParser, strArr);
                case hs.C4 /* 279 */:
                    return PredefMacros.longdiv_macro(teXParser, strArr);
                case hs.D4 /* 280 */:
                    return PredefMacros.questeq_macro(teXParser, strArr);
                case hs.E4 /* 281 */:
                    return PredefMacros.bangle_macro(teXParser, strArr);
                case hs.F4 /* 282 */:
                    return PredefMacros.brace_macro(teXParser, strArr);
                case hs.G4 /* 283 */:
                    return PredefMacros.brack_macro(teXParser, strArr);
                default:
                    return null;
            }
        } catch (Exception e10) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e10.getMessage());
        }
    }

    @Override // org.scilab.forge.jlatexmath.MacroInfo
    public Object invoke(TeXParser teXParser, String[] strArr) {
        return invokeID(this.id, teXParser, strArr);
    }

    public PredefMacroInfo(int i3, int i10) {
        super(i10);
        this.id = i3;
    }
}
